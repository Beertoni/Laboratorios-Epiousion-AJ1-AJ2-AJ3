/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
class TestaConta {

    public static void main(String[] args) {
        // Criacao da conta
        // Inicializacao da conta
        // Impressao dos dados da conta
        // Saque da conta
        // Impressao dos dados da conta
        // Deposito em conta
        // Impressao dos dados da conta
    	
    	Conta cc1 = new Conta();
    	cc1.inicializaConta(100f, "2345", "João Amarildo", 233, 34);
    	cc1.imprimeDados();
    	cc1.saque(20);
    	cc1.imprimeDados();
    	cc1.deposito(200);
    	cc1.imprimeDados();
    }
}
