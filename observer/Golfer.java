package observer;

import java.util.ArrayList;

public class Golfer implements Subject {
  private ArrayList<Observer> observers = new ArrayList<>();
  private String name;

  Golfer(String name) {
    this.name = name;
  }
  public void registerObserver(Observer observer) {
    observers.add(observer);
  }
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }
  public void notifyObserver(int strokes, int par) {
    Observer temp = observers.get(0);
    temp.update(strokes, par);
    temp = observers.get(1);
    temp.update(strokes, par);
  }
  public void enterScore(int strokes, int par) {
    notifyObserver(strokes, par);
  }
  public String getName() {
    return name;
  }
}
