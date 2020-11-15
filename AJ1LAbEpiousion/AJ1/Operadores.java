/**
 * Classe com o objetivo de praticar a utiliza√ß√£o dos operadores com tipos
 * primitivos.
 * 
 * @author Melissa
 */
public class Operadores {
  /**
   * M√©todo para que esta classe possa ser executada com o utilit√°rio java.
   * 
   * @param args
   *          - argumentos para o m√©todo main
   */
  public static void main(String[] args) {
	String nome = "Carolina Pereira";
	int idade = 20;
	String rg = "34.654.789-9";
	char sexo = 'F';
	double salario = 1500.0;
	int anoAtual = 2020;
	double aliquota = 0.20f;
	int anoNascimento = 2000;
	String sexoPorExtenso = "Feminino";
	double impostoDevido = 75f;
	System.out.print("O(a) Senhor(a) " + nome + ", nascido(a) no ano de ");
	System.out.println(anoNascimento + ", portador(a) do RG de numero " + rg);
	System.out.print(", do sexo " + sexoPorExtenso);
	System.out.print(", est· registrado(a) com o sal·rio de R$ " + salario);
	System.out.println(" e pagara R$ " + impostoDevido + " de imposto.");
	System.out.println("\nInformaÁıes reduzidas : ");
	System.out.println("Idade : " + idade + "\nSexo: " + sexo + "\nAno atual: " + anoAtual);
	System.out.printf("Aliquota : %.2f", aliquota);
  }
}
