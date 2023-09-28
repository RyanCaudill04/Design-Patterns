package singleton;

import java.util.ArrayList;
/**
 * @author Ryan Caudill
 * Anagram class holds jumbled words and 
 * unscrambled versions of the word
 */
public class Anagram {
  String question;
  ArrayList<String> answers;
  Anagram(String question, ArrayList<String> answers) {
    this.question = question;
    this.answers = answers;
  }
  public String getQuestion() {
    return question;
  }
  public boolean isCorrect(String userAnswer) {
    return answers.contains(userAnswer.toLowerCase());
  }
}
