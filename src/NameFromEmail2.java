public class NameFromEmail2{
        
	public static void main(String[] args){
        System.out.println(nameFromEmail("elek.viz@exam.com"));
    }

    static String nameFromEmail(String input){
	    String[] split = input.split("[\\W]",3);
	    String firstName = split[0];
	    String lastName = split[1];

        return lastName.substring(0,1).toUpperCase() + lastName.substring(1) + " " +  firstName.substring(0,1).toUpperCase() + firstName.substring(1);
	}
}

// Create a function that takes an email address as input in the following format: firstName.lastName@exam.com
//and returns a string that represents the user name in the following format: lastName firstName
//example: "elek.viz@exam.com" for this input the output should be: "Viz Elek"
//accents does not matter

