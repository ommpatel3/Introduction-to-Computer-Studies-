public class fizzbuzz
{
    public static void main (String[] args)
    {
        new fizzbuzz ();
    }
    
    public fizzbuzz()
    {
        int i=1;
        while(i<=100)
        {
           if ((i%3!=0)&&(i%5!=0))
           {
               System.out.print(i+" ");
           }
           if ((i%3==0)&&(i%5==0))
           {
               System.out.print("FizzBuzz ");
           }
           else if(i%3==0)
           {
               System.out.print("Fizz ");
           }
           else if (i%5==0)
           {
               System.out.print("Buzz ");
           }
           i++;
        }
    }
}