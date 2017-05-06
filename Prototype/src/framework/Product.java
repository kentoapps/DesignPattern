package framework;

/**
 * Created by kento on 2017/05/06.
 */
public interface Product extends Cloneable {
    public abstract void use(String s);
    public abstract Product createClone();
}
