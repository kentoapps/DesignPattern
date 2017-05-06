import framework.Manager;
import framework.Product;

/**
 * Created by kento on 2017/05/06.
 */
public class PrototypeMain {

    private static final String STRONG_MESSAGE = "strong message";
    private static final String WARNING_BOX = "warning box";
    private static final String SLASH_BOX = "slash box";

    public static void main(String[] args) {
        Manager manager = new Manager();

        // Register
        manager.register(STRONG_MESSAGE, new UnderlinePen('~'));
        manager.register(WARNING_BOX, new MessageBox('*'));
        manager.register(SLASH_BOX, new MessageBox('/'));

        // Create
        Product p1 = manager.create(STRONG_MESSAGE);
        p1.use("Hello, world.");
        Product p2 = manager.create(WARNING_BOX);
        p2.use("Hello, world.");
        Product p3 = manager.create(SLASH_BOX);
        p3.use("Hello, world.");
    }
}
