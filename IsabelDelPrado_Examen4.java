package IsabelDelPrado_Examen4;

public class IsabelDelPrado_Examen4 {

	public static void main(String[] args) {
		Empleado emp1 = new Empleado("Isabel", "Del Prado", "25","C");
		Empleado emp2 = new Empleado("Laura", "Torres", "35","C");
		Empleado emp3 = new Empleado("Miguel", "Velez", "42","S");
		
		Nomina nomina = new Nomina(emp1, emp2, emp3);
		nomina.calcularPagoDiasLaborados();
	}

}
