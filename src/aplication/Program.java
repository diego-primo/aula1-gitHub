package aplication;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posi??o inv?lida");
			e.printStackTrace();
		} catch (InputMismatchException e) {
			System.out.println("Erro de entrada");
			e.printStackTrace();
		}
		System.out.println("Fim do programa");
	}
}
