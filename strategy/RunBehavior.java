package strategy;
/**
 * @author Ryan Caudill
 * run behavior for quarterback to use
 */
import java.util.Random;
public class RunBehavior implements offenseBehavior {
  /**
   * Randomly generates string
   * @return runs a (drive, draw, pitch, reverse) string
   */
  @Override
  public String play() {
    String returnString = "runs a ";
    Random random = new Random();
    int randomNum = random.nextInt(4) + 1;
    switch (randomNum) {
      case 1:
        returnString += "drive (up the gut)";
        break;
      case 2:
        returnString += "draw";
        break;
      case 3:
        returnString += "pitch";
        break;
      case 4:
        returnString += "reverse";
        break;
    }
    return returnString;
  }
}
