package procesos.geometria;

public class Triangulo {
	int numLados = 3;
	int lado;
	int altura;
	int base;
	public double perimetro;
	public double area;
 
	public 	Triangulo (int lado, int base, int altura){
		this.lado = lado;
		this.base = base;
		this.altura = altura;
		
		
			
	}
	public void calcularPerimetro(){
		System.out.println("El valor del lado es "+lado);
		
		this.perimetro = this.lado*this.numLados;
	
				
	}
	
   public void calcularArea() {
	   System.out.println("El valor del lado es: "+lado);
	   
	   this.area = (this.base*this.altura)/2;
   }
	 
	
}

