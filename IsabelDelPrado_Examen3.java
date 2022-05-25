
public class IsabelDelPrado_Examen3 {
	public static void main(String[] args) {

		int[] arreglo1 = { 3, 2, 1, 1, 2, 3, 2, 3, 1 };
		int[] arreglo2 = { 1, 1, 2, 2, 1, 1, 1, 2, 1 };

		String arregloImp1 = "Arreglo 1 : [ ";
		String arregloImp2 = "Arreglo 2 : [ ";

		for (int i = 0; i < arreglo2.length; i++) {
			arregloImp1 = arregloImp1 + arreglo1[i]+",";
			arregloImp2 = arregloImp2 + arreglo2[i]+",";
		}

		System.out.println(arregloImp1 + " ]");
		System.out.println(arregloImp2 + " ]");

		for (int i = 0; i < arreglo2.length; i++) {
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println(arreglo1[i] + " + " + arreglo2[i] + " = " + (arreglo1[i] + arreglo2[i]));
			System.out.println(arreglo1[i] + " * " + arreglo2[i] + " = " + (arreglo1[i] * arreglo2[i]));
		}
	}
}
