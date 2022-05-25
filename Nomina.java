package IsabelDelPrado_Examen4;

import java.util.Random;

public class Nomina {
	private Empleado[] empleado;
	private double pagoPorDias;
	
	public Nomina (Empleado... empleado) {
		this.empleado = empleado;
	}
	
	public void calcularPagoDiasLaborados() {
		
		for (int i = 0; i < empleado.length; i++) {
			int dias = new Random().nextInt(5 + 10) + 1;
			if(empleado[i].getTipoEmpleado().equals("S")) {
				pagoPorDias = (dias * 350) * 0.9;
			}else {
				pagoPorDias = (dias * 500) * 0.87;
			}
			System.out.println(empleado[i].getDetalles()+pagoPorDias+ " por "+dias+" dias trabajados");
		}
		
	}
}
