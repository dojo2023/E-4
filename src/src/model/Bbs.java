package model;

public class Bbs {

  int user_id;

  String name;

  String chattext;

  /**
  * @return id
  */
  public int getId() {
    return user_id;
  }

  /**
  * @param id セットする id
  */
  public void setId(int id) {
    this.user_id = id;
  }

  /**
  * @return name
  */
  public String getName() {
    return name;
  }

  /**
  * @param name セットする name
  */
  public void setName(String name) {
    this.name = name;
  }

  /**
  * @return chattext
  */
  public String getChattext() {
    return chattext;
  }

  /**
  * @param chattext セットする chattext
  */
  public void setChattext(String chattext) {
    this.chattext = chattext;
  }



}