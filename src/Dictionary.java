import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    static Map<String,String> map;

    public static void main(String[] args) {
        map = new HashMap<String,String>();
        addWord("alma", "apple");
        addWord("fa", "tree");
        removeWord("alma");
        translateToEng("fa");
    }

    // Implement this method. It should add the given key-value pair to the the map
    public static void addWord(String hunWord, String engWord) {
        map.put(hunWord, engWord);
    }

    // Implement this method. It should remove the key-value pair by the given key from the map
    public static void removeWord(String hunWord) {
        map.remove(hunWord);
    }

    // Implement these methods. They should return the translation of the given word from the map
    public static String translateToHun(String engWord) {
    // get key of object

        return null;
    }

    public static String translateToEng(String hunWord) {
        System.out.println(map.get(hunWord));
        return null;
    }
}
