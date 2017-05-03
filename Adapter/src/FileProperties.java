import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by kento on 2017/05/02.
 */
public class FileProperties implements FileIO {

    private final Properties properties;

    public FileProperties() {
        properties = new Properties();
    }

    @Override
    public void readFromFile(String filename) throws IOException {
        FileInputStream is = new FileInputStream(filename);
        properties.load(is);
    }

    @Override
    public void writeToFile(String filename) throws IOException {

    }

    @Override
    public void setValue(String key, String value) {

    }

    @Override
    public String getValue(String key) {
        return null;
    }
}
