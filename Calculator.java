// package Pre_java;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-------Welcome To Calci---------");
		
		// condition
		
		while (true) {
			System.out.println("+-------------------+");
			System.out.println("| 1. Addition       |");
			System.out.println("| 2. Subtraction    |");
			System.out.println("| 3. Multiplication |");
			System.out.println("| 4. Division       |");
			System.out.println("| 5. Modulas        |");
			System.out.println("| 6. Exit           |");
			System.out.println("+-------------------+");
			
			System.out.println("Which Opration you want to perfrom Today!!, select number");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1 :{
				// for 1st number 
				System.out.println("Enter The First Number:");
				int a = sc.nextInt();
				
				// for 2nd number
				System.out.println("Enter The Second Number:");
				int b = sc.nextInt();
				System.out.println("-------------------------");
				System.out.println(a + " + "+ b +" = " + (a+b));
				System.out.println("-------------------------");
			}
			break;
			
			case 2 :{
				// for 1st number 
				System.out.println("Enter The First Number:");
				int a = sc.nextInt();
				
				// for 2nd number
				System.out.println("Enter The Second Number:");
				int b = sc.nextInt();
				System.out.println("-------------------------");
				System.out.println(a + " + "+ b +" = " + (a-b));
				System.out.println("-------------------------");
			}
			break;
			
			case 3 :{
				// for 1st number 
				System.out.println("Enter The First Number:");
				int a = sc.nextInt();
				
				// for 2nd number
				System.out.println("Enter The Second Number:");
				int b = sc.nextInt();
				System.out.println("-------------------------");
				System.out.println(a + " + "+ b +" = " + (a*b));
				System.out.println("-------------------------");
			}
			break;
			
			case 4 :{
				// for 1st number 
				System.out.println("Enter The First Number:");
				int a = sc.nextInt();
				
				// for 2nd number
				System.out.println("Enter The Second Number:");
				int b = sc.nextInt();
				System.out.println("-------------------------");
				System.out.println(a + " + "+ b +" = " + (a/b));
				System.out.println("-------------------------");
			}
			break;
			
			case 5 :{
				// for 1st number 
				System.out.println("Enter The First Number:");
				int a = sc.nextInt();
				
				// for 2nd number
				System.out.println("Enter The Second Number:");
				int b = sc.nextInt();
				System.out.println("-------------------------");
				System.out.println(a + " + "+ b +" = " + (a%b));
				System.out.println("-------------------------");
			}
			break;
			
			case 6:{
				System.out.println("--------------------------");
				System.out.println("======== Thanks for using my Calci ==========");
				System.out.println("--------------------------");
				return;
			} 
			default:{
				System.err.println("============= Error Invalid Input ============");
				
			}
			break;
			}
		}
	}

}
