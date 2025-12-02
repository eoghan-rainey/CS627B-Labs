import java.util.ArrayList;
import java.util.List;

public class Member {

    //creating a list for books in a members history
    private List<Book> history = new ArrayList<>();
    //giving each member an id number
    private String idNum;

    public Member(String idNum)
    {
        this.idNum = idNum;
    }
    //method to add a book to member history
    public void addToHistory(Book book)
    {
        history.add(book);
    }
    //getter method for members history
    public List<Book> getHistory()
    {
        return history;
    }
}
