package firstProgram.com;
import java.util.Scanner;
public class PracticeSet4 {
    public static void main(String[] args) {

        //Question 1
        int a = 19;
        if (a == 11){
            System.out.println("I am 11");
    }
        else{
            System.out.println("I am not 11");
        }

        //Question 2
//        byte m1,m2,m3;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your marks in Physics");
//        m1 = sc.nextByte();
//        System.out.println("Enter your marks in chemistry");
//        m2 = sc.nextByte();
//        System.out.println("Enter your marks in maths");
//        m3 = sc.nextByte();
//        float avg = (m1+m2+m3)/3.0f;
//        System.out.println("Your overall percentage is: " + avg);
//        if (avg>=40 && m1>=33 && m2>=33 && m3>=33){
//            System.out.println("Congratulations, You have been promoted.");
//        }
//        else {
//            System.out.println("Sorry, you have not been promoted.");
//        }

        //Question 3
//        float tax = 0;
//        float income = 3.3f;
//        if (tax<2.5){
//            tax = tax + 0;
//        }
//        else if (tax>2.5f && tax <5.0f){
//            tax = tax + 0.05f * (income - 2.5f);
//        }
//        else if (tax>5f && tax <10.0f){
//            tax = tax + 0.05f * (income - 2.5f);
//        }

        //Question 4
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch (day){
           case 1 -> System.out.println("Monday");
           case 2 -> System.out.println("Tuesday");
           case 3 -> System.out.println("Wednesday");
           case 4 -> System.out.println("Thursday");
           case 5 -> System.out.println("Friday");
           case 6 -> System.out.println("Saturday");
           case 7 -> System.out.println("Sunday");

        }


    }
}
