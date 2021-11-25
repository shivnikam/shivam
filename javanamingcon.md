Date: 24th nov 2021

JAVA Naming Conventions:


1) for file names :

  > java source = .java
  > java bytecode = .class

2) for declare package :

   > package abc;

3) for import package :

   > import package name.*;

4) for creating class : (should be start with uppercase letter)

    class abc
   {
     //code
   }

5) for interface :

   interface abc
   {
      //code
   }

6) for method :
   class abc
{
  //method
   void demo()
   {
     //code
   }
}

7) for variable :

  >It should start with a lowercase letter such as id, name.
  >It should not start with the special characters like & , $ , _ (underscore).
  e.g.class Employee
       {
   //variable declaration
          int id;
        //code 
       }


8)  if, if-else, if-else-if-else Statements :

 The if-else class of statements should have the following form:
 if (condition)
 {
   // statements;
 } 
if (condition)
 { 
   // statements;
 }
 else
 {
     //statements; 
}
 if (condition) 
{
  //Statements;
 }
 else if (condition)
{
  //Statements;
} else if (condition)
{
   // Statements;
}

9) for loop :

   for (initialization; condition; update) 
   {
      //Statements;
   }


10) while loop :
    while (condition) 
    {
       Statements;
    }

 
 11) do while loop :
      do 
       { 
          //Statements;
       }
       while (condition);

 12) switch case :
      
         switch (condition) 
          {
           case 1: 
           statements; 
           break;

           case 2:   
           Statements;
           break;

           case 3: 
           statements; 
           break; 

          Default:
          Statements;
          break;
         }

 13) try , catch block :
   try
    { 
     statements; 
     } 
    catch (Exceptionclass e)
    { 
     Statements; 
    }


   >Vim Commands

    ESC= Switch To Command Mode
    :wq = Write and Quit
    :q! = Quit
    :i=Insert
