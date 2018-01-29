import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        arrayMethod();

        phoneBookMethod();
    }

    private static void arrayMethod() {

        String[] array = getStringArray();

        HashMap<String, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {

            Integer value = hashMap.put(array[i], 1);

            if (value != null) {

                hashMap.put(array[i], value + 1);
            }
        }

        Set<String> keySet = hashMap.keySet();

        System.out.println(keySet);

        Iterator<String> iterator = keySet.iterator();

        while (iterator.hasNext()) {

            String key = iterator.next();

            System.out.println(key + ": " + hashMap.get(key));
        }
    }

    private static String[] getStringArray(){

        String[] array = new String[20];

        for (int i = 0; i < 16; i++) {

            array[i] = "ABC" + i;
        }

        array[16] = "ABC2";
        array[17] = "ABC2";
        array[18] = "ABC3";
        array[19] = "ABC4";

        return array;
    }

    private static void phoneBookMethod() {

        PhoneBook phoneBook = new PhoneBook();

        putNames(phoneBook);

        System.out.println("Сидоров: " + phoneBook.get("Сидоров"));
        System.out.println("Петров: " + phoneBook.get("Петров"));
    }

    private static void putNames(PhoneBook phoneBook) {

        phoneBook.add("Иванов", "84951234567");
        phoneBook.add("Петров", "84957894561");
        phoneBook.add("Петров", "84954567896");
        phoneBook.add("Сидоров", "84957894561");
    }
}
