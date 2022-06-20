package estadistica;
import java.util.Scanner;

public class OperacionesBasicas{
	
	
	double result=0;
    public int nElementos; 
    private double [] conjunto;
    
        public static void main(String[] args){
		
        	Scanner entrada = new Scanner(System.in);
        	int nElementos;
			int i;
        	System.out.println("Ingresa el numero de digitos");
			nElementos = entrada.nextInt();
			
		
		}
			
    public double promedio() {
    		int n= conjunto.length;
            for (int i=0; i<n;i++){
                result=result+conjunto[i];
            }
            System.out.println("El promedio es"+ (float)(result/n));
        
    	
    	return result;
    	
    	 
    }
    
    public void setNElementos(int nElementos) {
    	this.nElementos = nElementos;
    }
	
    public int getNElementos() {
    	return this.nElementos;
    }
    
    public void setConjunto(double[] conjunto) {
    	this.conjunto =  conjunto;
    }
    
   public double[] getConjunto() {
	   return this.conjunto;
	   
   }
}