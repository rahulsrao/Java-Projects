
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class ASCII_banner {
    
    public static void main (String[] args) throws IOException {
    BufferedImage image = new BufferedImage(144, 32, BufferedImage.TYPE_INT_RGB);
    Graphics g = image.getGraphics();
    g.setFont(new Font("Dialog", Font.PLAIN, 20));
    Graphics2D graphics = (Graphics2D) g;
    graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
    graphics.drawString("Good morning", 6, 24);
    ImageIO.write(image, "png", File.createTempFile("AsciiBanner.png", null));
    for (int y = 0; y < 32; y++) {
        StringBuilder sb = new StringBuilder();
        for (int x = 0; x < 144; x++)
            sb.append(image.getRGB(x, y) == -16777216 ? " " :
               image.getRGB(x, y) == -1 ? "a" : "s");
        if (sb.toString().trim().isEmpty()) continue;
        System.out.println(sb);
    }
  }
}
