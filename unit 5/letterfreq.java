public class letterfreq
{
    public static void main (String[] args)
    {
        new letterfreq ();
    }

    public letterfreq()
    {

        char letters[]={'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n','o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        double frequency[]={8.167, 1.492, 2.782, 4.253, 12.702, 2.228, 2.015, 6.094, 6.966, 0.153,0.772, 4.025, 2.406, 6.749, 7.507, 1.929, 0.095, 5.987, 6.327, 9.056,2.758, 0.978, 2.360, 0.150, 1.974, 0.074};
        double sum=0;
        for (int i=0; i<frequency.length;i++)
        {
            sum+=frequency[i];
        }
        System.out.println("The average is: "+(sum/26));
        System.out.print("The sum is: "+sum);
        if (sum==100)
        {
            System.out.println(" - Accurate");
        }
        else
        {
            System.out.println(" - Mild Rounding Error");
        }
        for (int i=0; i<frequency.length;i++)
        {
            sum+=frequency[i];
        }
    }
}