package model;
import java.util.ArrayList;

public class Manufacturing extends Company{

  //Relations

  private ArrayList<Product> products;

  //Constructor
  public Manufacturing(String name, String nit, String addres,String phoneN, int qEmployeer, double actives, String inscriptionD, char type, String lRName){
    super(name, nit, addres, phoneN, qEmployeer, actives, inscriptionD, type, lRName);
    products = new ArrayList<Product>();
  }

}//final