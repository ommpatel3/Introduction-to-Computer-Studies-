public class magic8
{
    public static void main (String[] args)
    {
        new magic8 ();
    }

    public magic8()
    {
        int num=(int) (Math.random () * 5) + 1;
        String input=IBIO.inputString("\nWhat's your question");
        if (num==1)
        {
            System.out.print("yes, certainly");     
        }
        else if (num==2)
        {
            System.out.print("for sure not!"); 
        }
        else if (num==3)
        {
            System.out.print("I don't know"); 
        }
        else if (num==4)
        {
            System.out.print("Likely not");
        }
        else if (num==5)
        {
            System.out.print("Probably");
        }
        
    }
}

