
public class Fluxo {

	    public static void main(String[] args) {
	        System.out.println("Ini do main");
	        try{
	        	metodo1();
	        } catch(Exception ex) { //captura todas as exececoes que podem acontecer
	        	String msg = ex.getMessage();
            	System.out.println("Exception " + msg);
	        	ex.printStackTrace();
            }
	        
	        System.out.println("Fim do main");
	    }

	    private static void metodo1() {
	        System.out.println("Ini do metodo1");
	        metodo2(); 
	        System.out.println("Fim do metodo1");
	    }

	    private static void metodo2() {
	        System.out.println("Ini do metodo2");
	        
	        throw new MinhaException("deu erro"); //só funciona com excessões 
	        
	        //System.out.println("Fim do metodo2");
	    
	    }	    
	    
}


