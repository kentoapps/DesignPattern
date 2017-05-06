import framework.Product;

/**
 * Created by kento on 2017/05/06.
 */
public class MessageBox implements Product {

    private char decoChar;

    public MessageBox(char decoChar) {
        this.decoChar = decoChar;
    }

    @Override
    public void use(String s) {
        // LINE 1
        int length = s.getBytes().length;
        printLine(length);

        // LINE 2
        System.out.println(decoChar + " " + s + " " + decoChar);

        // LINE 3
        printLine(length);
    }

    private void printLine(int length) {
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decoChar);
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
