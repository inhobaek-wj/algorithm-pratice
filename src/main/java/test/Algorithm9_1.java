/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package test;

import java.util.*;

public class Algorithm9_1 {

    public static void main(String[] args) throws Exception {
        System.out.println("Algorithm9_1 is start...");

        Scanner scanner = new Scanner(System.in);
        String teamHeorsInput = scanner.nextLine();
        String myHeorsInput = scanner.nextLine();

        List<String> teamList = Arrays.asList(teamHeorsInput.split(" "));
        Set<String> teamHeors = new HashSet<>(teamList);

        List<String> myList = Arrays.asList(myHeorsInput.split(" "));
        Set<String> myHeors = new HashSet<>(myList);

        myHeors.removeAll(teamHeors);

        System.out.println(myHeors.size());

        scanner.close();
    }
}
