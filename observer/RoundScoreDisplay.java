package observer;
/**
 * @author Ryan Caudill
 * Roundscoredisplay implements observer and holds the 
 * round's stroke and par counts
 */
public class RoundScoreDisplay implements Observer {
  private Subject golfer;
  private int strokesTotal;
  private int parTotal;
/**
 * sets count to 0, sets current golfer, and then 
 * registers as observer to that golfer
 * @param golfer
 */
  RoundScoreDisplay(Subject golfer) {
    this.golfer = golfer;
    this.strokesTotal = 0;
    this.parTotal = 0;
    this.golfer.registerObserver(this);
  }
  /**
   * increments by passed strokes and par
   * @param strokes
   * @param par
   */
  public void update(int strokes, int par) {
    this.strokesTotal += strokes;
    this.parTotal += par;
  }
  /**
   * @return output statement with round stats
   */
  public String toString() {
    String returnString = "\nOverall stats: ";
    returnString += "Par (" + Integer.toString(parTotal) + ") Strokes (" + 
                    Integer.toString(strokesTotal) + "), ";
    if(strokesTotal <= parTotal) {
      returnString += "making par";
    } else {
      returnString += Integer.toString(strokesTotal - parTotal) + " over par";
    }
    return returnString;
  }
}
