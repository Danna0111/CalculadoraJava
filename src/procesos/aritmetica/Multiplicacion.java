package procesos.aritmetica;

public class Multiplicacion {
	int num1, num2, total;
	
	public Multiplicacion(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
		
		
	}

	public void multiplicacion(){
		
		System.out.println("este es el primer valor a multiplicar "+this.num1);
		System.out.println("este es el segundo valor a multiplicar "+this.num2);
		
		this.total = this.num1*this.num2;
		
      System.out.println("El resultado de la multiplicacion es: "+ this.total);
      
		
	}
	
	
}
