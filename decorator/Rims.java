package decorator;

import java.util.ArrayList;

public class Rims extends VehicleDecorator {
  Rims(Vehicle vehicle) {
    super(vehicle.lines);
    ArrayList<String> list = FileReader.getLines("/Users/ryancaudill/Desktop/School/Semester_3/Software Engineering/Design-Patterns/decorator/rims.txt");
    integrateDecor(list);
  }
}
