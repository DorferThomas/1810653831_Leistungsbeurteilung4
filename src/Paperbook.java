import java.util.Date;

//Wenn i  LOL: https://www.java-forum.org/thema/was-sind-attribute.66512/
public class Paperbook extends Book {

    Paperbook(int pages, Date released, String title, String isbn, String series, String month) {
        super(pages, released, title, isbn); //wenn man super verwendet, erbt die Klasse Paperbook alles von der Klasse Book und man muss diese nicht mehr extra deklareiren
        this.series = series;
        this.month = month;
                                                                                                                        /*this.released = released ;
                                                                                                                        this.pages = pages;
                                                                                                                        this.title = title;*/
    }
        private String series;
        private String month;


    //Getter und Setter für alle Attribute erstellt (Kapselung)
    public String getMonth()
    {
        return month;
    }
    public void setMonth(String param)
    {
        series=param;
    }

    public void setSeries(String param)
    {
        series=param;
    }
    public String getSeries()
    {
        return series;
    }
}

