package ch.jobtrek;

import ch.jobtrek.sbb.Tunnel;
import ch.jobtrek.sbb.Tunnelable;

import java.net.URI;
import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class Csv {

    /**
     * This method reads the CSV file, and parse each lines to create a list of objects that represent a tunnel.
     *
     * @param filePath The path to the CSV file
     * @return A List of objects that implements the Tunnelable interface. You need to create this special class.
     */
    public static List<Tunnelable> importCSVfile(URI filePath) {
        try (var file = Files.lines(Paths.get(filePath))){return file.skip(1)
                .map(tableline -> tableline.split(";"))
                .map(tableline -> new Tunnel(tableline[1], Double.parseDouble(tableline[2])
                        / 1000, Integer.parseInt(tableline[3]), tableline[8]))
                .collect(Collectors.toList());}
        catch (IOException e) {return List.of();}
    }

    /**
     * Sort the list of tunnels provided, and pick de 10 longest
     *
     * @param tunnels A List of tunnels
     * @return A List containing only the 10 longest tunnels
     */

    public static List<Tunnelable> tenLongestTunnels(List<Tunnelable> tunnels) {
        return tunnels.stream()
                .sorted(Comparator.comparing(Tunnelable::getKilometerLength).reversed())
                .limit(10)
                .collect(Collectors.toList());
    }

    /**
     * @param tunnels List of tunnels
     * @return The computed average of the length of all tunnels
     */


    public static double computeAverageLength(List<Tunnelable> tunnels) {
        return tunnels.stream()
                .mapToDouble(Tunnelable::getKilometerLength)
                .average()
                .orElse(0.0);
    }

    /**
     * @param tunnels List of tunnels
     * @return A Map with the year as key and the number of tunnels as value
     */
    public static Map<Integer, Long> tunnelsByYears(List<Tunnelable> tunnels) {
        return Map.of(); // Replace with your code here
    }

    /**
     * @param tunnels List of tunnels
     * @return The year in which the most tunnels were built
     */
    public static int yearWithBiggestTunnelBuilds(List<Tunnelable> tunnels) {
        return 0; // Replace with your code here
    }

}