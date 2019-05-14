public class lettergame
{
    public static void main (String[] args)
    {
        new lettergame ();
    }
    public lettergame()
    {
        char[] letters = {'x','b','c','d','w','f','g','h','y','z'};
        int num=(int)(Math.random()*9+0);
        char letter= letters[num];
        String input=IBIO.inputString("\ninsert a word that starts with "+letter);
        if(input.charAt(0)==letter||input.charAt(0)==letter-32)
        {
            System.out.println("correct, You Win!");
        } 
        else
        {
            System.out.println("Wrong, You Lose!");
        }
    }
}


