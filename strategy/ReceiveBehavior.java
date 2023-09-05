package strategy;
/**
 * @author Ryan Caudill
 * Receive behavior offense behavior for receivers to use
 */
import java.util.Random;
public class ReceiveBehavior implements offenseBehavior {
  /**
   * play function makes string for offense behavior
   * @return random String runs a (slant, out, seem, screen, hail mary) route
   */
  @Override
  public String play() {
    String returnString = "runs a ";
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
