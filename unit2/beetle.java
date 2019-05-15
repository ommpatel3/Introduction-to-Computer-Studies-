public class beetle
{
    public static void main (String[] args)
    {
        new beetle ();
    }

    public beetle()
    {
        int person1=0;
        int person2=0;
        int turn = 1;
        instructions();
        while (person1!=6 && person2!=6)
        {
            if (turn==1){
                System.out.println("It is person 1’s turn");
                person1 = turn (person1);
                turn=2;
            }
            else if (turn==2){
                System.out.println("It is person 2’s turn");
                person2= turn (person2);
                turn=1;
            }
            if (person1==6){
                System.out.println("Person 1 won");
            }
            else{
                System.out.println("Person 2 won");
            }
        }
    }    

    public void instructions()
    {
        System.out.println("The goal of beetle is to be the first to draw the beetle in the correct order.");
        System.out.println("To be able to draw a body part, you need to roll the correct thing at the correct");
        System.out.println("time.");
        System.out.println("Body = 0");
        System.out.println("Leg 1 = 1");
        System.out.println("Leg 2 = 2");
        System.out.println("Leg 3 = 3");
        System.out.println("Leg 4 = 4");
        System.out.println("Leg 5 = 5");
        System.out.println("Leg 6 = 6");
        System.out.println("If you don’t roll what you are looking for, the part passes to the other player.");
    }

    public int turn (int score)
    {
        int roll=RollDice();
        if (roll == score+1)
        {
            DrawBeetle(score+1);
            return (score+1);
        }
        else
        {
            System.out.println(roll+" Too Bad");
            return score;
        }
    }

    public int RollDice( )
    {
        int dice=(int)(Math.random() * 6) + 1;
        return dice;
    }

    public void DrawBeetle (int score)
    {
        System.out.println("Your score is "+ score);
        if (score ==0)
        {
            System.out.println ("        \\   / ");
            System.out.println ("        .\\-/. ");
            System.out.println ("        () ()   ");
            System.out.println ("        /~-~\\  ");
            System.out.println ("       y  Y  V ");
            System.out.println ("      /   |   \\ ");
            System.out.println ("     {    |    }   ");
            System.out.println ("      \\   |    / ");
            System.out.println ("       \\  A   / ");
            System.out.println ("        \\/ \\/    ");
            System.out.println ("                  ");
        }
        else if (score == 1)
        {
            System.out.println ("        \\   / ");
            System.out.println ("        .\\-/. ");
            System.out.println ("   /\\   () ()  ");
            System.out.println ("  /  \\  /~-~\\ ");
            System.out.println ("       y  Y  V ");
            System.out.println ("      /   |   \\ ");
            System.out.println ("     {    |    }    ");
            System.out.println ("      \\   |    / ");
            System.out.println ("       \\  A   / ");
            System.out.println ("        \\/ \\/    ");
            System.out.println ("                  ");
        }
        else if (score ==2)
        {
            System.out.println ("        \\   / ");
            System.out.println ("        .\\-/. ");
            System.out.println ("   /\\   () ()  /\\ ");
            System.out.println ("  /  \\  /~-~\\ /  \\ ");
            System.out.println ("       y  Y  V ");
            System.out.println ("      /   |   \\ ");
            System.out.println ("     {    |    }    ");
            System.out.println ("      \\   |    / ");
            System.out.println ("       \\  A   /");
            System.out.println ("        \\/ \\/   ");
            System.out.println ("                  ");
        }
        else if (score == 3)
        {
            System.out.println ("        \\   / ");
        System.out.println ("        .\\-/. ");
        System.out.println ("   /\\   () ()  /\\ ");
        System.out.println ("  /  \\  /~-~\\ /  \\ ");
        System.out.println ("       y  Y  V ");
        System.out.println (" ,-^-./   |   \\ ");
        System.out.println ("/    {    |    }    ");
        System.out.println ("      \\   |    / ");
        System.out.println ("       \\  A   / ");
        System.out.println ("        \\/ \\/   ");
        System.out.println ("                  ");
        }
        else if (score ==4)
        {
            System.out.println ("        \\   / ");
        System.out.println ("        .\\-/. ");
        System.out.println ("   /\\   () ()  /\\ ");
        System.out.println ("  /  \\  /~-~\\ /  \\ ");
        System.out.println ("       y  Y  V ");
        System.out.println (" ,-^-./   |   \\,-^-. ");
        System.out.println ("/    {    |    }    \\");
        System.out.println ("      \\   |    / ");
        System.out.println ("       \\  A   / ");
        System.out.println ("        \\/ \\/    ");
        System.out.println ("                  ");
        }
        else if (score ==5)
        {
            System.out.println ("        \\   / ");
        System.out.println ("        .\\-/. ");
        System.out.println ("   /\\   () ()  /\\ ");
        System.out.println ("  /  \\  /~-~\\ /  \\ ");
        System.out.println ("       y  Y  V ");
        System.out.println (" ,-^-./   |   \\,-^-. ");
        System.out.println ("/    {    |    }    \\");
        System.out.println ("      \\   |    / ");
        System.out.println ("      /\\  A   / ");
        System.out.println ("     /  \\/ \\/    ");
        System.out.println ("    /             ");
        }
        else
        {
            System.out.println ("        \\   / ");
            System.out.println ("        .\\-/. ");
            System.out.println ("   /\\   () ()  /\\ ");
            System.out.println ("  /  \\  /~-~\\ /  \\ ");
            System.out.println ("       y  Y  V ");
            System.out.println (" ,-^-./   |   \\,-^-. ");
            System.out.println ("/    {    |    }    \\");
            System.out.println ("      \\   |    / ");
            System.out.println ("      /\\  A   /\\ ");
            System.out.println ("     /  \\/ \\/   \\ ");
            System.out.println ("    /            \\ ");
        }
    }
}
 