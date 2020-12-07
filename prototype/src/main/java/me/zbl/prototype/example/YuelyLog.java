package me.zbl.prototype.example;

import java.io.*;

public class YuelyLog implements Serializable,Cloneable {
  private Attachment attachment;
  private String name;
  private String date;
  @Override
  public YuelyLog clone() throws CloneNotSupportedException {
    return (YuelyLog)super.clone();
  }
  public Attachment getAttachment() {
    return attachment;
  }

  public void setAttachment(Attachment attachment) {
    this.attachment = attachment;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public YuelyLog deepClone() throws IOException, ClassNotFoundException {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
    objectOutputStream.writeObject(this);
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
    ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);

    return (YuelyLog)objectInputStream.readObject();
  }
}
