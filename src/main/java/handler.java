import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.TreeMap;

public class handler {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("C:\\StartPackAplana\\src\\main\\java\\example.txt"));
        SortedMap<String, Integer> statistics = new TreeMap<>();

        while (scanner.hasNext()) {
            String word = scanner.useDelimiter("\\s+").next();
            Integer count = statistics.get(word);
            if (count == null) {
                count = 0;
            }
            statistics.put(word, ++count);
        }
        System.out.println(statistics);
        int tmp = 0;
        String sTmp = "";
        for (Map.Entry<String, Integer> entry : statistics.entrySet()
        ) {
            if (entry.getValue() > tmp) {
                tmp = entry.getValue();
                sTmp = entry.getKey();
            }
        }
        System.out.println("Слово: " + sTmp  + " Чаще всего повторяется : целых " + tmp + " раза" );
    }
}