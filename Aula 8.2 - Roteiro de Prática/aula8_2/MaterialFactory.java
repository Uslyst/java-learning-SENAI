package aula8_2;
import aula8_2.entities.*;
import aula8_2.view.InputUtils;
import java.util.Scanner;

public class MaterialFactory {
    public static Book createBook(Scanner scanner) {
        var mat = createMaterialTemplate(scanner);
        int pageNum = InputUtils.readInt(scanner, "Page num: ");

        return new Book(mat.title(), mat.author(), mat.publishYear(), pageNum);
    }

    public static Magazine createMagazine(Scanner scanner) {
        var mat = createMaterialTemplate(scanner);
        int issueNumber = InputUtils.readInt(scanner, "Issue number: ");

        return new Magazine(mat.title(), mat.author(), mat.publishYear(), issueNumber);
    }

    public static Newspaper createNewspaper(Scanner scanner) {
        var mat = createMaterialTemplate(scanner);
        String issueDate = InputUtils.readString(scanner, "Issue date: ");

        return new Newspaper(mat.title(), mat.author(), mat.publishYear(), issueDate);
    }
    
    private static MaterialTemplate createMaterialTemplate(Scanner scanner) {
        String title = InputUtils.readString(scanner, "Title: ");
        String author = InputUtils.readString(scanner, "Author name: ");
        int publishYear = InputUtils.readInt(scanner, "Publish year: ");

        return new MaterialTemplate(title, author, publishYear);
    }

    record MaterialTemplate(String title, String author, int publishYear) {}
}
