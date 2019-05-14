public class shopping
{
    public static void main (String args[])
    {
        new shopping();
    }
    
    public shopping()
    {
        System.out.println("\nBlue candies are $1 each.");
        float blue=IBIO.inputInt("how many blue candies did you buy?");
        System.out.println("Red candies are $2 each.");
        float red=IBIO.inputInt("how many red candies did you buy?");
        System.out.println("Green candies are $3 each.");
        float green=IBIO.inputInt("how many green candies did you buy?");
        float total=(((red*2)+(blue)+(green*3))*113/100);
        System.out.println("the total is: "+total);
    }
}   