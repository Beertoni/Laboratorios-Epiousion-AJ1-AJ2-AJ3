/**
 * Classe com o objetivo de praticar a utilização de controladores de fluxo.
 * 
 * @author Globalcode
 */
class ControleFluxoWhileOpcional {
  /**
   * Método para que esta classe possa ser executada com o utilitário java.
   * 
   * @param args
   *          - argumentos para o método main
   */
  public static void main(String[] args) {
	  
	  int n1 = 100;
	  
	  while(n1<=200) {
		  if(n1%2==0) {
			  System.out.println(n1 + " � divisivel por 2!");
			  if(n1%3==0) {
				  System.out.println(n1 + " � divisivel por 3!");
			  }
			  	if(n1%2==0 && n1%3==0) {
			  		System.out.println(n1 + " � divisivel por 2 e 3!");
			  	}
			  
		  }

		  n1++;
	  }
	 
		  
	  
  }
}
