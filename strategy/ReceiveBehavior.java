// 2023 Ryan Caudill
package strategy;

import java.util.Random;
public class ReceiveBehavior implements offenseBehavior {
  @Override
  public String play() {
    String returnString = "runs a ";
    // Randomly chooses between 5 routes
    // slant, out, seem, screen, hail mary
    Random random = new Random();
    int randomNum = random.nextInt(5) + 1;
    switch (randomNum) {
      case 1:
        returnString += "slant route";
        break;
      case 2:
        returnString += "out route";
        break;
      case 3:
        returnString += "seem route";
        break;
      case 4:
        returnString += "screen pass";
        break;
      case 5:
        returnString += "hail mary";
        break;
    }
    return returnString;
  }
}
