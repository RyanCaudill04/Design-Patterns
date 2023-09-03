package strategy;

public class OBlockBehavior implements offenseBehavior {
  @Override
  public String play() {
    return "blocks defenders";
  }
}
