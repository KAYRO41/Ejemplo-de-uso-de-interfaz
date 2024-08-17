package empleado;

public class EmpleadoTiempoCompleto {

	private String nombre;
	private int id;
	private double salario;
	private double beneficios;
	
	public EmpleadoTiempoCompleto(String nombre, int id, double salario, double beneficios ) {
		this.nombre = nombre;
		this.id = id;
		this.salario = salario;
		this.beneficios = beneficios;
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getid() {
		return id;
	}
	
	public void Calcularsalario() {
		System.out.println("Salario Total (incluyendo beneficios): "+(salario + beneficios));
	}
}
