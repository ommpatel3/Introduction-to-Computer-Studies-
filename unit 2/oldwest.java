
/**
 *
 * 
 * 
 * 
 */
public class oldwest
{
    public static void main (String args[])
    {
        new oldwest ();
    }
    //System.out.println("");
    //password method
    public oldwest()
    {
        oldwestsign();
        System.out.println("\nWelcome to The Old West!");
        System.out.println("\nTask:\nFind Ghost Vitruvius\n");
        System.out.println("Emmet: Hey, What's that? ");
        wait(1500);
        System.out.println("A saloon?");
        System.out.println("Let's go inside, I remember Vitruvius used to be there all the time\n");
        olddoor();
        char open=IBIO.inputChar("\nPress a key to open the door and go inside ");
        System.out.println("\nInside, a lego man greets you,");
        System.out.println("\"Ey there you, you ain't from around these parts, are ye?\"");
        System.out.println("\nYou put on your best wild west accent and say:");
        System.out.println("\"uh, yeah-I mean howdy partner i'm from around here all right yeeeehaw eh?\"");
        System.out.println("\nHe grumbles: \"hmm ok sure now what about\"-he squints his eyes-\"Backjack\"");
        char play=IBIO.inputChar("Do you want to play? (y/n)");
        if (play=='y'||play=='Y')
        {
            System.out.println("Ok then, let's go");
            wait(1500);
            blackjack();
        }
        else
        {
            System.out.println("\nHe puts his hand on his revolver and looks like he's getting angry");
            System.out.println("Hey, the poster on the wall kind of looks like him too, \nHe is none other than Buckeye Bill, the Sharpest shooter of the old west!");
            System.out.println("\nIt's probably your best interest to say yes");
            wait(2500);
            blackjack();
        }
        System.out.println("");
        System.out.println("");
    }  

    public void oldwestsign()
    {
        System.out.println("______ _             __   _           _       ");             
        System.out.println("(_) |  | |           /\\_\\/| |    |    (_|   |   |_/");       
        System.out.println("    |  | |     _    |    || |  __|      |   |   | _   , _|_ ");
        System.out.println("  _ |  |/ \\   |/    |    ||/  /  |      |   |   ||/  / \\_|  ");
        System.out.println(" (_/   |   |_/|__/   \\__/ |__/\\_/|_/     \\_/ \\_/ |__/ \\/ |_/");

    }

    public void olddoor()
    {
        System.out.println("   ,-' ;  ! `-.");
        System.out.println(" / :  !  :  . \\");
        System.out.println("|_ ;   __:  ;  |");
        System.out.println(")| .  :)(.  !  |");
        System.out.println("|\"    (##)  _  |");
        System.out.println("|  :  ;`'  (_) (");
        System.out.println("|  :  :  .     |");
        System.out.println(")_ !  ,  ;  ;  |");
        System.out.println("|| .  .  :  :  |");
        System.out.println("|\" .  |  :  .  |");
        System.out.println("|___.;-----.___|");
    }

    public void wait (int time)
    {
        try
        {
            Thread.sleep (time);
        }
        catch (InterruptedException m)
        {
            ;
        }
    }

    public int blackjack()
    {
        //blackjack game
        int dealer=0;
        int player=0;
        char yes='y';
        int i=1;
        System.out.println(" BlackJack");
        System.out.println("+++++++++++");
        System.out.println(" _____");
        System.out.println("|A .  | _____");
        System.out.println("| /.\\ ||A ^  | _____");
        System.out.println("|(_._)|| / \\ ||A _  | _____");
        System.out.println("|  |  || \\ / || ( ) ||A_ _ |");
        System.out.println("|____V||  .  ||(_'_)||( v )|");
        System.out.println("       |____V||  |  || \\ / |");
        System.out.println("              |____V||  .  |");                
        System.out.println("                     |____V|");

        System.out.println("\nHe says, \"But first, lets spice this game up a bit\"");
        System.out.println("If I win, you give me 10 of them diamonds. If you win, I'll give you 20");
        System.out.println("Or if you're a real cowboy, if I win, you give me 20, but if you win, I'll give 40");
        //gets user input on which of the two option they choose, this variable is used later after winning/losing the game
        char bet=IBIO.inputChar("\nWhat do you say partner? are you a cowboy(y/n) ");
        System.out.println("\nOk, lets go\n");
        while ((yes=='y'||yes=='Y')&&i<=5)
        {   
            int card=(int)(Math.random()*11+1);
            player=player+card;
            System.out.println("You got a: "+card);
            System.out.println("Your Score: "+player);
            i++;
            if (player==21)
            {
                System.out.println("You Win!");
                System.exit(0);
            }
            if (player>21)
            {
                System.out.println("You Lose!");
                System.exit(0);
            }
            yes=IBIO.inputChar("Take another card? (y/n) ");
        }
        System.out.println("Dealer's Turn");
        char end='n';
        int i_deal=1;
        while((i_deal<=5)&&(end=='n'))
        {
            int card=(int)(Math.random()*11+1);
            dealer=dealer+card;
            //System.out.println("Dealer got a: "+card);
            //System.out.println("    Dealer's score: "+dealer);
            i++;
            if ((dealer>=16)&&(dealer<21))
            {
                System.out.println("Dealer ends turn");
                end='y';
            }
            if (dealer>21)
            {
                System.out.println("Dealer went over 21! You win!");
                System.exit(0);
            }
        }
        char go=IBIO.inputChar("Would you like to have another turn (y/n)");
        if (go=='y'||go=='Y')
        {
            yes='y';
            while ((yes=='y'||yes=='Y')&&i<=5)
            {   
                int card=(int)(Math.random()*11+1);
                player=player+card;
                System.out.println("You got a: "+card);
                System.out.println("Your Score: "+player);
                i++;
                if (player==21)
                {   
                    System.out.println("You Win!");
                    System.exit(0);
                }
                if (player>21)
                {   
                    System.out.println("You Lose!");
                    System.exit(0);
                }
                yes=IBIO.inputChar("Go again? (y/n) ");
            }
        }

        System.out.println("Let's Compare\n-----------------");
        System.out.println("You had: "+player);
        System.out.println("Dealer had: "+dealer);
        if (player>dealer)
        {
            System.out.println("Looks like won fair and square!");
            if (bet=='y'||bet=='Y')
            {
                System.out.println("Here's your 40 diamonds");
                return(40);
            }
            else 
            {
                System.out.println("Here's your 20 diamonds");
                return(20);
            }
        }
        else if (player<dealer)
        {
            System.out.println("Tough luck, you lose!");
            if (bet=='y'||bet=='Y')
            {
                System.out.println("Listen up, where's my 20?");
                return(-20);
            }
            else 
            {
                System.out.println("Aaand I'll be taking my 10");
                return(10);
            }
        }
        else
        {
            System.out.println("Tie!");
            return 0;
        }
    }
}

