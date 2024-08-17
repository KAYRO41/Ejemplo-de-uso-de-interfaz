package empleado;

public class EmpleadoMedioTiempo {
	private String nombre;
	private int id;
	private double salarioHora;
	private int horasTrabajadas;
	
	public EmpleadoMedioTiempo(String nombre, int id, double salarioHora, int horasTrabajadas) {
		this.nombre = nombre;
		this.id = id;
		this.salarioHora = salarioHora;
		this.horasTrabajadas = horasTrabajadas;
		
	}
public String getNombre() {
	return nombre;
}

public int getid() {
	return id;
}

public void calcularSalario() {
	System.out.println("Salario Total:" + (salarioHora  *  horasTrabajadas));
	
	}
}


