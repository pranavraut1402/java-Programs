package Com.company;
import java.util.Scanner;
public class Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kilometer to Miles Converter");

        System.out.println("Enter Distance in Kilometer");

        double kilometer = sc.nextDouble();
        double miles = kilometer * 0.621371;

        System.out.println(miles);

    }
}
