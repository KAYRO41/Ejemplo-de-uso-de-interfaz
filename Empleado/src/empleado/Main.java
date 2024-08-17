package empleado;

public class Main {
	public static void main(String[] args) {
		 EmpleadoTiempoCompleto empleado1 = new EmpleadoTiempoCompleto("Juan", 1, 50000, 5000);
		 EmpleadoMedioTiempo empleado2 =new EmpleadoMedioTiempo ("sara", 2 , 20 , 25);
		
		empleado1.Calcularsalario();
		empleado2.calcularSalario();
	}
}
