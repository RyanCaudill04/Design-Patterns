package factory;
/**
 * Bikestore class is used to make bikes
 */
public class BikeStore {
  /**
   * Calls bike contructor based on string input
   * @param type of bike
   * @return the bike created
   */
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
