package iterator;

import java.util.Stack;
import java.util.Iterator;
/**
 * @author Ryan Caudill
 * StackIterator class implements util interface Iterator
 * has methods to iterate through a stack in reverse
 */
public class StackIterator implements Iterator<String> {
  private Stack<String> items = new Stack<String>();
  private int position;

  StackIterator(Stack<String> items) {
    this.items = items;
    position = 0;
  }
  /**
   * next parses through stack in reverse (bottom -> top)
   * @return next item on the stack from the bottom
   */
  public String next() {
    if (!hasNext()) {
      return "";
    }
    String returnString = items.get(position);
    position++;
    return returnString;
  }
  /**
   * checks if position has gone all the way through the stack
   * @return if stack has any more items
   */
  public boolean hasNext() {
    return position < items.size();
  }
}
