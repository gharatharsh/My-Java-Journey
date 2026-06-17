
import java.util.Scanner;

public class Q_Operations {

    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);

    // Q1. Take two numbers from user and print results of all 5 arithmetic operators (+ - * / %)

        System.out.println("Enter 1st No:");
        int num1 = sc.nextInt();

        System.out.println("Enter 2nd No:");
        int num2 = sc.nextInt();

        int Add = num1 + num2;
        int Sub = num1 - num2;
        int Mul = num1 * num2;
        int Div = num1 / num2;
        int Modulas = num1 % num2; 
        // double Modulas = (double)num1 % num2 ;

        System.out.println("Addition: " + Add);
        System.out.println("Subtraction: "+Sub);
        System.out.println("Multiplication: "+Mul);
        System.out.println("Division: "+Div       );
        System.out.println("Modulas :"+Modulas    );
        System.out.println("----------------");


    // Q2. Take a number from user and check if it's greater than 50. Print true or false.

        System.out.println("Enter Your 1St Value: ");
        Double a = sc.nextDouble();

        boolean res = a >= 50;
        System.out.println("The Number is Greater Than 50: "+res);


    // Q3. Take two numbers and check if they are equal. Print the result.

        
        System.out.println("Enter Your 1St Value: ");
        int c = sc.nextInt();

        System.out.println("Enter Your 1St Value: ");
        int d = sc.nextInt();

        System.out.println("Check Both No are equal To Other or Not: "+(c == d));
       

    // Q4. Take a number and increment it by 1 using unary operator. Print before and after value.

        System.out.println("Enter the No For increment: ");
        int a1 = sc.nextInt();
        System.out.println("You Enter: "+a1);
        System.out.println("Your Increment Value: "+(++a1));

    // Q5. Take a number and decrement it by 1 using unary operator. Print before and after value.

        System.out.println("Enter the No. for Decrement: ");
        int b1 = sc.nextInt();
        System.out.println("You Enter: "+b1);
        System.out.println("Your Decrement Value: "+(--b1));

    // Q6. Take two numbers, check if both are greater than 10 using && operator.
        
        int c1 = 8;
        double c2 = 9.9;

        System.out.println("Both greater than 10: " + (c1 > 10 && c2 > 10));

    // Q7. Take two numbers, check if atleast one is even using || operator
        
        System.out.println("Enter Your 1St No.: ");
        int d1 = sc.nextInt();
        System.out.println("You Enter Value: "+d1);

        System.out.println("Enter Your 2Nd No.: ");
        int d2 = sc.nextInt();
        System.out.println("You Enter Value: "+d2);

       System.out.println("Checking Atleast 1 is even: " + ((d1 % 2 == 0) || (d2 % 2 == 0)));

    // Q8. Take a number, use += operator to add 50 to it. Print the result.
        
        System.out.println("Enter Your No. :");
        int e1 = sc.nextInt();
        System.out.println("After Adding 50 Your Result will be: "+(e1+=50));

    // Q9. Take a number from user, check if it's between 10 and 100 using relational and logical operators.

        System.out.print("Enter Your No. : ");
        int f1 = sc.nextInt();
        System.out.println("Checking Your No. is Between 10 and 100 or Not :"+(f1 > 10 && f1 < 100));

    // Q10. What is the difference between i++ and ++i? Write code to prove it.

        // In i++ it will 1st use the value of i then it will add 
        // In ++i it will 1st add the value or we can say it will increment and then use the value of i

        int x = 5;
        System.out.println(x++); // prints 5
        System.out.println(x);   // prints 6

        int y = 5;
        System.out.println(++y); // prints 6

    // Q11. Take a number, check if it's positive, negative or zero using relational operators only — no if/else!
        
        System.out.println("Enter 1st No. :");
        int g1 = sc.nextInt();

        System.out.println("Enter 2nd No: ");
        int g2 = sc.nextInt();

        if(g1 > 0 && g2 > 0){
            System.out.println("Your both no is Positive :");
        }
        else if(g1 == 0 || g2 == 0 ){
            System.out.println("Your any One No. is equal to Zero :");
        }
        else if (g1 < 0 || g2 < 0) {
            System.out.println("Your any one No. is Negative :");   
        }
        else{
            System.err.println("Enter Valid No !!");
        }
    
    // Q12. Take two boolean variables, print results of &&, || and ! for all combinations.

        System.out.println("Enter true Or false  :");
        boolean h1 = sc.nextBoolean();

        System.out.println("Enter true Or false :");
        boolean h2 = sc.nextBoolean();

        System.out.println("Your Vlaue : "+h1);
        System.out.println("Your Vlaue : "+h2);

         // AND (&&)
        System.out.println("h1 && h2 = " + (h1 && h2));

        // OR (||)
        System.out.println("h1 || h2 = " + (h1 || h2));

        // NOT (!)
        System.out.println("!h1 = " + (!h1));
        System.out.println("!h2 = " + (!h2));

    // Q13. Take a number from user, using only arithmetic operators check if it's even or odd. Print the result.
        
        System.out.println("Enter Your 1st No: ");
        int i1 = sc.nextInt();

        System.out.println("Enter Your 2nd No: ");
        int i2 = sc.nextInt();

        if (i1 % 2 == 0 && i2 % 2 == 0) {
            System.out.println("Your Both Values Are Even.!");
        }
        else{
            System.out.println("Your Value is Odd.!");
        }

    // Q14. Take three numbers from user, find the largest using relational and logical operators only.

        System.out.println("Enter 1st No. :");
        int j1 = sc.nextInt();

        System.out.println("Enter 2nd No. :");
        int j2 = sc.nextInt();

        System.out.println("Enter 3rd No. :");
        int j3 = sc.nextInt();

               if (j1 > j2 && j1 > j3) {
            System.out.println("Your 1st No is Largest");
        } else if (j2 > j1 && j2 > j3) {
            System.out.println("Your 2nd No is Largest");
        } else {
            System.out.println("Your 3rd No is Largest");
        }

    // Q15. What happens when you do 5/2 vs 5.0/2 in Java? Write code, print both and explain the difference.
        
        // in 5/2 we 2 as a o/p
        // But in 5.0/2 we get 2.5  as o/p

        int k = 5;
        double L = 5.0;

        // Integer division
        System.out.println("5 / 2 = " + (k / 2));

        // Floating-point division
        System.out.println("5.0 / 2 = " + (L / 2));
        
        
    }   
     
}
