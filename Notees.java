package map;
/*Write a Java program to create a Tree Map and obtain all keys
from the given a Tree Map.*/
import java.util.TreeMap;
import java.util.Set;

public class TreeMapKeys {

    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Add elements to the TreeMap
        treeMap.put(1, "Apple");
        treeMap.put(2, "Banana");
        treeMap.put(3, "Orange");
        treeMap.put(4, "Grapes");
        treeMap.put(5, "Pineapple");

        // Obtain all keys from the TreeMap
        Set<Integer> keys = treeMap.keySet();

        // Print all keys
        System.out.println("Keys in the TreeMap:");
        for (Integer key : keys) {
            System.out.println(key);
        }
    }
}
/*• Write a Java program to display the values of a tree map whose
keys are less than a given key*/

public class MapCopy {

    public static void main(String[] args) {
        // Create the original map
        Map<Integer, String> originalMap = new HashMap<>();
        originalMap.put(1, "Apple");
        originalMap.put(2, "Banana");
        originalMap.put(3, "Orange");

        // Create the destination map
        Map<Integer, String> destinationMap = new HashMap<>();
        
        // Copy all mappings from the original map to the destination map
        destinationMap.putAll(originalMap);

        // Display the destination map
        System.out.println("Destination Map after copying from Original Map:");
        System.out.println(destinationMap);
    }
}
/*Write a Java program to find the greatest key and the least key in
a map.*/
import java.util.TreeMap;

public class TreeMapValuesLessThanKey {

    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Add some key-value pairs to the TreeMap
        treeMap.put(10, "Value1");
        treeMap.put(20, "Value2");
        treeMap.put(30, "Value3");
        treeMap.put(40, "Value4");
        treeMap.put(50, "Value5");

        // Given key
        int givenKey = 35;

        // Display the values whose keys are less than the given key
        System.out.println("Values whose keys are less than " + givenKey + ":");
        for (Integer key : treeMap.keySet()) {
            if (key < givenKey) {
                System.out.println(treeMap.get(key));
            }
        }
    }
}


class Student {
    // Attributes of a student
    int rollno;
    String name, address;

    // Constructor
    public Student(int rollno, String name, String address) {
        // This keyword refers to current object itself
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    // Method to print student details
    public String toString() {
        return this.rollno + " " + this.name + " " + this.address;
    }
}

// Helper class - Comparator implementation
class Sortbyroll implements Comparator<Student> {
    // Used for sorting in ascending order of roll number
    public int compare(Student a, Student b) {
        return a.rollno - b.rollno;
    }
}

public class GFG {

    // Method to create TreeMap and print its elements
    static void Example2ndConstructor() {
        // Creating an empty TreeMap with custom Comparator
        TreeMap<Student, Integer> tree_map = new TreeMap<Student, Integer>(new Sortbyroll());

        // Mapping string values to int keys
        tree_map.put(new Student(111, "nyc", "address"), 3);

        // Printing the elements of TreeMap
        System.out.println("TreeMap: " + tree_map);
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("TreeMap using TreeMap(Comparator) constructor: \n");
        Example2ndConstructor();
    }
}
//
class Book11 {
int id;
String name, author, publisher; int quantity;
public Book11(int id, String name, String author, String publisher, int quantity) {
this.id = id;
this.name = name;
this.author = author;
this. publisher = publisher;
this.quantity = quantity;
}
public class MapExample {
public static void main(String[] args) {
//Creating map of Books
Map<Integer,Book11 > map=new LinkedHashMap<Integer,Book11>();
//Creating Books
Book11 b1=new Book11(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
//Adding Books to map map. put (2,b2);
map. put (1,b1); map. put (3,b3);
//Traversing map
for (Map.Entry<Integer, Book11 > entry:map. entrySet()){
int key=entry.getKey);
Book11 b=entry.getValue();
System.out.println(key+" Details:");
System.out.printin(b.id+" "+b.name+" "+b.authort" "+b.publisher+" "+b.quantity);

//
class TreeMap3{
public static void main(String args[]){
//Maintains descending order
System.out.println("descendingMap: "+map.descendingMap());
system-out. prinen Pearhose ap.e arap (182, true) equal to the specified key.
//Returns key-value pairs whose keys are greater than or equal to the specified key.
System.out.println("tailMap: "+map.tailMap(102,true));
//Returns key-value pairs exists in between the specified key.
System.out.printin("subMap: "+map.subMap(100, false, 102, true));
//