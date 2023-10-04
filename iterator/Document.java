package iterator;

import java.util.Stack;
/**
 * @author Ryan Caudill
 * Document class holds two stacks of strings, undo and redo
 * Undo command puts top item of undostack onto redostack
 * Redo command puts top item of redostack back onto undostack
 */
public class Document {
  private String title;
  private Stack<String> undoStack = new Stack<String>();
  private Stack<String> redoStack = new Stack<String>();

  Document(String title) {
    this.title = title;
  }
  /**
   * Adds change to undoStack and returns String 
   * saying making change
   * @param change String to add to undoStack
   * @return String: "Making change: change"
   */
  public String makeChange(String change) {
    undoStack.push(change);
    String returnString = "Making change: " + change;
    return returnString;
  }
  /**
   * First checks if a change can be undone, then
   * moves item from undoStack to redoStack
   * @return String: "Undoing change: change"
   */
  public String undoChange() {
    if (!canUndo()) {
      return "Cannot undo";
    }
    String temp = undoStack.pop();
    redoStack.push(temp);
    String returnString = "Undoing change: " + temp;
    return returnString;
  }
  /**
   * @return boolean if undoStack is empty
   */
  public boolean canUndo() {
    return !undoStack.empty();
  }
  /**
   * First checks if redoStack is empty, then
   * moves item from redoStack to undoStack
   * @return String: "Redoing change: change"
   */
  public String redoChange() {
    if (!canRedo()) {
      return "Cannot redo";
    }
    String temp = redoStack.pop();
    undoStack.push(temp);
    String returnString = "Redoing change: " + temp;
    return returnString;
  }
  /**
   * @return boolean is redoStack is empty or not
   */
  public boolean canRedo() {
    return !redoStack.empty();
  }
  /**
   * Makes StackIterator of undoStack
   * @return undoIterator
   */
  public StackIterator getUndoIterator() {
    StackIterator undoIterator = new StackIterator(undoStack);
    return undoIterator;
  }
  /**
   * Makes StackIterator of redoStack
   * @return redoIterator
   */
  public StackIterator getRedoIterator() {
    StackIterator redoIterator = new StackIterator(redoStack);
    return redoIterator;
  }
}
