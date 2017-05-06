import framework.Product;

/**
 * Created by kento on 2017/05/06.
 */
public class UnderlinePen implements Product {

    private char ulChar;

    public UnderlinePen(char ulChar) {
        this.ulChar = ulChar;
    }

    @Override
    public void use(String s) {
        // LINE 1
        System.out.println("\"" + s + "\"");

        // LINE 2
        System.out.print(" ");
        int length = s.getBytes().length;
        for (int i = 0; i < length; i++) {
            System.out.print(ulChar);
        }
        System.out.println("");
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
