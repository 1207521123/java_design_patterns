package me.zbl.abstractFactory.example;

/**
 * 宝马车轮
 */
public class BMW implements Wheels {
  @Override
  public String getName() {
    System.out.println("宝马车轮");
    return "";
  }
}
