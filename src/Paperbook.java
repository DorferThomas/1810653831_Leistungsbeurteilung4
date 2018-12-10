import java.util.Date;

//Wenn i  LOL: https://www.java-forum.org/thema/was-sind-attribute.66512/
public class Paperbook extends Book {

    Paperbook(int pages, Date released, String title, String isbn, String series, String month) {
        super(pages, released, title, isbn);
        //this. verwendet, damit die übergebenen Attribute der Main auf die private Attribute übergeben werden.
        this.released = released ;
        this.pages = pages;
        this.title = title;
        this.isbn = isbn;
        this.month = month;
    }

        private String series;
        private String month;
        private int pages;
        private Date released;
        private String title;
        private String isbn;


        //Getter und Setter für alle Attribute erstellt (Kapselung)
        public void setSeries(String param){series=param;}
        public String getSeries() {return series; }


        public void setMonth(String param){series=param;}
    public String getMonth() {return month; }


    @Override
        public int getPages () {
            return this.pages;
        }
    @Override
        public void setPages ( int param){
            this.pages = param;
        }
    @Override
        public Date getReleased () {
            return this.released;
        }
    @Override
        public void setReleased (Date param){
            this.released = param;
        }
    @Override
        public String getTitle () {
            return this.title;
        }
    @Override
        public void setTitle (String param){
            this.title = param;
        }
    @Override
        public String getIsbn () {
            return this.isbn;
        }
        @Override
        public void setIsbn (String param){
            this.isbn = param;
        }

    }

