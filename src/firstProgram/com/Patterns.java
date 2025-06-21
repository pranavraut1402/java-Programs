package firstProgram.com;

public class Patterns {
    public static void main(String[] args) {

        //Solid rectangle of 4x5

        for (int i = 1; i<=4; i++){
            for (int j = 1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Hollow rectangle of 4x5

        for (int i=1; i<=4; i++){
            for (int j =1; j<=5; j++){
                if (i==1 || j==1 || i==4 || j==5){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //Half pyramid

        for (int i = 1; i<=4; i++){
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


        //Inverse half pyramid

        for (int i =4; i>=1; i--){
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


        //Half pyramid 180 rotated
        //outer loop

        for (int i=1; i<=4; i++){
            for (int j=1; j<=4-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //
        for (int i=1; i<=5; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        //
        for (int i=1; i<=5; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        //
        for (int i=5; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        //
        int number = 1;
        for (int i=1; i<=5; i++){
            for (int j=1; j<=i; j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }

        //
        for (int i =1; i<=5; i++){
            for (int j=1; j<=i; j++){
                if ((i+j) % 2 == 0){
                    System.out.print(1+" ");
                }else {
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }





    }
}
