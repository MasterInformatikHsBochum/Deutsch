package de.hochschule_bochum;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Stack;

public class AbstrakteKellerMaschine
{
<<<<<<< HEAD
	public static final int REGISTER_SIZE = 8;
=======
	public static int REGISTER_SIZE = 32;
>>>>>>> f9209d68390cbc2eb54da8d456f010c876981423
	private Stack<Object> stack;
	private ArrayList<String> machineCode = new ArrayList<String>();
	private Object[] register = new Object[REGISTER_SIZE];
	int pointer = 0;
	private boolean debug = false;

	public AbstrakteKellerMaschine() {
		stack = new Stack<Object>();
	}

	public void parseCode(File code) {
		if(debug) {
			System.out.println("Abstrakte Kellermaschine: Debug-Information an.");
		}
		try
		{
			String line = null;
			BufferedReader reader = new BufferedReader(new FileReader(code));
			while ((line = reader.readLine()) != null) {
				machineCode.add(line);
			}
			while(pointer < machineCode.size()-1) {
				execute(machineCode.get(pointer));
				pointer++;
			}
			if (debug) {
				System.out.println("Abstrakte Kellermaschine beendet.");
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
		}
		if(debug)
		{
			String registereintraege = "";
			for(int i = 0; i < register.length;i++) {
				if (register[i] != null) {
						registereintraege += ",R" + i + ":" + register[i];
				}
			}
			System.out.println("Kommando:" + command + "Stapel:" + stack.toString() + registereintraege);
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

	public void setDebug(boolean debug)
	{
		this.debug = debug;
	}

	public boolean isDebug()
	{
		return debug;
	}
}