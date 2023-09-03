// 2023 Ryan Caudill
package strategy;

public class Receiver extends Player {
  // Receiver constructor
  Receiver(String firstName, String lastName, boolean Offense) {
    // Utilizes player class constructor
    super(firstName, lastName, Offense);
    if (Offense) {
      setOffenseBehavior();
    } else {
      setDefenseBehavior();
    }
  }
  // setDefenseBehavior function
  @Override
  public void setDefenseBehavior() {
    // Receiver does not play defense
    DefenseBehavior = null;
    OffenseBehavior = null;
  }
  // setOffenseBehavior function
  @Override
  public void setOffenseBehavior() {
    ReceiveBehavior setReceive = new ReceiveBehavior();
    OffenseBehavior = setReceive;
    DefenseBehavior = null;
  }
  // play function
  @Override
  public String play() {
    if (OffenseBehavior != null) {
      return this.OffenseBehavior.play();
    } else {
      return "not playing";
    }
  }
}
