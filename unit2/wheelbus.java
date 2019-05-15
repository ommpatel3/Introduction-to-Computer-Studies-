public class wheelbus
{
    public static void main (String[] args)
    {
        String object=IBIO.inputString("Insert object");
        String sound=IBIO.inputString("What does it do?");
        String verb=IBIO.inputString("Go or goes?");
        String place=IBIO.inputString("Where?");
        wheelbus(object, verb, sound, place);
        wheelbus("car", "go", "vroom", "town");
    }
    public static void wheelbus(String object, String verb, String sound, String place)
    {
        System.out.println("The "+object+" on the bus "+verb+" "+sound+" and "+sound);
        System.out.println(sound+" and "+sound+", "+sound+" and "+sound);
        System.out.println("The "+object+" on the bus "+verb+" "+sound+" and "+sound);
        System.out.println("All through "+place);
    }
}