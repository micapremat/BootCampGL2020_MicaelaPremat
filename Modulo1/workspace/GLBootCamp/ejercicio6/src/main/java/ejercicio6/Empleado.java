package ejercicio6;

public class Empleado extends Persona implements Comparable<Empleado>{
	private int ID;
	private String nombre;
	private int sueldoBase;
	private int hsExtrasAlMes;
	private double tipoIRPF;
	private char casado;
	private int cantHijos;
	static double importeHsExtra = 500;
	
	public Empleado(int dni) {
		super.setDni(dni);
	}
	
	public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setID(int id){
        this.ID = id;
    }
    
    public int getId(){
        return this.ID;
    }
    
    public void setSueldoBase(int sueldo){
        this.sueldoBase = sueldo;
    }
    
    public int getSueldoBase(){
        return this.sueldoBase;
    }
    
    public void setHorasExtrasAlMes(int horas){
        this.hsExtrasAlMes = horas;
    }
    
    public int getHorasExtrasAlMes(){
        return this.hsExtrasAlMes;
    }
    
    public void setTipoIRPF(double tipoIRPF){
        this.tipoIRPF = tipoIRPF;
    }
    
    public double getTipoIRPF(){
        return this.tipoIRPF;
    }
    
    public void setEsCasado(char casado){
        this.casado = casado;
    }
    
    public char getEsCasado(){
        return this.casado;
    }
    
    
    public void setCantidadDeHijos(int cantidad){
        this.cantHijos = cantidad;
    }
    
    public int getCantidadDeHijos(){
        return this.cantHijos;
    }
    
    public double calcularSueldoExtra() {
    	return this.hsExtrasAlMes * this.importeHsExtra;
    }
    
    public double calcularSueldoBruto() {
    	return this.sueldoBase + this.calcularSueldoExtra();
    }
    
    public double calcularRetencionesIRPF() {
    	if(this.casado == 's') {
    		this.tipoIRPF = this.tipoIRPF - 2;
    		if(this.cantHijos > 0) {
    			return this.tipoIRPF - this.cantHijos;
    		}
    	}else {
    		if(this.cantHijos > 0) {
    			return this.tipoIRPF - this.cantHijos;
    		}
    	}
    	return this.tipoIRPF;

    }
    
    public String toString(){
        return super.getDni() + this.nombre + "\n" + 
        		"Sueldo Base: " + this.sueldoBase + "\n" +
        		"Horas Extras: " + this.hsExtrasAlMes + "\n" +
        		"tipo IRPF: "+ this.tipoIRPF + "\n" +
        		"Casado: " + this.casado + "\n" +
        		"Numero de hijos: " + this.cantHijos;
    }
    
	public int compareTo(Empleado o) {
		// TODO Auto-generated method stub
		return this.sueldoBase - o.sueldoBase;
	}

	


}
