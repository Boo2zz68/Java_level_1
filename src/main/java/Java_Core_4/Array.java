package Java_Core_4;
import java.util.HashMap;
import java.util.Map;
public class Array {
    private String [] arrayWords;
    public Array(String[] arrayWords) {
        this.arrayWords = arrayWords;
    }
    public void doArray() {
        HashMap<String,Integer> mapArray = getMap(arrayWords);
        for (Map.Entry entry: mapArray.entrySet()) {
            if (entry.getValue().equals(1)) {
                System.out.println(entry.getKey());
            }
        }
    }
    private HashMap<String, Integer> getMap(String[] arrayWords) {
        HashMap<String, Integer> mapArray = new HashMap<>();
        for (int i = 0; i < arrayWords.length; i++) {
            if (mapArray.containsKey(arrayWords[i])) {
                mapArray.put(arrayWords[i], mapArray.get(arrayWords[i]) + 1);
            }
            else {
                mapArray.put(arrayWords[i],1);
            }
        }
        return mapArray;
    }
}
