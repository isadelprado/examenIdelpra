import java.util.Scanner;

public class IsabelDelPrado_Examen1 {
	private static int valorHora = 265;
	private static int valorHoraExtra = 350;

	public static void main(String[] args) {
		int horasTrabajadas;
		System.out.println("Ingrese el numero de horas trabajadas por semana: ");
		Scanner entrada = new Scanner(System.in);
		horasTrabajadas = Integer.parseInt(entrada.nextLine());
		while (horasTrabajadas < 40) {
			System.out.println("El numero de Horas Trabajadas debe ser mayor o igual a 40\n");

			System.out.println("Ingrese el numero de horas trabajadas por semana: ");
			horasTrabajadas = Integer.parseInt(entrada.nextLine());
		}
		int valorNormal = valorHora * 40;
		System.out.println("El total a pagar por Horas Laborales Normal (40hrs) es de: " + valorNormal);

		if (horasTrabajadas > 40) {
			int horasExtras = (horasTrabajadas - 40);
			int valorExtra = horasExtras * valorHoraExtra;
			System.out.println("El total a pagar por Horas extra ("+horasExtras+"hrs) es de: " + valorExtra);
		}

	}

}
