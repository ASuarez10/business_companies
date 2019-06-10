package model;
import java.util.ArrayList;

public class PService extends ServiceC{

  public static final String SAWAGE_SYSTEM = "Alcantarillado" ;
  public static final String ENERGY = "Energia" ;
  public static final String AQUEDUCT ="Acueducto" ;

  private String servicePublic;
  private int suscriptorsTotally;
  private int suscriptorsOneAndTwo;

  public PService(String nameComercy,String nit, String addres,String phoneContact, int employeerCant, double amountActives, String dateOfInscription, char typeOrganization, String legalName,Building build,String servicePublic,int suscriptorsTotally, int suscriptorsOneAndTwo){

  super(nameComercy,nit,addres,phoneContact,employeerCant,amountActives,dateOfInscription,typeOrganization,legalName,build);
  this.servicePublic = servicePublic;
  this.suscriptorsTotally = suscriptorsTotally;
  this.suscriptorsOneAndTwo = suscriptorsOneAndTwo;

  }

  /**
	* Description This method allows to get the type of service of the company. <br>
	* <b>post:</b> The type of service of the company is given.
	* @return The type of service of the company.
	*/
  public String getServicePublic(){
    return servicePublic;
  }

  /**
  * Description This method allows to change the type of service of the company. <br>
  * <b>post:</b> The type of service of the company is changed.
  * @param The new type of service of the company.
  */
  public void setServicePublic(String servicePublic){
    this.servicePublic = servicePublic;
  }

  /**
	* Description This method allows to get the amount of subscribers of the company. <br>
	* <b>post:</b> The amount of subscribers of the company is given.
	* @return The amount of subscriberse of the company.
	*/
  public int getSuscriptorsTotally(){
    return suscriptorsTotally;
  }

  /**
  * Description This method allows to change the amount of subscribers of the company. <br>
  * <b>post:</b> The amount of subscribers of the company is changed.
  * @param The new amount of subscribers of the company.
  */
  public void setSuscriptorsTotally(int suscriptorsTotally){
    this.suscriptorsTotally = suscriptorsTotally;
  }

  /**
	* Description This method allows to get the amount of subscribers in stratum 1 and 2 of the company. <br>
	* <b>post:</b> The amount of subscribers in stratum 1 and 2 of the company is given.
	* @return The amount of subscriberse in stratum 1 and 2 of the company.
	*/
  public int getSuscriptorsOneAndTwo(){
    return suscriptorsOneAndTwo;
  }

  /**
  * Description This method allows to change the amount of subscribers in stratum 1 and 2 of the company. <br>
  * <b>post:</b> The amount of subscribers in stratum 1 and 2 of the company is changed.
  * @param The new amount of subscribers in stratum 1 and 2 of the company.
  */
  public void setSuscriptorsOneAndTwo(int suscriptorsOneAndTwo){
    this.suscriptorsOneAndTwo = suscriptorsOneAndTwo;
  }

  /** Description:This method allows to get the company information
  *@return Company information
  */
  public String toString(){
  String msj = "";

  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += super.toString();
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "El servicio publico es:" + servicePublic;
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "El total de suscriptores es:" + suscriptorsTotally;
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "La cantidad de suscriptores uno y dos es:" +suscriptorsOneAndTwo;
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "El impuesto proCultura es:" + calculatedProCultura();
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";

  return msj;
  }

  /**
  *Description: This method allows to calculate the taxes cost
  *@return The taxes cost
  */
  public double calculatedProCultura(){

    double porProCultura = 0.0;

    porProCultura += 40 - (suscriptorsTotally/100);

    if(porProCultura < 0){
      porProCultura = 0.0;
    }

    return porProCultura;
  }
}
