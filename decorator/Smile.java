package decorator;

import java.util.ArrayList;

public class Smile extends VehicleDecorator {
  Smile(Vehicle vehicle) {
    super(vehicle.lines);
    ArrayList<String> list = FileReader.getLines("/Users/ryancaudill/Desktop/School/Semester_3/Software Engineering/Design-Patterns/decorator/smile.txt");
    integrateDecor(list);
  }
}
