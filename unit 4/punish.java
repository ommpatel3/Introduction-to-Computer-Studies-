import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class punish extends JPanel implements ActionListener {
    JLabel grade;
    JTextField mark;
    public static void main (String[] args){
        punish content = new punish();
        JFrame window = new JFrame("Punish");
        window.setContentPane(content);
        window.setSize(500,200);
        window.setLocation( 100, 100);
        window.setVisible(true);
    }//end main
    public punish(){
        mark = new JTextField (3);
        
        JLabel ins = new JLabel ("Enter the number of times you have been late:");

        JLabel title = new JLabel ("Punishment Selector");
        title.setFont(new Font("Chiller",Font.BOLD,50));
        title.setForeground(Color.red);

        grade = new JLabel ("------------------");
        grade.setForeground (Color.blue);
        
        JButton findLevel = new JButton ("Find Punishment");
        findLevel.addActionListener (this);
        findLevel.setActionCommand ("cut");
        findLevel.setBackground (Color.black);
        findLevel.setForeground (Color.white);

        add (title);
        add (ins);
        add (mark);
        add (findLevel);
        add (grade);
    }//end constructor
    public void actionPerformed (ActionEvent e){
        int m = Integer.parseInt (mark.getText());
        if (m >= 4) {
            grade.setText ("Corporal Punishment");
        } else if (m >= 3) {
            grade.setText ("10 Years Jail Time");
        } else if (m >= 2) {
            grade.setText ("You Will be \"Relocated\" to Siberia");
        } else if (m >= 1) {
            grade.setText ("The Government fines you $1000");
        } else {
            grade.setText ("Well Done, but remember, Big Brother still Watches");
        }
    }//end actionPerformed
}//end clas