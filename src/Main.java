import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Author janette = new Author("Janette", "Wals");
        Author author = new Author("Hayley", "Scrivenor");

        Book glassCastle = new Book("glassCastle", 2020, janette);
        Book dirtyCity = new Book("dirtyCity", 2025, new Author("Hayley", " Scrivenor"));

        System.out.println(dirtyCity.getAuthor().equals(author));


        System.out.println(janette.equals(glassCastle.getAuthor()));

        System.out.println(glassCastle.getTitle() + " ;" + glassCastle.getPublishDate());
        glassCastle.setPublishDate(2022);
        System.out.println(glassCastle.getTitle() + " ;" + glassCastle.getPublishDate());

        System.out.println(dirtyCity.getAuthor().getFirstName() + " " + dirtyCity.getAuthor().getLastName());
    }
}