package me.zbl.bridge.example;

public class GreanCircle implements DrawApi {
  @Override
  public void draw(int x, int y, int radius) {
    System.out.println("draw circle grean circle x="+x+",y="+y+",radius="+radius);
  }
}
