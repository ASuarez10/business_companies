package model;

public class Employee{

  private String name;
  private String extension;
  private String position;
  private String email;
  private boolean disponibility;

  public Employeer(String name, String extension, String position, String email, boolean disponibility){

  this.name = name;
  this.extension = extension;
  this.position = position;
  this.email = email;
  this.disponibility = disponibility;

  }

  public String getName(){
    return name;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getExtension(){
    return extension;
  }

  public void setExtension(String extension){
    this.extension = extension;
  }

  public String getPosition(){
    return position;
  }

  public void setPosition(String position){
    this.position = position;
  }

  public String getEmail(){
    return email;
  }

  public void setEmail(String email){
    this.email = email;
  }

  public boolean getDisponibility(){
    return disponibility;
  }

  public void setDisponibility(boolean disponibility){
    this.disponibility = disponibility;
  }


}//final
