package model;
import java.util.ArrayList;

public class Education extends ServiceC{

  public static final String HIGH_SCHOOL = "Bachillerato" ;
  public static final String UNIVERSITY = "Universidad" ;

  private String numberRegistrationMEN;
  private int numberYearsAcreditation;
  private int nationalPositionSaber11;
  private int nationalPositionSaberPro;
  private String rectorName;
  private String educativeSector;
  private int amountStudentsStratum1and2;
  private int totalAmountActivesStudent;


  public Education(String nameComercy,String nit, String addres,String phoneContact, int employeerCant, double amountActives, String dateOfInscription, char typeOrganization, String legalName,Building build, String numberRegistrationMEN,int numberYearsAcreditation,int nationalPositionSaber11,int nationalPositionSaberPro,String rectorName,String educativeSector,int amountStudentsStratum1and2, int totalAmountActivesStudent){
  super(nameComercy,nit,addres,phoneContact,employeerCant,amountActives,dateOfInscription,typeOrganization,legalName,build);
  this.numberRegistrationMEN = numberRegistrationMEN;
  this.numberYearsAcreditation = numberYearsAcreditation;
  this.nationalPositionSaber11 = nationalPositionSaber11;
  this.nationalPositionSaberPro = nationalPositionSaberPro;
  this.rectorName = rectorName;
  this.educativeSector = educativeSector;
  this.amountStudentsStratum1and2 = amountStudentsStratum1and2;
  this.totalAmountActivesStudent = totalAmountActivesStudent;
  }

  /**
	* Description This method allows to get the approval registration number of the company. <br>
	* <b>post:</b> The approval registration number of the company is given.
	* @return The approval registration number of the company.
	*/
  public String getNumberRegistrationMEN(){
    return numberRegistrationMEN;
  }

  /**
  * Description This method allows to change the approval registration number of the company. <br>
  * <b>post:</b> The approval registration number of the company is changed.
  * @param The new approval registration number of the company.
  */
  public void setNumberRegistrationMEN(String numberRegistrationMEN){
    this.numberRegistrationMEN = numberRegistrationMEN;
  }

  /**
	* Description This method allows to get the number of years with acreditation of the company. <br>
	* <b>post:</b> The number of years with acreditation of the company is given.
	* @return The number of years with acreditation of the company.
	*/
  public int getNumberYearsAcreditation(){
    return numberYearsAcreditation;
  }

  /**
  * Description This method allows to change the number of years with acreditation of the company. <br>
  * <b>post:</b> The number of years with acreditation of the company is changed.
  * @param The new number of years with acreditation of the company.
  */
  public void setNumberYearsAcreditation(int numberYearsAcreditation){
    this.numberYearsAcreditation = numberYearsAcreditation;
  }

  /**
	* Description This method allows to get the position on "Pruebas Saber 11" of the company. <br>
	* <b>post:</b> The position on "Pruebas Saber 11" of the company is given.
	* @return The position on "Pruebas Saber 11" of the company.
	*/
  public int getNationalPositionSaber11(){
    return nationalPositionSaber11;
  }

  /**
  * Description This method allows to change the position on "Pruebas Saber 11" of the company. <br>
  * <b>post:</b> The position on "Pruebas Saber 11" of the company is changed.
  * @param The new position on "Pruebas Saber 11" of the company.
  */
  public void setNationalPositionSaber11(int nationalPositionSaber11){
    this.nationalPositionSaber11 = nationalPositionSaber11;
  }

  /**
	* Description This method allows to get the position on "Pruebas Saber Pro" of the company. <br>
	* <b>post:</b> The position on "Pruebas Saber Pro" of the company is given.
	* @return The position on "Pruebas Saber Pro" of the company.
	*/
  public int getNationalPositionSaberPro(){
    return nationalPositionSaberPro;
  }

  /**
  * Description This method allows to change the position on "Pruebas Saber Pro" of the company. <br>
  * <b>post:</b> The position on "Pruebas Saber Pro" of the company is changed.
  * @param The new position on "Pruebas Saber Pro" of the company.
  */
  public void setNationalPositionSaberPro(int nationalPositionSaberPro){
    this.nationalPositionSaberPro = nationalPositionSaberPro;
  }

  /**
	* Description This method allows to get the rector name of the company. <br>
	* <b>post:</b> The rector name of the company is given.
	* @return The rector name of the company.
	*/
  public String getRectorName(){
    return rectorName;
  }

  /**
  * Description This method allows to change the rector name of the company. <br>
  * <b>post:</b> The rector name of the company is changed.
  * @param The new rector name of the company.
  */
  public void setRectorName(String rectorName){
    this.rectorName = rectorName;
  }

  /**
	* Description This method allows to get the educative sector of the company. <br>
	* <b>post:</b> The educative sector of the company is given.
	* @return The educative sector of the company.
	*/
  public String getEducativeSector(){
    return educativeSector;
  }

  /**
  * Description This method allows to change the educative sector of the company. <br>
  * <b>post:</b> The educative sector of the company is changed.
  * @param The new educative sector of the company.
  */
  public void setEducativeSector(String educativeSector){
    this.educativeSector = educativeSector;
  }

  /**
	* Description This method allows to get the amount of students in stratum 1 and 2 of the company. <br>
	* <b>post:</b> The amount of students in stratum 1 and 2 of the company is given.
	* @return The amount of students in stratum 1 and 2 of the company.
	*/
  public int getAmountStudentsStratum1and2(){
    return amountStudentsStratum1and2;
  }

  /**
  * Description This method allows to change the amount of students in stratum 1 and 2 of the company. <br>
  * <b>post:</b> The amount of students in stratum 1 and 2 of the company is changed.
  * @param The new amount of students in stratum 1 and 2 of the company.
  */
  public void setAmountStudentsStratum1and2(int amountStudentsStratum1and2){
    this.amountStudentsStratum1and2 = amountStudentsStratum1and2;
  }

  /**
  * Description This method allows to get the amount of active students of the company. <br>
  * <b>post:</b> The amount active students of the company is given.
  * @return The amount of active students of the company.
  */
  public int getTotalAmountActivesStudent(){
    return totalAmountActivesStudent;
  }

  /**
  * Description This method allows to change the amount of active students of the company. <br>
  * <b>post:</b> The amount of active students of the company is changed.
  * @param The new amount of active students of the company.
  */
  public void setTotalAmountActivesStudent(int totalAmountActivesStudent){
    this.totalAmountActivesStudent = totalAmountActivesStudent;
  }

  /** Description:This method allows to get the company information
  *@return Company information
  */
  public String toString(){
  String msj = "";

  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += super.toString();
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "El numero de registro es:" + numberRegistrationMEN;
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "Los años de acreditacion es:" + numberYearsAcreditation;
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "El puesto en las pruebas 11 es:" + nationalPositionSaber11;
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "El puesto de las pruebas Pro es:" + nationalPositionSaberPro;
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "El nombre del rector es:" +rectorName;
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "El sector educativo es:" + educativeSector;
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "El numero de estudiantes en estratos uno y dos son:" + amountStudentsStratum1and2;
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "El numero de total de estudiantes es:" +totalAmountActivesStudent;
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "El impuesto de procultura es:" + calculatedProCultura();
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";


  return msj;


  }

  /**
  *Description: This method allows to calculate the taxes cost
  *@return The taxes cost
  */
  public double calculatedProCultura(){
  double porcentaje = 0.0;

  porcentaje += 20 - ( amountStudentsStratum1and2/100);

  if(porcentaje < 0){

  porcentaje = 0.0;

  }

  return porcentaje;
  }

}//final
