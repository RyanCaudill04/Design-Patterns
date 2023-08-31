package strategy;

import java.util.Random;
public class QuarterBack extends Player {
  QuarterBack(String firstName, String lastName, boolean offense) {
    super(firstName, lastName, offense);
    if (offense) {
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
    Random random = new Random();
    int randomNum = random.nextInt(2) + 1;
    switch(randomNum) {
      case 1:
        PassBehavior setPass = new PassBehavior();
        OffenseBehavior = setPass;
        break;
      case 2:
        RunBehavior setRun = new RunBehavior();
        OffenseBehavior = setRun;
        break;
    }
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
