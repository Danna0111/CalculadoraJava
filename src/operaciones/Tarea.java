package operaciones;

public class Tarea{
	int num1;
	int num2;
	int num3;
	int num4;
	float total;
	
	
	public Tarea(int num1, int num2, int num3){
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}
	
	public Tarea (int num1, int num2, int num3, int num4) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.num4 = num4;
	}
	

	public float operacion1() {
			
			System.out.println("este es el primer valor a sumar: "+this.num1);
			System.out.println("Y el segundo valor: "+this.num2);
			System.out.println("Y el tercer valor a multiplicar: "+this.num3);
			
			this.total = this.num1+this.num2*this.num3;
			
		return this.total ;
	}
		
	public float operacion2() {
		
		System.out.println("Este es el primer valor a dividir "+this.num1);
		System.out.println("y el segundo valor: "+this.num2);
		System.out.println("Y el tercer valor a restar "+this.num3);
		
		this.total = this.num1/this.num2-this.num3;
		
	return this.total ;
}
	
	public float operacion3() {
		
		System.out.println("este es el primer valor a sumar: "+this.num1);
		System.out.println("y el segundo valor "+this.num2);
		System.out.println("y el tercer valor a restar: "+this.num3);
		
		this.total = this.num1+this.num2-this.num3;
		
		return this.total;
	
	}
	
public float operacion4() {
		
		System.out.println("este es el primer valor a restar: "+this.num1);
		System.out.println("y el segundo valor "+this.num2);
		System.out.println("y el tercer valor a dividir: "+this.num3);
		System.out.println("y el cuarto valor a multiplicar "+this.num4);
		
		this.total = this.num1-this.num2/this.num3*this.num4;
		
		return this.total;
	
	}
	

	
}



