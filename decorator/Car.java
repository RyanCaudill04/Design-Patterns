package decorator;
/**
 * @author Ryan Caudill
 * Car class child of vehicle class has arraylist of strings
 * that draw an ASCII car from car.txt
 */
public class Car extends Vehicle {
  Car() {
    super(FileReader.getLines("/Users/ryancaudill/Desktop/School/Semester_3/Software Engineering/Design-Patterns/decorator/car.txt"));
  }
}
