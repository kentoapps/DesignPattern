/**
 * Created by kento on 2017/05/05.
 */
public class TemplateMethodMain {
    public static void main(String[] args) {
        AbstractDisplay charDisp = new CharDisplay('K');
        charDisp.display();
        AbstractDisplay strDisp = new StringDisplay("Hello, boy!!");
        strDisp.display();
        AbstractDisplay strDispJp = new StringDisplay("これがテンプレートメソッドだっ！");
        strDispJp.display();
    }
}
