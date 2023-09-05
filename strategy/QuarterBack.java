package strategy;
/**
 * Quarterback class child of Player class
 * @author Ryan Caudill
 */
import java.util.Random;
public class QuarterBack extends Player {
  /**
   * Uses player constructor and then sets either offensive
   * or defensive behavior based on offense param
   * @param firstName
   * @param lastName
   * @param offense
   */
  QuarterBack(String firstName, String lastName, boolean offense) {
    super(firstName, lastName, offense);
    if (offense) {
      setOffenseBehavior();
    } else {
      setDefenseBehavior();
    }
  }
  /**
   * Always sets both to null because quarterback is offensive position
   */
  @Override
  public void setDefenseBehavior() {
    DefenseBehavior = null;
    OffenseBehavior = null;
  }
  /**
   * Randomly assigns pass or run behavior to the offensebehavior
   */
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
}
