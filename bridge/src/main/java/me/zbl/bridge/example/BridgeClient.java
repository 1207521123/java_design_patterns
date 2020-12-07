package me.zbl.bridge.example;

import org.junit.jupiter.api.Test;

public class BridgeClient {

  @Test
  public void testBridge(){
    Circle greanCircle = new Circle(1,2,10,new GreanCircle());
    greanCircle.draw();

    Circle blueCircle = new Circle(2,2,10,new BlueCircle());
    blueCircle.draw();
  }
}
