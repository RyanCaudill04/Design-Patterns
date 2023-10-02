package iterator;

import java.util.Stack;
import java.util.Iterator;

public class StackIterator implements Iterator<String> {
  private Stack<String> items = new Stack<String>();
  private int position;

  StackIterator(Stack<String> items) {
    this.items = items;
    position = 1;
  }
  public String next() {
    position++;
    return items.pop();
  }
  public boolean hasNext() {
    return !items.empty();
  }
}
