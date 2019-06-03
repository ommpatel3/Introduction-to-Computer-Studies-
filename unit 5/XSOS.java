import javax.swing.*; import java.awt.*; import java.awt.event.*;
public class XSOS extends JPanel implements ActionListener{
    int row = 3;
    JButton btn[][] = new JButton [row][row];
    char turn = 'X';

    int butval[] [] = {{9, 9, 9}, {9, 9, 9}, {9, 9, 9}}; //Set to nines to make wins easier to check
    public static void main (String[] args){
        XSOS content = new XSOS();
        JFrame window = new JFrame("Hello");
        window.setContentPane( content);
        window.setSize(175,140);
        window.setLocation( 100, 100);
        window.setVisible(true);
    }//end main
    public XSOS () {
        setLayout (new GridLayout( row, row));

        for (int x = 0 ; x < row ; x++){
            for (int y = 0 ; y < row ; y++){
                btn [x] [y] = new JButton ("   ");
                btn [x] [y].addActionListener (this);
                btn [x] [y].setActionCommand ("" + (x * 10 + y));
                btn [x] [y].setForeground (Color.black);
                btn [x] [y].setBackground (Color.cyan);
                btn [x] [y].setPreferredSize(new Dimension(60, 40));
                add (btn [x] [y]);
            }//end nested for
        }//end for
    }// end constructor
    public void actionPerformed (ActionEvent e) {
        int i = Integer.parseInt (e.getActionCommand ());
        int row = i / 10; 
        int column = i % 10;
        String letter[] = {"O", "X"};

        // Put the X or O on the button only if blank
        if (butval [row] [column] == 9){
            turn = (char)((turn + 1) % 2);
            btn [row] [column].setText (letter [turn]);
            butval [row] [column] = turn;

            // Game over checks: current column, current row and both diagonals
            if (butval [row] [0] + butval [row] [1] + butval [row] [2] == turn * 3 
            || butval [0] [column] + butval [1] [column] + butval [2] [column] == turn * 3 
            || butval [0] [0] + butval [1] [1] + butval [2] [2] == turn * 3 
            || butval [2] [0] + butval [1] [1] + butval [0] [2] == turn * 3)
                JOptionPane.showMessageDialog (null, 
                    "Game Over! " + letter[turn] + "'s have won!", 
                    "Game Over!", 
                    JOptionPane.INFORMATION_MESSAGE);
        }
    } //end actionPerformed
}//end actionPerformed