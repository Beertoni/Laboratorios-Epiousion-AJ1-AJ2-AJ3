package lab04Epiousion;

public class Agencia {

	String numero;
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getBanco_da_agencia() {
		return banco_da_agencia;
	}

	public void setBanco_da_agencia(String banco_da_agencia) {
		this.banco_da_agencia = banco_da_agencia;
	}

	String nome;
	String banco_da_agencia;
	
	void status() {
		System.out.println("Agencia: " + this.nome);
		System.out.println("Numero: " + this.numero);
	}
}
