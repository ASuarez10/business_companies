package model;
import java.util.ArrayList;

public class Technology extends ServiceC{

  //Constantes

  public static final String C_C = "Consultoria";
  public static final String S_D = "Desarrollo sofware";
  public static final String I_S = "Servicio infraestructura";
  public static final String S_S = "Servicio sofware";
  public static final String P_S = "Servicio plataforma";

  //Atributo

  private String service;
  private int killowatts;

  //Relaciones

  private ArrayList<String> services;

  public Technology(String name, String nit, String addres,String phoneN, int qEmployeer, double actives, String inscriptionD, char type, String lRName, Building bu, String service, int killowatts){
    super(name, nit, addres, phoneN, qEmployeer, actives, inscriptionD, type, lRName, bu);
  	this.service = service;
  	this.killowatts = killowatts;
  	services = new ArrayList<String>();
  	services.add(C_C);
  	services.add(S_D);
  	services.add(I_S);
  	services.add(S_S);
  	services.add(P_S);
  }

  /**
	* Description This method allows to get the type of service of the company. <br>
	* <b>post:</b> The type of service of the company is given.
	* @return The type of service of the company.
	*/
  public String getService(){
    return service;
  }

  /**
  * Description This method allows to change the service of the company. <br>
  * <b>post:</b> The service of the company is changed.
  * @param The new service of the company.
  */
  public void setService(String service){
    this.service = service;
  }

  /**
	* Description This method allows to get the killowatts consumption of the company. <br>
	* <b>post:</b> The killowatts consumption of the company is given.
	* @return The killowatts consumption of the company.
	*/
  public int getKillowatts(){
  	return killowatts;
  }

  /**
  * Description This method allows to change the killowatts consumption of the company. <br>
  * <b>post:</b> The killowatts consumption of the company is changed.
  * @param The new killowatts consumption of the company.
  */
  public void setKillowatts(int killowatts){
  	this.killowatts = killowatts;
  }

  /**
  *Description: This method allows to calculate the trees amount to plant
  *@return The trees amount to plant
  */
  public int calculateTreeXKW(){

    int treesToPlant = 0;

    if(killowatts > 1 && killowatts < 1000){

      treesToPlant = 8;

    }else if(killowatts > 1001 && killowatts < 3000){

        treesToPlant = 35;

      }else if(killowatts > 3000){

            treesToPlant = 500;

          }

  return treesToPlant;

  }

  /** Description:This method allows to get the company information
  *@return Company information
  */
  public String toString(){
  String msj = "";

  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "El servicio es:" + service;
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "Los arboles a sembrar son:" + calculateTreeXKW();

  return msj;
  }
}//final
