
import java.util.Scanner;              // this is used to load the Scanner package to user program   

public class Operators {
    public void myMethod(){           //  This is Non - Static Method() 
        
        // Arithmatic opearators ------->  +,-,*,/,%

        // Adition
        int a = 15;
        int b = 50;

        int Res = a + b;
        System.out.println("Result:"+Res);

        // Subtraction

        int c = 56;
        int d = 44;
        int res = c - d;
        System.out.println("Sub Res:"+res);

        // Multiplication

        int e = 45;
        int f = 3;
        int muliti = e * f;

        System.out.println("Multiplication Result:"+muliti);

        // Division

        int g = 88;
        int h = 4;
        int divi = g/h;

        System.out.println("Division Result:"+divi);

        // Modulus

        int i = 99;
        int j = 2;
        int Modulas = i % j;
        System.out.println("Modulus Result: "+Modulas);
    }


    // Here i'm asking direct input from the user only 
    // Becuse there is no need to pass hard-coded input in the program 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);      // here we create the scanner class package 

        // Addition Program 

        System.out.println("Enter Your 1St No: ");     // ask user to enter or pass the 1st input 
        int Num1 = sc.nextInt();

        System.out.println("Enter Your 2nd No: ");     // ask user to enter or pass the 2st input 
        int Num2 = sc.nextInt();

        int Resultt = Num1 + Num2;                        // addition opration can perform 

        System.out.println("Addition of Your 1st & 2nd No is: "+Resultt);
        System.out.println("---------------------------------------");


                // Subtraction Program 

        System.out.println("Enter Your 1St No: ");     // input from the user 
        int Num3 = sc.nextInt();

        System.out.println("Enter Your 2nd No: ");
        int Num4 = sc.nextInt();

        int SubResultt = Num3 - Num4;

        System.out.println("Subtraction of Your 1st & 2nd No is: "+SubResultt);     // subtration can perform 
        System.out.println("---------------------------------------------");

             // Multiplication Program 

        System.out.println("Enter Your 1St No: ");
        int Num5 = sc.nextInt();

        System.out.println("Enter Your 2nd No: ");
        int Num6 = sc.nextInt();

        int MulResultt = Num5 * Num6;                                   // Multiplication can perform 

        System.out.println("Multiplication of Your 1st & 2nd No is: "+MulResultt);
        System.out.println("------------------------------------------------");


             // Division Program 

        System.out.println("Enter Your 1St No: ");
        int Num7 = sc.nextInt();

        System.out.println("Enter Your 2nd No: ");
        int Num8 = sc.nextInt();

        int DivResultt = Num7 / Num8;                   // Division can perform 

        System.out.println("Division of Your 1st & 2nd No is: "+DivResultt);
        System.out.println("-------------------------------------------");

             // Modulaus Program 

        System.out.println("Enter Your 1St No: ");
        int Num9 = sc.nextInt();

        System.out.println("Enter Your 2nd No: ");
        int Num10 = sc.nextInt();

        int ModResultt = Num9 % Num10;                   // Modulus Can perform 

        System.out.println("Modulaus of Your 1st & 2nd No is: "+ModResultt);
        System.out.println("-------------------------------------------");
        System.out.println("                                            ");

        
        System.out.println("--------- Realtional Operator ---------------");
            // Realtional Oprator  == , != , > ,< >= ,<= 
        int a1 = 40;
        int a2 = 23;
        
        System.out.println("Both are Equal or not "+ (a1 == a2));           // To check both are Equal or Not 
        System.out.println("Not Equal to "+ (a1 != a2));                    // Check both are Not Equal to Others 
        System.out.println("Greater Than: "+(a1 > a2));                     // To check a1 is Greater Than a2
        System.out.println("Greater Than: "+(a1 >= a2));                    // To check a1 is Greater Than Equal To a2
        System.out.println("Greater Than: "+(a1 < a2));                     // To check a1 is Less Than a2
        System.out.println("Greater Than: "+(a1 <= a2));                    // To check a1 is Less Than Equal to a2

        System.out.println("------- End Of Realational Operators ----------");


        System.out.println("------------ Logical Operators -----------------");

        // And

        System.out.println("True && True");    // True
        System.out.println("True && False");   // False
        System.out.println("False && False");  // False

        // Here I'M gonna use all DataTypes 

        // Int 
        int a3 = 50;
        int a4 = 65;

        System.out.println(a3 <= a4 && a3 == a4 );
        System.out.println(a3 > a4 && a3 < a4 );
        System.out.println(a3 <= a4 && a3 > a4 );
        System.out.println(a3 >= a4 && a3 != a4 );

    // char
    
 	char c = 'B';
	char d = 'b';
	
	System.out.println(c <= d && c == d);
	System.out.println(c < d && c > d);
	System.out.println(c != d && c < d);
	System.out.println(c >= d && c != d);

// float

	float f1 = 12.5f;
    float f2 = 3.5f;

	System.out.println(f1 <= f2 && f1 == f2);
	System.out.println(f1 < f2 && f1 > f2);
	System.out.println(f1 != f2 && f1 < f2);
	System.out.println(f1 >= f2 && f1 != f2);

// Double
	
	double d1 = 45.75;
    double d2 = 15.25;
	
	System.out.println(d1 <= d2 && d1 == d2);
	System.out.println(d1 < d2 && d1 > d2);
	System.out.println(d1 != d2 && d1 < d2);
	System.out.println(d1 >= d2 && d1 != d2);

    	// Locial Oprator

		// OR

	// System.out.println(true || true); // t && t 
	// System.out.println(true || false);
	// System.out.println(false || true);
	// System.out.println(false || false);

// int 
	int x = 10;
	int y = 20;

	System.out.println(x <= y || x == y);
	System.out.println(x < y || x > y);
	System.out.println(x != y|| x < y);
	System.out.println(x >= y || x != y);

// Double 
   
       double m = 25.5;
	double n = 55.22;

	
	System.out.println(m <= n || m == n);
	System.out.println(m < n || m > n);
	System.out.println(m != n|| m < n);
	System.out.println(m >= n || m != n);

// Char

	char k='i';
        char l= 'j';

        System.out.println(k <= l || k == l);
        System.out.println(k < l || k > l);
        System.out.println(k != l || k < l);
        System.out.println(k >= l || k != l);

// float
	
	float e = 12.5f;
        float f = 18.75f;

        System.out.println(e <= f || e == f);
        System.out.println(e < f || e > f);
        System.out.println(e != f || e < f);
        System.out.println(e >= f || e != f);


// Logical Not 
	
	System.out.println(!true);
	System.out.println(!false);
	System.out.println(!('A' == 'a' ));
	System.out.println(!("hi".equals("Hi")));


// double 

       
        double h = 69.0;
        double g = 45.8;

        System.out.println(!(h > g));   // false → true
        System.out.println(!(h < g));   // true → false
        System.out.println(!(h == g));  // false → true
        System.out.println(!(h != g));  // true → false

// long
        long l1 = 120L;
        long l2 = 150L;

        System.out.println(!(l1 > l2));
        System.out.println(!(l1 < l2));
        System.out.println(!(l1 == l2));
        System.out.println(!(l1 != l2));

// float
        float f3 = 12.5f;
        float f4 = 18.75f;

        System.out.println(!(f3 > f4));
        System.out.println(!(f3 < f4));
        System.out.println(!(f3 == f4));
        System.out.println(!(f3 != f4));


// short
        short s1 = 25;
        short s2 = 40;

        System.out.println(!(s1 > s2));
        System.out.println(!(s1 < s2));
        System.out.println(!(s1 == s2));
        System.out.println(!(s1 != s2));

    System.out.println("End of Logical Operator");


    // Assignment Operators 
    //  +=, -=,*=,/=,%=

    int b1 = 10;
    int b2 = 5;
    
    b1 += b2;     // b1 = 10 + 5 = 15     // Now B1 value become 15
    System.out.println("Value Of b1 after +=: "+b1);

    b1 -= b2;     // b1 = 15 - 5 = 10    now B1 value become 10 Again
    System.out.println("Value of b1 after -=: "+b1);

    b1 *= b2;       // b1 = 10 * 5 = 50  Now b1 value become 50 Again 
    System.out.println("Value of b1 after *=: "+b1);

    b1 /= b2;       // b1 = 50 / 5 = 10 now b1 value become 10
    System.out.println("Value of b1 after /=: "+b1);

    b1 %= b2;       // b1 = 10 % 5 = 0  Now b1 value become 0 
    System.out.println("Value of b1 after %=: "+b1);

    System.out.println("End Of Assignment Operator");





    // Unary Operators

    int R = 8;
    int S = 10;

    System.out.println("Pre-increment: " + (++R));         // R becomes 9, prints 9
    System.out.println("Post-increment:" + (R++));         // prints 9, then R becomes 10

    System.out.println("Pre-decrement:" + (--R));          // R becomes 9, prints 9
    System.out.println("Post-decrement:" + (R--));         // prints 9, then R becomes 8

    System.out.println("--------------------");

    System.out.println("Pre-increment: " + (++S));       // S becomes 11, prints 11
    System.out.println("Post-increment:" + (S++));       // prints 11, then S becomes 12

    System.out.println("Pre-decrement:" + (--S));        // S becomes 11, prints 11
    System.out.println("Post-decrement:" + (S--));       // prints 11, then S becomes 10

    sc.close();
    }
}
