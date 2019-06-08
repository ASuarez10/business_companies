package model;

public class Technology extends ServiceC{

  //Constantes

  public static final char C_C = 'A';
  public static final char S_D = 'B';
  public static final char I_S = 'C';
  public static final char S_S = 'D';
  public static final char P_S = 'E';

  //Atributo

  private String service;
  private int killowatts;

  //Relaciones

  private ArrayList<char> services;

  public TechnologyCompany(String name, String nit, String addres,String phoneN, int qEmployeer, double actives, String inscriptionD, char type, String lRName, Building bu, String service, int killowatts){
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

  public String getService(){
    return service;
  }

  public void setService(String service){
    this.service = service;
  }

  public int getKillowatts(){
  	return killowatts;
  }

  public void setKillowatts(int killowatts){
  	this.killowatts = killowatts;
  }

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

  public String toString(){
  String msj = "";

  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "El servicio es:" + service;
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "Los arboles son:" + calculateTreeXKW();

  return msj;
  }
}//final
