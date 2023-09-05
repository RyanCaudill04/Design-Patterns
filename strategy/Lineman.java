// 2023 Ryan Caudill
package strategy;

import java.util.Random;
public class Lineman extends Player {
  // Constructor for Lineman class
  Lineman(String firstName, String lastName, boolean offense) {
    // Utilizes Player class constructor
    super(firstName, lastName, offense);
    if(offense) {
      setOffenseBehavior();
    } else {
      setDefenseBehavior();
    }
  }
  @Override
  public void setOffenseBehavior() {
    OBlockBehavior setOBlock = new OBlockBehavior();
    OffenseBehavior = setOBlock;
    DefenseBehavior = null;
  }
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
