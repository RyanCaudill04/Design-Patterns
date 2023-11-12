package state;

import java.util.ArrayList;

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
  public ArrayList<String> getAnimalList() {
    return state.getAnimaList();
  }
  public void pressAnimalButton(String animal) {
    state.pressAnimalButton(animal);
  }
  public void pressEnglishButton() {
    state.pressEnglishButton();
  }
  public void pressSpanishButton() {
    state.pressSpanishButton();
  }
  public void pressFrenchButton() {
    state.pressFrenchButton();
  }
  public void setState(State state) {
    this.state = state;
  }
  public State getEnglishState() {
    return this.englishState;
  }
  public State getSpanishState() {
    return this.spanishState;
  }
  public State getFrenchState() {
    return this.frenchState;
  }
}