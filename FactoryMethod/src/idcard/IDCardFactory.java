package idcard;

import framework.Factory;
import framework.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by kento on 2017/05/05.
 */
public class IDCardFactory extends Factory {

    private final Map<Integer, IDCard> owners = new HashMap<>();

    private int serial = 100;

    @Override
    protected void registerProduct(Product product) {
        IDCard idCard = (IDCard) product;
        owners.put(idCard.getSerial(), idCard);
    }

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner, serial++);
    }

    public Map<Integer, IDCard> getOwners() {
        return owners;
    }
}
