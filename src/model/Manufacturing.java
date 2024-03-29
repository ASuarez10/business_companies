package model;
import java.util.ArrayList;

public class Manufacturing extends Company{

  //Relations

  private ArrayList<Product> products;

  //Constructor
  public Manufacturing(String name, String nit, String addres,String phoneN, int qEmployeer, double actives, String inscriptionD, char type, String lRName, Building bu){
    super(name, nit, addres, phoneN, qEmployeer, actives, inscriptionD, type, lRName, bu);
    products = new ArrayList<Product>();
  }

  /**
  * Description This method allows to get the ArrayList. <br>
  * <b>post:</b> The ArrayList is given.
  * @return The ArrayList of the company.
  */
  public ArrayList<Product> getProducts(){
    return products;
  }

  /**
  * Description This method allows to change the Arraylist. <br>
  * <b>post:</b> The Arraylist is changed.
  * @param The new ArrayList.
  */
  public void setProducts(ArrayList<Product> products){
    this.products = products;
  }

  public void addProduct(ArrayList<Product> pro){

  products = pro;

  }

  /**
  * Description This method allows to get the information of the company. <br>
  * <b>post:</b> The information of the company is given.
  * @return The information of the company.
  */
  public String getInformation(){

  String msj = "";

  for(int i = 0; i < products.size();i++){
      msj += products.get(i).toString();
    }
  return msj;
  }

  /** Description:This method allows to get the company information
  *@return Company information
  */
  public String toString(){
  String msj = "";

  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "El nombre comercial es:" + getName();
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

  for(int i = 0; i < products.size();i++){

  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += products.get(i).toString();
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";

  }

  return msj;
  }

}//final
