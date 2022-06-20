package funcionalidades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import operaciones.Tarea;
import procesos.algebra.TrinomioPrueba;
import procesos.aritmetica.*;





public class Calculadora{
	
	
	
	public static void main(String args[]) throws IOException {
		//InputStreamReader streamReader = new InputStreamReader(System.in);
		//BufferedReader bufferedReader = new BufferedReader(streamReader);
		
		/*
		 * Menu menu = new Menu(); menu.cicloMenu(bufferedReader);
		 */
			
		/* System.exit(0); */
		//System.out.print("Seleccione una operacion: ");
	    InputStreamReader streamReader = new InputStreamReader(System.in);
	    BufferedReader bufferedReader = new BufferedReader(streamReader);
	    //int operacion= Menu.llenarOperacion(bufferedReader);
		  Menu menu = new Menu(); 
		  menu.cicloMenus(bufferedReader);
		 
		
//		  MenuGeometria menu = new MenuGeometria(); menu.ejecutarAplicacion();
		
			
//			  
//			  InputStreamReader streamReader = new InputStreamReader(System.in);
//			  BufferedReader bufferedReader = new BufferedReader(streamReader); int num1 =
//			  TrinomioPrueba.llenarOperacion("Recibiendo primer numero", bufferedReader);
//			  
//			   System.out.println(num1);
//			 * 
//			 * 
//			 * int num2 = TrinomioPrueba.llenarOperacion("Recibiendo segundo numero",
//			 * bufferedReader);
//			 * 
//			 * System.out.println(num2);
//			 * 
//			 * 
//			 * 
//			 * int num3 = TrinomioPrueba.llenarOperacion("Recibiendo tercer numero",
//			 * bufferedReader);
//			 * 
//			 * System.out.println(num3);
//			 * 
//			 * 
//			 * 
//			 * 
//			 * 
//			 * double resultado = 0.0;
//			 * 
//			 * TrinomioPrueba trinomio = new TrinomioPrueba(num1,num2,num3); resultado =
//			 * trinomio.operacion1();
//			 * System.out.println("El resultado de operacion1 es: "+resultado);
//			 * 
//			 * 
//			 * 
//			 * resultado = trinomio.operacion2();
//			 * System.out.println("El resultado de la opercion2 es: "+resultado);
//			 * 
//			 * System.exit(0);
//			 */
//		
		
		
		
	}
	
	
	public static void mainRespaldoTarea(String args[]){
		/*
		 * ejecutarMultiplicacion(10,5); ejecutarDivision(1000,5); ejecutarSuma(10, 5);
		 * ejecutarResta(6,7);
		 */
		
		//llenarOperacion();
		
		
		
		 Tarea operaciones = null;
		 float resultado = 0;
		 
		
		 operaciones = new Tarea(300,300,4);
		  resultado = operaciones.operacion1();
	     System.out.println("Este es el resultado de operacion1: "+resultado);
	  
	   
	    operaciones = new Tarea(400,4,50);
	     resultado =operaciones.operacion2();
	     System.out.println("Este es el resultado de operacion2: "+resultado);
	   
	   
	    operaciones =new Tarea(200,300,250);
	    resultado = operaciones.operacion3();
	   System.out.println("este es el resultado de operacion3: "+resultado);
	   
	   operaciones =new Tarea(700,400,2,3);
	    resultado = operaciones.operacion4();
	   System.out.println("este es el resultado de operacion3: "+resultado);
	   
	   
	  System.exit(0);
	  
	 
	
	
	}
	
	
	
	
	

	 	
	public static void ejecutarSuma(int num1, int num2){
 
		 //Inicializamos el objeto a sumar con los valores 6 y 7 para que este pueda procesar
		 // para ello los ponemos en el constructor de la clase suma Suma(Valor1, valor2)
	
	
		 Suma suma = new Suma(num1, num2);
		 
		 System.out.println("");
		 System.out.println("Saludos humano");
		 
		  //invocamos la funcion sumar que es uno de los metodos definidos en la clase suma
		  suma.sumar();
		  
		  
		   System.out.println("Hemos terminado, hasta luego simple mortal");
		  
		   //Salimos del programa
		  
	
	}
	
	public static void ejecutarResta(int num1, int num2){
		 
		 //Inicializamos el objeto a sumar con los valores 6 y 7 para que este pueda procesar
		 // para ello los ponemos en el constructor de la clase resta Resta(Valor1, valor2)
	
	
		 Resta resta = new Resta(num1, num2);
		 
		 System.out.println("");
		 System.out.println("Saludos humano");
		 
		  //invocamos la funcion sumar que es uno de los metodos definidos en la clase suma
		  resta.restar();
		  
		  
		   System.out.println("Hemos terminado, hasta luego simple mortal");
		  
		   //Salimos del programa
		  
	
	}
	
	
	public static void ejecutarDivision(int num1, int num2){
		 
	
		 Division division = new Division(num1, num2);
		 
		 System.out.println("");
		 System.out.println("Saludos humano");
		 
		  //invocamos la funcion sumar que es uno de los metodos definidos en la clase suma
		  division.dividir();
		  
		  
		   System.out.println("Hemos terminado, hasta luego simple mortal");
		  
		   //Salimos del programa
		  
	
	}
	
	
	public static void ejecutarMultiplicacion(int num1, int num2){
		 
		 //Inicializamos el objeto a sumar con los valores 6 y 7 para que este pueda procesar
		 // para ello los ponemos en el constructor de la clase resta Resta(Valor1, valor2)
	
	
		Multiplicacion multiplicacion = new Multiplicacion(num1, num2);
		 
		 System.out.println("");
		 System.out.println("Saludos humano");
		 
		  //invocamos la funcion sumar que es uno de los metodos definidos en la clase suma
		  multiplicacion.multiplicacion();
		  
		  
		   System.out.println("Hemos terminado, hasta luego simple mortal");
		  
		   //Salimos del programa
		  
	
	}
	
}


