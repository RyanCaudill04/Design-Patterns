package observer;
/**
 * observer interface for hole and round score display
 * @author Ryan Caudill
 */
public interface Observer {
  public void update(int strokes, int par);
  public String toString();
}
