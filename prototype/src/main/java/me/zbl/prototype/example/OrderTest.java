package me.zbl.prototype.example;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Date;

public class OrderTest {

  @Test
  public void testOrder() throws CloneNotSupportedException, InterruptedException, IOException, ClassNotFoundException {
    Attachment attachment = new Attachment();
    attachment.setName("zhangsan");
    Order order = new Order();
    order.setAttachment(attachment);
    order.setCreateTime(new Date());
    order.setId(1L);
    order.setUserName("zhangSan");
    System.out.println("order="+order.toString());
    System.out.println();
    Thread.sleep(1000);
    Order order1 = order.clone();
    order1.setUserName("liSi");
    order1.setCreateTime(new Date());
    order1.setId(2L);
    order1.getAttachment().setName("lisi");
    System.out.println("order="+order.toString());
    System.out.println("order1="+order1.toString());
    System.out.println();
    Thread.sleep(1000);
    Order order2 = order.deepCopy();
    order2.setId(3L);
    System.out.println("order="+order.toString());
    System.out.println("order2="+order2.toString());
  }
}
