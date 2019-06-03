import javax.swing.*; import java.awt.*; import java.awt.event.*;
public class red extends JPanel implements ActionListener {
    JLabel text;
    JLabel image;
    int count = 0;
    String story[]=new String[11];
    String pictures[]=new String[11];
    public static void main (String[] args){
        red content = new red();
        JFrame window = new JFrame("red riding hood");
        window.setContentPane( content);
        window.setSize(625,325);
        window.setLocation( 100, 100);
        window.setVisible(true);
    }//end main
    public red (){
        
        
        JButton next=new JButton(">>");
        next.setActionCommand("next");
        next.addActionListener(this);
        
        
        story[0]="Once upon a time, Little Red Riding Hood went tovisit her sick grandmother.";
        story[1]="She walked through the woods and over bridges";
        story[2]="After a while, she met a wold that tricked her into picking flowers for her grandmother";
        story[3]="The wold ran ahead and ate her sick grandmother, then disguised himself";
        story[4]="When red arrived, she was puzzled, she said \"what big ears you have\"";
        story[5]="Then, red said \"what big teeth you have\"and the wolf ate her.";
        story[6]="The wold went to sleep and snored loudly. A nearby woodcutter heard it";
        story[7]="When the woodcutter came to investigate, he noticed a scarf in the wolf's mouth";
        story[8]="The scarf was that of her grandmother's";
        story[9]="He pulled red and her grandmother free!";
        story[10]="The wolf was put in prison and everyone lived happily";
        
        
        pictures[0]="red1.jpg";
        pictures[1]="red2.jpg";
        pictures[2]="red3.jpg";
        pictures[3]="red4.jpg";
        pictures[4]="red5.jpg";
        pictures[5]="red6.jpg";
        pictures[6]="red7.jpg";
        pictures[7]="red8.jpg";
        pictures[8]="red9.jpg";
        pictures[9]="red10.jpg";
        pictures[10]="red11.jpg";
        
        text=new JLabel(story[0]);
        image=new JLabel (createImageIcon ("redlogo.jpg"));
        
        add (text);
        add (image);
        add (next);
    }//end constructor
    public void actionPerformed (ActionEvent e) {
        if (e.getActionCommand().equals("next"))
        {
            count++;
            text.setText(story[count]);
            image.setIcon(createImageIcon (pictures[count]));
        }
        if (count==10)
        {
            count=0;
        }
    }//end actionPerformed
    protected static ImageIcon createImageIcon (String path){
        java.net.URL imgURL = red.class.getResource( path);
        if (imgURL != null){
            return new ImageIcon (imgURL);
        } else {
            System.err.println( "Couldn't find file: " + path);
            return null;
        }
    }//end ImageIcon
}//end clas