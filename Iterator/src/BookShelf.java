import java.util.ArrayList;
import java.util.List;

/**
 * Created by kento on 2017/05/01.
 */
public class BookShelf implements Aggregate {
    private List<Book> bookList;

    public BookShelf() {
        bookList = new ArrayList<>();
    }

    public Book getBookAt(int index) {
        return bookList.get(index);
    }

    public void appendBook(Book book) {
        bookList.add(book);
    }

    public int getLength() {
        return bookList.size();
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
