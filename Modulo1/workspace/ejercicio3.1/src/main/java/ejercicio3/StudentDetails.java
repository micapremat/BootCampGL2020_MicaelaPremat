package ejercicio3;


public class StudentDetails {
	public void studentAge(int edad) {
		int age = 0;
		age = age+=5;
		System.out.println("La edad del estudiante es: "+ edad);
		
	}
	
	
	public static void main(String[] args) {
		StudentDetails estudiante = new StudentDetails();
		estudiante.studentAge(10);
		

	}

}
