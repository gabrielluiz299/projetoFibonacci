package br.com.gsoares;

import java.util.Scanner;

public class NewProject {
	public static boolean quadradoPerfeito(int x) {
		int s = (int) Math.sqrt(x);
		return (s*s == x);
	}
	
	public static boolean fibonacci(int n) {
		return quadradoPerfeito(5*(n*n)+4) || quadradoPerfeito(5*(n*n)-4);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int number = s.nextInt();
		
		if (fibonacci(number)) {
			System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
		} else {
			System.out.println("O número " + number + " NÃO pertence à sequência de Fibonacci.");
		}
		
		s.close();
	}

}
