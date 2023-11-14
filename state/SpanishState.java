package state;
/**
 * @author Ryan Caudill
 * spanish state extends state parent class
 * implements spanish animals and sounds
 */
public class SpanishState extends State {
  public SpanishState(BabyBook book) {
    super(book);
    animalSounds.put("pájaro", "pío");
    animalSounds.put("gato", "miau");
    animalSounds.put("gallina", "coc co co coc");
    animalSounds.put("perro", "guau");
    animalSounds.put("caballo", "relinchar");
    animalSounds.put("ratón", "cui-cui");
    animalSounds.put("oveja", "bee, mee");
  }
  /**
   * switches current book state to english state
   */
  public void pressEnglishButton() {
    this.book.setState(this.book.getEnglishState());
  }
  /**
   * does nothing because already in spanish state
   */
  public void pressSpanishButton() {}
  /**
   * switches current book state to french state
   */
  public void pressFrenchButton() {
    this.book.setState(this.book.getFrenchState());
  }
}
