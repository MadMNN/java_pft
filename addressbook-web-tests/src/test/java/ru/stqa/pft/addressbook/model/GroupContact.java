package ru.stqa.pft.addressbook.model;

public class GroupContact {
  private final String first;
  private final String last;
  private final String addr;
  private final String tel;
  private final String email;

  public GroupContact(String first, String last, String addr, String tel, String email) {
    this.first = first;
    this.last = last;
    this.addr = addr;
    this.tel = tel;
    this.email = email;
  }

  public String getFirst() {
    return first;
  }

  public String getLast() {
    return last;
  }

  public String getAddr() {
    return addr;
  }

  public String getTel() {
    return tel;
  }

  public String getEmail() {
    return email;
  }
}
