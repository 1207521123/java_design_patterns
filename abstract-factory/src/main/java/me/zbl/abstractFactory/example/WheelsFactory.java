package me.zbl.abstractFactory.example;

public class WheelsFactory implements Factory{
  @Override
  public Car createCar(String type) {
    return null;
  }

  public Wheels createWheels(String type){
    if("BMW".equals(type)){
      return new BMW();
    }else if("BCW".equals(type)){
      return new BCW();
    }
    return null;
  }
}
