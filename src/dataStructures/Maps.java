package dataStructures;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Mike", "Car");
        map.put("Luca", "Motorcycle");
        map.put("Liam", "Bicycle");
        map.forEach((key, value) -> {
            System.out.printf(
                "%s is driving by %s.\n", key, value
            );
        });
        // Output:
        // Mike is driving by Car.
        // Luca is driving by Motorcycle.
        // Liam is driving by Bicycle.
    }
}
