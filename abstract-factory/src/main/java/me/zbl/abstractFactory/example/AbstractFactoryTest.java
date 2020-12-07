package me.zbl.abstractFactory.example;

import org.junit.jupiter.api.Test;

public class AbstractFactoryTest {

  @Test
  public void testFactory(){
    Factory factory = FactoryProducer.createFactory("BMF");
    Car car = factory.createCar("BM");
    car.getName();
    car = factory.createCar("BC");
    car.getName();

    factory = FactoryProducer.createFactory("BCF");
    Wheels wheels = factory.createWheels("BMW");
    wheels.getName();
    wheels = factory.createWheels("BCW");
    wheels.getName();
  }
}
