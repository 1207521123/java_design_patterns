package me.zbl.abstractFactory.example;

public class FactoryProducer {
  public static Factory createFactory(String type) {
    if("BMF".equals(type)){
      return new CarFactroy();
    }else if("BCF".equals(type)){
      return new WheelsFactory();
    }
    return null;
  }
}
