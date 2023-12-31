package ch.jobtrek;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Basics {

    /**
     * This function gets two integers and must compute them as follows:
     * IF all numbers are even or number 1 is greater than 10, return true
     * in all other cases, return false
     */
    public static boolean someConditionals(int number1, int number2) {
        // Vérifie si les deux nombres sont pairs
        boolean numbers = (number1 % 2 == 0) && (number2 % 2 == 0);

        // Vérifie si le nombre 1 est supérieur à 10
        boolean nombre1plusgrandque10 = (number1 > 10);

        // Vérifie si toutes les conditions sont remplies
        return numbers || nombre1plusgrandque10;

    }

    /**
     * @param text A string containing words separated by spaces
     * @return A string containing only words of maximum 4 characters and starting
     * with letter T. All words should be uppercase and separated by spaces
     */

    public static String strings(String text) {
        return Arrays.stream(text.split(" ")).filter(word -> word.length() <= 4 && word.startsWith("T")).map(String::toUpperCase).collect(Collectors.joining(" "));
    }

    /**
     * @param needle   The word you need to replace
     * @param haystack A string in which you need to replace the needle by the new word
     * @param newWord  The replacement word
     * @return A new string where the needle is replaced by newWord
     */
    public static String findAndReplace(String needle, String haystack, String newWord) {

        if (needle == null || needle.isEmpty()) {
            return haystack;
        }
        return haystack.replace(needle, newWord);
    }
}