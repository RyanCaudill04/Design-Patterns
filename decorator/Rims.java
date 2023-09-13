package decorator;

import java.util.ArrayList;
/**
 * @author Ryan Caudill
 * Rims subclass of Vehicle decorator utilizes integratedecor
 * function from parent to add "rims.txt" on top of the car
 */
public class Rims extends VehicleDecorator {
  Rims(Vehicle vehicle) {
    super(vehicle.lines);
    ArrayList<String> list = FileReader.getLines("/Users/ryancaudill/Desktop/School/Semester_3/Software Engineering/Design-Patterns/decorator/rims.txt");
    integrateDecor(list);
  }
}
