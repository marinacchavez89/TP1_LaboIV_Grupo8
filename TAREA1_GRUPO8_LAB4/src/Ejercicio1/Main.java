package Ejercicio1;

public class Main {

	public static void main(String[] args) {
		 // Esta clase en realidad es la que debería llamarse "Principal"
		 // La cree y le puse "Main" para probar que el proyecto se generó correctamente.
		 System.out.println("¡Proyecto TP1_GRUPO8 creado con éxito!");
		 
		 /*Prueba de funcionamiento correcto de atributo.
		 Empleado empleado1 = new Empleado();
		 empleado1.setEdad(22);
		 System.out.println(empleado1.getEdad());*/
		 
		 // Prueba del constructor vacio con valores inciales
		 Empleado empleado1 = new Empleado();
		// System.out.println("Empleado 1: ID = " + empleado1.getId() + ", Nombre = " + empleado1.getNombre() + ", Edad = " + empleado1.getEdad());
		
		 // Prueba del constructor con parametros nombre y edad
		 Empleado empleado2 = new Empleado("Camila", 30);
		// System.out.println("Empleado 2: ID = " + empleado2.getId() + ", Nombre = " + empleado2.getNombre() + ", Edad = " + empleado2.getEdad());
		
		 // Prueba1 funcionamiento devuelveProximoID()
		 Empleado empleado3 = new Empleado();
		// System.out.println("Empleado 3: ID = " + empleado3.getId() + " El próximo ID será el " + Empleado.devuelveProximoID(empleado3.getId()));
		 // Prueba12 funcionamiento devuelveProximoID()
		 Empleado empleado4 = new Empleado();
		// System.out.println("Empleado 4: ID = " + empleado4.getId() + " El próximo ID será el " + Empleado.devuelveProximoID(empleado4.getId()));
	     
		 //Prueba del método toString
		 System.out.println(empleado1.toString());
		 System.out.println(empleado2.toString());
		 System.out.println(empleado3.toString());
		 System.out.println(empleado4.toString());
	}

}
