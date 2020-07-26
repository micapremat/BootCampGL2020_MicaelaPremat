package ejercicio6;

public class Persona {
	private String nombre;
    private int dni;
    private int edad;
    
    public void setNombre(String unNombre){
        nombre = unNombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setDni(int unDni){
        dni = unDni;
    }
    
    public int getDni(){
        return dni;
    }
    
    public void setEdad(int unaEdad){
        edad = unaEdad;
    }
    
    public int getEdad(){
        return edad;
    }
}
