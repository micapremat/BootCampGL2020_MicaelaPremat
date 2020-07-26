package ejercicio6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
    	int cant = 0;
    	double mayorSueldo = 0;
    	double menorSueldo = 999999;
    	double mayorSueldoExtra = 0;
    	double menorSueldoExtra = 999999;
    	int posMayorSueldo = 0;
    	int posMenorSueldo = 0;
    	int posMayorHsExtra = 0;
    	int posMenorHsExtra = 0;
    	
    	Scanner in = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de empleados");
        cant = in.nextInt();
        if (cant < 20) {
        	Empleado[] empleados = new Empleado[cant];
        	for (int i=0; i<cant; i++) {
        		char car;
        		System.out.println("Ingrese el DNI del empleado");
        		Empleado empleado = new Empleado(in.nextInt());
        		System.out.println("Ingrese el id");
        		empleado.setID(in.nextInt());
        		System.out.println("Ingrese el nombre");
        		in.next();
        		empleado.setNombre(in.nextLine());
        		System.out.println("Ingrese el sueldo basico");
        		empleado.setSueldoBase(in.nextInt());
        		System.out.println("Ingrese las horas extras realizadas en el mes");
        		empleado.setHorasExtrasAlMes(in.nextInt());
        		System.out.println("Ingrese el numero de porcentaje de IRPF");
        		empleado.setTipoIRPF(in.nextDouble());
        		System.out.println("Es casado? ingrese 's' para si 'n' para no");
        		empleado.setEsCasado(in.next().charAt(0));
        		System.out.println("Indique el numero de hijos");
        		empleado.setCantidadDeHijos(in.nextInt());
        		System.out.println(empleado.toString());
        		empleados[i]=empleado;
        	}
        	System.out.println("Indique el valor de la hora extra");
        	Empleado.importeHsExtra = in.nextDouble();
        
        for (int i=0; i<cant; i++) {
        	if(empleados[i].calcularSueldoBruto() > mayorSueldo) {
        		mayorSueldo = empleados[i].calcularSueldoBruto();
        		posMayorSueldo = i;
        	}
        	if(empleados[i].calcularSueldoBruto() < menorSueldo) {
        		menorSueldo = empleados[i].calcularSueldoBruto();
        		posMenorSueldo = i;
        	}
        	if(empleados[i].calcularSueldoExtra() > mayorSueldoExtra) {
        		mayorSueldoExtra = empleados[i].calcularSueldoExtra();
        		posMayorHsExtra = i;
        	}
        	if(empleados[i].calcularSueldoExtra() < menorSueldoExtra) {
        		menorSueldoExtra = empleados[i].calcularSueldoExtra();
        		posMenorHsExtra = i;
        	}
        	
        }
        System.out.println("El empleado con mayor sueldo es: " + empleados[posMayorSueldo].toString());
        System.out.println("El empleado con menor sueldo es: " + empleados[posMenorSueldo].toString());
        System.out.println("El empleado con mayor ganancia en horas extras: " + empleados[posMayorHsExtra].toString());
        System.out.println("El empleado con menor ganancia en horas extras: " + empleados[posMenorHsExtra].toString());
        Arrays.sort(empleados);
        System.out.println(Arrays.toString(empleados));
        
        }else {
        	System.out.println("El maximo permitido es 20");
        }
    }
    
}
