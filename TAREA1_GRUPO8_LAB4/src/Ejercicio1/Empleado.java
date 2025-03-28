package Ejercicio1;

public class Empleado {
	
	private final int id;
	private String nombre;
	private int edad;
	
	// variable de la clase y no de los objetos
	private static int cont = 1000;
	// constructor
	public Empleado()
	{
	 this.id = cont++;
	 this.nombre = "sin nombre";
	 this.edad = 99;
	}
	
	// Segundo constructor (recibe nombre y edad como parámetros)
	public Empleado(String nombre, int edad) {
		this.id = cont++; 
		this.nombre = nombre;
		this.edad = edad;
	}
	
	
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
