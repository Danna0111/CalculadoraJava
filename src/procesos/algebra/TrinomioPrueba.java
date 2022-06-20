package procesos.algebra;

import java.io.BufferedReader;

public class TrinomioPrueba{
	/*
	 * int exp1 = 3; int exp2 = 2;
	 */
	 float  div1 = 4;
	int A;
	int B;
	int C;
	/* double total; */
	
	public TrinomioPrueba(){
		
	}
		
	public TrinomioPrueba(int A, int B, int C){
		this.A = A;
		this.B = B;
		this.C = C;
		}

	


	public  double  operacion1() {
		
		System.out.println("Este es el valor de A: "+this.A);
		/* System.out.println("Este es el valor del exp1: "+this.exp1); */
		System.out.println("Este es el valor de B: "+this.B);
		/* System.out.println("Este es el valor del exp2: "+this.exp2); */
		System.out.println("Este es el valor de C: "+this.C);
		System.out.println("Este es el valor del exp3: "+this.div1);
		 
		/*
		 * double primerMonomio = (this.A)*(this.A)*(this.A);
		 * System.out.println("El resultado de primerMonomio es: "+primerMonomio);
		 * 
		 * double segundoMonomio = (this.B)*(this.B);
		 * System.out.println("El resultado de segundoMonomio es: "+segundoMonomio);
		 */
		return ((this.A)*(this.A)*(this.A)+((this.B)*(this.B))+this.C)/this.div1;   
		
		
	}
	  
	public double operacion2(){
		System.out.println("Este es el valor de A: "+this.A);
		/* System.out.println("Este es el valor del exp1: "+this.exp1); */
		System.out.println("Este es el valor de B: "+this.B);
		/*
		 * System.out.println("Este es el valor del exp2: "+this.exp2);
		 */	
		System.out.println("Este es el valor de C: "+this.C);
		System.out.println("Este es el valor del exp3: "+this.div1);
		
		
		return ((this.A)*(this.A)*(this.A)/this.div1)+((this.B)*(this.B)/this.div1)+(this.C/this.div1);
	}
		
		
		public int llenarOperacion( String mensaje, BufferedReader buffer){
			int numX = 0;
			try  {
				System.out.println(mensaje);
			 numX  = Integer.parseInt(buffer.readLine());
				
			} catch(Exception e) {
				e.printStackTrace();
				
			}
			
			return numX;
			
		
		
	}




	
    
    	
   
		
}
	

	