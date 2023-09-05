package strategy;
/**
 * Player abstract parent class for quarterback, lineman, and receiver
 * has 5 attributes
 * @author Ryan Caudill
 */
public abstract class Player {
  private String firstName;
  private String lastName;
  private boolean offense;
  protected defenseBehavior DefenseBehavior;
  protected offenseBehavior OffenseBehavior;
  /**
   * Football player
   * @param inFirstName
   * @param inLastName
   * @param inOffense
   */
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
  /**
   * toString creates a string of the first and last name of the palyer
   * @return firstname + lastname string
   */
  public String toString() {
    String name = firstName + " " + lastName;
    return name;
  }
}
