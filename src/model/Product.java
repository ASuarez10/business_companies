package model;
import java.util.ArrayList;

public class Product{

  private String nameProduct;
  private int waterAmount;
  private long identify;
  private int numberUnities;


  public Product(String nameProduct,int waterAmount, long identify, int numberUnities){
    this.nameProduct = nameProduct;
    this.waterAmount = waterAmount;
    this.identify = identify;
    this.numberUnities = numberUnities;
  }

  /**
  * Description This method allows to get the product name. <br>
  * <b>post:</b> The product name is given.
  * @return The product name.
  */
  public String getNameProduct(){
    return nameProduct;
  }

  public void setNameProduct(String nameProduct){
    this.nameProduct = nameProduct;
  }

  /**
  * Description This method allows to get the water amount of the product fabrication. <br>
  * <b>post:</b> The water amount of the product fabrication is given.
  * @return The water amount of the product fabrication.
  */
  public int getWaterAmount(){
    return waterAmount;
  }

  public void setWaterAmount(int waterAmount){
    this.waterAmount = waterAmount;
  }

  /**
  * Description This method allows to get the identifier of the product. <br>
  * <b>post:</b> The identifier of the product is given.
  * @return The identifier of the product.
  */
  public long getIdentify(){
    return identify;
  }

  public void setIdentify(long identify){
    this.identify = identify;
  }

  /**
  * Description This method allows to get the number of unities of the product. <br>
  * <b>post:</b> The number of unities of the product is given.
  * @return The number of unities of the product.
  */
  public int getNumberUnities(){
    return numberUnities;
  }

  public void setNumerUnities(){
    this.numberUnities = numberUnities;
  }


  public String toString(){
  String msj = "";

  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "El nombre del producto es:"+ nameProduct;
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "La identificacion es:"+ identify;
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "El numero de unidades es:"+ numberUnities;
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "La cantidad de agua utilizada es:"+ waterAmount;
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";

  return msj;
  }

}//final
