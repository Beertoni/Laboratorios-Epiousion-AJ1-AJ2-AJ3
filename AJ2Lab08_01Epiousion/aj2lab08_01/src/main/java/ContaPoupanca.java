/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * Tarefas: 
 * 1) Faca com que a classe ContaPoupanca estenda a classe Conta 
 * 2) Adicione o atributo data de aniversario (dataAniversario) a classe ContaPoupanca,
 *  declarando-o como String e encapsule o atributo 
 * 3) Crie um construtor para a classe ContaPoupanca obrigando a passagem da data de 
 *  aniversario e todos os parametros necessarios para abertura de Conta 
 * 4) Faca override do metodo imprimeDados fazendo com que ele imprima
 *  tambem a data de aniversario e o tipo da conta (CONTA POUPANCA) em seu cabecalho
 */
public class ContaPoupanca extends Conta{
	
	private String dataAniversario;



	public ContaPoupanca(double saldoInicial, String num, Cliente tit, Agencia ag) {
		super(saldoInicial, num, tit, ag);
		// TODO Auto-generated constructor stub
	}
	
	public String getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(String dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

	public ContaPoupanca(double saldoInicial, String num, Cliente tit, Agencia ag, String dataAniversario) {
		super(saldoInicial, num, tit, ag);
		this.dataAniversario = dataAniversario;
	}
	
	@Override
    public void imprimeDados() {
        System.out.println("======================================");
        agencia.imprimeDados();
        System.out.println("Numero da conta: " + numero);
        titular.imprimeDados();
        System.out.println(this.dataAniversario);
        System.out.println("CONTA POUPANÇA!");
        System.out.println("Saldo  : R$" + saldo);
        System.out.println("IFN devido: R$" + acumuladorIFN);
        System.out.println("========================================");
    }
}
