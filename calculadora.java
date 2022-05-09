package com.calculadora;

import java.util.Scanner;

public class calculadora {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a= scan.nextInt();
		System.out.println("Digite segundo valor: ");
		b=scan.nextInt();
		soma(a,b);
		int soma = soma(a,b);
	    int subtracao = subtracao(a,b);
	    int mult = mult(a,b);
	    double divisao = divisao(a,b);
	    
		System.out.println("soma "+soma);
		System.out.println("sub "+subtracao);
		System.out.println("div "+divisao);
		System.out.println("mult "+mult);
	}
	public static int soma(int a,int b) {
		return a+b;
	}
	public static int subtracao(int a,int  b) {
		return a - b;
	}
	public static double divisao(int a,int b) {
		return a / b;
	}
	public static int mult(int a, int b) {
		return a * b;
	}
	
}
