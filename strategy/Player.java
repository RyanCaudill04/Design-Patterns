// 2023 Ryan Caudill
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
    if (offense) {
      this.setOffenseBehavior();
      return this.OffenseBehavior.play();
    } else {
      this.setDefenseBehavior();
      if (DefenseBehavior == null) {
        return "not playing";
      } else {
        return this.DefenseBehavior.play();
      }
    }
  }
  public void turnover() {
    offense = !offense;
  }
  public String toString() {
    String name = firstName + " " + lastName;
    return name;
  }
}
