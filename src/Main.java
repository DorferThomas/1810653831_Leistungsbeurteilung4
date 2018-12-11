import java.util.*;


public class Main {
    public static void main(String[] args)
    {
        //Aufgabe 3:
        //Java provides the Date class available in java.util package, this class encapsulates the current date and time.
        //SimpleDateFormat is a concrete class for formatting and parsing dates in a locale-sensitive manner. SimpleDateFormat allows you to start by choosing any user-defined patterns for date-time formatting.
        //https://www.tutorialspoint.com/java/java_date_time.htm
        //year fängt bei 1900 an, deshalb 118.

        Date date1 = new Date(118,9,02,14,9,34);
        Book book1 = new Book(200,date1,"My Book 1","111-111-111-111");
        System.out.println("Das Buch hat " + book1.getPages() + " Seiten, wurde am " + book1.getReleased() + " veröffentlicht und hat den Titel " + book1.getTitle());

        //Aufgabe 4:
        //4 Objekte des Typs Book erstellt
        Book book2 = new Book(230,date1,"My Book 2","111-111-111-112");
        Book book3 = new Book(234,date1,"My Book 3","111-111-111-113");
        Book book4 = new Book(333,date1,"My Book 4","111-111-111-114");
        Book book5 = new Book(565,date1,"My Book 5","111-111-111-115");
        Book book6 = new Book();
        //Eine ArrayList mit den zuvor erstellten Book Objekten erstellt und mittels for-each schleife auf die Konsole ausgegeben.
        ArrayList<Book> bookArrayList = new ArrayList<>();
        bookArrayList.add(book1);
        bookArrayList.add(book2);
        bookArrayList.add(book3);
        bookArrayList.add(book4);
        bookArrayList.add(book5);

        for (Book book : bookArrayList ) {
            System.out.println("My " + book.getTitle() + " hat " + book.getPages() + " Seiten und folgenden ISBN: " + book.getIsbn() + ".");
        }

                                            /*
                                            List<Book> bookLinkedList = new LinkedList<>();
                                            bookLinkedList.add(book1);
                                            bookLinkedList.add(book2);
                                            bookLinkedList.add(book3);
                                            bookLinkedList.add(book4);
                                            bookLinkedList.add(book5);

                                            for (Book book : bookLinkedList )
                                            {
                                                System.out.println("ARRAYLIST My " + book.getTitle() + " hat " + book.getPages() + " Seiten und folgenden ISBN: " + book.getIsbn() + ".");
                                            }

                                            */
        //Aufgabe 5:
        //5 Objekte des Typs Paperbook erstellt
        Paperbook paperbook1 = new Paperbook(200,date1,"Paperbook1","0000:00000:000000","????","April");
        Paperbook paperbook2 = new Paperbook(345,date1,"Paperbook2","0000:00000:000000","????","März");
        Paperbook paperbook3 = new Paperbook(767,date1,"Paperbook3","0000:00000:000000","????","September");
        Paperbook paperbook4 = new Paperbook(233,date1,"Paperbook4","0000:00000:000000","????","Juni");
        Paperbook paperbook5 = new Paperbook(111,date1,"Paperbook5","0000:00000:000000","????","August");

        //eine LikedList erstellt und die zuvor erstellten Objekte hinzugefügt. LinkedList Vorteil = doppeltverkettete Liste, welche beim löschen oder hinzufügen von Daten schneller ist. Da jetzt Stelle ihren Vor-/ und Nachgänger kennt.
        //nachteil: wenn man bestimmte Elemente der Liste sucht, kann dies länger dauern da man Bsp. sucht man das 200 Idem von 201, muss die Liste alle 200 abklappern bis dad Idem gefunden wurde
        //Bei ArrayList kennt man hingegen genau den Speicherplatz und dadurch ist sie schneller zum lesen, aber längsamer zum Beschreiben und Löschen

        List<Paperbook> paperbookList = new LinkedList<>();
        paperbookList.add(paperbook1);
        paperbookList.add(paperbook2);
        paperbookList.add(paperbook3);
        paperbookList.add(paperbook4);
        paperbookList.add(paperbook4);

        //mittels for-each schleife alle Büche mit dem "sout" & "getter&setter" auf der Konsole ausgegeben.
        for ( Paperbook paperbook : paperbookList )
        {
            System.out.println("My " + paperbook.getTitle() + " hat " + paperbook.getPages() + " Seiten und folgenden ISBN: " + paperbook.getIsbn() + " zusätzlich ist es im Monat " + paperbook.getMonth() + " erschienen.");
        }
    }
}
