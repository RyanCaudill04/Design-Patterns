package strategy;
/**
 * Oblock behavior is offensive behavior for lineman to use when on offense
 * @author Ryan Caudill
 */
public class OBlockBehavior implements offenseBehavior {
  /**
   * creates a string to be returned when play is called
   * @return string "blocks defenders"
   */
  @Override
  public String play() {
    return "blocks defenders";
  }
}
