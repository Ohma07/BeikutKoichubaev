import java.util.HashSet;
import java.util.Arrays;

//practice 1

public class SetStackQueue {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 4, 4, 4, 5};

        HashSet<Integer> set = new HashSet<>();
        for (int n : numbers) {
            set.add(n);
        }

        System.out.println(set);
    }
}

//practice 2

class CheckMembership {
    public static boolean isAllowed(String name, HashSet<String> allowedUsers) {
        return allowedUsers.contains(name);
    }

    public static void main(String[] args) {
        HashSet<String> users = new HashSet<>();
        users.add("alice");
        users.add("bob");

        System.out.println(isAllowed("bob", users));
        System.out.println(isAllowed("charlie", users));
    }
}

//practice 3

class SizeAndEmptiness {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(5);
        set.add(10);
        set.add(15);

        System.out.println("Size: " + set.size());

        set.clear();
        System.out.println("Is empty: " + set.isEmpty());
    }
}

//practice 4

class RemoveElements {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Beka");
        names.add("Akbarrych");
        names.add("Nurs1ks");
        names.add("Sn1ckers");
        names.add("Hezza");

        boolean removed = names.remove("Hezza");

        System.out.println("Removed? " + removed);
        System.out.println(names);
    }
}

//practice 5

class BulkAdd {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        set1.addAll(set2);
        System.out.println(set1);
    }
}

//practice 6

class BulkRemove {
    public static void main(String[] args) {
        HashSet<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        HashSet<Integer> setB = new HashSet<>(Arrays.asList(3, 4));

        setA.removeAll(setB);
        System.out.println(setA);
    }
}

//practice 7

class RetainCommon {
    public static void main(String[] args) {
        HashSet<Integer> setX = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        HashSet<Integer> setY = new HashSet<>(Arrays.asList(3, 4, 5));

        setX.retainAll(setY);
        System.out.println(setX);
    }
}

//practice 8

class ContainsAllExample {
    public static void main(String[] args) {
        HashSet<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        HashSet<Integer> setB = new HashSet<>(Arrays.asList(2, 3));

        if (setA.containsAll(setB)) {
            System.out.println("setA contains all elements of setB");
        } else {
            System.out.println("setA does not contain all elements of setB");
        }
    }
}

//practice 9

class DeduplicateWords {
    public static void main(String[] args) {
        String sentence = "this is a test this is a test";
        String[] words = sentence.split(" ");

        HashSet<String> uniqueWords = new HashSet<>();
        for (String word : words) {
            uniqueWords.add(word);
        }

        System.out.println(uniqueWords);
    }
}

//practice 10

  class CaseInsensitiveWords {
    public static void main(String[] args) {
        String[] words = {"Apple", "apple", "APPLE", "Banana", "BANANA"};

        HashSet<String> set = new HashSet<>();
        for (String word : words) {
            set.add(word.toLowerCase());
        }

        System.out.println(set);
    }
}