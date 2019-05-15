public class piglatin
{
    public static void main (String[] args)
    {
        new piglatin ();
    }
    public piglatin()
    {
        char run='y';
        while (run=='y'){
            String word=IBIO.inputString("Insert word");
            String pl= word.substring(1)+word.charAt(0)+"ay";
            System.out.println(pl);
            run=IBIO.inputChar("another word? (y/n)");
        }
    }
}