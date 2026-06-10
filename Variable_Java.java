// package Pre_java;


public class Variable_Java {
	
	public static void main(String[] args) {
		
//
//	// integers like :- byte,short,int , long
//	
//	byte b = 5;
//	// binary number
//	  byte   x = 0b101;
//	short s = 10;
//	int c = 45;
//	long l = 45000;
//	
//	int i;    // declaration statement
//	i = 4;    // definition statement 
//	System.out.println(i);
//	
//	System.out.println(b);
//	System.out.println(s);
//	System.out.println(c);
//	System.out.println(l);
		
		
	//Q1. Create variables to store your name, age and city. Print all three.
		String Name = "Harsh";
		int age = 21;
		String city = "Saphale";
		
		System.out.println(Name);
		System.out.println(age);
		System.out.println(city);
		System.out.println("-----------------------------------");
		
	//Q2. Create two int variables, add them and print the result.
		
		int a = 12;
		int b = 15;
		int result = a + b;
		
		System.out.println(result);
		System.out.println("-----------------------------------");
		
	//Q3. Create a double variable for your height and print it.
		
		double height = 176.2d;
		System.out.println("My Height is "+ height);
		System.out.println("-----------------------------------");
		
	//Q4. Create two variables — one int and one double. Multiply them and print the result.
		
		int c = 125;
		double d = 15.2d;
		
		double res = c * d;
		System.out.println(res);
		System.out.println("-----------------------------------");
		
	//Q5. Create a boolean variable isJavaFun and set it to true. Print it.
		
		boolean isJavaFun = true;
		System.out.println(isJavaFun);
		System.out.println("-----------------------------------");
		
	//Q6. Store your first name and last name in two separate String variables. Print them together in one line.

		String First = "Harsh";
		String Last = "Gharat";
		
		System.out.print("My Name is:"+First);
		System.out.println(Last);
		
		System.out.println("-----------------------------------");
		
	//Q7. Create an int variable with value 500. Now convert it to double and print both.
		
		int e = 500;
		double f = 500d;
		
		System.out.println(e);
		System.out.println(f);  // it maybe wrong i'm not sure!
		
	//Q8. What happens if you store 3.99 in an int variable? Try it and tell me what you get.
		
		// if we store 3.99 which is double or float value are not able to store in int variable and it show error
		
	//Q9. Create 5 variables of 5 different datatypes and print all of them.
		
		byte h = 27;
		short i = 45;
		int j = 45689;
		long k = 794561235;
		float M = 789.2f;
		double N = 7895.5d;
		
		char o = 'A';
		boolean bool = false;
		
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(M);
		System.out.println(N);
		
		System.out.println(o);
		System.out.println(bool);
		
		System.out.println("-------------------------------");
		
	//Q10. Store your monthly pocket money in a variable and calculate how much you get in a year. Print the result.
		
		int y = 500;
		int z = 12;
		
		int yearly = y * z;
		
		System.out.println("Yearly Pocket Moneny:"+yearly);
		
		
	}
}
