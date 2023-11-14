package state;
/**
 * @author Ryan Caudill
 * english state is child class of state class
 * english animals and sounds are added to book
 */
public class EnglishState extends State {
  public EnglishState(BabyBook book) {
    super(book);
    animalSounds.put("bird", "tweet");
    animalSounds.put("cat", "meow");
    animalSounds.put("chicken", "cluck");
    animalSounds.put("dog", "woof");
    animalSounds.put("horse", "neigh");
    animalSounds.put("mouse", "squeak");
    animalSounds.put("sheep", "baah");
  }
  /**
   * does nothing because already in english state
   */
  public void pressEnglishButton() {}
  /**
   * switches current book state to spanish state
   */
  public void pressSpanishButton() {
    this.book.setState(this.book.getSpanishState());
  }
  /**
   * switches current book state to french state
   */
  public void pressFrenchButton() {
    this.book.setState(this.book.getFrenchState());
  }
}
