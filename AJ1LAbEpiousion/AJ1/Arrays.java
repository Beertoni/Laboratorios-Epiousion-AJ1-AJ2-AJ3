/**
 * Classe com o objetivo de praticar arrays de tipos primitivos e reference.
 * 
 * @author Melissa
 */
class Arrays {
  /**
   * Método para que esta classe possa ser executada com o utilitário java.
   * 
   * @param args
   *          - argumentos para o método main
   */
  public static void main(String args[]) {
	String array[] = new String[3];
	array[0] = "cliente1@cliente.com.br";
	array[1] = "cliente2@cliente.com.br";
	array[2] = "cliente3@cliente.com.br";
	
	for(String cliente: array) {
		System.out.println(cliente + "");
	}

	
  }
}
