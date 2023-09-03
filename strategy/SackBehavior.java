// 2023 Ryan Caudill
package strategy;

public class SackBehavior implements defenseBehavior {
  @Override
  public String play() {
    return "sacks the quarterback";
  }
}
