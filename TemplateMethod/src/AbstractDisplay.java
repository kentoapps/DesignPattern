/**
 * Created by kento on 2017/05/05.
 */
public abstract class AbstractDisplay {
    protected abstract void open();
    protected abstract void print();
    protected abstract void close();
    protected void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
