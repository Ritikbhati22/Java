import javax.swing.JApplet;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
/*<applet code = "FillOval" width = 200 height= 200></applet>
*/
public class FillOval extends JApplet{
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.fillOval(20,20,60,60);
    }
}
