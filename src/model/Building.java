package model;
import java.util.ArrayList;

public class Building{

  //Atributtes

  private int buildingSize;

  //Relations

  private Employee[][] cubicles;

  public void initializeMatriz(){
    for(int i = 0; i < cubicles.length; i++){
      for(int j = 0; j < cubicles[0].length; j++){
        cubicles[i][j] = new Employee("", "23" + i + j, "", "", false);
      }
    }
  }

  public Building(int buildingSize){
    this.buildingSize = buildingSize;
    cubicles = new Employee[buildingSize][20];
    initializeMatriz();
  }

  public Employee[][] getEmployee(){
  	return cubicles;
  }

  public void setEmployee(Employee[][] cubicles){
  	this.cubicles = cubicles;
  }

  public void assigTheEmploInCub(String nameEm, String positionEm, String emailEm){

  boolean t = false;
  	for(int i = 0; i < cubicles.length && !t;i++){
  		for(int k = 0; k < cubicles[0].length && !t;k++){
  			if(cubicles[i][k].getDisponibility() == false){
  				cubicles[i][k].setName(nameEm);
  				cubicles[i][k].setPosition(positionEm);
  				cubicles[i][k].setEmail(emailEm);
  				cubicles[i][k].setDisponibility(true);
  				t = true;
  			}
  		}
  	}
  }

  public String recorridoL(String nameEmpleado){
  String msj = "";
  int k = 0;
  boolean abajoL = false;

  for(int i = 0;  i < cubicles.length; i++){
      if(cubicles[i][k].getName().equals(nameEmpleado)){

        msj = "El empleado es" + cubicles[i][k].getExtension();
        }
      abajoL = true;
    }

    if(abajoL == true){
      for(int m = 1; m  < cubicles[0].length; m++){
        if(cubicles[k][m].getName().equals(nameEmpleado)){

              msj = "El empleado es" + cubicles[k][m].getExtension();
      }


    }

  }

  return msj;


  }


  public String recorridoZ(String nombreEmpleado){

  String msj = "";

  for(int i =0; i < cubicles.length; i++){
      if(cubicles[0][i].getName().equals(nombreEmpleado)){
        msj += "El empleado es" + cubicles[0][i].getExtension();
  }
  }

  for(int k = 1; k < cubicles.length;k++){
        if(cubicles[k][cubicles.length-k].getName().equals(nombreEmpleado)){
            msj += "El empleado es" + cubicles[k][cubicles.length-k].getExtension();
  }

  }

  for(int j= 1; j < cubicles.length; j++){
    if(cubicles[cubicles.length-1][j].getName().equals(nombreEmpleado)){
      msj += "El empleado es:" + cubicles[cubicles.length][j].getExtension();
    }
  }
  return msj;
  }


  public String espiralXfila(String nombreEmpleado){
  String msj ="";

  //Diagonal principal
   for(int i = 0; i < cubicles.length;i++){
  	 if(cubicles[i][i].getName().equals(nombreEmpleado)){
  		 msj += "El empleado es:" + cubicles[i][i].getExtension();
  	 }
   }

  //Diagonal Inversa
    for(int k = 0; k < cubicles.length;k++){
  	if((cubicles.length % 2 == 0) || (cubicles.length % 2 != 0 && k != cubicles.length/2)){
  		if(cubicles[k][cubicles.length-1-k].getName().equals(nombreEmpleado)){
  			msj += "El empleado es:" + cubicles[k][cubicles.length-1-k].getExtension();
  		}
  	}
    }

  return msj;
  }

  public String espiralE(String nombreEmpleado){
  String msj = "";
  int m = 0;

  for(int i = 0; i < cubicles.length;i+= 2){
  	for(int j = 0; j < cubicles.length;j++){
  		if(m % 2 == 0){
  			if(cubicles[i][j].getName().equals(nombreEmpleado)){
  			msj += "El empleado es:" + cubicles[i][j].getExtension();
  			 }
  			}else if(m % 2 != 0){
  						if(cubicles[i][cubicles.length-j-1].getName().equals(nombreEmpleado)){
  						msj += "El empleado es:" + cubicles[i][cubicles.length-j-1].getExtension();
  				}
  			}
  		}
  		if(m % 2 == 0 && i < cubicles.length-1){
  			if(cubicles[i+1][cubicles.length-1].getName().equals(nombreEmpleado)){
  				msj += "El empleado es:" + cubicles[i+1][cubicles.length-1].getExtension();
  			}
  		}else{
  			if(cubicles[i+1][0].getName().equals(nombreEmpleado)){
  				msj += "El empleado es:" + cubicles[i+1][0].getExtension();
  			}
  		}
  		m++;
  	}
  		return msj;
  }

  public String espiralO(String nombreEmpleado){
  String msj = "";

  for(int i = 0; i < cubicles.length;i++){
    if(cubicles[0][i].getName().equals(nombreEmpleado)){
      msj += "El empleado es:" + cubicles[0][i].getExtension();
    }
  }

  for(int k = cubicles[0].length-1; k > 0; k--){
    if(cubicles[cubicles.length][k].getName().equals(nombreEmpleado)){
      msj += "El empleado es:" + cubicles[cubicles.length][k].getExtension();
    }
  }

  for(int o = 0; o < cubicles.length;o++){
   if(cubicles[o][0].getName().equals(nombreEmpleado)){
     msj += "El empleado es:" +cubicles[o][0].getExtension();
   }else if(cubicles[o][cubicles.length].getName().equals(nombreEmpleado)){
     msj += "El empleado es:" +cubicles[o][cubicles.length].getExtension();
   }
  }
  return msj;

  }

  public String espiral(String cargo){

  	String msj = "";
  	int fila1 = 0;
  	int fila2 = cubicles.length-1;
  	int col1 = 0;
  	int col2 = cubicles.length-1;

  	while(fila1 < fila2 && col1 < col2){

  		for(int i = fila1; i < fila2;i++){
  			if(cubicles[i][col1].getPosition().equals(cargo)){
  				msj += "El empleado" + cubicles[i][col1].getEmail();
  			}
  		}

  		col1++;
  		for(int i = col1; i < col2;i++){
  			if(cubicles[fila2][i].getPosition().equals(cargo)){
  			}
  		}
  		fila2--;

  		for(int i = fila2; i >= fila1 ;i--){
  			if(cubicles[i][col2].getPosition().equals(cargo)){
  				msj += "El empleado" + cubicles[i][col2].getEmail();
  			}
  		}
  		col2--;

  		for(int i = col2; i >= col1;i--){
  			if(cubicles[fila1][i].getPosition().equals(cargo)){
  				msj += "El empleado " + cubicles[fila1][i].getEmail();
  			}
  		}
  		fila1++;

  	}
   return msj;
  }

}//final
