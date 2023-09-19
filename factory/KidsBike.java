package factory;
/**
 * Kidsbike class extends bike parent class
 * bike has 3 wheels, pedals and training wheels
 */
public class KidsBike extends Bike {
  KidsBike() {
    name = "Tricycle";
    numWheels = 3;
    hasPedals = true;
    hasTrainingWheels = true;
  }
}
