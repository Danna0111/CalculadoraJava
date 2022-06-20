package procesos.aritmetica;

public class Division{
	int num1, num2, total;
	
	public Division(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void dividir(){
		System.out.println("Este es el primer valor a dividir "+this.num1);
	   System.out.println("Este es el segundo valor a dividir "+this.num2);
	   
	   this.total = this.num1/this.num2;
	   
	   
	   System.out.println("El resultado de la division es: "+this.total);
	}
	
	
	

}
