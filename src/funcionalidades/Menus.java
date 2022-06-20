package funcionalidades;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import procesos.aritmetica.*;
import procesos.geometria.*;
import procesos.algebra.*;


public class Menus {
	

	public static  void ejecutarProceso() throws IOException{
		System.out.print("1 para procesos aritmetica/n2 para procesos geometria\n3 procesos algebra\n");
       
    	   System.out.print("Seleccione un proceso: ");
    	    InputStreamReader streamReader = new InputStreamReader(System.in);
    	    BufferedReader bufferedReader = new BufferedReader(streamReader);
    	    int proceso= Menu.llenarOperacion(bufferedReader);
    	    
    	    switch(proceso) {
    		
  		  case 1:
  			  System.out.println("1");
  			System.out.println("Elegiste procesos aritmetica");
  			Menu menu = new Menu();
  			menu.ejecutarAplicacion();

  			
  		    break;
  		    
  		  case 2:
  			  System.out.println("2");
  			  System.out.println("Elegiste procesos geometria");
  			 MenuGeometria menugeometria = new MenuGeometria();
  			 menugeometria.ejecutarAplicacion();
    	    
  			 break;
  			 
  		  case 3:
  			  System.out.println("3");
  			  System.out.println("Elegiste procesos algebra");
  			  TrinomioPrueba trinomioprueba = new TrinomioPrueba();
  			  trinomioprueba.llenarOperacion("", bufferedReader);
  			  
  			 break;

}
    	    
}
}	