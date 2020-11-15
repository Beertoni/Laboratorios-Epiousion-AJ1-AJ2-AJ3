/**
 * Classe com o objetivo de praticar a utilização de controladores de fluxo.
 * 
 * @author Globalcode
 */
class ArraysBidimensionais {
  /**
   * Método para que esta classe possa ser executada com o utilitário java.
   * 
   * @param args
   *          - argumentos para o método main
   */
  public static void main(String args[]) {
	  
	int array[][] = { { 1, 6, 7 }, { 2, 5, 1, 0 }, { 2, 4, 1, 2, 1 } };
	
		for(int i=0;i<array.length;i++) {
			System.out.println(array[0][i]);
				
		}
		System.out.println();
		
		for(int i=0;i<4;i++) {
			System.out.println(array[1][i]);
				
		}
		System.out.println();
		
		for(int i=0;i<5;i++) {
			System.out.println(array[2][i]);
				
		}

  }

}
