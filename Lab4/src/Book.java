
public class Book extends Item {

private String author;
private int ISBN;

public Book(String name, String author, int ISBN) {
super(name);
this.author = author;
this.ISBN = ISBN;
}

@Override
public String getListing() {
return "Book Name - " + title + "\n" + "Author: " + author + "\n" + "ISBN# " + ISBN;
}

}
