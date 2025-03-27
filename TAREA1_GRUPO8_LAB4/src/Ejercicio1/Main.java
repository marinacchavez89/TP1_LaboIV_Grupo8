package Ejercicio1;

public class Main {

	public static void main(String[] args) {
		// Esta clase en realidad es la que debería llamarse "Principal"
		// La cree y le puse "Main" para probar que el proyecto se generó correctamente.
		 System.out.println("¡Proyecto TP1_GRUPO8 creado con éxito!");
		 
		 // Prueba de funcionamiento correcto de atributo.
		 Empleado empleado1 = new Empleado();

		 empleado1.setEdad(22);
		 System.out.println(empleado1.getEdad());
	}

}
