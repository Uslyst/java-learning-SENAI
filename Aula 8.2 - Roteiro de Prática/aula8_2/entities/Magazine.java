package aula8_2.entities;

public class Magazine extends LibraryMaterial {
    private int issueNumber;

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public Magazine(String title, String author, int publishYear, int issueNumber) {
        super(title, author, publishYear);
        this.issueNumber = issueNumber;
    }

    @Override
    public String getDetails() {
        return String.format("%s\nIssue number: %d", super.getMaterialDetails(), issueNumber);
    }
}
