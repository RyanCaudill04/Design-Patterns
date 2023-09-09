package observer;
/**
 * @author Ryan Caudill
 * class Holescoredisplay implements observer
 * holds current hole stats
 */
public class HoleScoreDisplay implements Observer {
  private Subject golfer;
  private int strokes;
  private int par;
/**
 * sets golfer and then registers as that golfers observer
 * @param golfer
 */
  HoleScoreDisplay(Subject golfer) {
    this.golfer = golfer;
    this.golfer.registerObserver(this);
  }
  /**
   * @param strokes
   * @param par
   * sets strokes and par for this hole
   */
  public void update(int strokes, int par) {
    this.strokes = strokes;
    this.par = par;
  }
  /**
   * output statement for the current hole stats
   * @return the output string
   */
  public String toString() {
    String returnString = "\nCurrent Hole stats: ";
    returnString += "Par (" + Integer.toString(par) + ") Strokes (" + 
                    Integer.toString(strokes) + "), ";
    if(strokes <= par) {
      returnString += "making par";
    } else {
      returnString += Integer.toString(strokes - par) + " over par";
    }
    return returnString;
  }
}
