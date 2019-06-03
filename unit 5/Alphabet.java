import javax.swing.*; import java.awt.*; import java.awt.event.*;
public class Alphabet extends JPanel implements ActionListener {
    JTextField text; //Global
    public static void main (String[] args){
        Alphabet content = new Alphabet();
        JFrame window = new JFrame("Alphabet");
        window.setContentPane( content);
        window.setSize(625,325);
        window.setLocation( 100, 100);
        window.setVisible(true);
    }//end main
    public Alphabet (){
        text = new JTextField (40);
        JButton a[] = new JButton [26];
        Panel g = new Panel (new GridLayout (2, 13));
        for (int i = 0 ; i < a.length ; i++)
        {   a [i] = new JButton ("" + (char) (i + 97));
            a [i].addActionListener (this);
            a [i].setActionCommand ("" + (char) (i + 97));
            a [i].setBackground(Color.yellow);
            g.add (a [i]);
        }
        
        JButton b[] = new JButton [10];
        Panel h = new Panel (new GridLayout (1,10));
        for (int i = 0 ; i < b.length ; i++)
        { b [i] = new JButton ("" + i);
            b [i].addActionListener (this);
            b [i].setActionCommand ("" + i);
            b [i].setBackground(Color.cyan);
            h.add (b [i]);
        }
        JButton space=new JButton ("Space");
        space.addActionListener (this);
        space.setActionCommand (" ");
        add (text);
        add (g);
        add (space);
        add (h);
    }//end constructor
    public void actionPerformed (ActionEvent e) {
        text.setText (text.getText () + e.getActionCommand ());
    }//end actionPerformed
}//end clas