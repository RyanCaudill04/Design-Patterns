package strategy;

public abstract class Player {
  private String firstName;
  private String lastName;
  private boolean offense;
  protected defenseBehavior DefenseBehavior;
  protected offenseBehavior OffenseBehavior;
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
  public void turnover() {
    offense = !offense;
    if (offense) {
      this.setOffenseBehavior();
    } else {
      this.setDefenseBehavior();
    }
  }
  public String toString() {
    String name = firstName + " " + lastName;
    return name;
  }
}
