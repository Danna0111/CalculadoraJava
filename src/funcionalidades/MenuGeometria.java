package funcionalidades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import procesos.geometria.*;

public class MenuGeometria {
	
	

	public  void ejecutarAplicacion(){
		System.out.print("1 para Cuadrado\n2 para Rectangulo\n 3 pa triangulo\n 4 para circulo\n");
		
		  System.out.print("Seleccione una operacion: ");
  	    InputStreamReader streamReader = new InputStreamReader(System.in);
  	    BufferedReader bufferedReader = new BufferedReader(streamReader);
  	     int opcion= Menu.llenarOperacion(bufferedReader);
  	     
				
		switch(opcion) {
		
		  case 1:
			  System.out.println("Cuadrado");
			
			  int lado = Menu.llenarOperacion(bufferedReader);
			  Cuadrado cuadrado  = new Cuadrado(lado); 
			  cuadrado.calcularArea();
			  System.out.println("Este es el resultado de area: "+cuadrado.area);
			  cuadrado.calcularPerimetro();
			  System.out.println("Este es el resultado del perimetro: "+cuadrado.perimetro);
	
		    break;
		    
		  case 2:
			  System.out.println("Rectangulo");
			  int lado2 = Menu.llenarOperacion(bufferedReader);
			  int base = Menu.llenarOperacion(bufferedReader);
			  Rectangulo rectangulo = new Rectangulo(lado2, base); 
			  rectangulo.calcularArea();
			  System.out.println("Este es el resultado de area: "+rectangulo.area);
			  rectangulo.calcularPerimetro();
			  System.out.println("Este es el resultado del perimetro: "+rectangulo.perimetro);
			  
			  
		    break;
		    
		  case 3:
			  System.out.println("Triangulo");
			  int lado3 = Menu.llenarOperacion(bufferedReader);
			  int altura = Menu.llenarOperacion(bufferedReader);
			  int base2 = Menu.llenarOperacion(bufferedReader);
			  Triangulo triangulo = new Triangulo(lado3,altura, base2); 
			  triangulo.calcularArea();
			  System.out.println("Este es el resultado de area: "+triangulo.area);
			  triangulo.calcularPerimetro();
			  System.out.println("Este es el resultado del perimetro: "+triangulo.perimetro);
			  
			  
			 break;
			 
			 
		  case 4:
			  System.out.println("Circulo");
			  double radio = Menu.llenarOperacion(bufferedReader);
              Circulo circulo = new Circulo(radio); 
			  circulo.calcularArea();
			  System.out.println("Este es el resultado de area: "+circulo.area);
			  circulo.calcularPerimetro();
			  System.out.println("Este es el resultado del perimetro: "+circulo.perimetro);
		  
		  default:
			  
			  break;
			  
	}
		 

	    		   
       
	}
	    	  
	}
	