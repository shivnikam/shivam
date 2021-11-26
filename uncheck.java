class uncheck
{
   public static void main(String args[])
   {
     try
      {
         int[] num={1,2,3,4,5};
         System.out.println(num[0]);
         System.out.println(num[3]);
         System.out.println(num[6]);

      }
   
      catch(Exception i)
      {
        System.out.println(i);
        
   
      }
      System.out.println("exception caught in above block");

   }
}