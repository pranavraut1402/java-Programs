package firstProgram.com;

public class Exercise3 {
    public static void main(String[] args) {
        //Question 1
        String name = "Jack Parker";
        System.out.println(name.toLowerCase());

        //Question 2
        String text = "To Lower Case";
        text = text.replace(" ","_");
        System.out.println(text);

        //Question 3
        String letter = "Dear name, thanks a lot!";
        letter = letter.replace("name","Jerry");
        System.out.println(letter);

        //Question 4
        String mystring = "This string contains  double and triple spaces";
        System.out.println(mystring.indexOf("  "));
        System.out.println(mystring.indexOf("   "));

        //Question 5
        String letter2 = "Dear Jerry, \n\tThis Java Course is Nice.\n\tThanks!";
        System.out.println(letter2);




    }
}
