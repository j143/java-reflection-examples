
import java.util.*;

class LinkedListExamples {
    public static void main(String[] args) {
        LinkedList<String> languages = new LinkedList<>();
        List languagesList = Collections.synchronizedList(new LinkedList<>());

        languages.add("Telugu");
        languages.add("Hindi");
        languages.add("Tamil");
        languages.add("None");
        System.out.println("LinkedList: " + languages);
        languagesList.add("Punjabi");
        languagesList.add("Kashmiri");
        languagesList.add("Tagin");
        System.out.println("Synchronized LinkedList: " + languagesList);

        languagesList.addAll(languages);

        // remove None from the list with index
        languagesList.remove(6);

        String s = languages.get(1);
        System.out.println(s);

        Iterator<String> language = languagesList.iterator();
        while (language.hasNext()) {
            System.out.print(language.next() + ",");

        }

    }
}

class MapSortingExample {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        // key, value
        languages.put("1", "Telugu");
        languages.put("3", "Hindi");
        languages.put("2", "Sanskrit");
        System.out.println("Map: " + languages);

        // creating treemap sorts by key
        TreeMap<String, String> sortedlanguages = new TreeMap<>(languages);
        System.out.println("Map with keys sorted: " + sortedlanguages);
    }
}

class SetsExamples {
    public static void main(String[] args) {
        Set<Integer> natural_numbers = new HashSet<>();
        natural_numbers.add(1);
        natural_numbers.add(2);
        natural_numbers.add(3);
        natural_numbers.add(4);
        System.out.println("Natural numbers: " + natural_numbers);

        Set<Integer> prime_numbers = new HashSet<>();
        prime_numbers.add(2);
        prime_numbers.add(3);
        System.out.println("Prime numbers: " + prime_numbers);

        boolean compare = natural_numbers.containsAll(prime_numbers);
        if(compare) {
            System.out.println("Natural numbers contains all the primary numbers");
        }
    }
}


class StringExamples {
    public static void main(String[] args) {
        String one = "hello";
        String two = "j143";
        String[] shuffled = {"ehll0134j", "helloj143", "hello413j", "j143hello"};

        if(wordShuffleCheck(one, two, shuffled))
            System.out.println("No breakfast today");
    }

    static boolean wordShuffleCheck(String one, String two, String[] shuffled) {

        one = sortString(one);
        two = sortString(two);
        System.out.println(one + two + shuffled[0]);

        // TODO: This check is not correct, may be it needed be checked Char by Char
        if ((one.concat(two)) == shuffled[0])
            return true;

        return false;
    }

    static String sortString(String s) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);

        s = String.valueOf(charArray);
        return s;
    }

}

public class BasicExamples {
    public static void main(String[] args) {
        // do nothing
    }
}
