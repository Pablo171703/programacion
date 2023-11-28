package UD4;

import java.util.Scanner;
/*9. Que lea 5 números por teclado, 
 * los copie a otro array multiplicados por 2 y
muestre el segundo array.
 * */

public class H4EJ9 {

	public static void main(String[] args) {
		//habilitamos la lectura por teclado
		Scanner entrada = new Scanner(System.in);
		//definimos el array
		double[] numeros = new double[5];
		
		//rellenamos el array
				for(int i = 0; i < 5; i++) {
					System.out.println("Introduce 5 valores");
					numeros[i]=entrada.nextDouble();

				}
				for(int i=0;i< 5;i++) {
					double numero=2*numeros[i];
					numeros[i]=numero;

				}
				//muestre el segundo array
				for(int i=0;i< 5;i++) {
					System.out.println(numeros[i]);
				}

			}
}
