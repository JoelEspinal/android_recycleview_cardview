package geskep.com.abc.DummyData;

import java.util.ArrayList;
import java.util.List;

import geskep.com.abc.models.Book;
import geskep.com.abc.models.Citation;

/**
 * Created by User on 10/6/2017.
 */

public class Content {

    public static Book MATEO = new Book(Book.DEFAULT_BOOK_VERSION, "Mateo");




    public static void fillMateo(){
        List<Citation> quotes = new ArrayList<>();

        quotes.add(new Citation(1, "Libro de la genealogía de Jesucristo, hijo de David, hijo de Abraham."));
        quotes.add(new Citation(2, "Abraham engendró a Isaac, Isaac a Jacob, y Jacob a Judá y a sus hermanos."));
        quotes.add(new Citation(3, "Judá engendró de Tamar a Fares y a Zara, Fares a Esrom, y Esrom a Aram."));
        quotes.add(new Citation(4, "Aram engendró a Aminadab, Aminadab a Naasón, y Naasón a Salmón."));
        quotes.add(new Citation(5, "Salmón engendró de Rahab a Booz, Booz engendró de Rut a Obed, y Obed a Isaí."));
        quotes.add(new Citation(6, "Isaí engendró al rey David, y el rey David engendró a Salomón de la que fue mujer de Urías."));
        quotes.add(new Citation(7, "Salomón engendró a Roboam, Roboam a Abías, y Abías a Asa."));
        quotes.add(new Citation(8, "Asa engendró a Josafat, Josafat a Joram, y Joram a Uzías."));
        quotes.add(new Citation(9, "Uzías engendró a Jotam, Jotam a Acaz, y Acaz a Ezequías."));
        quotes.add(new Citation(10, "Ezequías engendró a Manasés, Manasés a Amón, y Amón a Josías."));

        MATEO.setCitations(quotes);

    }

}
