package model;
import java.util.ArrayList;

public class ServiceC extends Company{

  //Relations

  private ArrayList<SSurvey> sS;

  //Constructor

  public ServiceC(String name, String nit, String addres,String phoneN, int qEmployeer, double actives, String inscriptionD, char type, String lRName){
    super(name, nit, addres, phoneN, qEmployeer, actives, inscriptionD, type, lRName);
    sS = new ArrayList<SSurvey>();
  }
}//Final
