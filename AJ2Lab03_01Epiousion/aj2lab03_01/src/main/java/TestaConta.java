/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
public class TestaConta {

    public static void main(String[] args) {
        // Criar um objeto do tipo Conta
        // Usar o metodo inicializaConta para fazer a inicializacao do objeto criado
        // executar um deposito
        // Imprimir o saldo apos o deposito
        // executar um saque cujo valor seja menor que o saldo
        // Imprimir o saldo apos o deposito
        // executar uma retirada cujo valor seja maior que o saldo
        // Imprimir o saldo apos o deposito
    	
    	Conta cc1 = new Conta();
    	cc1.inicializaConta(0, "4321", "Péricles", 2208, 44);
    	System.out.println();
    	cc1.deposito(150f);
    	System.out.println(cc1.getSaldo());
    	cc1.saque(20f);
    	System.out.println(cc1.getSaldo());
    	cc1.saque(300f);
    	System.out.println(cc1.getSaldo());
    }
}
