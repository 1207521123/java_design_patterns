package me.zbl.abstractFactory.example;

public interface Factory {
  public Car createCar(String type);
  public Wheels createWheels(String type);
}
