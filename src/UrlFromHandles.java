
import java.util.List;
import java.util.ArrayList;

public class UrlFromHandles {
    public static void main(String[] args){

        System.out.println(urlsFromHandles("ghhandle1", "ghhandle2"));
    }
    public static List urlsFromHandles(String...input){
        ArrayList<String> output = new ArrayList<String>();;
        String url = "\"https://github.com/greenfox-academy/";

        for (int i = 0; i < input.length; i++) {
            output.add(url + input[i] + "\"");
        }
        return output;
    }
}

// Create a function that takes a list of GitHub handles as input and returns a list of strings that represents
// GitHub url's under Green Fox Academy organization in the following format: "https://github.com/greenfox-academy/teststudent"

// example:
// input: ["ghhandle1", "ghhandle2"]
// output: ["https://github.com/greenfox-academy/ghhandle1", "https://github.com/greenfox-academy/ghhandle2"]

