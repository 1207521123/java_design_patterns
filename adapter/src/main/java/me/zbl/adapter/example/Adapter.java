package me.zbl.adapter.example;

/**
 * 类适配器
 */
public class Adapter extends Adaptee implements Target {

  @Override
  public void play() {
    super.playA();
  }
}
