package factory;
/**
 * @author Ryan Caudill
 * Abstract bike class that holds methods to assemble bikes
 */
public abstract class Bike {
  protected String name;
  protected double price;
  protected int numWheels;
  protected boolean hasPedals;
  protected boolean hasTrainingWheels;
  /**
   * Makes a string based on protected variables unique 
   * for each bike type
   * @return combined string from assembly methods
   */
  public String assembleBike() {
    String returnString = "Creating a " + name + "\n";
    returnString += createFrame();
    returnString += addWheels();
    returnString += addPedals();
    returnString += "- Price is $" + getPrice();
    return returnString;
  }
  /**
   * Makes a string using bike type
   * @return assembling (bike type) frame
   */
  private String createFrame() {
    String returnString = "- Assembling " + name + " frame\n";
    return returnString;
  }
  /**
   * Makes a string using amount of wheels
   * @return adding (wheel amount) wheel(s)
   */
  private String addWheels() {
    String returnString = "- Adding " + numWheels + " wheel(s)\n";
    return returnString;
  }
  /**
   * Adds either training wheels or pedals based on boolean values
   * @return adding training wheels and/or adding pedals
   */
  private String addPedals() {
    String returnString = "";
    if (hasTrainingWheels) {
      returnString += "- Adding training wheels\n";
    }
    if (hasPedals) {
      returnString += "- Adding pedals\n";
    }
    return returnString;
  }
  /**
   * Unused method returns price variable
   * @return price
   */
  public double getPrice() {
    return price;
  }
}
