package Java_Core_5;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        AppData data = new AppData();
        data.readFromFile("example.csv");
        System.out.println(Arrays.toString(data.getHeader()));
        System.out.println(Arrays.deepToString(data.getData()));
        data.writeToCSV("new_example.csv");
    }
}
