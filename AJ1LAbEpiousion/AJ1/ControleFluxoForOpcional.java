/**
 * Classe com o objetivo de praticar a utilização de controladores de fluxo.
 * 
 * @author Globalcode
 */
class ControleFluxoForOpcional {
  /**
   * Método para que esta classe possa ser executada com o utilitário java.
   * 
   * @param args
   *          - argumentos para o método main
   */
  public static void main(String[] args) {
	  int n1 = 100;
	  
	  for(int i=0;n1<=200;i++) {
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
