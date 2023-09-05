package strategy;
/**
 * @author Ryan Caudill
 * Receiver class player child class
 */
public class Receiver extends Player {
  /**
   * uses player constructor and sets offense or defensive behavior\
   * based on offense param
   * @param firstName
   * @param lastName
   * @param Offense
   */
  Receiver(String firstName, String lastName, boolean Offense) {
    super(firstName, lastName, Offense);
    if (Offense) {
      setOffenseBehavior();
    } else {
      setDefenseBehavior();
    }
  }
  /**
   * receiver does not play defense so both are null
   */
  @Override
  public void setDefenseBehavior() {
    DefenseBehavior = null;
    OffenseBehavior = null;
  }
  @Override
  public void setOffenseBehavior() {
    ReceiveBehavior setReceive = new ReceiveBehavior();
    OffenseBehavior = setReceive;
    DefenseBehavior = null;
  }
}
