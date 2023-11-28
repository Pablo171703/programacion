package entornosDesarrollo;
//11. Que pida una letra y detecte si es una bocal

//Inicio
public class H1EJ11 {
	public static void main (String[] args) {
		//declaración de variable
		//tipo_dato nombre_variable;
		char letra;
		//letra<- '0' Inicializamos
		letra='0';
		//mostrar "Introduce una letra"
		System.out.println("Introduce una letra");
		//Leer letra
		letra='r';
		
		//comprobamos si es una vocal
		if((letra=='a') || (letra=='e') || (letra=='i') || (letra=='o') || letra=='u')	{
			//mostrar "Es vocal"
			System.out.println("Es vocal");
		}else { //es una contraseña
			System.out.println("Es una consonante");
		}
		}
}
