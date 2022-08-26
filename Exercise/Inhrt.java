class Loan
{
 public void parent()
{
 System.out.println("Parent class");
}
 public void child()
{
System.out.println("in child class");
}
}
 class Inhrt
{
 public static void main(String []args)
{
Loan l=new Loan();
l.parent();
l.child();
}
}