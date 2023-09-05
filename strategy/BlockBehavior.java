package strategy;

import java.util.Random;
/**
 * Block behavior class implements defense behavior interface
 * @author Ryan Caudill
 */
public class BlockBehavior implements defenseBehavior {
  /**
   * play function randomly makes a string of the block behavior for a player to use
   * @return blocks a (kick, punt, catch, or pass)
   */
  @Override
  public String play() {
    String returnString = "blocks a ";
    Random random = new Random();
    int randomNum = random.nextInt(4) + 1;
    switch (randomNum) {
      case 1:
        returnString += "kick";
        break;
      case 2:
        returnString += "punt";
        break;
      case 3:
        returnString += "catch";
        break;
      case 4:
        returnString += "pass";
        break;
    }
    return returnString;
  }
}
