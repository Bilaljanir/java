package ch.jobtrek;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class Collections {

    /**
     * @param array An array that contains strings of different lengths
     * @param size  The string size used to chunk the array
     * @return An array containing two arrays, one with the stings below and equal
     * of the size, and another with the stings longer than the size
     */
    public static List<List<String>> chunkArrayByStringSize(List<String> array, int size) {
        // Crée deux listes pour stocker les chaînes de caractères courtes et longues
        List<String> shortest = new ArrayList<>();
        List<String> longest = new ArrayList<>();

        for (String str : array) {
            if (str.length() <= size) {
                shortest.add(str);
            } else {
                longest.add(str);
            }
        }
        List<List<String>> result = new ArrayList<>();
        result.add(shortest);
        result.add(longest);

        return result;
    }

    /**
     * @param numbers A list of integers
     * @return A list containing the integers of the original list, without
     * duplicates, sorted by frequency of occurrence
     */
    public static List<Integer> frequencyOfApparition(List<Integer> numbers) {
        return List.of(); // Replace with your code here
    }

    /**
     * @param numbers A list, containing list of numbers
     * @return The sum of all numbers, but all odd numbers should be multiplied by two before sum
     * Should return zero if there is no numbers
     */
    public static Integer sumArrays(List<List<Integer>> numbers) {
        return 3; // Replace with your code here
    }

    /**
     * @param students A hashmap containing students name as key, and student grade as value
     * @return The student with the best grade in the map
     */
    public static String bestStudent(Map<String, Integer> students) {
        return ""; // Replace with your code here
    }
}
