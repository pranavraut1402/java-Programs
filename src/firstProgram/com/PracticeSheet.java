package firstProgram.com;
import java.util.Locale;
import java.util.Scanner;
public class PracticeSheet {
    public static void main(String[] args) {

        //Section 1: Variables & Data Types
        //Problem 1
//        int age = 18;
//        short age2 = 24;
//        byte places = 6;
//        long population = 1480000000;
//        float percentage = 98.7f;
//        double percentile = 99.84753d;
//        char Grade = 'A';
//        boolean raj = true;
//
//        System.out.println(raj);
//        System.out.println(age);
//        System.out.println(age2);
//        System.out.println(places);
//        System.out.println(population);
//        System.out.println(percentage);
//        System.out.println(percentile);
//        System.out.println(population);
//        System.out.println(Grade);
//
//       // Problem 2 ---> Celsius to Fahrenheit Converter
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter temp in celcius");
//        float temp = sc.nextFloat();
//        System.out.println((temp * 9/5) + 32);
//
//      //  Problem 3 ---> Area of Rectangle
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Length And Breadth");
//        int length = sc.nextInt();
//        int breadth = sc.nextInt();
//        int Area = length * breadth;
//        System.out.println("Area ---> " + Area);
//
//      //  Problem 4 ---> Swap two numbers without using temporary variable.
//        int a = 5;
//        int b = 10;
//
//        a = a + b;
//        b = a - b;
//        a = a - b;
//        System.out.println();

       // Section 2: Operators & Expressions

        //Problem 1
//        int a = 5;
//        int b = 10;
//        int c = 20;
//        int d = 15;
//        System.out.println((a+b) * (c-d));

        //Problem 2

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your first number (Dividend)");
//        int num1 = sc.nextInt();
//        System.out.println("Enter your second number (Divisor)");
//        int num2 = sc.nextInt();
//        System.out.print("Your Remainder Is ");
//        System.out.println(num1/num2);

        //Problem 3

//        Scanner sc = new Scanner(System.in);
//        System.out.println("How many numbers");
//        int n = sc.nextInt();
//        System.out.println("First number");
//        int n1 = sc.nextInt();
//        System.out.println("Second number");
//        int n2 = sc.nextInt();
//        System.out.println("Third number");
//        int n3 = sc.nextInt();
//        double avg = ( (n1+n2+n3) /n);
//        System.out.println(avg);


        //Section 3 ---> Strings

        //Problem 1
//        Scanner s = new Scanner(System.in);
//        String text = s.nextLine();
//        text = text.toUpperCase();
//        System.out.println(text);
//        text = text.toLowerCase();
//        System.out.println(text);
//        String reversed = new StringBuilder(text).reverse().toString();
//        System.out.println(reversed);

        //Problem 2
//        Scanner t = new Scanner(System.in);
//        System.out.println("First String is");
//        String str1 = t.nextLine();
//        System.out.println("Second String is");
//        String str2 = t.nextLine();
//        System.out.println("Are the strings equal (Ignoring case)? ---> " + str1.equalsIgnoreCase(str2));

        //Problem 3
//        Scanner sc = new Scanner(System.in);
//        System.out.print("String --->");
//        String string = sc.nextLine();
//        boolean Java = string.contains("java");
//        System.out.println(Java);

        //Problem 4
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        int vowel = str.replaceAll("[^aeiou]", "").length();
//        System.out.println(vowel);

        //Section 4: Bonus-Simple Programs

        //Problem 1
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your name");
//        String name = sc.nextLine();
//        System.out.println("Enter your Age");
//        int Age = sc.nextInt();
//        sc.nextLine();
//        System.out.println("Enter your city");
//        String city = sc.nextLine();
//
//        System.out.println(name + ", Have a Good Day...😊");

        //Problem 2
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Number");
//        int num1 = sc.nextInt();
//
//        System.out.println("Square and Cube of these numbers ---> " + (num1*num1) + " and " + (num1*num1*num1) );

        //Problem 3
        String name = "Tom";
        String Lastname = "Jerry";
       // System.out.println(name +" & " + Lastname); //method 1
        String result = name.concat(" ").concat(Lastname); //method 2
        System.out.println(result);












































    }
}
