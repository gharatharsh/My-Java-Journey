// package Pre_java;

public class Type_Conversion {
	public static void main(String[] args) {
	
		// Their are two types of type conversion in java
		
		// 1. Implicit
		// 2. Explicit
		
		
		// This  is Implicit Types of Examples
		
		// Int to Character
		
		int n1 = 21;
		int n2 = n1;
		
		System.out.println("N1 :-"+n1);
		System.out.println("N2 :-"+n2);
		System.out.println("-------------------------------");
		
		
		// Char to Int
		
		char n3 = 'D';
		int n4 = n3; 
		
		System.out.println("N3 :-"+n3);
		System.out.println("N4 :-"+n4);
		System.out.println("------------------------------");
		
		// float To Char
		
		float n5 = 12.2f;
		char n6 = 'E';
		
		System.out.println("N5 :-"+n5);
		System.out.println("N6 :-"+n6);
		System.out.println("------------------------------");
		
		
		// 2. Explicit Type
		
		// short To byte
		short s1 = 120;
		byte b1 = (byte)s1;
		
		System.out.println("Short Value S1 :-"+s1);
		System.out.println("Short To Byte By Explicit Type");
		System.out.println("Byte Value B1 :-"+b1);
		System.out.println("------------------------------");
		
		// Double to Int 
		double d1 = 120.05;
		int i1 = (int)d1;
		
		System.out.println("Double Value D! :-"+d1);
		System.out.println("Double To INT By Explicit Type");
		System.out.println("INT Value I1 :-"+i1);
		System.out.println("------------------------------");
		
		//Long To short
		long l1 = 1254;
		short s2 = (short)l1;
		
		System.out.println("Long Value L1 :-"+l1);
		System.out.println("Long To Short By Explicit Type");
		System.out.println("Short Value S2 :-"+s2);
		System.out.println("------------------------------");
		
		System.out.println("+------+------+");
		
		
	// Q1. Store an int value in a long variable and print both.	
		
		int i2 = 123;
		long l2 = i2;
		
		System.out.println("Int value:"+i2);
		System.out.println("Long Value:"+l2);
		System.out.println("+------+------+");
	
	// Q2. Store a char value 'A' in an int variable and print both. What number do you get?
		
		char a = 'A';
		int i3 = a;
		
		System.out.println("Char Value 'A':"+a);
		System.out.println("Int Value I3:"+i3);
		System.out.println("+------+------+");
		
	// Q3. Store an int value 66 in a char variable using explicit casting and print it.
		
		int i4 = 66;
		char b = (char)i4;
		
		System.out.println("Int Value:"+i4);
		System.out.println("Char Value:-"+b);  // think is this wrong something
		System.out.println("+------+------+");
		
	// Q4. Store a float value in a double variable and print both.
		
		float f2 = 156.6f;
		double d2 = f2;
		
		System.out.println("Float Value:-"+f2);
		System.out.println("Long Value:- "+d2);
		System.out.println("+----------+-----------");
		
	// Q5. Store a double value 9.99 in an int variable using explicit casting. What happens to the decimal?
		
		double d3 = 9.99d;
		int i5 = (char)d3;
		
		System.out.println("Double Value:"+d3);
		System.out.println("Int value:"+i5);
		System.out.println("+------+------+"); 
		
	// Q6. Store int value 1000 in a byte variable using explicit casting. What result do you get and why? 
		
		int i6 = 1000;
		byte b2 = (byte)i6;
		
		System.out.println("Int Value:"+i6);
		System.out.println("Byte Value:"+b2); // out of range 
		System.out.println("===============");
		
	// Q7. Convert a double to float explicitly and print both.
		
		double d4 = 4562.0145d;
		float f4 = (float)d4;
		
		System.out.println("Double Value:"+d4);
		System.out.println("Float value:-"+f4);
		System.out.println("                 ");
		System.out.println("******************");
		
	// Q8. Store char 'Z' in an int — print the number. Then store that number back in a char and print it.
		
		char d = 'Z';
		int i7 = d;
		
		System.out.println("Char value:"+d);
		System.out.println("Int Value:"+i7);
		System.out.println("*************");
		
	// Q9. Take two int variables, divide them and store result in double. Print the result.
	
		int i8 = 45;
		int i9 = 3;
		
		double res = (double)i8/i9;
		System.out.println("Division Result are store in Double:");
		System.out.println(res);
	
	// Q10. Store long value 9999999 in a short using explicit casting. What do you get?
		
		long l5 = 9999999;
		float f5 = (float)l5;
		
		System.out.println("Long Value:-"+l5);
		System.out.println("Float Value:-"+f5);
		System.out.println("*/*//*//*/*/*//**");
		System.out.println("                  ");
		
	// Q11. Take a double value 7.9. Cast it to int, then cast that int to byte. Print all three values.
		
		double d6 = 458.56;
		int i10 = (int)d6;
		byte b3 = (byte)i10;
		
		System.out.println("Double Value:"+d6);
		System.out.println("Int value :"+i10);
		System.out.println("Byte Value:"+b3);
		System.out.println("*****************");
		System.out.println("                  ");
		
	//Q12. Take char 'a' convert to int, add 5 to it, then convert back to char. What character do you get?
		
		char ch1 = 'a';
		int i11 = ch1;
		i11 = i11 + 5;
		char result = (char)i11;
		System.out.println("Result char:"+result);
		System.out.println("*******************");
		System.out.println("                   ");

	// Q13. Take two double variables 10.5 and 3.2, multiply them, store in int. Print the result and explain the data loss.
		
		double d7 = 10.5;
		double d8 = 3.2;
		
		double res2 = 10.5 * 3.2;
		int i13 = (int)res2;
		System.out.println("Double result:"+res2);
		System.out.println("Int result:"+i13);  
		
		System.out.println("Final res:"+res);
		System.out.println("**************");
		System.out.println("              ");
		
	// Q14. Store int value 256 in a byte. What do you get and why?
		
		int i15 = 256;
		byte b4 = (byte)i15;
		
		System.out.println("Result:"+i15);
		System.out.println("Result:"+b4);
		System.out.println("***********");
		System.out.println("            ");
		
		
	// Q15. Create a long variable with value 123456789. Cast it to int, then to short, then to byte. 
	// Print all four values and explain what happens at each step.
		
		
		long l8 = 123456789;
		int i16 = (int)l8;
		short s5 = (short)i16;
		byte b8 = (byte)s5;
		
		System.out.println("Long l8:-"+l8);
		System.out.println("Int i16:-"+i16);
		System.out.println("Short s5:-"+s5);
		System.out.println("Byte  b8:-"+b8);
		
		System.out.println("**************");
		System.out.println("               ");
		
	}

}
