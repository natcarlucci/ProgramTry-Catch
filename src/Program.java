import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch (InputMismatchException e) {
			System.out.println("Erro na Entrada de Dados");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição Inválida!");
		}
		
		System.out.println("Fim do Programa");
		

		sc.close();
	}

}
