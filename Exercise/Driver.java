interface vechicle
{
      void engine();
      void breaks();
}
abstract class Bus implements  vechicle
{
    public void breaks()
    {
        System.out.println("Apply breaks");
    
    }
}
class RedBus extends Bus
{
   public void engine()
   {
    System.out.println("Engine speed per hour is 5000cc");
   }  
}
class StBus extends Bus
{
   public void engine()
   {
    System.out.println("Engine speed per hour is 2000cc");
   }  
}
class volva extends Bus
{
   public void engine()
   {
    System.out.println("Engine speed per hour is 23000cc");
   }  
}

public class Driver {
    public static void  main(String []args)
    {
        vechicle v =new RedBus();
        v.breaks();
        v.engine();
        v=new volva();
        v.breaks();
        v.engine();
        v=new StBus();
        v.breaks();
        v.engine();


    }
}

