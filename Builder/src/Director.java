/**
 * Created by kento on 2017/05/08.
 */
public class Director {

    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("Morning to afternoon");
        builder.makeItems(new String[]{
                "Good morning.",
                "Good afternoon.",
        });
        builder.makeString("At night");
        builder.makeItems(new String[]{
                "Good evening.",
                "Good night.",
                "Good bye.",
        });
        builder.close();
    }
}
