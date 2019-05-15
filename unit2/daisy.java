public class daisy
{
    public static void main (String[] args)
    {
        new daisy ();
    }

    public daisy()
    {
        System.out.println("   ,-' ;  ! `-.");
        System.out.println(" / :  !  :  . \\");
        System.out.println("|_ ;   __:  ;  |");
        System.out.println(")| .  :)(.  !  |");
        System.out.println("|\"    (##)  _  |");
        System.out.println("|  :  ;`'  (_) (");
        System.out.println("|  :  :  .     |");
        System.out.println(")_ !  ,  ;  ;  |");
        System.out.println("|| .  .  :  :  |");
        System.out.println("|\" .  |  :  .  |");
        System.out.println("|___.;-----.___|");
        int num=(int)(Math.random()*15+25);
        for (int i=1;i<=num;i++)
        {
            if (i%2==0){
                System.out.println("You may enter");
            }
            else {
                System.out.println("You may not enter");
            }
            try
            {
                Thread.sleep(i*10+100);
            }
            catch (InterruptedException m)
            {
                ;
            }
        }
    }
}