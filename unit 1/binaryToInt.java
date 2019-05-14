public class binaryToInt
{
    public static void main (String args[])
    {
        new binaryToInt ();
    }

    public binaryToInt()
    {
        int decNum=0;
        int place=1;
        int binNum=IBIO.inputInt("\nInsert a binary number: ");
        while (binNum !=0)
        {
            int n=binNum%2;
            int decPlace=n*place;
            decNum=decNum+decPlace;
            binNum=binNum/10;
            place=place*2;
        }
        System.out.print (decNum);
    }
}