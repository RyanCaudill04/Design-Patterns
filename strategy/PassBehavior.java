package strategy;
/**
 * Pass behavior for quarterback to use on offense
 * @author Ryan Caudill
 */
import java.util.Random;
public class PassBehavior implements offenseBehavior {
  /**
   * play function creates a string randomly between 5 options:
   * @return throws a (slant, out, seem) route/screen pass/hail mary
   */
  @Override
  public String play() {
    String returnString = "throws a ";
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
