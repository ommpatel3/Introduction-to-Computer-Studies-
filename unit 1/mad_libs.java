public class mad_libs
{
    public static void main (String args[])
    {
        new mad_libs ();
    }

    public mad_libs()
    {
        int num1=IBIO.inputInt("\nenter a number");
        String object=IBIO.inputString("enter an object");
        String name=IBIO.inputString("enter a name");
        String place=IBIO.inputString("enter a place");
        String adj=IBIO.inputString("enter an adjective");
        String adj3=IBIO.inputString("enter another adjective");
        String adj2=IBIO.inputString("enter yet another adjective");
        String time=IBIO.inputString("enter a time of day");
        
        System.out.println("\nOnce upon a time, there was a person named "+name);
        System.out.println("he lived in "+place);
        System.out.println("at "+time+","+name+" felt very "+adj);
        System.out.println("he ate "+num1+" "+object+"s and felt "+adj3);
        System.out.println("but after some time he felt "+adj2+" and became a legend");
        System.out.println("The End");
    }
}