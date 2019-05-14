public class sad_little_store
{
    public static void main (String args[])
    {
        new sad_little_store();
    }
    
    public sad_little_store()
    {
        //inputs
        System.out.println("+++++++++++++++++++++++");
        System.out.println("Welcome to Toad's Toys!");
        System.out.println("+++++++++++++++++++++++");
        int lego=IBIO.inputInt("1. How many lego sets would you like?");
        int car=IBIO.inputInt("2. How many remote control cars would you like?");
        int yoyo=IBIO.inputInt("3. How many yoyos would you like?");
        int doll=IBIO.inputInt("4. How many dolls would you like?");
        int bear=IBIO.inputInt("5. How many teddy bears would you like?");
        //bill
        System.out.println("++++++++++++++++");
        System.out.println("Toad's Toys Bill");
        System.out.println("++++++++++++++++");
        double legocost= (lego*19.50);
        System.out.println(lego+" lego set @ $ 19.50= "+legocost);
        double carcost=(car*29.50);
        System.out.println(car+" car @ $29.50 = "+carcost);
        double yoyocost=(yoyo*5.00);
        System.out.println(yoyo+" yoyo @ $5.00 = "+yoyocost);
        double dollcost=(doll*15.50);
        System.out.println(doll+" doll @ $15.50 = "+dollcost);
        double bearcost=(bear*10.00);
        System.out.println(bear+" teddy bear @ $10.00 = "+bearcost);
        //subtotal
        double subtotal= legocost+carcost+yoyocost+dollcost+bearcost;
        System.out.println("\nSubtotal: $"+ subtotal);
        //tax
        double tax= (subtotal*0.13);
        double tax1= (int)(tax*100);
        double taxfinal=tax1/100;
        System.out.println("Tax: $"+taxfinal+"(at 13%)");
        //total
        double total= taxfinal+subtotal;
        double total1=(int)(total*100);
        Double totalfinal=total1/100;
        System.out.println("Total: $"+totalfinal);
        //pay
        double pay=IBIO.inputInt("\nEnter the amount of money paid: $");
        if (pay<total)
        {
            double remaining=(int)total1-(pay*100);
            double remainingfinal=remaining/100;
            System.out.println("That's not enough. you have to pay an additional $"+remainingfinal);
        }
        else if (pay>total)
        {
            double extra=pay-total;
            double extra1= (int) (extra*100);
            double extrafinal=extra1/100;
            System.out.println("Your change is $"+extrafinal);
        }
        else
        {
            System.out.print("Thank you, have a good day");
        }
    }
}   