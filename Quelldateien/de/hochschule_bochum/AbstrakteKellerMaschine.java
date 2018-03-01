package de.hochschule_bochum;

import org.apache.commons.lang.StringEscapeUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.Stack;

public class AbstrakteKellerMaschine
{
	public static final int REGISTER_SIZE = 32;
	private Stack<Object> stack;
	private ArrayList<String> machineCode = new ArrayList<String>();
	private Object[] register = new Object[REGISTER_SIZE];
	int pointer = 0;
	private boolean debug = false;
	private String debugInfo = "";

	public AbstrakteKellerMaschine() {
		stack = new Stack<Object>();
	}

	public void parseCode(File code) {
		if(debug) {
			debugInfo += "Abstrakte Kellermaschine gestartet.\n";
		}
		try
		{
			String line = null;
			BufferedReader reader = new BufferedReader(new FileReader(code));
			while ((line = reader.readLine()) != null) {
				machineCode.add(line);
			}
			while(pointer < machineCode.size()) {
				execute(machineCode.get(pointer));
				pointer++;
			}
			if (debug) {
				debugInfo += "Abstrakte Kellermaschine beendet.\n";
				BufferedWriter bufferedWriter = null;
				try {
					File debugLog = new File("Kellerdebug.log");
					if (!debugLog.exists()) {
						debugLog.createNewFile();
					}
					Writer writer = new FileWriter(debugLog);
					bufferedWriter = new BufferedWriter(writer);
					bufferedWriter.write(debugInfo);
				} catch (IOException e) {
					e.printStackTrace();
				} finally{
					try{
						if(bufferedWriter != null) bufferedWriter.close();
					} catch(Exception ex){

					}
				}
			}
		}
		catch (java.io.IOException e)
		{
			e.printStackTrace();
		}
	}

	private void add() {
		Object stack1 = stack.pop();
		Object stack2 = stack.pop();
		if( stack1 instanceof String || stack2 instanceof String) {
			throw new NumberFormatException();
		}
		else if(stack1 instanceof Integer) {
			if (stack2 instanceof Integer) {
				stack.push((int) stack1 + (int) stack2);
			}
		}
	}

	private void sub() {
		Object stack1 = stack.pop();
		Object stack2 = stack.pop();
		if( stack1 instanceof String || stack2 instanceof String) {
			throw new NumberFormatException();
		}
		else if(stack1 instanceof Integer) {
			if (stack2 instanceof Integer) {
				stack.push((int) stack1 - (int) stack2);
			}
		}
	}

	private void mul() {
		Object stack1 = stack.pop();
		Object stack2 = stack.pop();
		if( stack1 instanceof String || stack2 instanceof String) {
			throw new NumberFormatException();
		}
		else if(stack1 instanceof Integer) {
			if (stack2 instanceof Integer) {
				stack.push((int) stack1 * (int) stack2);
			}
		}
	}

	private void div() {
		Object stack1 = stack.pop();
		Object stack2 = stack.pop();
		if( stack1 instanceof String || stack2 instanceof String) {
			throw new NumberFormatException();
		}
		else if(stack1 instanceof Integer)
		{
			if (stack2 instanceof Integer)
			{
				stack.push((int)stack2 / (int)stack1);
			}
		}
	}

	private void load(String v)  {
		int zahl = 0;
		try
		{
			zahl = Integer.parseInt(v);
			stack.push(zahl);
		} catch (NumberFormatException e) {
			stack.push(v);
		}
	}

	private void goTo(String l){
		for (int i = 0; i < machineCode.size();i++) {
			if(machineCode.get(i).equals("MARKIERUNG " + l)){
				pointer = i;
				break;
			}
		}
	}

	private void goToStack() {
		Object stack1 = stack.pop();
		if (stack1 instanceof String) {
			goTo((String) stack1);
		}
	}

	private void goTrue(String l) {
		Object stack1 = stack.pop();
		if(stack1 instanceof Integer && (int)stack1 > 0) {
			goTo(l);
		}
	}

	private void goFalse(String l)
	{
		Object stack1 = stack.pop();
		if (stack1 instanceof Integer && (int)stack1 == 0 )
		{
			goTo(l);
		}
	}

	private void execute(String command) {
		if (command.startsWith("LADE") || command.startsWith("LEGE M")) {
			load(command.substring(command.indexOf(' ') + 1));
		} else if (command.equals("ADD")) {
			add();
		} else if (command.equals("SUB")) {
			sub();
		} else if (command.equals("MUL")) {
			mul();
		} else if (command.equals("DIV")) {
			div();
		} else if (command.startsWith("GEHEZU")) {
			goTo(command.substring(command.indexOf(' ') + 1));
		} else if (command.equals("GEHEZUSTAPEL")) {
			goToStack();
		} else if (command.startsWith("GEHEWAHR")) {
			goTrue(command.substring(command.indexOf(' ') + 1));
		} else if (command.startsWith("GEHEFALSCH")) {
			goFalse(command.substring(command.indexOf(' ') + 1));
		} else if (command.equals("AUSKELLERN")) {
			pop();
		} else if (command.startsWith("AUSKELLERN R")) {
			pop(Integer.parseInt(command.substring(command.lastIndexOf('R') + 1)));
		} else if (command.startsWith("LEGE R")) {
			moveR(Integer.parseInt(command.substring(command.lastIndexOf('R') + 1)));
		} else if (command.equals("EIN")) {
			in();
		} else if (command.equals("AUS")) {
			out();
		}
		if(debug)
		{
			String registereintraege = "";
			for(int i = 0; i < register.length;i++)
			{
				if (register[i] != null)
				{
					registereintraege += ", R" + i + ":" + register[i];
				}
			}
			debugInfo += "Kommando: " + command + " Stapel: " + stack.toString() + registereintraege + "\n";

		}
	}

	private void moveR(int r)
	{
		if (r < register.length) {
			stack.push(register[r]);
		}
	}

	private void pop(int r)
	{
		if (r < register.length) {
			register[r] = stack.pop();
		}
	}

	private void pop()
	{
		stack.pop();
	}

	private void out() {
		String output = stack.pop() + "";

		// " zu Beginn einer Zeichenkette entfernen
		output = output.replaceFirst("^\"", "");

		// " am Ende einer Zeichenkette entfernen
		output = output.replaceFirst("\"$", "");

		// Escapen rückgängig machen
		output = StringEscapeUtils.unescapeJava(output);
		System.out.print(output);
	}

	private void in() {
		String input = System.console().readLine();
		try
		{
			int zahl = 0;
			zahl = Integer.parseInt(input);
			stack.push(zahl);
		} catch (NumberFormatException e) {
			stack.push(input);
		}
	}

	public void setDebug(boolean debug)
	{
		this.debug = debug;
	}

	public boolean isDebug()
	{
		return debug;
	}
}
