package firstProgram.com;
import java.util.Scanner;
public class exercise {
    public static void main(String[] args) {
        //Question 1
        Scanner sc = new Scanner(System.in);
//        System.out.println("what is your name ? ");
//        String name = sc.nextLine();
//        System.out.println("Hello " + name + " Have a good day!");

        //Question 2
//        int a = 39;
//        int b = 89;
//        int c = 75;
//        int sum = a+b+c;
//        System.out.println(sum);

        //Question 3
        float a=87;
        float b=98;
        float c=87;
        float sum = a+b+c;
       // System.out.println(sum/30);

        //Question 4
//        System.out.println("Enter your number");
//        Scanner sc = new Scanner(System.in);
//        System.out.println(sc.hasNextInt());

        //Question 5
        Scanner marks = new Scanner(System.in);
        System.out.println("Enter your physics marks");
        int physics = sc.nextInt();
        System.out.println("Enter your chemistry marks");
        int chemistry = sc.nextInt();
        System.out.println("Enter your maths marks");
        int maths = sc.nextInt();
        System.out.println("Enter your english marks");
        int eng = sc.nextInt();
        System.out.println("Enter your bio marks");
        int bio = sc.nextInt();

        float percentage = ((physics+chemistry+maths+eng+bio)/500.0f)*100;
        System.out.println(percentage);







    }

    }

