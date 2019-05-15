public class phi
{
    public static void main (String args[])
    {
        double a = 1;
        double b = 1.0;
        for (int i = 0 ; i < 25 ; i++)
        {
            System.out.println (i + ". " + b + "/" + a + ": " + (b / a));
            double temp = b;
            b = a + b;
            a = temp;
        }
    }
}