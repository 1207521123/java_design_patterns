package me.zbl.bridge.example;

public class BlueCircle implements DrawApi {
  @Override
  public void draw(int x, int y, int radius) {
    System.out.println("draw circle blue circle x="+x+",y="+y+",radius="+radius);
  }
}
