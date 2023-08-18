class  Dhoni
{
    public static void roll()
     {
         System.out.println("wicket_keeper");
     }
}
class  Play extends Dhoni
{
    public static void roll()
     {   
         
         System.out.println("wicket_keeper  and batsMan");
     }
}

class  Captain extends Play
{
    public static void roll()
     {    
        
         System.out.println("wicket_keeper  and batsMan and Captain of the team");
     }
}
class Criket
{
   public static void main(String [] args)
        {
          Captain c=new Captain();
           c.roll();
         }
}