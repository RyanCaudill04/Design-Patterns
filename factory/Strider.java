package factory;
/**
 * Strider class extends bike parent class
 * strider has 2 wheels and no pedals nor training
 * wheels
 */
public class Strider extends Bike {
  Strider() {
    name = "Strider";
    numWheels = 2;
    hasPedals = false;
    hasTrainingWheels = false;
    price = 5.49;
  }
}
