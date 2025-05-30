package LAMBDAEXP;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class MethodReferenceExample {
    public static void main(String[] args) {
        // Step 1: Create a list of names
        List<String> names = Arrays.asList("Zoya", "Aman", "Neha", "Rohan");

        // Step 2: Print the original list using method reference
        System.out.println("Original List:");
        names.forEach(System.out::println);

        // Step 3: Sort the list using a method reference
        Collections.sort(names, String::compareToIgnoreCase);

        // Step 4: Print the sorted list using method reference
        System.out.println("\nSorted List:");
        names.forEach(System.out::println);
    }
}
