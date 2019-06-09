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


  public void addCompanyProducts(Company k,ArrayList<Product> l){

    companies.add(k);
    ((Manufacturing) k).addProduct(l);


  }

  public void addCompanyWithSSurveys(Company k, ArrayList<SSurvey> SSurveys){

  companies.add(k);
  ((ServiceC)k).addSS(SSurveys);


  }

  public String getCompaniesNames(){
    String msj = "";

  	for(int i = 0; i < companies.size();i++){

      	if(companies.get(i) instanceof ServiceC){

          msj += companies.get(i).getName();

        }


    }

  return msj;

  }

  public String getCompanyWithProducts(String nombre){
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

  public String getCompanyWithSSurveys(String nombre1){
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

  public ArrayList<Product> getProductWithCompany(String nombre){

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

  public void addEmployeerToCubicules(String nameCom,String nameEm,String positionEm,String emailEm){

  for(int i = 0; i < companies.size();i++){
    if(nameCom.equals(companies.get(i).getName())){
      if(companies.get(i).getBu().getEmployee() !=null){
        companies.get(i).getBu().assigTheEmploInCub(nameEm,positionEm,emailEm);
      }
    }
  }

  }

  public void addBuildingToCompany(String nameCom,Building numberPisos){

  for(int i = 0; i < companies.size();i++){
    if(companies.get(i).getName().equals(nameCom)){
      if(companies.get(i).getBu().getEmployee() == null){
          companies.get(i).setBu(numberPisos);
      }
    }

  }

  }

  public String showBuildingL(String nombre3,String nombreEmpleado){
  String msj = "";

  for(int i = 0; i < companies.size();i++){
  if(companies.get(i).getName().equals(nombre3)){

  msj += companies.get(i).getBu().recorridoL(nombreEmpleado);

  }

  }
  return msj;
  }

  public String showBuildingZ(String nombre3,String nombreEmpleado){
  String msj = "";

  for(int i = 0; i < companies.size();i++){
  if(companies.get(i).getName().equals(nombre3)){

  msj += companies.get(i).getBu().recorridoZ(nombreEmpleado);

  }

  }
  return msj;
  }

  public String showBuildingEspiral(String nombre3,String cargo1){
  String msj = "";

  for(int i = 0; i < companies.size();i++){
  if(companies.get(i).getName().equals(nombre3)){

  msj += companies.get(i).getBu().espiral(cargo1);

  }

  }
  return msj;
  }

  public String showBuildingE(String nombre3,String nombreEmpleado){
  String msj = "";

  for(int i = 0; i < companies.size();i++){
  if(companies.get(i).getName().equals(nombre3)){

  msj += companies.get(i).getBu().espiralE(nombreEmpleado);

  }

  }
  return msj;
  }

}//final
