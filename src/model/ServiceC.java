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

  /**
	* Description This method allows to get all the ArrayList. <br>
	* <b>post:</b> The ArrayList is given.
	* @return The ArrayList.
	*/
  public ArrayList<SSurvey> getSS(){
    return sS;
  }

  /** Description: el promedio en general
  *@return int la relacion costo por beneficio
  */
  public int p3(){
    int rela = 0;
    for(int i = 0; i < sS.size();i++){
      rela += sS.get(i).getRelationCostXBenefit();
    }
    return rela;
  }

  /**
  * Description This method allows to change all the ArrayList. <br>
  * <b>post:</b> The Arraylist is changed.
  * @param The new ArrayList.
  */
  public void setSS(ArrayList<SSurvey> sS){
    this.sS = sS;
  }

  public void addSS(ArrayList<SSurvey> client){
    sS = client;
  }

  /** Description: el promedio final sobre 50
  *@return int el promedio
  */
  public int p5(){
    int finalPolls1 = 0;

    finalPolls1 = (p1() + p2() + p3()) / 50;

    return finalPolls1;
  }

  /**
	* Description This method allows to get the info of the service surveys. <br>
	* <b>post:</b> The info of the service surveys is given.
	* @return The info of the service surveys.
	*/
  public String getInfor(){
  String msj = "";

  for(int i = 0 ; i < sS.size();i++){

  msj += sS.get(i).toString();


  }
  return msj;
  }

  /** Description:This method allows to get the company information
  *@return Company information
  */
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
  msj += "El promedio de las encuestas es:" + p1();
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";

  return msj;


  }

  /** Description: el promedio en general
  *@return int el servicio
  */
  public int p1(){

    int ser = 0;
    for(int i = 0; i < sS.size();i++){
      ser += sS.get(i).getServiceDoIt();

    }
    return ser;
  }


  /** Description: el promedio en general
  *@return int el tiempo de respuesta
  */
  public int p2(){
  int ans = 0;
  for(int i = 0; i < sS.size();i++){
    ans += sS.get(i).getAnswerTime();

  }
  return ans;
  }


  /** Description: el promedio final sobre 10
  *@return int el promedio
  */
  public int p4(){
    int finalPolls = 0;

    finalPolls = (p1() + p2() + p3()) / 10;

    return finalPolls;
  }

}//Final
