package model;

public class Building{

  //Atributtes

  private int buildingSize;

  //Relations

  private Employee[][] cubicles;

  public void initializeMatriz(){
    for(int i = 0; i < cubicles.length; i++){
      for(int j = 0; j < cubicles[0].length; j++){
        cubicles[i][j] = new Employee("", "23", i + j, "", "", false);
      }
    }
  }

}//final
