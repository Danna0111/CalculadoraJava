package procesos.aritmetica;

//Esta clase Suma nos permite llevar a cabo los procesos
//ojo, esta fuera de la clase MiPrimerApp y es publica

public class Suma{
	
	  // Las propiedades del "Suma" para que el proceso pueda funcionar, en este caso son variables de tipo entero
	  // para almacenar el primer y segundo numero a sumar y el resultado del proceso
	
	  int num1, num2, total;
	  
	   // Constuctor para la clase Suma, sirve para inicializar un objeto de tipo suma
	   // esto es programacion orientada a objetos, la clase suma por medio del constuctor nos permite
	   // trabajar con los objetos de tipo suma accediendo a sus propiedades (los valores declarados arriba)
	   //y sus metodos.
	   //Dbes notar que el constructor es a su vez una funcion que recibe dos parametros el num1 y num2, que nos serviran para establecer
	   // los valores de esas propiedades al construir un nuevo objeto suma
	  
	 public Suma(int num1, int num2){
		  
		  //El uso de la palabra "this" seguida de un punto es para hacer referencia a la propiedad de este objeto, o sea para nuestro caso
		 
		  //"este objeto suma"(this) en la propiedad num1
		  this.num1 = num1;    
		  
		   //"este objeto suma"(this) en la propiedad num1
		   this.num2 = num2;
		   
	  }
	  
	     // Esto es una funcion o metodo de los objetos de clase suma, invocando esta funcion la suma
	     // usando los parametros definidos en el objeto de clase suma cuando este es construido
	  
	  
	    public void sumar() {
	      
	    	  //Mostramos los valores a sumar 
	    	
         System.out.println("Vamos a sumar el numero: "+this.num1);
         System.out.println("Y el numero: "+num2);
	    	
         
         //Sumamos
         
         this.total = this.num1 + this.num2;
         
          System.out.println("El resultado de la suma es: "+this.total);
         		 
	    	
	   }
	  
}
