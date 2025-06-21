package firstProgram.com;
import java.util.Scanner;
public class elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age.");
        int age = sc.nextInt();

//        if (age>56){
//            System.out.println("You are experienced! ");
//        }
//        else if (age>46){
//            System.out.println("You are semi-experienced!");
//        }
//        else if (age>30){
//            System.out.println("You are semi-semi-experienced!");
//        }
//        else {
//            System.out.println("You are not experienced");
//        }
        switch (age) {
            case 18 -> System.out.println("You are going to become an adult!");
            case 23 -> System.out.println("You are going to join a job!");
            case 60 -> System.out.println("You are going to retire!");
            default -> System.out.println("Enjoy your life!");
        }
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//
//        if (num % 2 == 0){
//            System.out.println("Even");
//        }else{
//            System.out.println("Odd");
//        }
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of a");
//        int a = sc.nextInt();
//        System.out.println("Enter the value of b");
//        int b = sc.nextInt();
//        if (a==b){
//            System.out.println("a is equal to b");
//        } else if (a > b) {
//            System.out.println("a is greater");
//        } else if (a < b) {
//            System.out.println("a is smaller");
//        }

        //Homework Problem
        //Problem1 --> Calculator

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your first number");
//        int num1 = sc.nextInt();
//        System.out.println("Enter your second number");
//        int num2 = sc.nextInt();
//        System.out.println("Enter your operator");
//        char operator = sc.next().charAt(0);
//
//        if (operator == '+'){
//            System.out.println(num1 + num2);
//        } else if (operator == '-') {
//            System.out.println("Please enter greater number first unless result will be negative");
//            System.out.println(num1-num2);
//        } else if (operator == '*') {
//            System.out.println("Do not enter 0");
//            System.out.println(num1*num2);
//        } else if (operator == '/') {
//            System.out.println("Do not enter 0");
//            System.out.println(num1/num2);
//        } else if (operator == '%') {
//            System.out.println(num1%num2);
//        }else {
//            System.out.println("Invalid Operator");
//        }

        //Problem 2 --> Month Identifier

//        Scanner sc = new Scanner(System.in);
//        int Day = sc.nextInt();
//
//        switch (Day){
//            case 1 -> System.out.println("January");
//            case 2 -> System.out.println("February");
//            case 3 -> System.out.println("March");
//            case 4 -> System.out.println("April");
//            case 5 -> System.out.println("May");
//            case 6 -> System.out.println("June");
//            case 7 -> System.out.println("July");
//            case 8 -> System.out.println("August");
//            case 9 -> System.out.println("Sept");
//            case 10 -> System.out.println("oct");
//            case 11 -> System.out.println("Nov");
//            case 12 -> System.out.println("Dec");
//        }




    }
}
