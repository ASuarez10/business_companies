package model;
import java.util.ArrayList;

public class Employee{

  private String name;
  private String extension;
  private String position;
  private String email;
  private boolean disponibility;

  public Employee(String name, String extension, String position, String email, boolean disponibility){

  this.name = name;
  this.extension = extension;
  this.position = position;
  this.email = email;
  this.disponibility = disponibility;

  }

  /**
  * Description This method allows to get the name of the employer. <br>
  * <b>post:</b> The name of the employer is given.
  * @return The name of the employer.
  */
  public String getName(){
    return name;
  }

  /**
  * Description This method allows to change the name of the employer. <br>
  * <b>post:</b> The name of the employer is changed.
  * @param The new name of the employer.
  */
  public void setName(String name){
    this.name = name;
  }

  /**
  * Description This method allows to get the extension of the employer. <br>
  * <b>post:</b> The extension of the employer is given.
  * @return The extension of the employer.
  */
  public String getExtension(){
    return extension;
  }

  /**
  * Description This method allows to change the extension of the employer. <br>
  * <b>post:</b> The extension of the employer is changed.
  * @param The new extension of the employer.
  */
  public void setExtension(String extension){
    this.extension = extension;
  }

  /**
  * Description This method allows to get the position of the employer. <br>
  * <b>post:</b> The position of the employer is given.
  * @return The position of the employer.
  */
  public String getPosition(){
    return position;
  }

  /**
  * Description This method allows to change the position of the employer. <br>
  * <b>post:</b> The position of the employer is changed.
  * @param The new position of the employer.
  */
  public void setPosition(String position){
    this.position = position;
  }

  /**
  * Description This method allows to get the email of the employer. <br>
  * <b>post:</b> The email of the employer is given.
  * @return The email of the employer.
  */
  public String getEmail(){
    return email;
  }

  /**
  * Description This method allows to change the email of the employer. <br>
  * <b>post:</b> The email of the employer is changed.
  * @param The new email of the employer.
  */
  public void setEmail(String email){
    this.email = email;
  }

  /**
  * Description This method allows to get the disponibility of the cubicle. <br>
  * <b>post:</b> The disponibility of the cubicle is given.
  * @return The disponibility of the cubicle.
  */
  public boolean getDisponibility(){
    return disponibility;
  }

  /**
  * Description This method allows to change the disponibility of the cubicle. <br>
  * <b>post:</b> The disponibility of the cubicle is changed.
  * @param The new disponibility of the cubicle.
  */
  public void setDisponibility(boolean disponibility){
    this.disponibility = disponibility;
  }


}//final
