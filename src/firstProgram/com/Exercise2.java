package firstProgram.com;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        //Question 1
        float a = 7/4.0f * 9/2.0f;
        System.out.println(a);

        //Question 2
        char Grade = 'A';
        Grade = (char)(Grade + 8);
        System.out.println(Grade);
        //decrypt
        Grade = (char)(Grade - 8);
        System.out.println(Grade);

        //Question 3
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        System.out.println(b>9);


        //Question 4
        int v =10;
        int u =8;
        int c =4;
        int s =6;

        System.out.println((v*v-u*u)/2*c*s);

       //Question 5
        int x = 7;
        int p =7*49/7 + 35/7;
        System.out.println(p);



    }
}
