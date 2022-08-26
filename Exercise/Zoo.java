interface Animal
{
      void eat();
      void Sleep();
}
abstract class WildAniml implements Animal
{
    public void Sleep()
    {
        System.out.println("Sleeps at Night");
    
    }
}
      class Lion extends WildAniml
{
   public void eat()
   {
    System.out.println("******************");
    System.out.println("Lion eat Non-veg");
   }  
}
      class Rabbit extends WildAniml
{
   public void eat()
   {
    System.out.println("*********************");
    System.out.println("Rabbit doesn't eat Non_veg ");
   }  
}
          class Hipopotomus extends WildAniml
{
   public void eat()
   {
    System.out.println("***********************");
    System.out.println("Hipopotomus doesn't eat Non-veg it eats only healthy food ");
   }  
}
public class Zoo {
      public static void main(String args[])
      {
        WildAniml wld=new Lion();
        wld.eat();
         wld.Sleep();
       
         wld=new Rabbit();
        wld.eat();
        wld.Sleep();
        
        wld=new Hipopotomus();
        wld.eat();
        wld.Sleep();
      }
}
