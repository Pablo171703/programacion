package UD4;

import java.util.Scanner;

//Leer 10 numeros, almacenarlos en un array, luego tiene que salir el siguiente menú:

public class Ej_menú_arrays {

	public static void main(String[] args) {
		final int TAMAÑO=10;
		Scanner entrada = new Scanner(System.in);
		//Variables
		int[] nums=new int[TAMAÑO];
		char opcion='0';
		int[] numsRotado=new int[TAMAÑO];
		//Introducir los numeros
		for(int s=0;s<TAMAÑO;s++) {
			System.out.println("Introduce los numeros");
			nums[s]=entrada.nextInt();
		}
		entrada.nextLine();
		//Hacemos el menu
		do {
			System.out.println("Escoge una opcion:");
			System.out.println("a.el valor máximo y mínimo del array");
			System.out.println("b.eliminar duplicados y sutituirlos por 0 (todos menos el primero)");
			System.out.println("c.rotar array");
			System.out.println("d. salir");
			opcion=entrada.nextLine().charAt(0);
			switch(opcion) {
			case 'c':
			case 'C':
				//Invertimos el array de numeros
				for(int k=0;k<TAMAÑO;k++) {
					numsRotado[k]=nums[(TAMAÑO-1)-k];
		            System.out.print("La array rotada: "+numsRotado[k]);
			}
				System.out.println("");
			break;
			case 'a':
			case 'A':
				//Declaramos las variables minimo y maximo
				int maximo=nums[0];
				int minimo=nums[0];
				//Comparamos todos los numeros hasta encontrar el mayor
				for (int z=1;z<TAMAÑO;z++) {
					if (nums[z] > maximo){
						maximo = nums[z];
					}
				////Comparamos todos los numeros hasta encontrar el menor
			  } for(int z=1;z<TAMAÑO;z++) {
				  if(nums[z] < minimo) {
					  minimo = nums[z];
				  }
			  }
			    System.out.println("Los valores mínimo y máximo son:"+minimo+" y "+maximo);
			break;
			case 'b':
			case 'B':
				//Comparamos el primer numero con todos para encontrar los duplicados
				for(int i=0;i<TAMAÑO;i++){
					for(int j=0;j<TAMAÑO;j++){
						if(i!=j){
							//Si ambos son iguales:
							if(nums[i]==nums[j]){
								// sustituimos por 0
								nums[j]=0;
							}
						}
					}
				System.out.print("La nueva array es: "+nums[i]);
				}
				System.out.println("");
			break;
			default:
				System.out.println("Salir");
			}
		}while((opcion!='d')&&(opcion!='D'));{
		}
	}
}