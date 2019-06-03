public class commonk
{
    public static void main (String[] args)
    {
        new commonk ();
    }

    public commonk()
    {
        int fibonacci[]=new int[10];
        for (int i=0; i<fibonacci.length; i++)
        {
            int num1 = 1, num2 = 1;
            System.out.println("\n ");
            for (int j = 1; j <= 12;j++)
            {
                System.out.print(num1 + " ");

                int sum = num1 + num2;
                num1 = num2;
                num2 = sum;
            }
        }
    }
}