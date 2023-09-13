package decorator;

public class Paint extends VehicleDecorator {
  Paint(Vehicle vehicle, String color) {
    super(vehicle.lines);
    // Red, Green, Purple, Blue, Yellow, Cyan, or None
    switch (color.toLowerCase()) {
      case "red":
        for (String a : lines) {
          int temp = lines.indexOf(a);
          a = "\u001B[31m" + a;
          lines.set(temp, a);
        }
        break;
      case "green":
        for (String a : lines) {
          int temp = lines.indexOf(a);
          a = "\u001B[32m" + a;
          lines.set(temp, a);
        }
        break;
      case "yellow":
        for (String a : lines) {
          int temp = lines.indexOf(a);
          a = "\u001B[33m" + a;
          lines.set(temp, a);
        }
        break;
      case "blue":
        for (String a : lines) {
          int temp = lines.indexOf(a);
          a = "\u001B[34m" + a;
          lines.set(temp, a);
        }
        break;
      case "purple":
        for (String a : lines) {
          int temp = lines.indexOf(a);
          a = "\u001B[35m" + a;
          lines.set(temp, a);
        }
        break;
      case "cyan":
        for (String a : lines) {
          int temp = lines.indexOf(a);
          a = "\u001B[36m" + a;
          lines.set(temp, a);
        }
        break;
      default:
        for (String a : lines) {
          int temp = lines.indexOf(a);
          a = "\u001B[0m " + a;
          lines.set(temp, a);
        }
        break;
    }
  }
}
