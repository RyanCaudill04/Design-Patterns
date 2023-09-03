// 2023 Ryan Caudill
package strategy;

public abstract class Player {
  // Define variables for Player class
  private String firstName;
  private String lastName;
  private boolean offense;
  protected defenseBehavior DefenseBehavior;
  protected offenseBehavior OffenseBehavior;
  // Player constructor
  Player(String inFirstName, String inLastName, boolean inOffense) {
    this.firstName = inFirstName;
    lastName = inLastName;
    offense = inOffense;
  }
  public void setDefenseBehavior() {}
  public void setOffenseBehavior() {}
  public String play() {
    return "";
  }
  // turnover function
  public void turnover() {
    offense = !offense;
    if (offense) {
      this.setOffenseBehavior();
    } else {
      this.setDefenseBehavior();
    }
  }
  // toString function
  public String toString() {
    String name = firstName + " " + lastName;
    return name;
  }
}
