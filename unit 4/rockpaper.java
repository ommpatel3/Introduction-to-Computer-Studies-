import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class rockpaper extends JPanel implements ActionListener {
    JLabel user;
    JLabel computer;
    JLabel win;
    JLabel score;
    int scoreyou=0;
    int scorecomputer=0;
    int computernum;
    public static void main (String[] args){
        rockpaper content = new rockpaper();
        JFrame window = new JFrame("RockPaperScissors");
        window.setContentPane(content);
        window.setSize(750,350);
        window.setLocation( 100, 100);
        window.setVisible(true);
    }//end main

    public rockpaper(){
        //title label
        JLabel title = new JLabel("Rock, Paper, Scissors");
        title.setFont(new Font("Jokerman",Font.BOLD,32));

        //making radio buttons
        JRadioButton rock = new JRadioButton("Rock");
        rock.setActionCommand("rock");
        rock.addActionListener(this);

        JRadioButton paper = new JRadioButton("Paper");
        paper.setActionCommand("paper");
        paper.addActionListener(this);

        JRadioButton scissor = new JRadioButton("Scissors");
        scissor.setActionCommand("scissor");
        scissor.addActionListener(this);

        //grouping radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(rock);
        group.add(paper);
        group.add(scissor);
        //making panel for buttons
        JPanel buttons= new JPanel();
        buttons.add(rock);
        buttons.add(paper);
        buttons.add(scissor);
        //setting button panel layout to boxlayout
        buttons.setLayout(new BoxLayout (buttons, BoxLayout.Y_AXIS));

        //making panel for all image selections and text
        JPanel pictures=new JPanel();
        //serstuff panel stores user's image and the text saying "user's choicer:"
        JPanel userstuff=new JPanel();
        JLabel userchoice=new JLabel("Your Choice:");
        user=new JLabel(createImageIcon("blank.png"));//images set by default to a blank white square so the layout does not change
        //adding image and text to user panel
        userstuff.add (userchoice);
        userstuff.add (user);
        //making panel for computer image and "computer's choice" text
        JPanel compstuff=new JPanel();
        JLabel compchoice=new JLabel("Computer Choice:");
        computer=new JLabel(createImageIcon("blank.png"));
        //adding image and text to computers' panel 
        compstuff.add (compchoice);
        compstuff.add (computer);

        //adding user and computer panels to the images panel
        pictures.add(userstuff);
        pictures.add(compstuff);

        win=new JLabel("----");

        score=new JLabel("   Score:  You - "+scoreyou+" Computer - "+scorecomputer);

        JButton play=new JButton("Play");
        play.setActionCommand ("play");
        play.addActionListener (this); 

        JButton reset=new JButton("Reset Score");
        reset.setActionCommand ("reset");
        reset.addActionListener (this); 

        //stats panel holds all messages and buttons
        JPanel stats=new JPanel();
        stats.add(play);
        stats.add(reset);
        stats.add(win);
        stats.add(score);

        //making the main panel, it is the major panel for all sub panels to go into
        JPanel main=new JPanel();
        //assigning borderlayout to main panel
        main.setLayout (new BorderLayout());
        //adding all sub panels to main panel
        main.add (title, BorderLayout.NORTH);
        main.add (buttons, BorderLayout.WEST);
        main.add (pictures, BorderLayout.EAST);
        main.add (stats, BorderLayout.SOUTH);

        //adding final main panel
        add(main);
    }//end constructor

    int usernum=0;

    public void actionPerformed(ActionEvent e) {
        //reset everything
        if (e.getActionCommand().equals ("reset"))
        {
            scoreyou=0;
            scorecomputer=0;
            score.setText("   Score:  You - 0 Computer - 0");
        }

        //random number to simulate comouter's choice
        computernum=(int)(Math.random() * ((3) + 1));

        //assigning variable to computer's choice to make comparisons easier
        if (e.getActionCommand ().equals ("rock"))
        {
            usernum = 1;            
        }
        else if (e.getActionCommand ().equals ("paper"))
        {
            usernum = 2;           
        }
        else if (e.getActionCommand ().equals ("scissor"))
        {
            usernum = 3;
        }

        if (e.getActionCommand().equals ("play")){
            //changing pictures
            if (usernum==1) {
                user.setIcon(createImageIcon ("rock.png"));
            }else if (usernum==2) {
                user.setIcon(createImageIcon ("paper.png"));
            }else if (usernum==3) {
                user.setIcon(createImageIcon ("scissor.png"));
            }

            if (computernum==1){
                computer.setIcon(createImageIcon ("rock.png"));
            }else if (computernum==2){
                computer.setIcon(createImageIcon ("paper.png"));
            }else if (computernum==3){
                computer.setIcon(createImageIcon ("scissor.png"));
            }

            //comparing and cheching for win/lose/tie
            //(could have been done more efficiently)
            if (usernum==1&&computernum==2){
                scorecomputer++;
                win.setText("You lost!");
                score.setText("Score:  You - "+scoreyou+" Computer - "+scorecomputer);
            }else if (usernum==1&&computernum==3){
                scoreyou++;
                win.setText("You win!");
                score.setText("Score:  You - "+scoreyou+" Computer - "+scorecomputer);
            }else if (usernum==2&&computernum==1){
                scoreyou++;
                win.setText("You win!");
                score.setText("Score:  You - "+scoreyou+" Computer - "+scorecomputer);
            }else if (usernum==2&&computernum==3){
                scorecomputer++;
                win.setText("You lost!");
                score.setText("Score:  You - "+scoreyou+" Computer - "+scorecomputer);
            }else if (usernum==3&&computernum==1){
                scorecomputer++;
                win.setText("You lost!");
                score.setText("Score:  You - "+scoreyou+" Computer - "+scorecomputer);
            }else if (usernum==3&&computernum==2){
                scoreyou++;
                win.setText("You win!");
                score.setText("Score:  You - "+scoreyou+" Computer - "+scorecomputer);
            }else if (usernum==computernum){//tie
                win.setText("Tie!");
                score.setText("Score:  You - "+scoreyou+" Computer - "+scorecomputer);
            }

        }
    }

    protected static ImageIcon createImageIcon (String path){
        java.net.URL imgURL = rockpaper.class.getResource( path);
        if (imgURL != null){
            return new ImageIcon (imgURL);
        } else {
            System.err.println( "Couldn't find file: " + path);
            return null;
        }
    }//end ImageIcon
}