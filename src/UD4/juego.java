package UD4;
import java.util.Scanner;

public class juego {

		static Scanner in = new Scanner(System.in);
	    static char[] tablero = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
	    static int [][] historial = new int[9][9];
	    static int jugada= 0;
	    static int ganajug1= 0, ganajug2 = 0, empate = 0;

	    public static void main(String[] args) {
	        char opcion;
	        do {
	            System.out.println("1. Jugar una partida");
	            System.out.println("2. Mostrar estadísticas");
	            System.out.println("3. REcrear estadísticas");
	            System.out.println("4. Salir");
	            System.out.print("Seleccione una opción: ");
	            opcion = in.next().charAt(0);
	            
	            switch (opcion) {
                case '1':
                    jugarPartida();
                    break;
                case '2':
                    mostrarEstadisticas();
                    break;
                case '3':
                    recrearPartida();
                    break;
                case '4':
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != '4');
    }
	    public static void jugarPartida() {
	    	iniciar();
	        boolean turnoJugador1 = true;
	        boolean juegoTerminado = false;

	        while (!juegoTerminado) {
	            dibujaTablero();
	            int movimiento;
	            if (turnoJugador1) {
	                System.out.print("Introduzca movimiento (Jugador 1): ");
	                movimiento = in.nextInt();
	                if (movimientoValido(movimiento - 1)) {
	                    mueveJugador1(movimiento - 1);
	                } else {
	                    System.out.println("Movimiento no válido. Intente de nuevo.");
	                    continue;
	                }
	            } else {
	                System.out.print("Introduzca movimiento (Jugador 2): ");
	                movimiento = in.nextInt();
	                if (movimientoValido(movimiento - 1)) {
	                    mueveJugador2(movimiento - 1);
	                } else {
	                    System.out.println("Movimiento no válido. Intente de nuevo.");
	                    continue;
	                }
	            }

	            guardarEstadoTablero();

	            if (ganaJugador1()) {
	                dibujaTablero();
	                System.out.println("Ha Ganado el Jugador 1!");
	                juegoTerminado = true;
	                ganajug1++;
	            } else if (ganaJugador2()) {
	                dibujaTablero();
	                System.out.println("Ha Ganado el Jugador 2!");
	                juegoTerminado = true;
	                ganajug2++;
	            } else if (!quedanCasillas()) {
	                dibujaTablero();
	                System.out.println("Empate. No quedan más movimientos posibles.");
	                juegoTerminado = true;
	                empate++;
	            }

	            turnoJugador1 = !turnoJugador1;
	        }
	    }

	    public static void mostrarEstadisticas() {
	        System.out.println("Estadísticas:");
	        System.out.println("Jugador 1: " + ganajug1 + " ganadas, " + ganajug2 + " perdidas");
	        System.out.println("Jugador 2: " + ganajug2 + " ganadas, " + ganajug1 + " perdidas");
	        System.out.println("Empates: " + empate);
	    }

	    public static void recrearPartida() {
	        if (jugada > 0) {
	            for (int i = 0; i < jugada; i++) {
	                restaurarEstadoTablero(i);
	                dibujaTablero();
	            }
	        } else {
	            System.out.println("No hay partida para recrear.");
	        }
	    }
	    public static void guardarEstadoTablero() {
	        for (int i = 0; i < tablero.length; i++) {
	            historial[jugada][i] = tablero[i];
	        }
	        jugada++;
	    }

	    public static void restaurarEstadoTablero(int turno) {
	        for (int i = 0; i < tablero.length; i++) {
	            tablero[i] = (char) historial[turno][i];
	        }
	    }
	    

	    public static void mueveJugador1(int pos) {
	        tablero[pos] = 'X';
	    }

	    public static void mueveJugador2(int pos) {
	        tablero[pos] = 'O';
	    }
	    
	    public static void mostrar_estadisticas(int jugador1,int jugador2) {
	        System.out.println("jugador 1 : " + jugador1 + " ganadas " + jugador2 +" perdidas ");
	        System.out.println("jugador 2 : " + jugador2 + " ganadas " + jugador1 +" perdidas ");
	    }

	    public static boolean movimientoValido(int pos) {
	        return pos >= 0 && pos < 9 && tablero[pos] == ' ';
	    }

	    public static void iniciar() {
	        for (int i = 0; i < 9; i++) {
	            tablero[i] = ' ';
	        }
	    }

	    public static boolean quedanCasillas() {
	        for (int i = 0; i < 9; i++) {
	            if (tablero[i] == ' ') {
	                return true;
	            }
	        }
	        return false;
	    }

	    public static void dibujaTablero() {
	        System.out.println("-------------");
	        System.out.println("| " + tablero[0] + " | " + tablero[1] + " | " + tablero[2] + " |");
	        System.out.println("-------------");
	        System.out.println("| " + tablero[3] + " | " + tablero[4] + " | " + tablero[5] + " |");
	        System.out.println("-------------");
	        System.out.println("| " + tablero[6] + " | " + tablero[7] + " | " + tablero[8] + " |");
	        System.out.println("-------------");
	    }

	    public static boolean ganaJugador1() {
	    	 return (tablero[0] == 'X' && tablero[1] == 'X' && tablero[2] == 'X') ||
	                (tablero[3] == 'X' && tablero[4] == 'X' && tablero[5] == 'X') ||
	                (tablero[6] == 'X' && tablero[7] == 'X' && tablero[8] == 'X') ||
	                (tablero[0] == 'X' && tablero[3] == 'X' && tablero[6] == 'X') ||
	                (tablero[1] == 'X' && tablero[4] == 'X' && tablero[7] == 'X') ||
	                (tablero[2] == 'X' && tablero[5] == 'X' && tablero[8] == 'X') ||
	                (tablero[0] == 'X' && tablero[4] == 'X' && tablero[8] == 'X') ||
	                (tablero[2] == 'X' && tablero[4] == 'X' && tablero[6] == 'X');
	    }
	    public static boolean ganaJugador2() {
	         return (tablero[0] == 'O' && tablero[1] == 'O' && tablero[2] == 'O') ||
	                (tablero[3] == 'O' && tablero[4] == 'O' && tablero[5] == 'O') || 
	                (tablero[6] == 'O' && tablero[7] == 'O' && tablero[8] == 'O') ||
	                (tablero[0] == 'O' && tablero[3] == 'O' && tablero[6] == 'O') ||
	                (tablero[1] == 'O' && tablero[4] == 'O' && tablero[7] == 'O') ||
	                (tablero[2] == 'O' && tablero[5] == 'O' && tablero[8] == 'O') ||
	                (tablero[0] == 'O' && tablero[4] == 'O' && tablero[8] == 'O') ||
	                (tablero[2] == 'O' && tablero[4] == 'O' && tablero[6] == 'O');
	    }
	    

	}

