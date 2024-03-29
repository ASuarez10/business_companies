package model;
import java.util.ArrayList;

public abstract  class Company{

  public final static char A_H_S_F = 'A';
  public static final char E_M_C = 'B';
  public static final char I_M = 'C';
  public static final char E_G_S = 'D';
  public static final char CONSTRUCTION = 'E';
  public static final char COMERCY_MM  = 'F';
  public static final char T_A_C = 'G';
  public static final char S_I_C = 'H';
  public static final char S_C = 'I';

  private  String name;
  private String nit;
  private String addres;
  private String phoneN;
  private int qEmployeer;
  private double actives;
  private String inscriptionD;
  private char type;
  private String lRName;
  private Building bu;

  public Company(String name, String nit, String addres,String phoneN, int qEmployeer, double actives, String inscriptionD, char type, String lRName, Building bu){
    this.name = name;
    this.nit = nit;
    this.addres = addres;
    this.phoneN = phoneN;
    this.qEmployeer = qEmployeer;
    this.actives = actives;
    this.inscriptionD = inscriptionD;
    this.type = type;
    this.lRName = lRName;
    this.bu = bu;
  }

  /**
	* Description This method allows to get the inscription date of the company. <br>
	* <b>post:</b> The inscription date of the company is given.
	* @return The inscription date.
	*/

  public String getInscriptionD(){
    return inscriptionD;
  }

  /**
	* Description This method allows to change the inscription date of the company. <br>
	* <b>post:</b> The inscription date of the company is changed.
	* @param The new inscription date of the company.
	*/
  public void setInscriptionD(String inscriptionD){
    this.inscriptionD = inscriptionD;
  }

  /**
	* Description This method allows to get the name of the company. <br>
	* <b>post:</b> The name of the company is given.
	* @return The name of the company.
	*/
  public String getName(){
    return name;
  }

  /**
	* Description This method allows to change the name of the company. <br>
	* <b>post:</b> The name of the company is changed.
	* @param The new name of the company.
	*/
  public void setName(String name){
    this.name = name;
  }

  /**
	* Description This method allows to get the nit of the company. <br>
	* <b>post:</b> The nit of the company is given.
	* @return The nit of the company.
	*/
  public String getNit(){
    return nit;
  }

  /**
	* Description This method allows to change the nit of the company. <br>
	* <b>post:</b> The nit of the company is changed.
	* @param The new nit of the company.
	*/
  public void setNit(String nit){
    this.nit = nit;
  }

  /**
	* Description This method allows to get the addres of the company. <br>
	* <b>post:</b> The addres of the company is given.
	* @return The addres of the company.
	*/
  public String getAddres(){
    return addres;
  }

  /**
	* Description This method allows to change the addres of the company. <br>
	* <b>post:</b> The addres of the company is changed.
	* @param The new addres of the company.
	*/
  public void setAddres(String addres){
    this.addres = addres;
  }

  /**
	* Description This method allows to get the phone number of the company. <br>
	* <b>post:</b> The phone number of the company is given.
	* @return The phone number of the company.
	*/
  public String getPhoneN(){
    return phoneN;
  }

  /**
	* Description This method allows to change the phone number of the company. <br>
	* <b>post:</b> The phone number of the company is changed.
	* @param The new phone number of the company.
	*/
  public void setPhoneN(String phoneN){
    this.phoneN = phoneN;
  }

  /**
	* Description This method allows to get the employeer amount of the company. <br>
	* <b>post:</b> The employeer amount of the company is given.
	* @return The employeer amount of the company.
	*/
  public int getQEmployeer(){
    return qEmployeer;
  }

  /**
	* Description This method allows to change the employeer quantity of the company. <br>
	* <b>post:</b> The employeer quantity of the company is changed.
	* @param The new employeer quantity of the company.
	*/
  public void setQEmployeer(int qEmployeer){
    this.qEmployeer = qEmployeer;
  }

  /**
	* Description This method allows to get the actives of the company. <br>
	* <b>post:</b> The actives of the company is given.
	* @return The actives of the company.
	*/
  public double getActives(){
    return actives;
  }

  /**
  * Description This method allows to change the actives amount of the company. <br>
  * <b>post:</b> The actives amount of the company is changed.
  * @param The new actives amount of the company.
  */
  public void setActives(double actives){
    this.actives = actives;
  }

  /**
	* Description This method allows to get the type of the company. <br>
	* <b>post:</b> The type of the company is given.
	* @return The type of the company.
	*/
  public char getType(){
    return type;
  }

  /**
  * Description This method allows to change the type of the company. <br>
  * <b>post:</b> The type of the company is changed.
  * @param The new type of the company.
  */
  public void setType(char type){
    this.type = type;
  }

  /**
	* Description This method allows to get the name of the legal representative of the company. <br>
	* <b>post:</b> The name of the legal representative of the company is given.
	* @return The name of the legal representative of the company.
	*/
  public String getLRName(){
    return lRName;
  }

  /**
  * Description This method allows to change the legal representant name of the company. <br>
  * <b>post:</b> The legal representant name of the company is changed.
  * @param The new legal representant name of the company.
  */
  public void setLRName(String lRName){
    this.lRName = lRName;
  }

  /**
	* Description This method allows to get all the building. <br>
	* <b>post:</b> The building is given.
	* @return The object.
	*/
  public Building getBu(){
    return bu;
  }

  /**
  * Description This method allows to change all the building. <br>
  * <b>post:</b> All the building is changed.
  * @param The building.
  */
  public void setBu(Building bu){
    this.bu = bu;
  }

  /** Description:This method allows to get the company information
  */
  public abstract String toString();

}//final
