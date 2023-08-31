package strategy;

import java.util.Random;
public class Lineman extends Player {
  Lineman(String firstName, String lastName, boolean offense) {
    super(firstName, lastName, offense);
    if(offense) {
      DefenseBehavior = null;
      setOffenseBehavior();
    } else {
      OffenseBehavior = null;
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
