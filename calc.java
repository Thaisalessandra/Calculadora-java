package calculadora;
import java.util.Scanner;
	public class calc {
	
		
		public static void main(String[] args) {
			
			 Scanner scan = new Scanner(System.in);
				double a, b;
				
				System.out.println("Digite o primeiro valor: ");
				a= scan.nextInt();
				System.out.println("Digite segundo valor: ");
				b=scan.nextInt();
				soma(a,b);
				double soma = soma(a,b);
				double subtracao = subtracao(a,b);
				double mult = mult(a,b);
				double divisao = divisao(a,b);
				
				System.out.println("soma "+soma);
				System.out.println("sub "+subtracao);
				System.out.println("div "+divisao);
				System.out.println("mult "+mult);
			}
		
		public static double soma(double a,double b) {
			return a+b;
		}
		public static double subtracao(double a,double  b) {
			return a - b;
		}
		public static double divisao(double a,double b) {
			return a / b;
		}
		public static double mult(double a, double b) {
			return a * b;
		}
		
	}


