package decorator;

import java.util.ArrayList;
/**
 * @author Ryan Caudill
 * Decorator parent for the different parent decorators
 */
public abstract class VehicleDecorator extends Vehicle {
  VehicleDecorator(ArrayList<String> lines) {
    super(lines);
  }
  /**
   * integrate decor takes one file's text and adds it on top of the 
   * car it is decorating
   * offset is to account for unicode at beginning of each line.
   * @param decor
   */
  protected void integrateDecor(ArrayList<String> decor) {
    // For loop replace characters
    int i = 0;
    for (String line : lines) {
      if (i == 0 && (line.charAt(0) != ' ')) {
        i++;
        continue;
      }
      char[] linesChar = line.toCharArray();
      for (int j = 0; (j < line.length()) && (j < decor.get(i).length()); j++) {
        if ((linesChar[j] != decor.get(i).charAt(j)) && ((linesChar[j] == ' ') || 
          (linesChar[j] == ')' && decor.get(i).charAt(j) != ' '))) {
          linesChar[j] = decor.get(i).charAt(j);
        }
      }
      String temp = new String(linesChar);
      lines.set(i, temp);
      i++;
    }
  }
}
