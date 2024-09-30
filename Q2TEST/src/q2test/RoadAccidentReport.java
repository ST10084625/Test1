/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q2test;

/**
 *
 * @author caleb
 */
public class RoadAccidentReport extends RoadAccidents {
    private String vehicleType;
    private String city;
    private int numberOfAccidents;

    public RoadAccidentReport(String vehicleType, String city, int numberOfAccidents) {
        this.vehicleType = vehicleType;
        this.city = city;
        this.numberOfAccidents = numberOfAccidents;
    }

    public void printAccidentReport() {
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("City: " + city);
        System.out.println("Number of Accidents: " + numberOfAccidents);
    }
}

