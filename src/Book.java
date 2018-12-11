import java.util.Date;

public class Book {

    Book(int pages, Date released, String title, String isbn){
        this.released = released ;
        this.pages = pages;
        this.title = title;
        this.isbn = isbn;
    }

    //Leeren Konstruktor erstellt, damit man auch
    Book(){}

        private Date released;
        private int pages;
        private String title;
        private String isbn;


    public int getPages () {
            return this.pages;
        }

        public void setPages ( int param){
            this.pages = param;
        }

    public Date getReleased () {
        return this.released;
    }

    public void setReleased (Date param){
        this.released = param;
    }


        public String getTitle () {
            return this.title;
        }
        public void setTitle (String param){
            this.title = param;
        }

        public String getIsbn () {
            return this.isbn;
        }
        public void setIsbn (String param){
            this.isbn = param;
        }

    }

