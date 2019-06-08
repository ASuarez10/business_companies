package model;
import java.util.ArrayList;

public class FoodC extends Manufacturing{

  public static final String ROOM_TEMPERATURE = "Temperatura ambiente" ;
  public static final String REFRIGERATION = "Refrigeracion";
  public static final String FREEZER = "Congelacion" ;

  private String importer;
  private String maker;
  private String conservation;

  public FoodC(String name, String nit, String addres,String phoneN, int qEmployeer, double actives, String inscriptionD, char type, String lRName, Building bu, String importer, String maker, String conservation){
  super(name, nit, addres, phoneN, qEmployeer, actives, inscriptionD, type, lRName, bu);
  this.importer = importer;
  this.maker = maker;
  this.conservation = conservation;
  }

  public String getImporter(){
    return importer;
  }

  public void setImporter(String importer){
    this.importer = importer;
  }

  public String getMaker(){
    return maker;
  }

  public void setMaker(String maker){
    this.maker = maker;
  }

  public String getConservation(){
    return conservation;
  }

  public void setConservation(String conservation){
    this.conservation = conservation;
  }

  public String toString(){
  String msj = "";

  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += super.toString();
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "El importador es:" + importer;
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "El fabricador es:" + maker;
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "La conservacion es:" + conservation;
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";

  return msj;


  }

}
