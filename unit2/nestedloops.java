public class nestedloops
{
    public static void main (String[] args)
        {
            new nestedloops ();
        }
        
    public nestedloops()
    {
            //cards
            for (int i=1;i<=52;i++)
            {
                if (i%13==1)
                {
                    System.out.print("Ace of ");
                }
                else if (i%13==2)
                {
                    System.out.print("2 of ");
                }
                else if (i%13==3)
                {
                    System.out.print("3 of ");
                }
                else if (i%13==4)
                {
                    System.out.print("4 of ");
                }
                else if (i%13==5)
                {
                    System.out.print("5 of ");
                }
                else if (i%13==6)
                {
                    System.out.print("6 of ");
                }
                else if (i%13==7)
                {
                    System.out.print("7 of ");
                }
                else if (i%13==8)
                {
                    System.out.print("8 of ");
                }
                else if (i%13==9)
                {
                    System.out.print("9 of ");
                }
                else if (i%13==10)
                {
                    System.out.print("10 of ");
                }
                else if (i%13==11)
                {
                    System.out.print("Jack of ");
                }
                else if (i%13==12)
                {
                    System.out.print("Queen of ");
                }
                else
                {
                    System.out.print("King of ");
                }
                if (i<=13)
                {
                   System.out.println("Hearts");
                }
                else if (i<=26)
                {
                   System.out.println("Diamonds");
                }
                else if (i<=39)
                {
                   System.out.println("Spades");
                }
                else if (i<=52)
                {
                   System.out.println("Clubs");
                }
            }
            //multiplication
            System.out.println("\n");
            for (int num=1;num<=10;num++)
            {
                for (int i=1;i<=10;i++)
                {
                    System.out.println(num+"*"+i+"="+(num*i));
                }
            }
            System.out.println("\n");
            //tape
            int length=IBIO.inputInt("insert length of tape");
            System.out.println("+/\\/\\/\\/\\/\\+");
            for (int i=1;i<=length;i++)
            {
                System.out.println("|          |");
            }
            System.out.println("+/\\/\\/\\/\\/\\+");
            System.out.println("\n");
            
            //pyramid
            int height=IBIO.inputInt("height");
            for (int row=0; row<height; row++) 
            {    
                for (int spaces=height-row; spaces>1; spaces--) 
                { 
                    // printing spaces 
                    System.out.print(" "); 
                    //System.out.print("spaces"+spaces);
                } 
                for (int star=0; star<=row; star++ ) 
                { 
                    // printing stars 
                    System.out.print("* "); 
                    //System.out.print("star"+star);
                } 
                System.out.println();
            }
        }
}