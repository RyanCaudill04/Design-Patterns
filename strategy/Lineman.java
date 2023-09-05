package strategy;

import java.util.Random;
/**
 * Lineman child of player class
 * @author Ryan Caudill
 */
public class Lineman extends Player {
  Lineman(String firstName, String lastName, boolean offense) {
    super(firstName, lastName, offense);
    if(offense) {
      setOffenseBehavior();
    } else {
      setDefenseBehavior();
    }
  }
  /**
   * Gives the lineman OBlock offensive behavior and null
   * defensive behavior
   */
  @Override
  public void setOffenseBehavior() {
    OBlockBehavior setOBlock = new OBlockBehavior();
    OffenseBehavior = setOBlock;
    DefenseBehavior = null;
  }
  /**
   * Gives the lineman a random defensive behavior (Sack, 
   * strip, block) and null offensive behavior
   */
  @Override
  public void setDefenseBehavior() {
    Random random = new Random();
    int randomNum = random.nextInt(3) + 1;
    switch (randomNum) {
      case 1:
        SackBehavior setSack = new SackBehavior(); 
        DefenseBehavior = setSack;
        break;
      case 2:
        StripBehavior setStrip = new StripBehavior();
        DefenseBehavior = setStrip;
        break;
      case 3:
        BlockBehavior setBlock = new BlockBehavior();
        DefenseBehavior = setBlock;
        break;
    }
    OffenseBehavior = null;
  }
}
