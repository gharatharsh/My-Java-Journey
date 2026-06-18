import java.util.Scanner;

public class Decision_Making {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

// Q1. Take a number from user, check if it's positive, negative or zero.    

    System.out.print("Enter the Number to check is Positive , Negative Or Zero: ");
    int a = sc.nextInt();

    if (a > 0) {
        System.out.println("Your Number is Positive: "+a);
    }
    else if (a == 0) {
        System.out.println("Your Number is Equal to Zero: "+a);
    }
    else{
        System.out.println("Your Number is in Negative: "+a);
    }

// Q2. Take age from user, if age >= 18 print "Eligible to Vote" else print "Not Eligible".

    System.out.print("Enter your Age Here: ");
    int Age = sc.nextInt();

    if(Age >= 18){
        System.out.println("You are Eligible to Vote.!");
    }
    else{
        System.out.println("Sorry But You are Not Eligible to Vote.!");
    }

// Q3. Take two numbers, print the largest one.

    System.out.print("Enter Your 1st Number:");
    int b = sc.nextInt();

    System.out.println("Enter Your 2nd Number:");
    int C = sc.nextInt();

    if(b > C){
        System.out.println("Your 1st Number is Greater Than 2nd Number:"+b);
    }
    else {
        System.out.println("Your 2nd Number is Greater Than 1st Number:"+C);
    }

// Q4. Take a number, check if it's even or odd using ternary operator.

    System.out.print("Enter a number: ");
    int num = sc.nextInt();

    // Using ternary operator
    String result = (num % 2 == 0) ? "Even" : "Odd";

    System.out.println("The number is: " + result);

// Q5. Take marks from user, if marks >= 40 print "Pass" else print "Fail".

    System.out.println("Enter Your Marks: ");
    int Marks = sc.nextInt();
    
    if(Marks >= 40){
        System.out.println("You Pass 😊");
    }
    else{
        System.out.println("Sorry, you Fail");
    }

// Q6. Take marks from user and print grade:

// 90+ → A
// 80-89 → B
// 70-79 → C
// 60-69 → D
// Below 60 → Fail

  System.out.println("Enter Your Marks ");
  int marks = sc.nextInt();

  if (marks >= 90) {
      System.out.println("You Got A Gread");
  }
  else if (marks >= 80 && marks < 90){
    System.out.println("You Got B Gread");
  }
else if (marks >= 70 && marks < 80){
    System.out.println("You Got C Gread");
  }
else if (marks >= 60 && marks < 70){
    System.out.println("You Got D Gread");
  }
else if(marks < 60){
    System.out.println("You Fail");
}
else{
    System.out.println("Enter Valid Marks:");
}

// Q7. Take three numbers from user and find the largest using nested if.

    System.out.print("Enter Your 1st Number:");
    int d = sc.nextInt();

    System.out.println("Enter Your 2nd Number:");
    int e = sc.nextInt();

    
    System.out.println("Enter Your 2nd Number:");
    int f = sc.nextInt();

    if(d > e && d > f){
        System.out.println("Your 1st Number is Greater Than Other Numbers:"+d);
    }
    else if(e > d && e > f){
        System.out.println("Your 2nd Number is Greater Than Other Numbers:"+e);
    }
    else{
        System.out.println("F is Greater Number: "+f);
    }

// Q8. Take a year from user, check if it's a leap year or not.

            System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Leap year condition
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }

// Q9. Take two numbers and an operator (+,-,*,/) from user and perform that operation.

        System.out.println("--------  Addition ------------------"+1);
        System.out.println("--------  Subtraction ---------------"+2);
        System.out.println("--------  Multiplication ------------"+3);
        System.out.println("-----------  Division ---------------"+4);

        System.out.println("Select The Number:");
        int UserIntput = sc.nextInt();

        System.out.println("Enter Your Value: ");
        int Val1 = sc.nextInt();
        
        System.out.println("Enter Your Value: ");
        int Val2 = sc.nextInt();

        int Addition = Val1 + Val2;
        int Subtraction = Val1 - Val2;
        int Multiplication = Val1 * Val2;
        int Division = Val1 / Val2;

        if(UserIntput == 1){
            System.out.println("Addition is: "+Addition);
        }
        else if(UserIntput == 2){
            System.out.println("Subtraction is: "+Subtraction);
        }
        else if(UserIntput == 3){
            System.out.println("Multiplication is: "+Multiplication);
        }

        else if(UserIntput == 4){
            System.out.println("Division is: "+Division);
        }
        else{
            System.out.println("Select Valid Number To Perform Correct Operation");
        }

// Q10. Take a number from user, check if it's divisible by both 3 and 5.

        System.out.println("Enter the Number: ");
        int Num = sc.nextInt();

        if(Num %3 == 0 && Num % 5 == 0){
            System.out.println("Number is Divisible By Both 3 & 5 :");
        }
        else{
            System.out.println("Number is Not Divisible by 3 & 5 :");
        }

// Q11. Take a number, check if it's a two digit number or not.

        System.out.print("Enter a number: ");
        int numm = sc.nextInt();

        // Check if number is between 10 and 99 OR -10 and -99
        if ((numm >= 10 && numm <= 99) || (numm <= -10 && numm >= -99)) {
            System.out.println(numm + " is a Two-Digit Number.");
        } else {
            System.out.println(numm + " is NOT a Two-Digit Number.");
        }

          // Some Questions for pratice 

// Q12. A person gets discount based on purchase amount:

// Above 10000 → 20% discount
// Above 5000 → 10% discount
// Above 2000 → 5% discount
// Below 2000 → no discount

// Print final amount after discount.

// Q13. Take username and password from user. If username is "admin" and password is "1234" print "Login Successful" else print "Invalid Credentials".
// Q14. Take a number from user — if it's even print its square, if it's odd print its cube.
// Q15. FizzBuzz — Take a number:

// Divisible by 3 → print "Fizz"
// Divisible by 5 → print "Buzz"
// Divisible by both → print "FizzBuzz"
// None → print the number

// Q16. Take salary from user, calculate tax:

// Above 100000 → 30% tax
// Above 50000 → 20% tax
// Above 20000 → 10% tax
// Below 20000 → no tax

// Print tax amount and final salary.

// Q17. Take a character from user, check if it's a vowel or consonant.
// Q18. Take three sides of a triangle, check if it's:

// Equilateral
// Isosceles
// Scalene

// Q19. A bank has these rules:

// Balance must be above 1000 to withdraw
// Cannot withdraw more than balance
// Print "Withdrawal Successful" or reason for failure

// Q20. Take a number from user, check if it's Armstrong number or not.

// (Armstrong = sum of cubes of digits equals the number. Ex: 153 = 1³+5³+3³)

    }
}

