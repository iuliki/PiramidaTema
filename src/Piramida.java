
public class Piramida {
	private int n;

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
    public Piramida(int n) 
	{
		this.n=n;
		
	}
    
    public void print() {
    	
    	
    	
    	for(int i=1;i<=n;i++)
    	{  
    		 /*for( int j=0;j<(i-1);j++)
    		{ 
                   
    	            System.out.print(" ");
    		}
    		*/
    		
    		for( int j=0;j<((n-i+1));j++)
    		{
    			System.out.print(i);
    		}	
    		
    		
    		System.out.println();
    	      
    	}
    	
   }
   
	public static void main(String[] args) {
	     
		Piramida p= new Piramida(4);
		p.print();
	}


}
