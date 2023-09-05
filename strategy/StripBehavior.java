package strategy;
/**
 * @author Ryan Caudill
 * strip behavior for lineman on defense
 */
public class StripBehavior implements defenseBehavior {
  @Override
  public String play() {
    return "strips a ball from runner's hands";
  }
}
