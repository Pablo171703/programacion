package entornosDesarrollo;

public class H2EJ25 {
	public static void main(String[] args) {
		//declaración e inicialización de variables
		int a=0;
		int b=1;
		int c;
		int cont=1;
		//mostramos los dos primeros terminos de
		//la serie
		System.out.println(a);
		System.out.println(b);
		while (cont<=23) {
			c=a+b;
			System.out.println("cont:"+cont+"num:"+c);
			a=b;
			b=c;
			cont=cont+1;
		}
	
	
}

}