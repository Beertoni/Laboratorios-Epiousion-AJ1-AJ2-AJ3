/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * 
 * 1) Crie um objeto da classe Conta 
 * 2) Inicialize todos os atributos deste objeto 
 * 3) Imprima os valores dos atributos da classe Conta de forma a obter o seguinte resultado:
 * 
 * ----------------------------- 
 * AGENCIA: 1 BANCO : 234 
 * NUMERO : 01945 
 * TITULAR: Globalcode 
 * SALDO : R$10000.0
 * -----------------------------
 * 
 * Sugestoes: 
 * Utilizando '\t' para tab
 * Ex: System.out.println("Texto\tTexto");
 * 
 * voce produzira a seguinte saida: 
 * Texto  Texto
 */
class TestaConta {

    public static void main(String[] args) {
    	Conta cont1 = new Conta();
    	cont1.saldo = 200f;
    	cont1.agencia = 3;
    	cont1.banco = 567;
    	cont1.numero = "00234";
    	cont1.titular = "Antonio Oliveira";
    	
    	System.out.println("\n-----------------------------------");
    	System.out.println("AGENCIA: " + cont1.agencia + "\tBANCO: " + cont1.banco);
    	System.out.println("NUMERO: " + cont1.numero);
    	System.out.println("TITULAR: " + cont1.titular);
    	System.out.println("SALDO: " + cont1.saldo);
    	System.out.println("-----------------------------------");
    }
}
