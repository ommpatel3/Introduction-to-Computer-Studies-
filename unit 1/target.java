public class target
{
    public static void main (String args[])
    {
        new target ();
    }

    public target()
    {
        int magic=(int)(Math.random() * 1000 + 1);
        int guess1=IBIO.inputInt("\ninsert first guess (1-1000)");
        int guess2=IBIO.inputInt("insert second guess (1-1000)");
        if (guess1>1000||guess2>1000)
        {
         System.out.println("number is not within the range");
        }
        else
        {
            int maxg=Math.max(guess1,guess2);  
            int ming=Math.min(guess1,guess2); 
            boolean max=maxg>magic;
            boolean min=ming<magic;
            boolean correct=guess1==magic||guess2==magic;
            System.out.println("it is "+max+" that "+maxg+" is more than my number");
            System.out.println("it is "+min+" that "+ming+" is less than my number");
            System.out.println("it is "+correct+" that you guessed my number");
            System.out.println("the number was "+magic+"!");
        
        }
    }
}