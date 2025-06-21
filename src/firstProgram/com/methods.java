package firstProgram.com;

public class methods {
    public static void main(String[] args) {
        String statement = "Jerry is my man.";

        //name.length()
        int value = statement.length();
        System.out.println(value);

        //name.toLowerCase()
        String lstring = statement.toLowerCase();
        System.out.println(lstring);

        //name.toUpperCase()
        String ustring = statement.toUpperCase();
        System.out.println(ustring);

        //name.trim()
        String nonTrimmedString = " Jerry ";
        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);

        //name.substring()
        System.out.println(statement.substring(1));
        System.out.println(statement.substring(1,16));

        //name.replace()
        System.out.println(statement.replace('J','M'));
        System.out.println(statement.replace("rry","ppy"));

        //name.startsWith()
        System.out.println(statement.startsWith("Jer"));

        //name.endsWith()
        System.out.println(statement.endsWith("msfdf"));

        //name.charAt()
        System.out.println(statement.charAt(12));

        //name.indexOf()
        System.out.println(statement.indexOf("y"));


        System.out.println(statement.indexOf("man",4));

        //name.lastIndexOf()
        System.out.println(statement.lastIndexOf("Jer"));
        System.out.println(statement.equals("Jerry is my man."));
        System.out.println(statement.equalsIgnoreCase("Jerry is my Man."));

        //escapeSequenceCharacter
        System.out.println("I am escape sequence \" double quote");
















    }
}
