package InterViewPrep;

public class WhyStringIsImmutable {
    static void main() {
        String s1 = "Java";
        String s2 = "Java"; // Points to the same object in the String Pool

        // 1. Verify they point to the exact same memory address
        System.out.println("Are s1 and s2 the same object? " + (s1 == s2)); // true

        // 2. Try to "modify" s1
        s1 = s1.concat(" 21");

        // 3. See what happened under the hood
        System.out.println("Modified s1: " + s1); // "Java 21"
        System.out.println("Original s2: " + s2); // "Java" (s2 is completely untouched!)
        System.out.println("Are they the same now? " + (s1 == s2)); // false
    }
    }

