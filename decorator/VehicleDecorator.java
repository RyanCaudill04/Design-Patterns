package decorator;

import java.util.ArrayList;

public abstract class VehicleDecorator extends Vehicle {
  VehicleDecorator(ArrayList<String> lines) {
    super(lines);
  }
  protected void integrateDecor(ArrayList<String> decor) {
    // For loop replace characters
    int i = 0, offset = 5;
    for (String line : lines) {
      char[] linesChar = line.toCharArray();
      for (int j = 0; (j < line.length() - offset) && (j < decor.get(i).length()); j++) {
        if ((linesChar[j + offset] != decor.get(i).charAt(j)) && ((linesChar[j + offset] == ' ') || 
          (linesChar[j + offset] == ')' && decor.get(i).charAt(j) != ' '))) {
          linesChar[j + offset] = decor.get(i).charAt(j);
        }
      }
      String temp = new String(linesChar);
      lines.set(i, temp);
      i++;
    }
  }
}
