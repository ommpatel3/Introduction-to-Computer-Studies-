public class lebonbon
{
    public static void main (String args[])
    {
        new lebonbon();
    }
    
    public lebonbon()
    {
        int caram= IBIO.inputInt("input caramels");
        double total=caram*.75;
        System.out.print(total);
    }
}   