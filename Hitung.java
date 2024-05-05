import java.util.Scanner;

public class Hitung {
  public static void main(String[] args) {
    String operator = pilih_operator();
    if (operator == "") {
      System.out.println("Operator tidak dikenali!");
      return;
    }

    Scanner scanner = new Scanner(System.in);

    System.out.print("=> Operand 1: ");
    double op1 = scanner.nextDouble();
    System.out.print("=> Operand 2: ");
    double op2 = scanner.nextDouble();

    double hasil = hitung(op1, op2, operator);
    System.out.println("Hasil " + op1 + " " + operator + " " + op2 + " = " + hasil);
  }

  public static String pilih_operator() {
    System.out.println("1. Tambah");
    System.out.println("2. Kurang");
    System.out.println("3. Kali");
    System.out.println("4. Bagi");

    System.out.print("=> Pilih: ");
    String pilih = (new Scanner(System.in)).nextLine();
    switch (pilih.toLowerCase()) {
      case "1":
      case "tambah":
	return "+";

      case "2":
      case "kurang":
	return "-";

      case "3":
      case "kali":
	return "*";

      case "4":
      case "bagi":
	return "/";

      default:
	return "";
    }
  }

  public static double hitung(double op1, double op2, String operator) {
    switch (operator) {
      case "+":
	return op1 + op2;

      case "-":
	return op1 - op2;

      case "*":
	return op1 * op2;

      case "/":
	return op1 / op2;

      default:
	return 0;
    }
  }
}
