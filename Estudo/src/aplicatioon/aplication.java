/* Imagine que você está desenvolvendo o módulo de RH de uma grande empresa de tecnologia. 
O seu objetivo é criar um programa que calcule o bônus salarial anual de um funcionário e 
determine se ele tem direito a uma promoção imediata.
*/

package aplicatioon;

import java.util.Scanner;

public class aplication {
	public static void main(String[] args) {
		
	String name;
	double salarioAtual;
	int anosDeEmpresa;
	int notaPerformance;
	
	
	 Scanner sc = new Scanner(System.in);
	
	 
	 System.out.println("Insira o nome do funcionário: ");
	 name = sc.nextLine();
	 System.out.println("Qual o salário do Funcionário: ");
	 salarioAtual = sc.nextDouble();
	 System.out.println("Insira o tempo que o funcionário tem na empresa: ");
	 int tempoDigitado = sc.nextInt();
	 String tipoTempo = sc.next(); 
	 System.out.println("insira a nota do funcionario: ");
	 notaPerformance = sc.nextInt();
	 sc.nextLine();
	 
	 // Verificando se o usuario colocou o tempo em meses e converte para anos
	 if (tipoTempo.equalsIgnoreCase("Meses") || tipoTempo.equalsIgnoreCase("M")) {
		 anosDeEmpresa = tempoDigitado / 12;
	 }else {
		 anosDeEmpresa = tempoDigitado;
	 }
	 
	 // Verifica o tempo que o usuário tem na empresa e faz o calculo do bonus no salário
	 if(notaPerformance == 5 && anosDeEmpresa >= 3) {
		 salarioAtual += salarioAtual * 0.20;
	 }else if((notaPerformance == 4 || notaPerformance == 5) || anosDeEmpresa >5) {
		 salarioAtual += salarioAtual * 0.10;
	 }else if(notaPerformance == 3) {
		 salarioAtual += 500;
	 }else {
		 System.out.println("melhore seu desempenho!! ");
	 }
	 
	 // Verifica se o funcionario está elegivel para promoção
	 String statusPromocao = (notaPerformance >= 4 && anosDeEmpresa >=2) ? "Promovido" : "Não elegível para promoção";
	 
	 
	 
	 System.out.println("----- Resultado da Busca -----");
	 System.out.println("Nome: " + name);
	 System.out.println("Novo Salário: " + salarioAtual);
	 System.out.println("Status da Promocão: " + statusPromocao);

	 
	 
	 
	 sc.close();
	
	 }	 
} 

