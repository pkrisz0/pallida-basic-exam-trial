import java.lang.reflect.Field;

public class NameFromEmail {
    public static void main(String[] args){
        // Create a function that takes an email address as input in the following format: firstName.lastName@exam.com
        //and returns a string that represents the user name in the following format: lastName firstName
        //example: "elek.viz@exam.com" for this input the output should be: "Viz Elek"
        //accents does not matter
        System.out.println(nameFromEmail("elek.viz@exam.com"));
    }

    public static int nameFromEmail(String input) {
        String[] parts = input.split(("[\\W]"),3);
        String first = parts[0];
        String last = parts[1];

        String firstName = first.substring(0,1).toUpperCase() + first.substring(1);
        String lastName = last.substring(0,1).toUpperCase() + last.substring(1);

        System.out.println(lastName + " " + firstName);

        return 0; //figure out how to return string
    }

}
