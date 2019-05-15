
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PictureExample extends JPanel implements ActionListener{
    public static void main (String[] args){
        PictureExample content = new PictureExample();
        JFrame window = new JFrame("Picture Example");
        window.setContentPane( content);
        window.setSize(1000,500);
        window.setLocation( 100, 100);
        window.setVisible(true);
    }//end main
    public PictureExample (){
        JLabel picture = new JLabel (createImageIcon ("file.png"));
        add (picture);
    }//end PictureExample
    public void actionPerformed (ActionEvent e){
        
    }//end actionPerformed
    protected static ImageIcon createImageIcon (String path){
        java.net.URL imgURL = PictureExample.class.getResource( path);
        if (imgURL != null){
            return new ImageIcon (imgURL);
        } else {
            System.err.println( "Couldn't find file: " + path);
            return null;
        }
    }//end ImageIcon
}//end clas