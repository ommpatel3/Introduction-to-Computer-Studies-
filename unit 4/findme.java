import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class findme extends JPanel implements ActionListener {
    CardLayout cdlayout=new CardLayout();
    JLabel found;
    int room=(int)(Math.random() * ((7) + 2));
    public static void main (String[] args){
        findme content = new findme();
        JFrame window = new JFrame("FindMe");
        window.setContentPane(content);
        window.setSize(200,330);
        window.setLocation( 100, 100);
        window.setVisible(true);
    }//end main

    public findme(){
        setLayout (cdlayout);

        //int room=(int) (Math.random() * 2 + 7);
        
        start();
        hall();
        study();
        lounge();
        library();
        conservatory();
        billiard();
        ballroom();
    }//end constructor

    public void start(){
        JPanel start=new JPanel();

        JLabel title=new JLabel("Welcome to FindMe");
        //title.setFont (new Font ("Arial", Font.ITALIC, 14));

        JButton play=new JButton("Play");
        play.setActionCommand ("play");
        play.addActionListener (this);

        start.add(title);
        start.add(play);

        add(start);
    }

    public void hall(){
        JPanel hall=new JPanel();

        JLabel title=new JLabel ("You are in the hall");

        JLabel hallimg = new JLabel (createImageIcon ("hall.png"));

        JButton study=new JButton ("Study");
        study.setActionCommand ("2");
        study.addActionListener (this);

        JButton lounge=new JButton ("Lounge");
        lounge.setActionCommand ("3");
        lounge.addActionListener (this);

        JButton ballroom=new JButton ("Ballroom");
        ballroom.setActionCommand ("7");
        ballroom.addActionListener (this);

        hall.add (title);
        hall.add (hallimg);
        hall.add (study);
        hall.add (lounge);
        hall.add (ballroom);

        add ("1", hall);
    }

    public void study(){
        JPanel study=new JPanel();

        JLabel title=new JLabel ("You are in the study");

        JLabel studyimg = new JLabel (createImageIcon ("study.png"));

        JButton library=new JButton ("Library");
        library.setActionCommand ("4");
        library.addActionListener (this);

        JButton hall=new JButton ("Hall");
        hall.setActionCommand ("1");
        hall.addActionListener (this);
        
        if (room==2){
            found=new JLabel("You found me!");
            hall.setEnabled(false);
            library.setEnabled(false);
        }else
        found=new JLabel ("You did not find me!");

        study.add (title);
        study.add (studyimg);
        study.add (found);
        study.add (library);
        study.add (hall);

        add ("2", study);
    }

    public void lounge(){
        JPanel lounge=new JPanel();

        JLabel title=new JLabel ("You are in the lounge");

        JLabel loungeimg = new JLabel (createImageIcon ("lounge.png"));

        JButton hall=new JButton ("Hall");
        hall.setActionCommand ("1");
        hall.addActionListener (this);

        JButton conservatory=new JButton ("Conservatory");
        conservatory.setActionCommand ("5");
        conservatory.addActionListener (this);

        if (room==3){
            found=new JLabel("You found me!");
            conservatory.setEnabled(false);
            hall.setEnabled(false);
        }else
        found=new JLabel ("You did not find me!");

        lounge.add (title);
        lounge.add (loungeimg);
        lounge.add (found);
        lounge.add (conservatory);
        lounge.add (hall);

        add ("3", lounge);
    }

    public void library(){
        JPanel library=new JPanel();

        JLabel title=new JLabel ("You are in the library");

        JLabel libraryimg = new JLabel (createImageIcon ("library.png"));

        JButton study=new JButton ("Study");
        study.setActionCommand ("2");
        study.addActionListener (this);

        JButton billiard=new JButton ("Billiard Room");
        billiard.setActionCommand ("6");
        billiard.addActionListener (this);

        if (room==4){
            found=new JLabel("You found me!");
            billiard.setEnabled(false);
            study.setEnabled(false);
        }else
        found=new JLabel ("You did not find me!");

        library.add (title);
        library.add (libraryimg);
        library.add (found);
        library.add (study);
        library.add (billiard);

        add ("4", library);
    }

    public void conservatory(){
        JPanel conservatory=new JPanel();

        JLabel title=new JLabel ("You are in the conservatory");

        JLabel conservatoryimg = new JLabel (createImageIcon ("conservatory.png"));

        JButton ballroom=new JButton ("Ballroom");
        ballroom.setActionCommand ("7");
        ballroom.addActionListener (this);

        JButton lounge=new JButton ("Lounge");
        lounge.setActionCommand ("3");
        lounge.addActionListener (this);

        if (room==5){
            found=new JLabel("You found me!");
            lounge.setEnabled(false);
            ballroom.setEnabled(false);
        }else
        found=new JLabel ("You did not find me!");

        conservatory.add (title);
        conservatory.add (conservatoryimg);
        conservatory.add (found);
        conservatory.add (ballroom);
        conservatory.add (lounge);

        add ("5", conservatory);
    }

    public void billiard(){
        JPanel billiard=new JPanel();

        JLabel title=new JLabel ("You are in the Billiard Room");

        JLabel billiardimg = new JLabel (createImageIcon ("conservatory.png"));

        JButton ballroom=new JButton ("Ballroom");
        ballroom.setActionCommand ("7");
        ballroom.addActionListener (this);

        JButton library=new JButton ("Library");
        library.setActionCommand ("4");
        library.addActionListener (this);

        if (room==6){
            found=new JLabel("You found me!");
            library.setEnabled(false);
            ballroom.setEnabled(false);
        }else
        found=new JLabel ("You did not find me!");

        billiard.add (title);
        billiard.add (billiardimg);
        billiard.add (found);
        billiard.add (ballroom);
        billiard.add (library);

        add ("6", billiard);
    }

    public void ballroom(){
        JPanel ballroom=new JPanel();

        JLabel title=new JLabel ("You are in the Ballroom");

        JLabel ballroomimg = new JLabel (createImageIcon ("ballroom.png"));

        JButton billiard=new JButton ("Billiard Room");
        billiard.setActionCommand ("6");
        billiard.addActionListener (this);

        JButton conservatory=new JButton ("Conservatory");
        conservatory.setActionCommand ("5");
        conservatory.addActionListener (this);

        if (room==7){
            found=new JLabel("You found me!");
            conservatory.setEnabled(false);
            billiard.setEnabled(false);
        }else
        found=new JLabel ("You did not find me!");

        ballroom.add (title);
        ballroom.add (ballroomimg);
        ballroom.add (found);
        ballroom.add (billiard);
        ballroom.add (conservatory);

        add ("7", ballroom);
    }

    public void actionPerformed (ActionEvent e){
        if (e.getActionCommand().equals ("1")) {
            cdlayout.show (this, "1");
        } else if (e.getActionCommand().equals ("2")) {
            cdlayout.show (this, "2");
        } else if (e.getActionCommand().equals ("3")) {
            cdlayout.show (this, "3");
        } else if (e.getActionCommand().equals ("4")) {
            cdlayout.show (this, "4");
        } else if (e.getActionCommand().equals ("5")) {
            cdlayout.show (this, "5");
        } else if (e.getActionCommand().equals ("6")) {
            cdlayout.show (this, "6");
        } else if (e.getActionCommand().equals ("7")) {
            cdlayout.show (this, "7");
        } else if (e.getActionCommand().equals ("play")){
            cdlayout.show (this,"1");
        }

    }//end actionPerformed

    protected static ImageIcon createImageIcon (String path){
        java.net.URL imgURL = PictureExample.class.getResource( path);
        if (imgURL != null){
            return new ImageIcon (imgURL);
        } else {
            System.err.println( "Couldn't find file: " + path);
            return null;
        }
    }
}//end clas