import java.util.HashMap;
import java.util.LinkedList;

public class PhoneBook {

    private HashMap<String, LinkedList<String>> book = new HashMap<>();

    public void add(String name, String num) {

        if (book.get(name) == null) {

            LinkedList<String> linkedList = new LinkedList<>();

            linkedList.add(num);

            book.put(name, linkedList);
        }
        else {

            LinkedList<String> linkedList = book.get(name);

            linkedList.add(num);

            book.put(name, linkedList);
        }
    }

    public LinkedList<String> get(String name) {

        return book.get(name);
    }
}
