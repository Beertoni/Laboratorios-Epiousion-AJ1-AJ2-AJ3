/**
 * Classe com o objetivo de praticar arrays de tipos primitivos e reference.
 * 
 * @author Melissa
 */
class ParametrosMain {
  /**
   * Método para que esta classe possa ser executada com o utilitário java.
   * 
   * @param args
   *          - argumentos para o método main
   */
  public static void main(String[] args) {
	String nome = "Joao Victor";
	String dataNascimento = "26/09/99";
	String idade = " de idade 21 anos";
	String rg = "12.180.042-2";
	String salario = "900R$";
	String sexo = "Masculino";
	String textNome = "O(a) Senhor(a) ";
	String textNasc = ", nascido(a) em " + dataNascimento;
	String textRg = " portador(a)do rg de numero " + rg + ", \n";
	String textSexo = " do sexo " + sexo;
	String textTrabalho = ", est�o registrado(a) com o salario de R$ " + salario
	    + ".";
	
	if(nome!=null&&dataNascimento!=null&&rg!=null&&sexo!=null&&salario!=null) {
		System.out.println(nome + " nascido em:" + dataNascimento + ", portador do rg: " + rg + ", do sexo: " + sexo + " tem o salario de " + salario);
		
		
	}else {
		System.out.println("A maneira de executar a classe deve conter valores em NOME/DATANASCIMENTO/RG/SEXO/SALARIO!");
	}
	
  }
}
