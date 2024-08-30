//El codigo muestra una interaccion con el usuario, le solicita un pais para darle su capital, de no tenerlo muestra un mensaje que solicita al usuario escribir la capital de ese pais

package com.codigo7;

import java.util.HashMap;
import java.util.Scanner;

public class Codigo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in); //Impprtacion de scanner y System.in

		    HashMap<String, String> capitales = new HashMap<>(); //importacion de HashMap, y cambio en el tipo de dato

		    
			capitales.put("Canadá", "Otawwa");
		    capitales.put("Estados Unidos", "Washington DC");
		    capitales.put("México", "México DF");
		    capitales.put("Belice", "Belmopán");
		    capitales.put("Costa rica", "San José");
		    capitales.put("El Salvador","San Salvador"); //agregar el parametro de la capital
		    capitales.put("Guatemala", "Ciudad de Guatemala");
		    capitales.put("Honduras", "Tegucigalpa");
		    capitales.put("Nicaragua", "Managua");
		    capitales.put("Panamá", "Panamá");
		   
		    String c = " "; //cambio de Sting por String
		   
		    do {
		     System.out.println("Escribe el nombre de un país y te diré su capital: ");
		     System.out.print("Escribe 'salir' cuando desees terminar");
		     c = s.nextLine(); //cambio en el tipo de dato de entrada
		      
		      if (c.equals("salir")) {  //cambio equal por equals
		       break; //añadir break para cerrar la instruccion al escribir "salir"
		      }
		    	 if (capitales.containsKey(c)) { //cambio de Name por Key
		    	
		          System.out.println("La capital de " + c + " es " + capitales.get(c)); //cambio en todas las variables llamadas "ca" por "capitales"
		    	  } else {
		          System.out.print("No conozco la respuesta ¿cuál es la capital de " + c + "?: ");//eliminacion de algunas lineas de print para juntarlas en una sola
		          String ca = s.nextLine();
		          capitales.put(c, ca);
		          System.out.println("Gracias por enseñarme nuevas capitales");  
		      }
		    } while (true);//cambio de wile por while y se indica que el proceso termina hasta que c sea igual a "salir"
		     s.close(); //cerrar scanner
		     System.out.println("Fin del proceso, hasta pronto"); //Comentario agregado 
		    }
		  }


		

	


