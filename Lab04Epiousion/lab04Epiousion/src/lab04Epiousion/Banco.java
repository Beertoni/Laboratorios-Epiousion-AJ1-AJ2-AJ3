package lab04Epiousion;

public class Banco {

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	private String nome;
	private int numero;
	
	void status() {
		System.out.println("Banco: " + this.nome);
		System.out.println("Numero: " + this.numero);
	}
}
