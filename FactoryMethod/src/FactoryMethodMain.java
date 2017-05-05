import framework.Factory;
import framework.Product;
import idcard.IDCardFactory;

/**
 * Created by kento on 2017/05/05.
 */
public class FactoryMethodMain {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product goku = factory.create("Goku");
        Product gohan = factory.create("Gohan");
        Product goten = factory.create("Goten");
        goku.use();
        gohan.use();
        goten.use();

        ((IDCardFactory)factory).getOwners().get(101).use();
    }
}
