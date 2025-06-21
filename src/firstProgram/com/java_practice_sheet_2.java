package firstProgram.com;
import java.util.Scanner;
import java.util.Scanner;
public class java_practice_sheet_2 {
    public static void main(String[] args) {

        //Largest Among The Number.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Your 1st Number");
//        int num1 = sc.nextInt();
//        System.out.println("Enter Your 2nd Number");
//        int num2 = sc.nextInt();
//        System.out.println("Enter Your 3rd Number");
//        int num3 = sc.nextInt();
//        System.out.println("Enter Your 4th Number");
//        int num4 = sc.nextInt();
//        if (num1>num2 && num1>num3 && num1>num4){
//            System.out.println(num1 + " is greater. ");
//        }else if (num2>num3 && num2>num1 && num2>num4){
//            System.out.println(num2 +" is greater. ");
//        } else if (num3>num1 && num3>num2 && num3>num4) {
//            System.out.println( num3 + " is greater ");
//        } else if (num4>num1 && num4>num2 && num4>num3) {
//            System.out.println(num4 + " is greater ");
//        } else if (num1==num2 && num2==num3 && num3==num4) {
//            System.out.println("Numbers You Entered Are Equal");
//        }else {
//            System.out.println("Error");
//        }


        //Simple Interest Calculator
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Principle Value");
        int principle = sc.nextInt();
        System.out.println("Enter Interest Rate");
        int rate = sc.nextInt();
        System.out.println("Enter Time Period");
        int time =sc.nextInt();
        System.out.println((principle*rate*time)/100 + " This is your Interest");




    }
}
