package decorator;
/**
 * @author Ryan Caudill
 * Paint subclass of vehicle decorator adds unicode to start
 * of each line to change text output color
 */
public class Paint extends VehicleDecorator {
  Paint(Vehicle vehicle, String color) {
    super(vehicle.lines);
    String a = lines.get(0);
    int last = lines.size() - 1;
    String b = lines.get(last);
    // Red, Green, Purple, Blue, Yellow, Cyan, or None
    switch (color.toLowerCase()) {
      case "red":
        a = "\u001B[31m" + a;
        lines.set(0, a);
        b = b + "\u001B[0m";
        break;
      case "green":
        a = "\u001B[32m" + a;
        lines.set(0, a);
        b = b + "\u001B[0m";
        break;
      case "yellow":
        a = "\u001B[33m" + a;
        lines.set(0, a);
        b = b + "\u001B[0m";
        break;
      case "blue":
        a = "\u001B[34m" + a;
        lines.set(0, a);
        b = b + "\u001B[0m";
        break;
      case "purple":
        a = "\u001B[35m" + a;
        lines.set(0, a);
        b = b + "\u001B[0m";
        break;
      case "cyan":
        a = "\u001B[36m" + a;
        lines.set(0, a);
        b = b + "\u001B[0m";
        break;
      default:
        a = "\u001B[0m" + a;
        lines.set(0, a);
        b = b + "\u001B[0m";
        break;
    }
  }
}
