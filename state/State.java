package state;

import java.util.ArrayList;
import java.util.HashMap;

public class State {
  protected BabyBook book;
  protected HashMap<String, String> animalSounds;

  public State(BabyBook book) {
    this.book = book;
    animalSounds = new HashMap<String, String>();
  }
  public ArrayList<String> getAnimaList() {
    return new ArrayList<>(animalSounds.keySet());
  }
  public void pressAnimalButton(String animal) {
    System.out.println(animalSounds.get(animal));
  }
  public void pressEnglishButton() {}
  public void pressSpanishButton() {}
  public void pressFrenchButton() {}
}
