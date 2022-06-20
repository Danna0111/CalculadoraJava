package procesos.geometria;


	public class Circulo {
	    double radio;
	    double diametro;
	  public double perimetro;
	  public double area;
	 
		public Circulo(double radio){
			this.radio = radio;
		    this.diametro = 2*this.radio;
		   
			
			
				
		}
		public void calcularPerimetro(){
			System.out.println("El valor del radio es "+radio);
			
			this.perimetro =  2*Math.PI*this.diametro;
					
		}
		
	   public void calcularArea() {
		   System.out.println("El valor del area es: "+area);
		   
		   this.area = Math.PI *Math.sqrt(this.radio);
	   }
		 
		
	}


