public class magic8array
{
    public static void main (String[] args)
    {
        new magic8array ();
    }

    public magic8array()
    {
        String[] fortune = {"yes, certainly", "no, not at all", "maybe","probably not", "most likely"};
        String question=IBIO.inputString("\nask a question:");
        int num=(int) (Math.random () * 4) + 1;
        System.out.println(fortune[num]);
    }
}

