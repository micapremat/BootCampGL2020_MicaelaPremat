package ejercicio4sieteyocho;

public class While {

	public static void main(String[] args) {
		int i = 1;
		while (i<=10) {
			//System.out.println("Valor iterado: "+i);
			i++;
		}
		while(i<=50) {
			if((i % 2)==0) {
				System.out.println("El valor iterado "+ i + " es par");
			}else {
				System.out.println("El valor iterado "+ i + " es impar");
			}
			i++;
		}

	}

}
