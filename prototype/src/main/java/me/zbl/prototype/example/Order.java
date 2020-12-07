package me.zbl.prototype.example;

import lombok.Data;

import java.io.*;
import java.util.Date;

@Data
public class Order implements Serializable,Cloneable {

  private Long id;

  private Date createTime;

  private String userName;

  private Attachment attachment;
  @Override
  public Order clone() throws CloneNotSupportedException {
    return (Order) super.clone();
  }

  public Order deepCopy() throws IOException, ClassNotFoundException {
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
    objectOutputStream.writeObject(this);
    ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
    ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
    return (Order) objectInputStream.readObject();
  }

  @Override
  public String toString() {
    return "Order{" +super.toString()+
        "id=" + id +",offsite="+id+
        ", createTime=" + createTime +
        ", userName='" + userName + '\'' +
        ", attachment=" + attachment.getName()+",offsite="+attachment +
        '}';
  }
}
