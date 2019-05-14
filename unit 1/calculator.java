public class calculator
{
    public static void main (String[] args)
    {
        new calculator ();
    }

    public calculator()
    {
        int num1=IBIO.inputInt("\ninput first number");
        
        if (num1 >= -999 && num1 <= 999) 
        {
            
        }
        else
        {
                System.out.println("input is not a number");
                System.exit(0);
        }
        
        String op= IBIO.inputString("input math operation");
        
        int num2=IBIO.inputInt("input second number");
        
        int ans;
        if (op.equals("+")) 
            {
                ans= num1+num2;
                System.out.println("the answer is: "+ans);
            }
            else if (op.equals("-"))
            {
                ans=num1-num2;
                System.out.println ("the answer is: "+ans);
            }
            else if (op.equals("*"))
            {
                ans=num1*num2;
                System.out.println ("the answer is: "+ans);
            }
            else if (op.equals("/"))
            {
                ans=num1/num2;
                System.out.println ("the answer is: "+ans);
            }
            else
            {
                System.out.println("input is not a valid math operation");
            }   
        
        
    }
}

