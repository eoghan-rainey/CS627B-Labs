public class Test {
   
    private static Library library;
    private static Member member1;
    private static Member member2;

    public static void main(String[] args) {
        
        //Creating our library object
        library = new Library();
        // call method to add books to our library
        createBooks();
        //call method to add members to our library
        addMembersToLibrary();

        //testing check out method and its effects on members history
        library.searchByTitle("book1").checkBookOut(member1);
        System.out.println("Book is checked out? " + library.searchByTitle("book1").isCheckedOut());
        System.out.println(member1.getHistory().get(0).getTitle());
        
        //testing if validation for checking out works and its effects on history(should be empty for member 2)
        library.searchByTitle("book1").checkBookOut(member2);
        System.out.println("Book is checked out? " + library.searchByTitle("book1").isCheckedOut());
        System.out.println(member2.getHistory().size());
        //testing checking a book in
        library.searchByTitle("book1").checkBookIn();
        System.out.println("Book is checked out? " + library.searchByTitle("book1").isCheckedOut());

        //check it out to member 2 and check history
        library.searchByTitle("book1").checkBookOut(member2);
        System.out.println("Book is checked out? " + library.searchByTitle("book1").isCheckedOut());
        System.out.println(member2.getHistory().get(0).getTitle());
        
        //checking another book out to check its effects on history
        library.searchByTitle("book2").checkBookOut(member2);
        System.out.println("Book is checked out? " + library.searchByTitle("book2").isCheckedOut());
        System.out.println(member2.getHistory().get(1).getTitle());
    }

    //function to add books into our library
    private static void createBooks()
    {
        Book book1 = new Book("book1", "author1" , "0001");
        Book book2 = new Book("book2", "author2" , "0002");
        Book book3 = new Book("book3", "author3" , "0003");
        Book book4 = new Book("book4", "author4" , "0004");

        
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
    }

    //add members to library
    public static void addMembersToLibrary()
    {
        member1 = new Member("01");
        member2 = new Member("02");

        library.addMember(member1);
        library.addMember(member2);
    }   
}
