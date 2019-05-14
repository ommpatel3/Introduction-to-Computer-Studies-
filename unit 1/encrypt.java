public class encrypt
{
    public static void main (String[] args)
    {
        new encrypt ();
    }
    public encrypt()
    {
        char ed= IBIO.inputChar("Encrypt or decrypt? (e/d)");
        if (ed=='e')
        {
            char ch1= IBIO.inputChar("first letter: ");
            char ch2= IBIO.inputChar("second letter: ");
            char ch3= IBIO.inputChar("third letter: ");
            char ch4= IBIO.inputChar("fourth letter: ");
            int num= (int)(Math.random()*26+0);
            char let1=(char)(ch1+num);
            char let2=(char)(ch2+num);
            char let3=(char)(ch3+num);
            char let4=(char)(ch4+num);
            String code= (""+let1+let2+let3+let4);
            System.out.println(code);
            System.out.println("key: "+num);
        }
        if (ed=='d')
        {
            int key= IBIO.inputInt("insert key: ");
            char ch1= IBIO.inputChar("first letter: ");
            char ch2= IBIO.inputChar("second letter: ");
            char ch3= IBIO.inputChar("third letter: ");
            char ch4= IBIO.inputChar("fourth letter: ");
            char let1=(char)(ch1-key);
            char let2=(char)(ch2-key);
            char let3=(char)(ch3-key);
            char let4=(char)(ch4-key);
            String code= (""+let1+let2+let3+let4);
            System.out.println(code);
        }
        else
        {
            System.out.print("not a valid character");
        }
    }
}


