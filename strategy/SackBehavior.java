package strategy;
/**
 * @author Ryan Caudill
 * sack behavior for lineman to use on defense
 */
public class SackBehavior implements defenseBehavior {
  @Override
  public String play() {
    return "sacks the quarterback";
  }
}
