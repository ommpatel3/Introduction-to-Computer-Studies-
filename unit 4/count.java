import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class count extends JPanel implements ActionListener{
    int count=0;
    JLabel num;
    public static void main( String[] args){
        count content = new count();
        JFrame window = new JFrame("LeftOrRight");
        window.setContentPane( content);
        window.setSize(200,250);
        window.setLocation( 100, 100);
        window.setVisible(true);
    }//end class MathCirc
    public count (){
        JButton plus= new JButton("+");
        plus.setBackground(Color.green);
        plus.setActionCommand ("plus");
        plus.addActionListener (this);
        
        JButton minus= new JButton("-");
        minus.setBackground(Color.red);
        minus.setActionCommand ("minus");
        minus.addActionListener (this);
        
        num =new JLabel("0");
        num.setFont(new Font("Arial",Font.BOLD, 120));
        
        add (num);
        add (plus);
        add (minus);
    }//end constructor
    public void actionPerformed (ActionEvent e){
         if (e.getActionCommand ().equals ("plus"))
        {
            count++;
            num.setText(""+count+"");
        }
         if (e.getActionCommand ().equals ("minus"))
        {
            count--;
            num.setText(""+count+"");
        }
    }
}