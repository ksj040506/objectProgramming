public class Book {
    String title;
    String author;

    Book() {
        title = "";
        author = "";
    }
    
    Book(String title) {
        this.title = title;
        this.author = "작자미상";
    }

    Book(String title , String author) {
        this.title = title;
        this.author = author;
    }

    public void show() {
        System.out.println("제목:" + title + ", 작가:" + author);
    }

}
