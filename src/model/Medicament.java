package model;
import java.util.ArrayList;

public class Medicament extends Manufacturing{

  public static final char FABRICATION_EXPO = 'X';
  public static final char FABRICATION_SELL = 'Y';
  public static final char IMPORT_SELL = 'Z';
  public static final String VALID = "Vigente";
  public static final String NORENEWED = "No renovado";

  private String sanitaryRegistration;
  private String state;
  private String expiration;
  private char modality;

  public Medicament(String name, String nit, String addres,String phoneN, int qEmployeer, double actives, String inscriptionD, char type, String lRName, Building bu, String sanitaryRegistration, String state, String expiration, char modality){
    super(name, nit, addres, phoneN, qEmployeer, actives, inscriptionD, type, lRName, bu);
    this.sanitaryRegistration = sanitaryRegistration;
    this.state = state;
    this.expiration = expiration;
    this.modality = modality;
  }

  /**
  * Description This method allows to get the sanitary registration of the company. <br>
  * <b>post:</b> The sanitary registration of the company is given.
  * @return The sanitary registration of the company.
  */
  public String getSanitaryRegistration(){
    return sanitaryRegistration;
  }

  /**
  * Description This method allows to change the sanitary registration of the company. <br>
  * <b>post:</b> The sanitary registration of the company is changed.
  * @param The new sanitary registration of the company.
  */
  public void setSanitaryRegistration(String sanitaryRegistration){
    this.sanitaryRegistration = sanitaryRegistration;
  }

  /**
  * Description This method allows to get the state of the company. <br>
  * <b>post:</b> The state of the company is given.
  * @return The state of the company.
  */
  public String getState(){
    return state;
  }

  /**
  * Description This method allows to change the state of the company. <br>
  * <b>post:</b> The state of the company is changed.
  * @param The new state of the company.
  */
  public void setState(String state){
    this.state = state;
  }

  /**
  * Description This method allows to get the expiration of the company. <br>
  * <b>post:</b> The expiration of the company is given.
  * @return The expiration of the company.
  */
  public String getExpiration(){
    return expiration;
  }

  /**
  * Description This method allows to change the expiration of the company. <br>
  * <b>post:</b> The expiration of the company is changed.
  * @param The new expiration of the company.
  */
  public void setExpiration(String expiration){
    this.expiration = expiration;
  }

  /**
  * Description This method allows to get the modality of the company. <br>
  * <b>post:</b> The modality of the company is given.
  * @return The modality of the company.
  */
  public char getModality(){
  return modality;
  }

  /**
  * Description This method allows to change the modality of the company. <br>
  * <b>post:</b> The modality of the company is changed.
  * @param The new modality of the company.
  */
  public void setModality(char modality){
    this.modality = modality;
  }

  /** Description:This method allows to get the company information
  *@return Company information
  */
  public String toString(){
  String msj = "";

  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += super.toString();
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "El registro sanitario es:" + sanitaryRegistration;
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "El estado es:" + state;
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "La fecha de expiracion es:" + expiration;
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "La modalidad es:" + modality;
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "Los arboles a sembrar son:" + calculateTreeX();

  return msj;
  }

  /**
  *Description: This method allows to calculate the trees amount to plant
  *@return The trees amount to plant
  */
  public int calculateTreeX(){

  int treesToPlant = 0;

  for(int i = 0; i < getProducts().size(); i++){
    Product m = getProducts().get(i);
    if(m.getWaterAmount() > 1 && m.getWaterAmount()  < 140){

      treesToPlant = 6;

    }else if(m.getWaterAmount()  >41&& m.getWaterAmount()  < 800){

        treesToPlant = 25;

      }else if(m.getWaterAmount() >800){

            treesToPlant = 200;

          }
        }

  return treesToPlant;

  }
}//final
