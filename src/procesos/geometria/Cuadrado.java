package procesos.geometria;

public class Cuadrado {
	int numLados = 4;
	int lado;
	public double perimetro;
	public double area;
 
	public 	Cuadrado(int lado){
		this.lado = lado;
		
			
	}
	public void calcularPerimetro(){
		System.out.println("El valor del lado es "+lado);
		
		this.perimetro = this.lado*this.numLados;
				
	}
	
   public void calcularArea() {
	   System.out.println("El valor del lado es: "+lado);
	   
	   this.area = this.lado*this.lado;
   }
	 
	
}

