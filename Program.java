	public class Program {
	  
	    public static void main(String[] args) {

	  	System.out.println("exemplo 01: lendo as variaveis depois do codigo rodar");
  		
	  	int x=0, y=0;
    	x++;
  		++y;
   		System.out.printf("x: %d%ny: %d%n", x, y);
         
		  System.out.println("exemplo 02: lendo as variaveis no instante da leitura");		

		  int b=0, c=0;

		  System.out.printf("b: %d\nc: %d%n", b++, ++c);

		  System.out.println("exemplo 03: depois fica:");

	  	System.out.printf("b: %d%nc: %d%n", b, c);
   
	    }
	}
