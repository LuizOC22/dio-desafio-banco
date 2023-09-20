import java.util.Locale;
import java.util.Scanner;

public class banco {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String agencia = "067-8";
		double saldo = 237.48;
		
		System.out.println("Qual seu nome ?");
		String nomeDoCliente = sc.next();
		
		System.out.println("Qual o número da conta ?");
		int numeroDaConta = sc.nextInt();
		
		System.out.println("Olá " + nomeDoCliente + " obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + " conta " + numeroDaConta + " e seu saldo é de " + saldo + " que já está pronto para saque " );		
		
		sc.close();

	}

}
