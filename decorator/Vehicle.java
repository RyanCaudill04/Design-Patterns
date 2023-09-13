package decorator;

import java.util.ArrayList;
/**
 * @author Ryan Caudill
 * Vehicle parent class that outputs the arraylist lines using
 * toString method that prints the car
 */
public abstract class Vehicle {
  protected ArrayList<String> lines;
  Vehicle(ArrayList<String> lines) {
    this.lines = lines;
  }
  public String toString() {
    String returnString = "";
    for(String line : lines) {
      returnString += "\n" + line;
    }
    return returnString;
  }
}
