package de.hochschule_bochum;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.tree.Tree;

import javax.imageio.ImageIO;
import javax.print.PrintException;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class AbstrakterSyntaxbaum extends TreeViewer {
    private List<String> regelNamen;
    private Tree baum;

    public AbstrakterSyntaxbaum(List<String> regelNamen, Tree baum) {
        super(regelNamen, baum);

        this.regelNamen = regelNamen;
        this.baum = baum;
    }

    private String getTitel(String name) {
        File f = new File(name);
        String programmName = f.getName().split(".deutsch")[0];
        return programmName + " - Abstrakter Syntaxbaum";
    }

    private JPanel getJPanel(String name) {
        JPanel panel = new JPanel();
        this.setScale(1.0);
        panel.add(this);

        return panel;
    }

    public int zeige(String name) {
        JPanel panel = this.getJPanel(name);

        return JOptionPane.showConfirmDialog(null, panel, this.getTitel(name),
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
    }

    public void speicherAlsPng(String name, int breite, int hoehe) throws PrintException, IOException {
        this.setScale(1.0);

        String bildName = this.getTitel(name) + ".png";

        BufferedImage bufferedImage = new BufferedImage(breite, hoehe, BufferedImage.TYPE_INT_ARGB);
        Graphics graphics = bufferedImage.createGraphics();
        this.paint(graphics);
        graphics.dispose();

        ImageIO.write(bufferedImage, "png", new File(bildName));
    }

    public void speicherAlsPng(String name) throws PrintException, IOException {
        int breite = 4096, hoehe = 2160;
        speicherAlsPng(name, breite, hoehe);
    }
}
