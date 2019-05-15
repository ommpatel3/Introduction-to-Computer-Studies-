import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.ImageIcon;

public class RPS extends JPanel implements ActionListener
{

    public static void main (String[] args)
    {
        RPS content = new RPS();
        JFrame window = new JFrame("Rock Paper Scissors"); 
        window.setContentPane(content);
        window.setSize(920,600); 
        window.setLocation(100,100);
        window.setVisible(true); 

    }
    JLabel Outcome;
    JLabel you;
    JLabel comp;
    JLabel picture;
    JLabel picture2;
    JPanel panel;
    JPanel panel2;
    JPanel panel3;
    JPanel panel4;
    
    public RPS ()
    { 
        
        setBackground (new Color (204,204,204));

        panel = new JPanel (); 
        JLabel title = new JLabel ("Rock Paper Scissors Game");
        title.setFont (new Font ("Corsiva", Font.BOLD, 30));       
        title.setForeground (Color.red);
        title.setBackground (new Color (204,204,204));
        title.setOpaque (true);
        title.setBackground (new Color (204,204,204));
        panel.add (title); 
        
        panel3 = new JPanel ();
        JLabel B = new JLabel ("Your Choice:");
        B.setFont (new Font ("Arial", Font.BOLD, 12));
        panel3.add (B);

        picture = new JLabel (createImageIcon (""));
        panel3.add (picture);

        JLabel C = new JLabel ("Computer's Choice:");
        C.setFont (new Font ("Arial", Font.BOLD, 12));
        panel3.add (C);

        picture2 = new JLabel (createImageIcon (""));
        panel3.add (picture2);
        

        panel2 = new JPanel ();
        JLabel A = new JLabel ("Pick one:");
        A.setFont (new Font ("Arial", Font.BOLD, 12));
        panel2.add (A);
        
        JRadioButton rock = new JRadioButton ("Rock");
        rock.setBackground (new Color (204,204,204));
        rock.setForeground (Color.black);
        rock.setOpaque (true);
        rock.setBorderPainted (false);
        rock.setActionCommand("rock");
        rock.addActionListener (this);
        panel2.add (rock);

        JRadioButton Paper = new JRadioButton ("Paper");
        Paper.setBackground (new Color (204,204,204));
        Paper.setForeground (Color.black);
        Paper.setOpaque (true);
        Paper.setBorderPainted (false);
        Paper.setActionCommand("paper");
        Paper.addActionListener (this);
        panel2.add (Paper);

        JRadioButton Scissors = new JRadioButton ("Scissors");
        Scissors.setBackground (new Color (204,204,204));
        Scissors.setForeground (Color.black);
        Scissors.setOpaque (true);
        Scissors.setBorderPainted (false);
        Scissors.setActionCommand("scissors");
        Scissors.addActionListener (this);
        panel2.add (Scissors);

        ButtonGroup group = new ButtonGroup();
        group.add(rock);
        group.add(Paper);
        group.add(Scissors);
        
        
        panel4 = new JPanel ();
        JButton play = new JButton ("play");
        play.setBackground (Color.white);
        play.setForeground (Color.blue);
        play.setOpaque (true);
        play.setBorderPainted (false);
        play.setActionCommand("play");
        play.addActionListener (this);
        panel4.add (play);

        Outcome = new JLabel ("");
        Outcome.setFont (new Font ("Arial", Font.BOLD, 12));
        panel4.add (Outcome);
        
        JLabel S = new JLabel ("Score:");
        S.setFont (new Font ("Arial", Font.BOLD, 12));
        panel4.add (S);
        
        JLabel y = new JLabel ("You - ");
        y.setFont (new Font ("Arial", Font.BOLD, 12));
        panel4.add (y);
        
        you = new JLabel ("0");
        you.setFont (new Font ("Arial", Font.BOLD, 12));
        panel4.add (you);
        
        JLabel d = new JLabel ("Computer - ");
        d.setFont (new Font ("Arial", Font.BOLD, 12));
        panel4.add (d);
        
        comp = new JLabel ("0");
        comp.setFont (new Font ("Arial", Font.BOLD, 12));
        panel4.add (comp);
        
        setLayout(new BorderLayout()); 
        add(panel,BorderLayout.NORTH);  
        add(panel4,BorderLayout.SOUTH);    
        add(panel2,BorderLayout.WEST);  
        add(panel3,BorderLayout.CENTER);  

    }

    int user = 0;
    int you1 = 0;
    int comp1 = 0;
    
    public void actionPerformed (ActionEvent e)
    {

        int computer = (int) (Math.random () * 3) + 1;

        if (e.getActionCommand ().equals ("rock"))
        {
            user = 1;            
        }
        else if (e.getActionCommand ().equals ("paper"))
        {
            user = 2;           
        }
        else if (e.getActionCommand ().equals ("scissors"))
        {
            user = 3;
        }

        if (e.getActionCommand ().equals ("play"))
        {

            if (user == 1)
            {
                picture.setIcon (new ImageIcon("rock.gif"));
            }
            else if (user == 2)
            {
                picture.setIcon (new ImageIcon("paper.jpg"));
            }
            else if (user == 3)
            {
                picture.setIcon (new ImageIcon("scissors.jpg"));
            }
            
            if (computer == 1)
            {
                picture2.setIcon (new ImageIcon("rock.gif"));
                computer = 1;
            }
            else if (computer == 2)
            {
                picture2.setIcon (new ImageIcon("paper.jpg"));
                computer = 2;
            }
            else if (computer == 3)
            {
                picture2.setIcon (new ImageIcon("scissors.jpg"));
                computer = 3;     
            }

            if (user == 1 && computer == 3)
            {    
                Outcome.setText("You win! :)");
                you1 ++;
            }
            else if (user == 2 && computer == 1)
            {
                Outcome.setText("You win! :)");
                you1 ++;
            }
            else if (user == 3 && computer == 2)
            {                
                Outcome.setText("You win! :)"); 
                you1 ++;
            }
            else if (user == 3 && computer == 3 
            ||user == 2 && computer == 2  
            ||user == 1 && computer == 1)
            {                
                Outcome.setText("Its a draw! "); 
            }
            else 
            {
                Outcome.setText ("You lost :(");
                comp1 ++;
            }
            
            you.setText ("" + you1);
            comp.setText ("" + comp1 );
            
        }

    }

    protected static ImageIcon createImageIcon (String path){
        java.net.URL imgURL = RPS.class.getResource( path);
        if (imgURL != null)
        {
            return new ImageIcon (imgURL);
        } 
        else 
        {
            System.err.println( "Couldn't find file: " + path);
            return null;
        }
    }
}
