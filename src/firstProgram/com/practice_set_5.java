package firstProgram.com;

public class practice_set_5 {
    public static void main(String[] args) {

        //Problem 1 --> Print Pattern









        //Problem 2--> Sum of first n even numbers using while loop











        //Problem 3 --> Multiplication Table of 7

//        System.out.println("Here is your Table");
//        int num = 7;
//        for (int i = 1; i<=10; i++){
//            System.out.println(num + " x " +i+" = " + (num*i));
//        }


        //Problem 4 --> Multiplication table of 10 in reverse order.

//        for (int i =10; i>=1; i--){
//            System.out.println("10 x " +i+ " = "+(10*i));
//        }
//
//        //Problem 5 --> Factorial using loop
//
//        int n = 5; int fact = 1;
//        for (int i = 1; i<= n; i++){
//            fact *= i;
//        }
//        System.out.println("Factorial : " +fact);
//
//
//        //Problem 6 --> Factorial using while loop:
//
//        int num = 5;
//        int fact1 = 1,i=1;
//        while (i<=num){
//            fact1*=i;
//            i++;
//        }
//        System.out.println("Factorial: " + fact1);


        //Problem 7 --> Pattern printing using while loop:

        int i = 5;
        while (i>=1){
            int j = 1;
            while(j<=i){
                System.out.println("* ");
                j++;
            }
            System.out.println();
            i--;
        }



    }
}
