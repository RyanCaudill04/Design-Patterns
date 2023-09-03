// 2023 Ryan Caudill
package strategy;

public class StripBehavior implements defenseBehavior {
  @Override
  public String play() {
    return "strips a ball from runner's hands";
  }
}
