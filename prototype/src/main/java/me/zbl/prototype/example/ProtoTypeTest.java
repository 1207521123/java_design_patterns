package me.zbl.prototype.example;

import org.junit.jupiter.api.Test;

import java.io.IOException;

public class ProtoTypeTest {

  @Test
  public void testProtoType() throws CloneNotSupportedException {
    Attachment attachment = new Attachment();
    attachment.setName("zhangsan");
    YuelyLog yuelyLog = new YuelyLog();
    yuelyLog.setAttachment(attachment);
    yuelyLog.setName("1");
    YuelyLog yuelyLog2 = yuelyLog.clone();
    yuelyLog2.getAttachment().setName("lisi");
    yuelyLog2.setName("2");
    System.out.println(yuelyLog.getAttachment().getName());
    System.out.println(yuelyLog.getName());
  }

  @Test
  public void deepCopy() throws IOException, ClassNotFoundException {
    Attachment attachment = new Attachment();
    attachment.setName("zhangsan");
    YuelyLog yuelyLog = new YuelyLog();
    yuelyLog.setAttachment(attachment);
    yuelyLog.setName("1");
    YuelyLog yuelyLog2 = yuelyLog.deepClone();
    yuelyLog2.getAttachment().setName("lisi");
    yuelyLog2.setName("2");
    System.out.println(yuelyLog2.getAttachment().getName());
    System.out.println(yuelyLog2.getName());
  }
}
