import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Frame extends JFrame {
    private JLabel slidesLabel = new JLabel();
    private Icon[] icons;
    private int currentSlide = -1;
    public Frame() {
        try {
            // Personally, I'd use File#listFiles to list all the
            // images in a directory, but that might be consider
            // using our initiative...
            icons = new Icon[]{
                new ImageIcon(ImageIO.read(new File("C:\\Users\\HP\\Downloads\\sale.jpg"))),
                new ImageIcon(ImageIO.read(new File("C:\\Users\\HP\\Downloads\\ta.jpg"))),
                new ImageIcon(ImageIO.read(new File("C:\\\\Users\\\\HP\\\\Downloads\\\\ed4.jpg"))),
                new ImageIcon(ImageIO.read(new File("C:\\\\Users\\\\HP\\\\Downloads\\\\cow.jpg"))),
                new ImageIcon(ImageIO.read(new File("C:\\Users\\HP\\Downloads\\dp.jpg"))),
                new ImageIcon(ImageIO.read(new File("C:\\Users\\HP\\Pictures\\car.jpg"))),
                new ImageIcon(ImageIO.read(new File("C:\\Users\\HP\\Pictures\\music.jpg"))),
                new ImageIcon(ImageIO.read(new File("C:\\Users\\HP\\Pictures\\BS.jpg"))),
                
            };
            slidesLabel.setVerticalAlignment(JLabel.CENTER);
            slidesLabel.setHorizontalAlignment(JLabel.CENTER);
            slidesLabel.setBounds(60,50,50,40);
            setLayout(new BorderLayout());
            add(slidesLabel, BorderLayout.CENTER);
            slidesLabel.addMouseListener(new ClickListener());
            nextSlide();
        } catch (IOException exp) {
            exp.printStackTrace();
        }
    }

    public void nextSlide() {
        if (currentSlide < icons.length - 1) {
            currentSlide++;
            slidesLabel.setIcon(icons[currentSlide]);
        }
        
        }

    public static void main(String args[]) {
    	JFrame f=new JFrame();
    	f.setVisible(true);
    	f.setSize(900,900);
    	ImageIcon i=new ImageIcon("C:\\Users\\HP\\Downloads\\nav.gif");
		JLabel c=new JLabel("",i,JLabel.CENTER);
		f.add(c);
		c.setBounds(150,50,50,80);
		f.setVisible(true);      
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    ex.printStackTrace();
                }

                Frame frame = new Frame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

    public class ClickListener extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {
            nextSlide();
        }
    }

}
