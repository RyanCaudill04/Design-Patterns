package factory;

public abstract class Bike {
  protected String name;
  protected double price;
  protected int numWheels;
  protected boolean hasPedals;
  protected boolean hasTrainingWheels;
  public String assembleBike() {
    String returnString = "Creating a " + name + "\n";
    returnString += createFrame();
    returnString += addWheels();
    returnString += addPedals();
    return returnString;
  }
  private String createFrame() {
    String returnString = "- Assembling " + name + " frame\n";
    return returnString;
  }
  private String addWheels() {
    String returnString = "- Adding " + numWheels + " wheel(s)\n";
    return returnString;
  }
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
  public double getPrice() {
    return price;
  }
}
