/**
 * Created by kento on 2017/05/05.
 */
public class StringDisplay extends AbstractDisplay {

    private final String str;
    private final int length;

    public StringDisplay(String str) {
        this.str = str;
        this.length = str.getBytes().length;
    }

    @Override
    protected void open() {
        printLine();
    }

    @Override
    protected void print() {
        System.out.println("|" + str + "|");
    }

    @Override
    protected void close() {
        printLine();
    }

    private void printLine() {
        System.out.print('+');
        for (int i = 0; i < length; i++) {
            System.out.print('-');
        }
        System.out.println('+');
    }
}
