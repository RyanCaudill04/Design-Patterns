package factory;

public class BikeStore {
  public Bike createBike(String type) {
    switch (type.toLowerCase()) {
      case "tricycle":
        Bike returnTricycle = new Tricycle();
        return returnTricycle;
      case "kids bike":
        Bike returnKids = new KidsBike();
        return returnKids;
      case "strider":
        Bike returnStrider = new Strider();
        return returnStrider;
    }
    return null;
  }
}
