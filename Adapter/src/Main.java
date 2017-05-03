import java.io.IOException;

/**
 * Created by kento on 2017/05/02.
 */
public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            f.readFromFile("Adapter/src/file.txt");
            f.setValue("year", "2004");
            f.setValue("month", "4");
            f.setValue("day", "21");
            f.writeToFile("Adapter/src/newfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
