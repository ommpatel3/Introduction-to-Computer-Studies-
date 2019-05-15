public class blackjackshellac
{
    public static void main (String[] args)
    {
        new blackjackshellac ();
    }

    public blackjackshellac()
    {
        int dealer=0;
        int player=0;
        char yes='y';
        int i=1;
        System.out.println(" BlackJackShellac");
        System.out.println("++++++++++++++++++");
        System.out.println("        ()");
        System.out.println("        /\\");
        System.out.println("   ()--'  '--()");
        System.out.println("     `.    .'");
        System.out.println("      / .. \\");
        System.out.println("     ()'  '()");

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
            System.out.println("You Win!");
        }
        else if (player<dealer)
        {
            System.out.println("You Lose!");
        }
        else
        {
            System.out.println("Tie!");
        }
    }
}