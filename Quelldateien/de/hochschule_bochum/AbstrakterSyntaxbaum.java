package de.hochschule_bochum;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.tree.Tree;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
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

        BufferedImage bufferedImage = new BufferedImage(breite, hoehe, BufferedImage.TYPE_INT_ARGB);

        Graphics2D g = bufferedImage.createGraphics();
        viewer.paint(g);

        ImageIO.write(bufferedImage, "png", new File(bildName));
    }

    public void speicherAlsPng(String name) throws IOException {
        int breite = 4096, hoehe = 2160;
        speicherAlsPng(name, breite, hoehe);
    }
}
