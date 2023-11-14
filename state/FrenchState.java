package state;
/**
 * @author Ryan Caudill
 * French state is child class of state
 * that implements french animals and 
 * corresponding sounds
 */
public class FrenchState extends State {
  /**
   * adds all french animals and sounds
   * @param book
   */
  public FrenchState(BabyBook book) {
    super(book);
    animalSounds.put("oiseua", "cui cui");
    animalSounds.put("chat", "miaou");
    animalSounds.put("poulet", "cotcotcodet");
    animalSounds.put("chien", "ouaf ouaf");
    animalSounds.put("cheval", "nehiiiiiiiigh");
    animalSounds.put("souris", "chicotement");
    animalSounds.put("mouton", "bêlement");
  }
  /**
   * switches current book state to english state
   */
  public void pressEnglishButton() {
    this.book.setState(this.book.getEnglishState());
  }
  /**
   * switches curreent book state to spanish state
   */
  public void pressSpanishButton() {
    this.book.setState(this.book.getSpanishState());
  }
  /**
   * does nothing because already in french state
   */
  public void pressFrenchButton() {}
}
