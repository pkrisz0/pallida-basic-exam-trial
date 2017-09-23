import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddFilter2 {

  public static void main(String[] args) {
    System.out.println(oddFilter(Arrays.asList(1, 2, 3, 4, 5)));
  }

  public static List oddFilter(List<Integer> input){

      ArrayList<Integer> output = new ArrayList<>();

      for (int i = 0; i < input.size(); i++) {
          if (input.get(i) % 2 != 0) {
              output.add(input.get(i));
          }
      }
    return output;
  }

}

// Create a function that takes a list as a parameter,
// and returns a new list with every odd element from the orignal list
// should print [1, 3, 5]

