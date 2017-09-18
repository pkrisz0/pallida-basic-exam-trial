import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddFilter {
    public static void main(String[] args) {
        // Create a function that takes a list as a parameter,
        // and returns a new list with every odd element from the orignal list
        //System.out.println(oddFilter(Arrays.asList(1, 2, 3, 4, 5));
        // System.out.println(oddFilter(Arrays.asList(1, 2, 3, 4, 5)));
        // should print [1, 3, 5]

        int[] input = {1, 2, 3, 4, 5};

        ArrayList<Integer> output = new ArrayList<Integer>();

        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 != 0){
                output.add(input[i]);
            }
        }
        System.out.println(output);



    }

    public static List oddFilter(){
         return null;
    }
}

