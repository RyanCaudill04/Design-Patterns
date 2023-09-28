package singleton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
/**
 * @author Ryan Caudill
 * Game class has one instance of itself
 * Holds hashmap of three difficulties and subsequent anagrams
 * Difficulty increases after getting to certain score, +1 every correct answer
 * -1 for every incorrect answer
 */
public class Game {
  private static Game game;
  Random rand = new Random();
  Difficulty level;
  HashMap<Difficulty, ArrayList<Anagram>> anagrams = new HashMap<Difficulty, ArrayList<Anagram>>();
  Anagram currentAnagram;
  int score = 0;

  Game() {
    level = Difficulty.EASY;
    anagrams.put(Difficulty.EASY, FileReader.getAnagrams(Difficulty.EASY));
    anagrams.put(Difficulty.MEDIUM, FileReader.getAnagrams(Difficulty.MEDIUM));
    anagrams.put(Difficulty.HARD, FileReader.getAnagrams(Difficulty.HARD));
  }
  /**
   * Single instance of this class, creates if it not 
   * created yet
   * @return single instance of itself
   */
  public static Game getInstance() {
    if (game == null) {
      game = new Game();
    }
    return game;
  }
  /**
   * Accesses hashmap of current difficulty and
   * gets a random anagram from arraylist 
   * @return current anagram's jumbled word
   */
  public String getQuestion() {
    ArrayList<Anagram> temp;
    int size, randomNum;
    temp = anagrams.get(level);
    size = temp.size();
    randomNum = rand.nextInt(size);
    currentAnagram = temp.get(randomNum);
    return currentAnagram.getQuestion();
  }
  /**
   * Takes in user answer, checks if correct, increments or
   * decrements score accordingly, then adjusts difficulty 
   * based on new score
   * @param String userAnswer
   * @return if userAnswer is a possible answer
   */
  public boolean isCorrect(String userAnswer) {
    boolean check = currentAnagram.isCorrect(userAnswer);
    if (check) {
      score++;
    } else {
      score--;
    }
    if (score > 10) {
      level = Difficulty.HARD;
    } else if (score > 5) {
      level = Difficulty.MEDIUM;
    } else {
      level = Difficulty.EASY;
    }
    return check;
  }
  public int getScore() {
    return score;
  }
}
