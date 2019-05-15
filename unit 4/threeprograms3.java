import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class threeprograms3 extends JPanel implements ActionListener{
    JLabel text;
    int r=10;
    int g=10;
    int b=10;
    public static void main( String[] args){
        threeprograms3 content = new threeprograms3();
        JFrame window = new JFrame("Colorize");
        window.setContentPane( content);
        window.setSize(400,200);
        window.setLocation( 100, 100);
        window.setVisible(true);
        window.setBackground(Color.gray);
    }//end class MathCirc
    public threeprograms3 (){

        JButton red= new JButton("Red");
        red.setBackground(Color.red);
        red.setActionCommand ("red");
        red.addActionListener (this);

        JButton blue= new JButton("Blue");
        blue.setBackground(Color.blue);
        blue.setActionCommand ("blue");
        blue.addActionListener (this);

        JButton green= new JButton("Green");
        green.setBackground(Color.green);
        green.setActionCommand ("green");
        green.addActionListener (this);

        text =new JLabel("Text");
        text.setFont(new Font("Jokerman",Font.BOLD, 100));
        text.setForeground(new Color(r,g,b));

        add (red);
        add (blue);
        add (green);
        add (text);
    }//end constructor
    public void actionPerformed (ActionEvent e){
        if (e.getActionCommand ().equals ("red")&&r<=235)
        {
            r+=20;
            text.setForeground(new Color(r,g,b));
        }
        if (e.getActionCommand ().equals ("green")&&g<=235)
        {
            g+=20;
            text.setForeground(new Color(r,g,b));
        }
        if (e.getActionCommand ().equals ("blue")&&b<=235)
        {
            b+=20;
            text.setForeground(new Color(r,g,b));
        }
    }
}