package model;
import java.util.ArrayList;

public abstract  class Company{

  public final static char A_H_S_F = 'A';
  public static final char E_M_C = 'B';
  public static final char I_M = 'C';
  public static final char E_G_S = 'D';
  public static final char CONSTRUCTION = 'E';
  public static final char COMERCY_MM  = 'F';
  public static final char T_A_C = 'G';
  public static final char S_I_C = 'H';
  public static final char S_C = 'I';

  private  String name;
  private String nit;
  private String addres;
  private String phoneN;
  private int qEmployeer;
  private double actives;
  private String inscriptionD;
  private char type;
  private String lRName;
  private Building bu;

  public Company(String name, String nit, String addres,String phoneN, int qEmployeer, double actives, String inscriptionD, char type, String lRName, Building bu){
    this.name = name;
    this.nit = nit;
    this.addres = addres;
    this.phoneN = phoneN;
    this.qEmployeer = qEmployeer;
    this.actives = actives;
    this.inscriptionD = inscriptionD;
    this.type = type;
    this.lRName = lRName;
    this.bu = bu;
  }

  public String getInscriptionD(){
    return inscriptionD;
  }

  public void setInscriptionD(String inscriptionD){
    this.inscriptionD = inscriptionD;
  }

  public String getName(){
    return name;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getNit(){
    return nit;
  }

  public void setNit(String nit){
    this.nit = nit;
  }

  public String getAddres(){
    return addres;
  }

  public void setAddres(String addres){
    this.addres = addres;
  }

  public String getPhoneN(){
    return phoneN;
  }

  public void setPhoneN(String phoneN){
    this.phoneN = phoneN;
  }

  public int getQEmployeer(){
    return qEmployeer;
  }

  public void setQEmployeer(int qEmployeer){
    this.qEmployeer = qEmployeer;
  }

  public double getActives(){
    return actives;
  }

  public void setActives(double actives){
    this.actives = actives;
  }

  public char getType(){
    return type;
  }

  public void setType(char type){
    this.type = type;
  }

  public String getLRName(){
    return lRName;
  }

  public void setLRName(String lRName){
    this.lRName = lRName;
  }

  public Building getBu(){
    return bu;
  }

  public void setBu(Building bu){
    this.bu = bu;
  }

  public abstract String toString();

}//final
