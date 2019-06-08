package model;

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

  public Invima(String name, String nit, String addres,String phoneN, int qEmployeer, double actives, String inscriptionD, char type, String lRName, Building bu, String sanitaryRegistration, String state, String expiration, char modality){
    super(name, nit, addres, phoneN, qEmployeer, actives, inscriptionD, type, lRName, bu);
    this.sanitaryRegistration = sanitaryRegistration;
    this.state = state;
    this.expiration = expiration;
    this.modality = modality;
  }

  public String getSanitaryRegistration(){
    return sanitaryRegistration;
  }

  public void setSanitaryRegistration(String sanitaryRegistration){
    this.sanitaryRegistration = sanitaryRegistration;
  }

  public String getState(){
    return state;
  }

  public void setState(String state){
    this.state = state;
  }

  public String getExpiration(){
    return expiration;
  }

  public void setExpiration(String expiration){
    this.expiration = expiration;
  }

  public char getModality(){
  return modality;
  }

  public void setModality(char modality){
    this.modality = modality;
  }

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
