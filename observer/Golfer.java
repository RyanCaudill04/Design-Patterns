package observer;

import java.util.ArrayList;
/**
 * @author Ryan Caudill
 * Golfer class implements Subject interface
 * Has a name and arraylist of observers
 */
public class Golfer implements Subject {
  private ArrayList<Observer> observers = new ArrayList<>();
  private String name;
  Golfer(String name) {
    this.name = name;
  }
  /**
   * Adds or removes observer from observers arraylist
   */
  public void registerObserver(Observer observer) {
    observers.add(observer);
  }
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }
  /**
   * @param strokes int
   * @param par int
   * Updates each observer in the arraylist
   */
  public void notifyObserver(int strokes, int par) {
    Observer temp;
    for (int i = 0; i < observers.size(); i++) {
      temp = observers.get(i);
      temp.update(strokes, par);
    }
  }
  /**
   * uses notify observer to update scores
   * @param strokes
   * @param par
   */
  public void enterScore(int strokes, int par) {
    notifyObserver(strokes, par);
  }
  /**
   * @return name
   */
  public String getName() {
    return name;
  }
}
