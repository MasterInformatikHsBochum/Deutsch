package de.hochschule_bochum;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.tree.Tree;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class AbstrakterSyntaxbaum {
    private List<String> regelNamen;
    private Tree baum;

    public AbstrakterSyntaxbaum(List<String> regelNamen, Tree baum) {
        this.regelNamen = regelNamen;
        this.baum = baum;
    }

    public void speicherAlsPng(String name, int breite, int hoehe) throws IOException {
        TreeViewer viewer = new TreeViewer(this.regelNamen, this.baum);

        File f = new File(name);
        String programmName = f.getName().split(".deutsch")[0];
        String bildName = programmName + " - Abstrakter Syntaxbaum.png";

        int width = 640, height = 480;
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

        Graphics2D g = bufferedImage.createGraphics();
        viewer.paint(g);

        ImageIO.write(bufferedImage, "png", new File(bildName));
    }

    public void speicherAlsPng(String name) throws IOException {
        int breite = 640, hoehe = 480;
        speicherAlsPng(name, breite, hoehe);
    }
}
