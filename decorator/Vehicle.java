package decorator;

import java.util.ArrayList;

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
