/**
 * Created by kento on 2017/05/05.
 */
public class SingletonMain {

    public static void main(String[] args) {
        System.out.println("Start");

        Singleton singleton1= Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        if (singleton1 == singleton2) {
            System.out.println("They are same instances!");
        } else {
            System.out.println("No way...");
        }
        System.out.println("End");
    }
}
