package me.zbl.abstractFactory.example;

/**
 * 奔驰车轮
 */
public class BCW implements Wheels {
  @Override
  public String getName() {
    System.out.println("奔驰车轮");
    return "";
  }
}
