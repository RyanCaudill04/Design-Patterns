package state;

import java.util.ArrayList;
import java.util.HashMap;
/**
 * @author Ryan Caudill
 */
public class State {
  protected BabyBook book;
  protected HashMap<String, String> animalSounds;

  public State(BabyBook book) {
    this.book = book;
    animalSounds = new HashMap<String, String>();
  }
  /**
   * getter method for keyset of hashmap animalsounds
   * @return keyset of animals sounds hashmap
   */
  public ArrayList<String> getAnimaList() {
    return new ArrayList<>(animalSounds.keySet());
  }
  /**
   * accesses hashmap of animals sounds using key animal
   * then prints corresponding sound
   * @param animal
   */
  public void pressAnimalButton(String animal) {
    System.out.println(animalSounds.get(animal));
  }
  /**
   * abstract methods to switch this.book to chosen state
   */
  public void pressEnglishButton() {}
  public void pressSpanishButton() {}
  public void pressFrenchButton() {}
}
