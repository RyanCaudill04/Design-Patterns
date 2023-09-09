package observer;
/**
 * @author Ryan Caudill
 * subject interface for golfer to implement
 */
public interface Subject {
  public void registerObserver(Observer observer);
  public void removeObserver(Observer observer);
  public void notifyObserver(int strokes, int par);
}
