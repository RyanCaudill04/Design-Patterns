package observer;

public class HoleScoreDisplay implements Observer {
  private Subject golfer;
  private int strokes;
  private int par;

  HoleScoreDisplay(Subject golfer) {
    this.golfer = golfer;
    this.golfer.registerObserver(this);
  }
  public void update(int strokes, int par) {
    this.strokes = strokes;
    this.par = par;
  }
  public String toString() {
    String returnString = "Current Hole stats: ";
    returnString += "Par (" + Integer.toString(par) + ") Strokes (" + 
                    Integer.toString(strokes) + "), ";
    if(strokes <= par) {
      returnString += "Making par";
    } else {
      returnString += Integer.toString(strokes - par) + " over par";
    }
    return returnString;
  }
}
