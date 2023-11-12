package state;

public class FrenchState extends State {
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
  public void pressEnglishButton() {
    this.book.setState(this.book.getEnglishState());
  }
  public void pressSpanishButton() {
    this.book.setState(this.book.getSpanishState());
  }
  public void pressFrenchButton() {}
}
