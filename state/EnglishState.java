package state;

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
  public void pressEnglishButton() {}
  public void pressSpanishButton() {
    this.book.setState(this.book.getSpanishState());
  }
  public void pressFrenchButton() {
    this.book.setState(this.book.getFrenchState());
  }
}
