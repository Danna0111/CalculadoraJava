package procesos.aritmetica;

public class Resta{
	int num1, num2, total;
	
	 public Resta(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
	 }
	 
	 public void restar(){
		 
		 System.out.println("Este es el primer valor a restar "+this.num1);
		 System.out.println("Este es el segundo valor a restar "+this.num2);
		 
		 this.total = this.num1-this.num2;
		 
		 System.out.println("El resultado de la resta es: " +this.total);
	 }

}
