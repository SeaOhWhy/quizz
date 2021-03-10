import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // THE 8 PRIMITIVE DATA TYPES:
    // integer : Stores whole numbers from -2,147,483,648 to 2,147,483,647

    String q1 = "an int";
    System.out.println("What data type would you use for 4");
    int answer = scan.nextInt();

    if (q1(answer)) {
      System.out.println("You are correct!");
    } else {
      System.out.println("That answer is not correct. 1 point will be deducted. you now have 7 points");
    }

    String q2 = "Link";
    System.out.println("2.2 is a string");
    boolean answer = scan.nextBoolean();

    if (q2(answer)) {
      System.out.println("You are correct!");
    } else {
      System.out.println("That answer is not correct. 1 point will be deducted. you now have 6 points");
    }

    double q3 = 0.75;
    System.out.println("what data type is the equation 3/4? ");
    double answer = scan.nextDouble();

    if(q1(answer)) 
    {
      System.out.println("Correct!");
    }else{
      System.out.println("That answer is not correct. 1 point will be deducted. you now have 5 points");
    }

    float  q4 = 0.14;
    System.out.println("What's 2/14");
    float answer = scan.nextFloat();

    if(q4(answer)) 
    {
      System.out.println("Correct!");
    }else{
      System.out.println("That answer is not correct. 1 point will be deducted. you now have 4 points");
    }
    char q5 = "I";
    System.out.println("There is no ___ in us.");
    char answer = scan.nextChar();

    if(q5(answer)) 
    {
      System.out.println("Correct!");
    }else{
      System.out.println("That answer is not correct. 1 point will be deducted. you now have 3 points");
    }
    long q6 = -3;
    System.out.println("What is 1 - 4");
    long answer = scan.nextLong();

    if(q6(answer)) 
    {
      System.out.println("Correct!");
    }else{
      System.out.println("That answer is not correct. 1 point will be deducted. you now have 2 points");
    }
    String q7 = " A short";
    System.out.println("What data type is the number 32");
    Short answer = scan.next();

    if(q7(answer)) 
    {
      System.out.println("Correct!");
    }else{
      System.out.println("That answer is not correct. 1 point will be deducted. you now have 1 points");
    }
    byte q8 = "Link";
    System.out.println("Enter your name");
    byte Answer = scan.nextByte();

    if(q8(answer)) 
    {
      System.out.println("Correct!");
    }else{
      System.out.println("That answer is not correct. ");
    }
    // Write a program quizzing your user on the 8 primitive data types (reference
    // today's notes)
    // For example:
    // Print: What data type would you use to represent 102 ?
    // Receive input from user & save into a variable
    // Using an If statement, check to see if the user was correct
    // If correct, add 1 to the Score variable

    // Make sure to test for all primitive data types
    // Print out the user's score at the end of program.

  }
}t7x6rxf