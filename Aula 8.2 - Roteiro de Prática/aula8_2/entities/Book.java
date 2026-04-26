package aula8_2.entities;

public class Book extends LibraryMaterial{
    private int pageNum;

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public Book(String title, String author, int publishYear, int pageNum) {
        super(title, author, publishYear);
        this.pageNum = pageNum;
    }

    @Override
    public String getDetails() {
        return String.format("%s\nPage Num: %d", super.getMaterialDetails(), pageNum);
    }
}
