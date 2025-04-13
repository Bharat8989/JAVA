package Basic_of_java;
import java.util.*;
import java.util.stream.*;

public class Server {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("john", "sara", "bob", "mark", "anna");

        List<String> result = names.stream()
                .filter(name -> name.length() > 3)  // Step 1: Filter names longer than 3 letters
                .map(String::toUpperCase)           // Step 2: Convert to uppercase
                .sorted()                           // Step 3: Sort alphabetically
                .collect(Collectors.toList());      // Step 4: Collect the result

        System.out.println(result); // Output: [ANNA, JOHN, MARK, SARA]
    }
}

