package ejercicio3seis;

public class EmpleadoDemo {

	public static void main(String[] args) {
		Empleado empleado = new Empleado();
		Empleado empleado1 = new Empleado();
		empleado.salario = 1000;
		Empleado.salario = 20;
		System.out.println(empleado.nombre + " tiene un salario de: "+ empleado.salario);
		empleado1.salario = 10;
		System.out.println(empleado.nombre + " tiene un salario de: "+ empleado1.salario);
		System.out.println(empleado.nombre + " tiene un salario de: "+ empleado.salario);

	}

}
