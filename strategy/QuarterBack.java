// 2023 Ryan Caudill
package strategy;

import java.util.Random;
public class QuarterBack extends Player {
  // QuarterBack constructor
  QuarterBack(String firstName, String lastName, boolean offense) {
    // Utilizes player constructor
    super(firstName, lastName, offense);
    if (offense) {
      setOffenseBehavior();
    } else {
      setDefenseBehavior();
    }
  }
  // setDefenseBehavior function
  @Override
  public void setDefenseBehavior() {
    // QuarterBack does not play defense
    DefenseBehavior = null;
    OffenseBehavior = null;
  }
  // setOffenseBehavior function
  @Override
  public void setOffenseBehavior() {
    // Randomly chooses pass or run behavior
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
}
