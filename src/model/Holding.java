package model;
import java.util.ArrayList;

public class Holding{

  //Relaciones

  private ArrayList<Company> companies;
  private Building bl;

  //Constructor
  public Holding(Building bl){
  companies = new ArrayList<Company>();
  }

}//final
