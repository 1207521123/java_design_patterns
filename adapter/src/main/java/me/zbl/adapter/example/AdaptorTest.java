package me.zbl.adapter.example;

import org.junit.jupiter.api.Test;

public class AdaptorTest {

  @Test
  public void testAdapter(){
    Target conTarget = new ConTarget();
    conTarget.play();
    Target target = new Adapter();
    target.play();

    Adaptee2 adaptee2 = new Adaptee2Impl();
    Target target2 = new Adapter2(adaptee2);
    target2.play();
  }
}
