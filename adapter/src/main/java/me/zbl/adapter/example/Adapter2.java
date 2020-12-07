package me.zbl.adapter.example;

/**
 * 接口适配器
 */
public class Adapter2 implements Target {
  private Adaptee2 adaptee2;

  public Adapter2(Adaptee2 adaptee2){
    this.adaptee2 = adaptee2;
  }

  @Override
  public void play() {
    adaptee2.playA();
  }
}
