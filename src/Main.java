//import java.util.*;
//
//practice 1
//
//class Book {
//    int id;
//    String name;
//
//    Book(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    // Needed to remove duplicates
//    public boolean equals(Object o) {
//        Book b = (Book) o;
//        return id == b.id;
//    }
//
//    public int hashCode() {
//        return id;
//    }
//
//    public String toString() {
//        return id + " - " + name;
//    }
//}
//
//public class Main{
//    public static void main(String[] args) {
//
//        ArrayList<Book> list1 = new ArrayList<>();
//        list1.add(new Book(1, "Java"));
//        list1.add(new Book(2, "Python"));
//
//        ArrayList<Book> list2 = new ArrayList<>();
//        list2.add(new Book(2, "Python"));
//        list2.add(new Book(3, "C++"));
//
//        // Merge and remove duplicates
//        Set<Book> books = new HashSet<>();
//        books.addAll(list1);
//        books.addAll(list2);
//
//        // Print result
//        for (Book b : books) {
//            System.out.println(b);
//        }
//    }
//}
//
// Practice 2
//class LongestMovie{
//    public static void main(String[] args) {
//        ArrayList<String> movies = new ArrayList<>(Arrays.asList(
//                "Avatar", "Inception", "Interstellar"));
//
//        String longest = movies.get(0);
//
//        for (String m : movies) {
//            if (m.length() > longest.length()) {
//                longest = m;
//            }
//        }
//        System.out.println("Longest movie title: " + longest);
//    }
//}
//
//Practice 3
//
//class CountPizza{
//    public static void main(String[] args) {
//        ArrayList<String> foods = new ArrayList<>(Arrays.asList(
//                "Pizza", "Burger", "Pizza", "Pasta"));
//
//        int count = 0;
//        for (String f : foods) {
//            if (f.equals("Pizza")) count++;
//        }
//        System.out.println(count);
//    }
//}
//
//Practice 4
//
//
//class RemoveBanana {
//    public static void main(String[] args) {
//        ArrayList<String> fruits = new ArrayList<>(Arrays.asList(
//                "Apple", "Banana", "Mango", "Banana"));
//
//        fruits.removeIf(f -> f.equals("Banana"));
//        System.out.println(fruits);
//    }
//}
//
//Practice 5
//
//class ReplaceColors {
//    public static void main(String[] args) {
//        ArrayList<String> colors = new ArrayList<>(Arrays.asList(
//                "Red", "Blue", "Green"));
//
//        for (int i = 0; i < colors.size(); i++) {
//            colors.set(i, "Black");
//        }
//        System.out.println(colors);
//    }
//}
//
//Practice 6
//
//class CheckSports {
//    public static void main(String[] args) {
//        ArrayList<String> sports = new ArrayList<>(Arrays.asList(
//                "Football", "Cricket", "Tennis"));
//
//        ArrayList<String> sub = new ArrayList<>(Arrays.asList(
//                "Football", "Tennis"));
//
//        System.out.println(sports.containsAll(sub));
//    }
//}
//
//practice 7
//
//class FindRose {
//    public static void main(String[] args) {
//        ArrayList<String> flowers = new ArrayList<>(Arrays.asList(
//                "Lily", "Rose", "Tulip", "Rose"));
//
//        System.out.println(flowers.indexOf("Rose"));
//        System.out.println(flowers.lastIndexOf("Rose"));
//    }
//}
//
//practice 8
//
//class RemoveDuplicates {
//    public static void main(String[] args) {
//        ArrayList<String> animals = new ArrayList<>(Arrays.asList(
//                "Dog", "Cat", "Dog", "Lion"));
//
//        HashSet<String> set = new HashSet<>(animals);
//        System.out.println(set);
//    }
//}
//
//practice 9
//
//class ListToArray {
//    public static void main(String[] args) {
//        ArrayList<String> cities = new ArrayList<>(Arrays.asList(
//                "Paris", "London", "Tokyo"));
//
//        String[] cityArray = cities.toArray(new String[0]);
//        System.out.println(Arrays.toString(cityArray));
//    }
//}
//
//practice 10
//
//class ArrayToList {
//    public static void main(String[] args) {
//        Integer[] numbers = {1, 2, 3, 4};
//
//        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(numbers));
//        System.out.println(list);
//    }
//}
//
//practice 11
//
//class CommonCountries {
//    public static void main(String[] args) {
//        ArrayList<String> c1 = new ArrayList<>(Arrays.asList("India","USA","UK"));
//        ArrayList<String> c2 = new ArrayList<>(Arrays.asList("USA","Canada","India"));
//
//        c1.retainAll(c2);
//        System.out.println(c1);
//    }
//}
//
//practice 12
//
//class RemoveEvenLength {
//    public static void main(String[] args) {
//        ArrayList<String> names = new ArrayList<>(Arrays.asList(
//                "Tom","Anna","John","Amy"));
//
//        names.removeIf(n -> n.length() % 2 == 0);
//        System.out.println(names);
//    }
//}
//
//practice 13
//
//class ShortestSong {
//    public static void main(String[] args) {
//        ArrayList<String> songs = new ArrayList<>(Arrays.asList(
//                "Hello","Sky","Music"));
//
//        String shortest = songs.get(0);
//        for (String s : songs)
//            if (s.length() < shortest.length())
//                shortest = s;
//
//        System.out.println(shortest);
//    }
//}
//
//practice 14
//
//class ReplaceVowels {
//    public static void main(String[] args) {
//        ArrayList<String> words = new ArrayList<>(Arrays.asList(
//                "apple","banana"));
//
//        for (int i = 0; i < words.size(); i++)
//            words.set(i, words.get(i).replaceAll("[AEIOUaeiou]", "*"));
//
//        System.out.println(words);
//    }
//}
//
//practice 15
//
//class EvenOdd {
//    public static void main(String[] args) {
//        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//
//        ArrayList<Integer> even = new ArrayList<>();
//        ArrayList<Integer> odd = new ArrayList<>();
//
//        for (int n : nums)
//            if (n % 2 == 0) even.add(n);
//            else odd.add(n);
//
//        System.out.println(even);
//        System.out.println(odd);
//    }
//}
//
//practice 16
//
//class RotateDays {
//    public static void main(String[] args) {
//        ArrayList<String> days = new ArrayList<>(Arrays.asList(
//                "Mon","Tue","Wed","Thu","Fri"));
//
//        Collections.rotate(days, 2);
//        System.out.println(days);
//    }
//}
//
//practice 17
//
//class RemoveNulls {
//    public static void main(String[] args) {
//        ArrayList<String> students = new ArrayList<>(Arrays.asList(
//                "Alice", null, "Bob", null));
//
//        students.removeIf(s -> s == null);
//        System.out.println(students);
//    }
//}
//
//practice 18
//
//class SecondLargestMovie {
//    public static void main(String[] args) {
//        ArrayList<String> movies = new ArrayList<>(Arrays.asList(
//                "Avatar","Titanic","Up"));
//
//        movies.sort((a,b) -> b.length() - a.length());
//        System.out.println(movies.get(1));
//    }
//}
//
//practice 19
//
//class FruitLength {
//    public static void main(String[] args) {
//        ArrayList<String> fruits = new ArrayList<>(Arrays.asList(
//                "Apple","Banana","Kiwi"));
//
//        ArrayList<Integer> lengths = new ArrayList<>();
//        for (String f : fruits)
//            lengths.add(f.length());
//
//        System.out.println(lengths);
//    }
//}
//
//practice 20
//
//class NestedList {
//    public static void main(String[] args) {
//
//        ArrayList<ArrayList<String>> departments = new ArrayList<>();
//
//        ArrayList<String> it = new ArrayList<>(Arrays.asList("Alice","Bob"));
//        ArrayList<String> hr = new ArrayList<>(Arrays.asList("John","Emma"));
//
//        departments.add(it);
//        departments.add(hr);
//
//        System.out.println(departments);
//    }
//}