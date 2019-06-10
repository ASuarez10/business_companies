package model;
import java.util.ArrayList;

public class Holding{

  //Relaciones

  private ArrayList<Company> companies;
  private Building bl;

  //Constructor
  public Holding(Building bl){
  companies = new ArrayList<Company>();
  this.bl = bl;
  }

  /**
	* Description This method allows to get all the building. <br>
	* <b>post:</b> The building is given.
	* @return The object.
	*/
  public Building getBl(){
    return bl;
  }

  /** Description: This method allows to show the travel in E
  *@param nombre3 Company name
  *@param nombreEmpleado Employee name
  *@return Building info
  */
  public String sE(String nombre3,String nombreEmpleado){
    String msj = "";

    for(int i = 0; i < companies.size();i++){
      if(companies.get(i).getName().equals(nombre3)){

        msj += companies.get(i).getBu().enE(nombreEmpleado);

      }
    }
    return msj;
  }

  /**
	* Description This method allows to change the building. <br>
	* <b>post:</b> The building is changed.
	* @param The new building.
	*/
  public void setBl(Building bl){
    this.bl = bl;
  }

  public void addCompany(Company m){

    companies.add(m);

  }

  public String showInfo(){
  String msj = "";

  for(int i = 0; i < companies.size(); i++){

  msj += companies.get(i).toString();

  }
  return msj;
  }

  /**
	* Description This method allows to add products. <br>
	* <b>post:</b> Products were added.
	* @param k Company.
  * @param l Products.
	*/
  public void addCP(Company k,ArrayList<Product> l){

    companies.add(k);
    ((Manufacturing) k).addProduct(l);

  }

  /**
	* Description This method allows to add surveys. <br>
	* <b>post:</b> Surveys were added.
	* @param k Company.
  * @param l The polls.
	*/
  public void addCSS(Company k, ArrayList<SSurvey> SSurveys){

  companies.add(k);
  ((ServiceC)k).addSS(SSurveys);


  }

  /**
	* Description This method allows to get the names of the companies. <br>
	* @return The names of the companies.
	*/

  public String getCNames(){
    String msj = "";

  	for(int i = 0; i < companies.size();i++){

      	if(companies.get(i) instanceof ServiceC){

          msj += companies.get(i).getName();

        }
    }
  return msj;
  }

  /** Description: This method allows to show the travel in espiral
  *@param nombre3 Company name
  *@param nombreEmpleado Employee name
  *@return Building info
  */
  public String sEspiral(String nombre3,String cargo1){
    String msj = "";

    for(int i = 0; i < companies.size();i++){
      if(companies.get(i).getName().equals(nombre3)){

        msj += companies.get(i).getBu().espiral(cargo1);

      }
    }
    return msj;
  }

  public String getCP(String nombre){
  String msj = "";

  for(int i = 0; i < companies.size();i++){

  if(companies.get(i) instanceof Manufacturing){

    if(companies.get(i).getName().equals(nombre)){

  msj += ((Manufacturing)companies.get(i)).getInformation();

  }
  }


  }
  return msj;
  }

  /** Description: This method allows to show the travel in O
  *@param nombre3 Company name
  *@param nombreEmpleado Employee name
  *@return Building info
  */
  public String sO(String nombre3,String nombreEmpleado){
    String msj = "";

    for(int i = 0; i < companies.size();i++){
      if(companies.get(i).getName().equals(nombre3)){

        msj += companies.get(i).getBu().enEO(nombreEmpleado);

      }
    }
    return msj;
  }

  public String getCSS(String nombre1){
  String msj = "";

  for(int i = 0; i < companies.size();i++){

  if(companies.get(i) instanceof ServiceC){
    if(companies.get(i).getName().equals(nombre1)){

      msj += ((ServiceC) companies.get(i)).getInfor();

    }

  }

  }

  return msj;

  }

  public ArrayList<Product> getPC(String nombre){

  ArrayList<Product> m = null;

    for(int i = 0; i < companies.size();i++){

  if(companies.get(i) instanceof Manufacturing){

    if(companies.get(i).getName().equals(nombre)){


      m =  ((Manufacturing)companies.get(i)).getProducts();

  }

    }
  }
  return m;
  }

  /** Description: This method allows to show the travel in X
  *@param nombre3 Company name
  *@param nombreEmpleado Employee name
  *@return Building info
  */
  public String sX(String nombre3,String nombreEmpleado){
    String msj = "";

    for(int i = 0; i < companies.size();i++){
      if(companies.get(i).getName().equals(nombre3)){

      msj += companies.get(i).getBu().enX(nombreEmpleado);

      }
    }
    return msj;
  }

  public ArrayList<SSurvey> getSSurveysWithCompany(String nombre1){

  ArrayList<SSurvey> k = null;

  for(int i = 0; i < companies.size();i++){

  if(companies.get(i) instanceof ServiceC){
    if(companies.get(i).getName().equals(nombre1)){

      k = ((ServiceC)companies.get(i)).getSS();

    }

  }

  }

  return k;

  }

  /**
  *Description: This method allows to add a employeer to a cubicle
  *@param nameCom The name of the company
  *@param nameEm The name of the employeer
  *@param positionEm the employee position
  *@param emailEm The employeer email
  *<b>post:</b> The phone number of the company is given.
  */
  public void addEmployeerToCubicules(String nameCom,String nameEm,String positionEm,String emailEm){

  for(int i = 0; i < companies.size();i++){
    if(nameCom.equals(companies.get(i).getName())){
      if(companies.get(i).getBu().getEmployee() !=null){
        companies.get(i).getBu().assigTheEmploInCub(nameEm,positionEm,emailEm);
      }
    }
  }

  }

  public void addBC(String nameCom,Building numberPisos){

  for(int i = 0; i < companies.size();i++){
    if(companies.get(i).getName().equals(nameCom)){
      if(companies.get(i).getBu().getEmployee() == null){
          companies.get(i).setBu(numberPisos);
      }
    }
  }
  }

  /** Description: This method allows to show the travel in L
  *@param nombre3 Company name
  *@param nombreEmpleado Employee name
  *@return Building info
  */
  public String sL(String nombre3,String nombreEmpleado){
    String msj = "";

    for(int i = 0; i < companies.size();i++){
      if(companies.get(i).getName().equals(nombre3)){

        msj += companies.get(i).getBu().enL(nombreEmpleado);

      }
    }
    return msj;
  }

  /** Description: This method allows to show the travel in Z
  *@param nombre3 Company name
  *@param nombreEmpleado Employee name
  *@return Building info
  */
  public String sZ(String nombre3,String nombreEmpleado){
    String msj = "";

    for(int i = 0; i < companies.size();i++){
      if(companies.get(i).getName().equals(nombre3)){

        msj += companies.get(i).getBu().enZ(nombreEmpleado);

      }
    }
    return msj;
  }

}//final
