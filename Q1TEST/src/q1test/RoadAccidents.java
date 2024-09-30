/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q1test;

/**
 *
 * @author caleb
 */


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RoadAccidents {
    private static Map<String, Map<String, Integer>> cityData;

    static {
        cityData = new HashMap<>();
        cityData.put("CPT", new HashMap<>());
        cityData.get("CPT").put("car", 155);
        cityData.get("CPT").put("motorbike", 121);

        cityData.put("JBH", new HashMap<>());
        cityData.get("JBH").put("car", 178);
        cityData.get("JBH").put("motorbike", 145);

        cityData.put("PE", new HashMap<>());
        cityData.get("PE").put("car", 112);
        cityData.get("PE").put("motorbike", 89);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Options:");
            System.out.println("1. Enter road accidents for a city");
            System.out.println("2. Generate report");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    enterAccidents(scanner);
                    break;
                case 2:
                    generateReport();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void enterAccidents(Scanner scanner) {
        System.out.print("Enter the city (CPT, JBH, or PE): ");
        String city = scanner.next();

        while (!cityData.containsKey(city)) {
            System.out.println("Invalid city. Please try again.");
            System.out.print("Enter the city (CPT, JBH, or PE): ");
            city = scanner.next();
        }

        System.out.print("Enter the number of car accidents: ");
        int carAccidents = scanner.nextInt();

        System.out.print("Enter the number of motorbike accidents: ");
        int motorbikeAccidents = scanner.nextInt();

        updateCityData(city, carAccidents, motorbikeAccidents);
    }

    private static void updateCityData(String city, int carAccidents, int motorbikeAccidents) {
        cityData.get(city).put("car", cityData.get(city).get("car") + carAccidents);
        cityData.get(city).put("motorbike", cityData.get(city).get("motorbike") + motorbikeAccidents);
    }

    private static void generateReport() {
        System.out.println("Road Accidents Report:");
        for (Map.Entry<String, Map<String, Integer>> entry : cityData.entrySet()) {
            String city = entry.getKey();
            Map<String, Integer> data = entry.getValue();
            System.out.println(city + ":");
            System.out.println("  Car Accidents: " + data.get("car"));
            System.out.println("  Motorbike Accidents: " + data.get("motorbike"));
            System.out.println("  Total Accidents: " + (data.get("car") + data.get("motorbike")));
            System.out.println();
        }
    }
}

//an aplication with the purpose of recording and dsiplaying road accident report for cars and motorbikes in different cities, application to prompt the user to input
//car and motor bike accidents in a secific city the  display the total number of recorded road accidents that occured in three different cities.Resulting report
//will show road accidents for cars and motorbikes, along with the town and the number of accidents for each vehicle type
// CPT = Car(155) MOTORBIKE(121), JBH= CAR(178) MOTORBIKE(145), PE= CAR(112) MOTORBIKE(89)