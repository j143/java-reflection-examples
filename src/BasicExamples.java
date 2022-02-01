
import java.util.*;

// Datastructure is an arrangement of data


class DataStructure {

    // Create an array
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];

    public DataStructure() {
        // fill the array with ascending integer values
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }

    public void printEven() {

        // Print out values of even indices of the array
        DataStructureIterator iterator = new DataStructure.EvenIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    void print(DataStructureIterator iterator) {
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    interface DataStructureIterator extends java.util.Iterator<Integer> { }

    // Inner class implements the DataStructureIterator interface,
    // which extends the Iterator<Integer> interface

    private class EvenIterator implements DataStructureIterator {

        // Start stepping through the array from the beginning
        private int nextIndex = 0;

        public boolean hasNext() {

            // Check if the current element is the last in the array
            return (nextIndex <= SIZE - 1);
        }

        public Integer next() {

            // Record a value of an even index of the array
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);

            // Get the next even element
            nextIndex += 2;
            return retValue;
        }
    }

    public static void main(String s[]) {

        // Fill the array with integer values and print out only
        // values of even indices
        DataStructure ds = new DataStructure();
        ds.printEven();
    }
}

class Class1 {
    protected InnerClass1 ic;

    public Class1() {
        ic = new InnerClass1();
    }

    public void displayStrings() {
        System.out.println(ic.getString() + ".");
        System.out.println(ic.getAnotherString() + ".");
    }

    static public void main(String[] args) {
        Class1 c1 = new Class1();
        c1.displayStrings();
    }

    protected class InnerClass1 {
        public String getString() {
            return "InnerClass1: getString invoked";
        }

        public String getAnotherString() {
            return "InnerClass1: getAnotherString invoked";
        }
    }
}

class Me {

    // class variables
    // This variable updates with changes in the latest
    // call.
    public static int x = 10;

    // instance variables
    // different value for each instance invoked
    public int y = 3;
}


class BasicTest {
//    static int x;
//    static class Inner {
//        void aplusb() {
//            x = 10;
//        }
//    }

    public static void main(String[] args) {
        String s = "Hello";
        String s1 = new String("Hello");

        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());

        if(s==s1)
            System.out.println("Both are same");

//        Inner.aplusb();

        Me a = new Me();
        Me b = new Me();

        a.x = 1;
        a.y = 5;
        b.x = 2;
        b.y = 6;

        System.out.println(a.x);
        System.out.println(a.y);
        System.out.println(b.x);
        System.out.println(b.y);
        System.out.println(Me.x);
    }
}

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
