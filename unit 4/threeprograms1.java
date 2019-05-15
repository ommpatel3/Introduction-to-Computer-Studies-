import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class threeprograms1 extends JPanel implements ActionListener{
    JLabel o;
    public static void main( String[] args){
        threeprograms1 content = new threeprograms1();
        JFrame window = new JFrame("LeftOrRight");
        window.setContentPane( content);
        window.setSize(400,200);
        window.setLocation( 100, 100);
        window.setVisible(true);
    }//end class MathCirc
    public threeprograms1 (){
        JButton left= new JButton("Left");
        left.setActionCommand ("left");
        left.addActionListener (this);
        
        o=new JLabel("        O        ");

        JButton right= new JButton("Right");
        right.setActionCommand ("right");
        right.addActionListener (this);

        add (left);
        add (o);
        add (right);
    }//end constructor
    public void actionPerformed (ActionEvent e){
        if (e.getActionCommand ().equals ("left"))
        {
            o.setText("O             ");
        }//end actionPerformed
        if (e.getActionCommand ().equals ("right"))
        {
            o.setText("             O");
        }//end actionPerformed
    }
}