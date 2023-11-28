package UD3;

import java.util.Scanner;

public class H2EJ23 {

	public static void main(String[] args) {
		//HABILITAMOS LA LECTURA DE DATOS POR CONSOLA
			Scanner entrada=new Scanner(System.in);
			double num=0;
			int cont =1;
			double media =0;
			double acum =0;
			System.out.println("introduce un numero: ");
			//Leemos un decimal
			num= entrada.nextDouble();
			while (num !=0) {
				acum = acum + num;
				System.out.println("Introduce un numero: ");
				//Leemos un decimal
				num = entrada.nextDouble();
				cont = cont +1;
			}
			if (cont!=1) {
				media = acum /(cont -1);
				System.out.println("La media es : " +media );
			}else {
				System.out.println("No la puedo calcular");
			}

	}

}
