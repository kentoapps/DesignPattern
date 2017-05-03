import java.io.IOException;

/**
 * Created by kento on 2017/05/02.
 */
public interface FileIO {
    void readFromFile(String filename) throws IOException;
    void writeToFile(String filename) throws IOException;
    void setValue(String key, String value);
    String getValue(String key);
}
