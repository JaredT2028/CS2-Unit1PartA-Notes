/* This is my comment space! */


public class Main {

   public static void main(String []args) {
      /* 
      System.out.println("It makes no sense to divide a number by zero!");
      System.out.println(3/0);
      */

      double myGradeAverage = 95.0;
      //assign a value
      double myDreamGrade = 100.0;

      System.out.println("My current grade is: " + myGradeAverage);
      // print statement for ideal grade
      System.out.println("My dream grade is " + myDreamGrade + "!");

      // Task 
      System.out.print("Hi ");
      System.out.print("there");
      System.out.print("!");

      System.out.println("My teacher always says, \n\"Study for your test!\"");
      System.out.println("I \"have\" an " + myDreamGrade + " in every class!");

      //arithmetic operations (+ - * /)
      //working with only ints, output will be an int 
      //int / int does Truncating Division
      System.out.println(5*10);

      int myNum =7;
      int newNum = myNum;
      newNum = 8;

      System.out.println(myNum);
      System.out.println(newNum);

      myNum = myNum + 1; 
      myNum = myNum + 1;
      myNum++;

      System.out.println(myNum);

      System.out.println("Greetings human! What is your name?");
      Scanner scan = new Scanner(System.in);
   }
}

