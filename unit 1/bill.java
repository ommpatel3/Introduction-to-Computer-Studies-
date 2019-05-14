public class bill
{
    public static void main (String args[])
    {
     new bill();
    }
    
    public bill()
    {
       double cost=IBIO.inputInt("insert the price of the food:");
       double tip=IBIO.inputInt("tip percent:");
       double tipamount= (cost*tip/100);
       System.out.println("the tip amount is: "+tipamount);
       double tax=(cost*13/100);
       System.out.println("the tax is:"+tax);
       double total=(cost+tax+tip);
       System.out.println("the total amount is: "+total);
       int people=IBIO.inputInt("how many people:");
       double per=(total/people);
       System.out.print("Each person pays: "+per);

    }
}   