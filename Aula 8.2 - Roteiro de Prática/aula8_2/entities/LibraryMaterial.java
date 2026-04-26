package aula8_2.entities;

public abstract class LibraryMaterial {
    private String title;
    private String author;
    private int publishYear;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public LibraryMaterial(String title, String author, int publishYear) {
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
    }

    public abstract String getDetails();

    public void loan() {
        System.out.printf("\nLoaned material: '%s'", this.title);
    }

    public String getMaterialDetails() {
        return String.format("\nTitle: %s, \nAuthor: %s, \nPublish Year: %d", this.title, this.author, this.publishYear);
    }
}
