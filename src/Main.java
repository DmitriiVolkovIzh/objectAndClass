public class Main {
    public static void main(String[] args) {
        Author authorOne = new Author("Джордж","Оруэлль");
        Book bookOne = new Book("1984", authorOne, 1949);

        Author authorTwo = new Author("Николай","Носов");
        Book bookTwo = new Book("Незнайка на луне", authorOne, 1965);

        System.out.println("Книга 1 - " + bookOne.getName() + ", " + authorOne.getName()+ " " + authorOne.getSurname() + ", " + bookOne.setYearOfRelease());
        System.out.println("Книга 2 - " + bookTwo.getName() + ", " + authorTwo.getName()+ " " + authorTwo.getSurname() + ", " + bookTwo.setYearOfRelease());

        bookOne.setYearOfRelease(2022);
        System.out.println("Книга 1 - " + bookOne.getName() + ", " + authorOne.getName()+ " " + authorOne.getSurname() + ", " + bookOne.setYearOfRelease());
    }
}