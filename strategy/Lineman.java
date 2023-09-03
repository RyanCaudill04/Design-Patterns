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
  // setOffenseBehavior function
  @Override
  public void setOffenseBehavior() {
    // Create OBlock object and assign to OffenseBehavior
    OBlockBehavior setOBlock = new OBlockBehavior();
    OffenseBehavior = setOBlock;
    DefenseBehavior = null;
  }
  // setDefenseBehavior function
  @Override
  public void setDefenseBehavior() {
    // Randomly chooses from three defense behaviors
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
  // play function
  @Override
  public String play() {
    if (OffenseBehavior == null) {
      return this.DefenseBehavior.play();
    } else if (DefenseBehavior == null) {
      return this.OffenseBehavior.play();
    } else {
      return "error";
    }
  }
}
