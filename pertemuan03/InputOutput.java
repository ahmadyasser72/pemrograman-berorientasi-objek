import java.util.Scanner;

public class InputOutput {
	public static void main(String[] args) {
		int nilai = 0;
		double rata = 0;
		String nama = "Yasser";
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nama: " + nama);
		
		System.out.print("Input nama baru: ");
		nama = scanner.nextLine();
		System.out.println("Nama baru: " + nama);
	}
}