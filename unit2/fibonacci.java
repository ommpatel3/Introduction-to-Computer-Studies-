public class fibonacci
{
    public static void main (String[] args)
    {
        new fibonacci ();
    }

    public fibonacci()
    {
        int num1 = 1, num2 = 1;
        System.out.println("\n ");
        for (int i = 1; i <= 12;i++)
        {
            System.out.print(num1 + " ");

            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
        System.out.print("\n ");
        int num11=1, num22=2;
        for (int i = 1; i <= 10;i++)
        {
            System.out.print(num11+"/"+num22+"  ");
            num11++;
            num22++;
        }
        System.out.print("\n ");
        for (int i=0;i<=10;i++)
        {
            int num222=(int)Math.pow(i,2);
            System.out.print(num222+ " ");
        }
    }
}