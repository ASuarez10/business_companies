package model;
import java.util.ArrayList;

public class ServiceC extends Company{

  //Relations

  private ArrayList<SSurvey> sS;

  //Constructor

  public ServiceC(String name, String nit, String addres,String phoneN, int qEmployeer, double actives, String inscriptionD, char type, String lRName, Building bu){
    super(name, nit, addres, phoneN, qEmployeer, actives, inscriptionD, type, lRName, bu);
    sS = new ArrayList<SSurvey>();
  }

  public ArrayList<SSurvey> getSS(){
    return sS;
  }

  public void setSS(ArrayList<SSurvey> sS){
    this.sS = sS;
  }

  public void addSS(ArrayList<SSurvey> client){
    sS = client;
  }

  public String getInfor(){
  String msj = "";

  for(int i = 0 ; i < sS.size();i++){

  msj += sS.get(i).toString();


  }

  return msj;

  }

  public String toString(){
  String msj = "";

  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "El nombre del comercio es:" + getName();
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "El nit es:" + getNit();
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "La direccion es:" + getAddres();
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "El numero  celular es:" + getPhoneN();
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "La cantidad de empleados es:" + getQEmployeer();
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "La cantidad de activos es:" + getActives();
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "La fecha en la que se hizo" + getInscriptionD();
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "El tipo de organizacion es:" + getType();
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "El nombre legal es:" + getLRName();
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "El promedio de las encuestas es:" + promediateOfThis();
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";

  return msj;


  }

  public String promediateOfThis(){

  String msj = "";
  int ser = 0;
  int ans = 0;
  int rela = 0;
  for(int i = 0; i < sS.size();i++){
    ser += sS.get(i).getServiceDoIt();
    ans += sS.get(i).getAnswerTime();
    rela += sS.get(i).getRelationCostXBenefit();

    msj += "El servicio hecho es:" + ser + "El tiempo de respuesta es:" + ans + "El costo de relacion por beneficio es:" + rela;
  }
  return msj;

  }

}//Final
