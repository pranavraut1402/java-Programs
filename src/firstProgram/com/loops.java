package firstProgram.com;
import java.util.Scanner;
public class loops {
    public static void main(String[] args) {

        //print first 100 natural numbers

        //for loop
//        int i = 0;
//        for(i = 1; i <=100; i++){
//            System.out.println(i);
//        }


        //while loop
//        int j=100;
//        while(j<=200){
//            System.out.println(j);
//            j++;
//        }


        //do while loop

//        int k=0;
//        do {
//            System.out.println(k);
//            k++;
//        }while(k<=200);

        // print first n odd numbers

//        System.out.println(" How many Odd numbers do you want from 1. ");
//        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();
//        int n=0;
//        for (n=0; n<i; n++){
//            System.out.println(2*n+1);
//        }

        //print first n natural numbers in reverse order
        //Decrementing the For loop.
//        int i =0;
//        for (i=100; i>=0; i--){
//            System.out.println(i);
//        }


//        for (int i = 0; i<100; i = i+1){
//            System.out.println("Hello World");
//        }
//
//        for (int counter = 1; counter<11; counter++){
//            System.out.println(counter+" ");
//        }

//        int i = 0;
//        while(i<11){
//            System.out.println(i);
//            i++;
//        }
//        int i2 = 0;
//        do {
//            System.out.println(i2);
//            i2++;
//        }while (i2<11);


        //Print the sum of first n natural number.
        //n=4
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int sum =0;
//        for (int i=1; i<=n; i++){
//            sum=sum+i;
//        }
//        System.out.println(sum);

        //Print the multiplication table

//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//
//        for (int i=1; i<11; i++){
//            System.out.println(num*i);
//        }

        //Homework problems
        //Print all even numbers till n
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i=0; i<=n; i+=2){
//            System.out.println(i);
//        }

        //Print the squares of even numbers from 1 to n
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int n = sc.nextInt();

        //1st method
//        System.out.println("Squares of even numbers till " +n+ ":");
//        for (int i=2; i<=n; i+=2){
//            System.out.println(i*i);
//        }
//
//        // 2nd method
//        for (int i = 2; i<=n; i++){
//            if (i%2==0){
//                System.out.println(i*i);
//            }
//        }

        //Print the sum of all even numbers from 1 to n

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int sum = 0;
//        for (int i=2; i<=n; i+=2){
//            sum+=i;
//        }
//        System.out.println(sum);



        //Sum of squares of all even numbers from 1 to n
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int sum=0;
//        for (int i =2; i<=n; i+=2){
//            sum += (i*i);
//        }
//        System.out.println(sum);


        //Print all even numbers from n to 1 in reverse order

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i=n-1; i>=1; i-=2){
//            System.out.println(i);
//        }

        //Print the sum of all odd numbers from 1 to n

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your number");
//        int n = sc.nextInt();
//        int sum =0;
//        for (int i=1; i<=n; i+=2){
//            sum += i;
//        }
//        System.out.println(sum);

        //Print square of all odd numbers from 1 to n
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i=1; i<=n; i+=2){
//            System.out.println(i*i);
//        }


        //

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i=2; i<=n; i+=2){
//            System.out.println(i*(i*i));
//        }


        //Print all numbers from 1 to n that are divisible by both 3 and 5 enter a number 15 or greater

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i=1; i<=n; i++){
//            if (i % 3==0 && i % 5==0){
//                System.out.println(i);
//            }
//        }


        //FizzBuzz

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            if (i % 3 == 0 && i % 5 ==0){
                System.out.print("FizzBuzz");
            } else if (i % 3==0) {
                System.out.print("Fizz");
            } else if (i % 5== 0) {
                System.out.print("Buzz");
            }else {
                System.out.print(i + " ");
            }
        }













    }
}
