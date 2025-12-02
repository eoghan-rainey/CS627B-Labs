// This is a class that models a book with a title, an author and an IBSN (we assume this is some sort of library ID number)
//The boolean function allows us to essentially toggle whether or not a book is checked out or not.

public class Book{

    private String title;
    private String author;
    private String IBSN;
    private boolean isCheckedOut;

    //Constructor to make a 'Book' with a title, author, IBSN and default the isCheckedOut boolean to false
    
    public Book(String title, String author, String IBSN)
    {
        this.title = title;
        this.author = author;
        this.IBSN = IBSN;
        this.isCheckedOut = false;
    }

    // Getter and setter methods for each attribute

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getTitle()
    {
        return this.title;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }
    public String getAuthor()
    {
        return this.author;
    }

    public void setIBSN(String IBSN)
    {
        this.IBSN= IBSN;
    }

    public String getIBSN()
    {
        return this.IBSN;
    }

    //function to query if book is checked out

    public boolean isCheckedOut()
    {
        return this.isCheckedOut;
    }

    //function to check a book out, sets boolean to true
    public void checkBookOut(Member member)
    {
        if(isCheckedOut == true)
        {
            System.out.println("Book is already checked out");
        }
        else
        {
            this.isCheckedOut = true;
            member.addToHistory(this);
        }
    }

    //function to check a book in/ 'return' a book, sets boolean value to false
    public void checkBookIn()
    {
        if(isCheckedOut == false)
        {
            System.out.println("Book is already checked in");
        }
        else
        {
            this.isCheckedOut = false;
        }
    }

   

}