package aula8_2.entities;

public class Newspaper extends LibraryMaterial {
    private String issueDate;

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public Newspaper(String title, String author, int publishYear, String issueDate) {
        super(title, author, publishYear);
        this.issueDate = issueDate;
    }

    @Override
    public String getDetails() {
        return String.format("%s\nIssue date: %s", super.getMaterialDetails(), this.issueDate);
    }
}
