import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
      
        // while Loop
        int b = 1;
        while(b <= 10){
            System.out.println(b);
            b++;
        }

        // Ex 01
        // infinite result
        // while(true) {
        //     System.out.println("Hello from looping !");
        // }

        // Ex: 02

        int c = 1;
        while (c >= 5){   // ⚠️ This condition will never run because c=1 is not >=5
            System.out.println("Hello From Looping:");
            c++ ;
            System.out.println("                    ");
        }

        // Ex:- 03
        // Printing No from Starting(1) to Ending(20)

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Starting Number:-");
        int start = sc.nextInt();

        System.out.println("Enter Ending Number:-");
        int end = sc.nextInt();

        while(start <= end){
            System.out.println("Values:"+ start++);
            System.out.println("              ");
        }

        //  Reverse order 
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter The Start Number :- ");
        int startt = sc1.nextInt();

        System.out.print("Enter The End Number :- ");
        int endd = sc1.nextInt();

        System.out.println("Numbers in Reverse Order:");
        while(endd >= startt) {
            System.out.println(endd);
            endd--;   // decrement each time
        }



        // Do - While 


        int a =1;
        do { 
            System.out.println("values:"+a);
            a++;
        } while (a<=10);




        // for Loop


        int i,j;

        for(i = 1; i <= 10; i++){
            System.out.println("Value: "+i);
        }

        for (i = 1; i<= 5;i++){
            for (j = 1; j <= i;j++) {
                System.out.print("*");  
            }
            System.out.println("");
        }


        // Multiplication Table.
        
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Enter The Number :- ");
        int num = sc2.nextInt();

        for(int n1 = 1; n1 <= 10; n1++) {
            System.out.println(num + " x " + n1 + " = " + (num * n1));
        } 

    }
}
