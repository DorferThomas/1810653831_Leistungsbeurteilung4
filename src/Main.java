import java.util.*;


public class Main {
    public static void main(String[] args)
    {
        //Aufgabe 3:
        //Java provides the Date class available in java.util package, this class encapsulates the current date and time.
        //SimpleDateFormat is a concrete class for formatting and parsing dates in a locale-sensitive manner. SimpleDateFormat allows you to start by choosing any user-defined patterns for date-time formatting.
        //https://www.tutorialspoint.com/java/java_date_time.htm
        //year fängt bei 1900 an, deshalb 118.
        Date date1 = new Date(118,9,02,14,9,54);
        Book book1 = new Book(200,date1,"My Book 1","111-111-111-111");
        System.out.println("Das Buch hat " + book1.getPages() + " Seiten, wurde am " + book1.getReleased() + " veröffentlicht und hat den Titel " + book1.getTitle());

        //Aufgabe 4:
        //4 Objekte des Typs Book erstellt
        Book book2 = new Book(230,date1,"My Book 2","111-111-111-112");
        Book book3 = new Book(234,date1,"My Book 3","111-111-111-113");
        Book book4 = new Book(333,date1,"My Book 4","111-111-111-114");
        Book book5 = new Book(565,date1,"My Book 5","111-111-111-115");

        //Eine ArrayList mit den zuvor erstellten Book Objekten erstellt und mittels for-each schleife auf die Konsole ausgegeben.


        List<String> books = new LinkedList<>();
        books.add("My " + book1.getTitle() + " hat " + book1.getPages() + " Seiten und folgenden ISBN: " + book1.getIsbn());
        books.add("My " + book2.getTitle() + " hat " + book2.getPages() + " Seiten und folgenden ISBN: " + book2.getIsbn());
        books.add("My " + book3.getTitle() + " hat " + book3.getPages() + " Seiten und folgenden ISBN: " + book3.getIsbn());
        books.add("My " + book4.getTitle() + " hat " + book4.getPages() + " Seiten und folgenden ISBN: " + book4.getIsbn());
        books.add("My " + book5.getTitle() + " hat " + book5.getPages() + " Seiten und folgenden ISBN: " + book5.getIsbn());

        for (String eintrag : books )
        {
            System.out.println(eintrag);
        }

        //Aufgabe 5:

        Paperbook paperbook1 = new Paperbook(200,date1,"Paperbook1","0000:00000:000000","????","April");
        Paperbook paperbook2 = new Paperbook(345,date1,"Paperbook2","0000:00000:000000","????","März");
        Paperbook paperbook3 = new Paperbook(767,date1,"Paperbook3","0000:00000:000000","????","September");
        Paperbook paperbook4 = new Paperbook(233,date1,"Paperbook4","0000:00000:000000","????","Juni");
        Paperbook paperbook5 = new Paperbook(111,date1,"Paperbook5","0000:00000:000000","????","August");

        List<String> paperBooks = new LinkedList<>();
        paperBooks.add("My " + paperbook1.getTitle() + " hat " + paperbook1.getPages() + " Seiten und folgenden ISBN: " + paperbook1.getIsbn() + " zusätzlich ist es im Monat " + paperbook1.getMonth() + " erschienen.");
        paperBooks.add("My " + paperbook2.getTitle() + " hat " + paperbook2.getPages() + " Seiten und folgenden ISBN: " + paperbook2.getIsbn() + " zusätzlich ist es im Monat " + paperbook2.getMonth() + " erschienen.");
        paperBooks.add("My " + paperbook3.getTitle() + " hat " + paperbook3.getPages() + " Seiten und folgenden ISBN: " + paperbook3.getIsbn() + " zusätzlich ist es im Monat " + paperbook3.getMonth() + " erschienen.");
        paperBooks.add("My " + paperbook4.getTitle() + " hat " + paperbook4.getPages() + " Seiten und folgenden ISBN: " + paperbook4.getIsbn() + " zusätzlich ist es im Monat " + paperbook4.getMonth() + " erschienen.");
        paperBooks.add("My " + paperbook5.getTitle() + " hat " + paperbook5.getPages() + " Seiten und folgenden ISBN: " + paperbook5.getIsbn() + " zusätzlich ist es im Monat " + paperbook5.getMonth() + " erschienen.");

        for ( String eintrag : paperBooks )
        {
            System.out.println(eintrag);
        }
    }
}
