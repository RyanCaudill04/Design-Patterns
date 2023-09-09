package observer;

public class RoundScoreDisplay implements Observer {
  private Subject golfer;
  private int strokesTotal;
  private int parTotal;

  RoundScoreDisplay(Subject golfer) {
    this.golfer = golfer;
    this.strokesTotal = 0;
    this.parTotal = 0;
    this.golfer.registerObserver(this);
  }
  public void update(int strokes, int par) {
    this.strokesTotal += strokes;
    this.parTotal += par;
  }
  public String toString() {
    String returnString = "Overall stats: ";
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
