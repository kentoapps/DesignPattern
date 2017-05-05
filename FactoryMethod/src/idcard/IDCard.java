package idcard;

import framework.Product;

/**
 * Created by kento on 2017/05/05.
 */
public class IDCard extends Product {
    private final String owner;
    private final int serial;

    IDCard(String owner, int serial) {
        System.out.println(owner + "のカードを作ります。");
        this.owner = owner;
        this.serial = serial;
    }

    @Override
    public void use() {
        System.out.println(owner + "のカードを使います。");
    }

    public String getOwner() {
        return owner;
    }

    public int getSerial() {
        return serial;
    }
}
