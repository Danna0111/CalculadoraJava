package funcionalidades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import procesos.aritmetica.*;
import procesos.geometria.Cuadrado;

public class Menu{
	
	 public boolean validarOpcion(String letter, String opcion){
		 return (opcion.equals(letter) || opcion.equals(letter.toUpperCase()))?true:false;
				 
			 
		 
		 
	 }
	public  void cicloMenu(BufferedReader reader) {
		 boolean continuidad = true; 
		do { 
		    try {
		    	
		   
		   	 this.ejecutarAplicacion();
		   	System.out.println("Deseas continuar? s/n");
			 
			 String continuar = reader.readLine();
			 if(this.validarOpcion("s", continuar)|| this.validarOpcion("n", continuar)) {
			   switch(continuar.toLowerCase()) {
			   case "s":
				   System.out.println("Regresaremos al Menu principal");
				   
				  break; 
				   
			   case "n":
				   System.out.println("Estas saliendo del sistema");
				   
				   continuidad = false;
			       }
			 }else {
				 System.out.println("Opcion invalida, debe ser 's' o 'n'");
			 }
				
			
			 }catch(IOException e) {
				 e.printStackTrace();
			 }
			 
		}while(continuidad);
		
		
	}
	
	

	public  void cicloMenus(BufferedReader reader) {
		 boolean continuidad = true; 
		do { 
			try {
			
			 Menus.ejecutarProceso();
               			
			 System.out.println("Deseas continuar? s/n");
			 
			 String continuar = reader.readLine();
			 if(this.validarOpcion("s", continuar)|| this.validarOpcion("n", continuar)) {
			   switch(continuar.toLowerCase()) {
			   case "s":
				   System.out.println("Regresaremos al Menu principal");
				   
				  break; 
				   
			   case "n":
				   System.out.println("Estas saliendo del sistema");
				   
				   continuidad = false;
			       }
			 }else {
				 System.out.println("Opcion invalida, debe ser 's' o 'n'");
			 }
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}while(continuidad);
	}
	
	


	private void ejecutarProceso() {
		// TODO Auto-generated method stub
		
	}




	private static final String suma = null;

	public  void ejecutarAplicacion() throws IOException{
		System.out.print("1 para suma\n2 para resta\n3 para multiplicacion\n4 para division\n5 para salir\n");
       
    	   System.out.print("Seleccione una operacion: ");
    	    InputStreamReader streamReader = new InputStreamReader(System.in);
    	    BufferedReader bufferedReader = new BufferedReader(streamReader);
    	    int operacion= Menu.llenarOperacion(bufferedReader);
    	    
    	    
    	   
    		switch(operacion) {
    		
  		  case 1:
  			  System.out.println("1 ");
  			System.out.println("Estas haciendo una suma");
	    	
  			  int num1 = Menu.llenarOperacion(bufferedReader);
  			 int num2 = Menu.llenarOperacion(bufferedReader);
			  Suma suma  = new Suma(num1, num2); 
			  suma.sumar();
			
			   break;
			   
			   
  		case 2:
			  System.out.println(" 2 ");
			   
			  int num3 = Menu.llenarOperacion(bufferedReader);
			 int num4 = Menu.llenarOperacion(bufferedReader);
			  Resta resta  = new Resta(num3, num4); 
			  resta.restar();
		
			   break;
			   
  		case 3:
			  System.out.println(" 3");
			  int num5 = Menu.llenarOperacion(bufferedReader);
			 int num6 = Menu.llenarOperacion(bufferedReader);
			 
			  Multiplicacion multiplicacion = new Multiplicacion(num5, num6); 
			  multiplicacion.multiplicacion();
		
			   break;
			   
  		case 4:
			  System.out.println(" 4 ");
  	    	
			  int num7 = Menu.llenarOperacion(bufferedReader);
			 int num8 = Menu.llenarOperacion(bufferedReader);
			  Division division = new Division(num7, num8); 
			  division.dividir();
		
			   break;
			   
  		case 5:
			  System.out.println(" 5 ");
			   
			  System.out.println("Estas saliendo del sistema");
       	   
       	   mensajeDespedida();
		   default:
			   break;
			   
    		}
    
         
}
	
	public static void mensajeNumero1() {
		 System.out.print("Escriba el primer numero: ");
		
	}
	public static void mensajeDespedida() {
		 System.out.print("BAY: ");
		
	}
	
	//
	
	public static int llenarOperacion(BufferedReader buffer){
		int numX = 0;
		try  {
			System.out.println("Dame un numero entero");
		 numX  = Integer.parseInt(buffer.readLine());
			
		} catch(Exception e) {
			e.printStackTrace();
			
		}
		
		return numX;
		
		
	}
	
	 

}




	



