package IsabelDelPrado_Examen4;

public class Empleado extends Persona {
	private String tipoEmpleado;

	public Empleado(String nombre, String apellido, String edad, String tipoEmpleado) {
		super(nombre, apellido, edad);
		this.tipoEmpleado = tipoEmpleado;
	}

	public String getTipoEmpleado() {
		return tipoEmpleado;
	}

	public void setTipoEmpleado(String tipoEmpleado) {
		this.tipoEmpleado = tipoEmpleado;
	}

	public String getDetalles() {
		String TipoEmple = getTipoEmpleado().equals("C") ? "Empleado de Confianza" : "Sindicato";
		return super.getDetalles() + " - " + getTipoEmpleado() + " Pertenece a " + TipoEmple+" Con un Salario de $";
	}

}
