package strategy;

import java.util.Random;
public class BlockBehavior implements defenseBehavior {
  @Override
  public String play() {
    String returnString = "Block a ";
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
