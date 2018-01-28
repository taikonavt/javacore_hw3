import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

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

            System.out.println(hashMap.get(iterator.next()));
        }
    }

    private static String[] getStringArray(){

        String[] array = new String[20];

        for (int i = 0; i < 15; i++) {

            array[i] = "ABC" + i;
        }

        array[16] = "ABC2";
        array[17] = "ABC2";
        array[18] = "ABC3";
        array[19] = "ABC4";

        return array;
    }
}
