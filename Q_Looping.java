
import java.util.Scanner;

public class Q_Looping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    // Q1. Print numbers 1 to 10 using for loop.
        int a = 1;
        while(a <= 10){
            System.out.println(a);
            a++;
        }
        System.out.println("-------------------------");

    // Q2. Print numbers 10 to 1 using for loop (reverse).

        System.out.print("Enter the Start Number: ");
        int b = sc.nextInt();

        System.out.print("Enter The End Number: ");
        int c = sc.nextInt();

       while(c >= b){
       System.out.println(c);
       c--;
     }
     System.out.println("---------------------------------");
    // Q3. Print all even numbers from 1 to 20 using while loop.

        int d = 1;

        while(d <= 20){
            if (d % 2 == 0) {
                System.out.println("Even Number is : "+d);
            }
            d++;
        }

        System.out.println("---------------------------------");
    //  Q4. Print all odd numbers from 1 to 20 using do-while loop.
        
        int e = 1;

        do{
        if (e % 2 != 0) {
            System.out.println("Odd Number:"+e);
        }
        e++;
        }
        while(e <= 20);
        System.out.println("------------------");

    // Q5. Take a number from user, print its multiplication table using for loop.


        System.out.print("Enter The Number :- ");
        int num = sc.nextInt();

        for(int n1 = 1; n1 <= 10; n1++) {
            System.out.println(num + " x " + n1 + " = " + (num * n1));
        } 
        System.out.println("-------------------------------------");

    // Medium:

    // Q6. Take a number from user, find its factorial using for loop.
    
        System.out.println("Enter the Number to find Factorical:");

        int fact = 1;  // result starts at 1

        for(int i = 1; i <= num; i++){
        fact = fact * i;
    }
        System.out.println("Factorial: " + fact);
    System.out.println("------------------------------------------");

    // Q7. Print sum of numbers from 1 to 100 using while loop.

    int j = 1;
    int sum1 = 0;
    
    while(j <= 100){
    sum1 = sum1 + j; 
        j++;
    }
        System.out.println("Sum: " + sum1);
        System.out.println("----------");

    // Q8. Take a number from user, reverse it using while loop. (Ex: 1234 → 4321)

    System.out.println("Enter the Number to reverse it !");
    int num2 = sc.nextInt();
    int reverse = 0;

    while(num2 > 0){
        int digit = num2 % 10;
        reverse = reverse * 10 + digit;
        num2 = num2 /10;
    }
    System.out.println("Reverse Number:"+reverse);
    System.out.println("---------------------");

// Q9. Take a number from user, check if it's a palindrome. (Ex: 121, 1331)

   System.out.println("Enter the Number: ");
    int p = sc.nextInt();
    int original = p;  
    int reverse2 = 0;

    while(p != 0){
    reverse2 = (reverse2 * 10) + (p % 10);
    p = p / 10;
    }

    if(original == reverse2){
        System.out.println("Palindrome!");
    } else {
        System.out.println("Not Palindrome!");
    }
    System.out.println("------------------------");

// Q10. Print Fibonacci series up to n terms using for loop. (0,1,1,2,3,5,8...)

    System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int s = 0, t = 1;

        for (int k = 1; k <= n; k++) {
            System.out.print(s + " ");

            int fabo = s + t;
            s = t;  
            t = fabo;
        }
    
    }
    
}


// Medium:
// Q11. Take a number from user, find sum of its digits. (Ex: 123 → 6)
// Q12. Print this pattern using for loop:
// *
// **
// ***
// ****
// *****

// Interview Level 🔥:
// Q13. Take a number, check if it's a prime number or not.
// Q14. Print all prime numbers between 1 and 50.
// Q15. Take a number from user, check if it's an Armstrong number.

// (153 = 1³+5³+3³ = 153 ✅)
// Q16. Using switch, take a day number (1-7) from user and print day name.

// (1→Monday, 2→Tuesday...)
// Q17. Using switch, build a simple calculator with +,-,*,/.
// Q18. Take a number from user, print its reverse and check if it's palindrome — in same program.
// Q19. Print multiplication tables from 1 to 10 using nested for loop.
// Q20. Take a number from user, find all its factors.

// (Ex: factors of 12 → 1,2,3,4,6,12)