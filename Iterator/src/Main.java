/**
 * Created by kento on 2017/05/01.
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("Ants"));
        bookShelf.appendBook(new Book("Bugs"));
        bookShelf.appendBook(new Book("Cats"));
        bookShelf.appendBook(new Book("Dags"));
        bookShelf.appendBook(new Book("Eggs"));
        bookShelf.appendBook(new Book("Foxes"));

        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            System.out.println(((Book)iterator.next()).getName());
        }
    }
}
