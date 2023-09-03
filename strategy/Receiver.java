package strategy;

public class Receiver extends Player {
  Receiver(String firstName, String lastName, boolean Offense) {
    super(firstName, lastName, Offense);
    if (Offense) {
      setOffenseBehavior();
    } else {
      setDefenseBehavior();
    }
  }
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
  public String play() {
    if (OffenseBehavior != null) {
      return this.OffenseBehavior.play();
    } else {
      return "not playing";
    }
  }
}