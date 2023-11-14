package state;

import java.util.ArrayList;
/**
 * Babybook class contains each state and sets the State to
 * whatever of the three specific states required
 */
public class BabyBook {
  private EnglishState englishState;
  private SpanishState spanishState;
  private FrenchState frenchState;
  private State state;

  public BabyBook() {
    this.englishState = new EnglishState(this);
    this.frenchState = new FrenchState(this);
    this.spanishState = new SpanishState(this);
    this.state = englishState;
  }
  /**
   * getter method
   * @return current state animal list
   */
  public ArrayList<String> getAnimalList() {
    return state.getAnimaList();
  }
  /**
   * prints corresponding sound to whichever animal requested
   * according to current state
   * @param animal
   */
  public void pressAnimalButton(String animal) {
    state.pressAnimalButton(animal);
  }
  /**
   * switch current state to english
   */
  public void pressEnglishButton() {
    state.pressEnglishButton();
  }
  /**
   * switch current state to spanish
   */
  public void pressSpanishButton() {
    state.pressSpanishButton();
  }
  /**
   * switch current state to french
   */
  public void pressFrenchButton() {
    state.pressFrenchButton();
  }
  /**
   * change current state to which requested
   * @param state requested
   */
  public void setState(State state) {
    this.state = state;
  }
  /**
   * english state getter
   * @return englishstate
   */
  public State getEnglishState() {
    return this.englishState;
  }
  /**
   * spanish state getter
   * @return spanishstate
   */
  public State getSpanishState() {
    return this.spanishState;
  }
  /**
   * french state getter
   * @return frenchstate
   */
  public State getFrenchState() {
    return this.frenchState;
  }
}