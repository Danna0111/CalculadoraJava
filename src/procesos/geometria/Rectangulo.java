package procesos.geometria;

public class Rectangulo {
		int numLados = 4;
		int lado;
		int base;
		public double perimetro;
		public double area;
	 
		public 	Rectangulo(int lado, int base){
			this.lado = lado;
			this.base = base;
			
				
		}
		public void calcularPerimetro(){
			System.out.println("El valor del lado es "+lado);
			
			this.perimetro = 2*(this.lado+this.base);
		
					
		}
		
	   public void calcularArea() {
		   System.out.println("El valor del lado es: "+lado);
		   
		   this.area = this.lado*this.base;
	   }
		 
		
	}

