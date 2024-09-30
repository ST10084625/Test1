/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q2test;

import java.util.Scanner;

/**
 *
 * @author caleb
 */

    public class RoadAccidents {

    private static void PrintReport() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void PrintAccidents() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public RoadAccidents(String vehicleType, String city) {
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Accident Vehicle Type: ");
        String vehicleType = scanner.nextLine();

        System.out.print("Enter City for Vehicle of Accidents: ");
        String city = scanner.nextLine();
        
        System.out.println("Enter the number of  Car Accidents: ");
        int accidents = scanner.nextInt();

        RoadAccidents roadAccidentst = new RoadAccidents(vehicleType, city);
        RoadAccidents.PrintAccidents();
    }
}
    
    

