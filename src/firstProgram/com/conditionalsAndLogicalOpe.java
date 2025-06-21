package firstProgram.com;

public class conditionalsAndLogicalOpe {
    public static void main(String[] args) {

        int age = 37;
        if(age>18){
            System.out.println("Yes Boy you can drive!");
        }
        else {
            System.out.println("NO Boy you cannot drive yet!");
        }


        //Logical Operators

        System.out.println("For logical AND...");
        boolean a = true;
        boolean b = false;
        if (a && b){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        System.out.println("For logical OR...");
        if (a || b){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

        System.out.println("For logical NOT...");
        System.out.print("NOT(a) is ");
        System.out.println(!a);
        System.out.print("NOT(b) is ");
        System.out.println(!b);

    }
}
