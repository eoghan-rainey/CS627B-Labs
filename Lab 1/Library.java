// import java package to use a list
import java.util.ArrayList;
import java.util.List;

// new Library class that contains a list of books and members
public class Library{

    private List<Book> books = new ArrayList<>();
    private List<Member> members = new ArrayList<>();

    // function to add a book to the array list

    public void addBook(Book b)
    {
        books.add(b);
    }

    public void removeBook(String IBSN)
    {
        //remove books from books array list that match the IBSN
        books.removeIf(book -> (book.getIBSN().equals(IBSN)));
    }
    
    //this function loops through the array list of books and returns the books that contain the title, using the getTitle()
    public Book searchByTitle(String title)
    {
        for(int i = 0; i < books.size(); i++)
        {
           if(books.get(i).getTitle().equals(title))
           {
            return books.get(i);
           }
        }
        return null;
    }

    //this function loops through the array list and returns a new array list containing books that have the author you search

    public List<Book> searchByAuthor(String author)
    {
        List<Book> filteredList = new ArrayList<>();

        for(int i = 0; i < books.size(); i++)
        {
           if(books.get(i).getAuthor().equals(author))
           {
                filteredList.add(books.get(i));
           }
        }
        return filteredList;
    }

     //this function loops through the array list and checks if the boolean isCheckedOut is false, if it is it adds it to a new array list 'availableList'
     public List<Book> listAvailableBooks()
    {
        List<Book> availableList = new ArrayList<>();

        for(int i = 0; i < books.size(); i++)
        {
           if(books.get(i).isCheckedOut() == false)
           {
                availableList.add(books.get(i));
           }
        }
        return availableList;
    }
    // add a member to the library
    public void addMember(Member m)
    {
        members.add(m);
    }

    // getter for books
     public List<Book> getBooks()
    {
        return books;
    }
}
