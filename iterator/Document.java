package iterator;

import java.util.Stack;

public class Document {
  private String title;
  private Stack<String> undoStack = new Stack<String>();
  private Stack<String> redoStack = new Stack<String>();

  Document(String title) {
    this.title = title;
  }
  public String makeChange(String change) {

  }
  public String undoChange() {

  }
  public boolean canUndo() {

  }
  public String redoChange() {

  }
  public boolean canRedo() {

  }
  public StackIterator getUndoIterator() {

  }
  public StackIterator getRedoIterator() {
    
  }
}
