package state;

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
  public void pressEnglishButton() {
    this.book.setState(this.book.getEnglishState());
  }
  public void pressSpanishButton() {}
  public void pressFrenchButton() {
    this.book.setState(this.book.getFrenchState());
  }
}
