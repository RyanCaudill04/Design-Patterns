package decorator;

import java.util.ArrayList;
/**
 * @author Ryan Caudill
 * Smile subclass of vehicle decorator puts smile.txt over 
 * the car.txt using integratedecor from parent class
 */
public class Smile extends VehicleDecorator {
  Smile(Vehicle vehicle) {
    super(vehicle.lines);
    ArrayList<String> list = FileReader.getLines("/Users/ryancaudill/Desktop/School/Semester_3/Software Engineering/Design-Patterns/decorator/smile.txt");
    integrateDecor(list);
  }
}
