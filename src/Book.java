public class Book {
    private final String name;
    private final Author author;
    private int yearOfRelease;
    public Book (String name, Author author,int yearOfRelease){
        this.name = name;
        this.author = author;
        this.yearOfRelease = yearOfRelease;
    }
    public String getName() {
        return this.name;
    }
    public Author getAuthor(){
        return this.author;
    }

    public int getYearOfRelease() {
        return this.yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }
    public int setYearOfRelease() {
        this.yearOfRelease = yearOfRelease;
        return yearOfRelease;
    }
}




