package factory;
/**
 * Tricycle extends bike parent class
 * tricycles have 3 wheels, pedals but
 * no training wheels
 */
public class Tricycle extends Bike {
  Tricycle() {
    name = "Tricycle";
    numWheels = 3;
    hasPedals = true;
    hasTrainingWheels = false;
    price = 23.65;
  }
}
