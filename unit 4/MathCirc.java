import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MathCirc extends JPanel implements ActionListener{
    public static void main( String[] args){
        MathCirc content = new MathCirc();
        JFrame window = new JFrame("Math Circus");
        window.setContentPane( content);
        window.setSize(400,200);
        window.setLocation( 100, 100);
        window.setVisible(true);
        
    }//end class MathCirc
    public MathCirc (){
        setBackground(Color.cyan);
        JLabel welcome = new JLabel ("Welcome to ");
        welcome.setFont (new Font ("Arial", Font.ITALIC, 14));
        JLabel mathCircus = new JLabel ("Math Circus!");
        mathCircus.setFont (new Font ("Chiller", Font.BOLD, 70));
        mathCircus.setForeground (Color.red);
        JButton enter = new JButton ("Enter");
        enter.setBackground (Color.blue);
        enter.setForeground (Color.yellow);
        add (welcome);
        add (mathCircus);
        add (enter);
    }//end constructor
    public void actionPerformed (ActionEvent e){
    }//end actionPerformed
}