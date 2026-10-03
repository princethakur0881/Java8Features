package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class collectionsList {
    // 1. Added standard 'String[] args' parameter to make it an executable main method
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "bob", "morphias", "axe", "forish", "hexy", "aegy", "andrew", "adam");

//        List<String> upperCaseNames = names.stream()
//                .map(String::toUpperCase)
//                .collect(Collectors.toList());
//
//        // 2. Removed the broken 'Arrays.()' syntax. If you need an empty list, use new ArrayList<>()
//        List<String> newnames = new ArrayList<>();
//
//        System.out.println("All names:");
//        names.forEach(name -> System.out.print(name + "   "));
//        System.out.println(); // Prints a clean new line

        System.out.println("\nNames starting with 'A' or 'a':");
        names.stream()
                // 3. Changed to lower case check so it catches "axe", "aegy", "andrew", and "adam"
                .filter(n -> n.toLowerCase().startsWith("a"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
        names.stream()
                // 3. Changed to lower case check so it catches "axe", "aegy", "andrew", and "adam"
                .filter(n -> n.toLowerCase().startsWith("A"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}

