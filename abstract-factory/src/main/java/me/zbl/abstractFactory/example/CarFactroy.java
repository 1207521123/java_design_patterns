package me.zbl.abstractFactory.example;

/**
 * 汽车工厂
 */
public class CarFactroy implements Factory{

  public Car createCar(String type){
    if("BM".equals(type)){
      return new BM();
    }else if("BC".equals(type)){
      return new BC();
    }
    return null;
  }

  @Override
  public Wheels createWheels(String type) {
    return null;
  }
}
