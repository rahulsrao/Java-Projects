import java.awt.*;
import java.applet.*;

public class Banner extends Applet implements Runnable {
    
    String text="Sample Banner.....";
    Thread t;
    boolean b;
   
    public void init() {
      setBackground(Color.gray);
      setForeground(Color.yellow);
   }
   public void start() {
      t = new Thread(this);
      b = false;
      t.start();
   }
   public void run () {
      char ch;
      for( ; ; ) {
      try {
         repaint();
         Thread.sleep(250);
         ch= text.charAt(0);
         text= text.substring(1, text.length());
         text=  text + ch;
      }
      catch(InterruptedException e) {}
      }
   }
   public void paint(Graphics g) {
      
      g.drawRect(1,1,400,300);
      g.setColor(Color.black);
      g.fillRect(1,1,400,300);
      g.setColor(Color.white);
      g.drawString(text, 5, 50);
      
   }
}   
