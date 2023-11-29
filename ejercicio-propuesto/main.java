import java.util.ArrayList;
import java.util.*;

public class main {

	public static void main(String[] args) {

		//DECLARACION DE VARIABLES Y ARREGLOS NECESARIOS
		Scanner scan = new Scanner(System.in);
		ArrayList<Soldado> ejercito1 = new ArrayList();
		ArrayList<Soldado> ejercito2 = new ArrayList();
		ArrayList<Soldado> ejercito3 = new ArrayList();
		ArrayList<Soldado> ejercito4 = new ArrayList();
		ArrayList<ArrayList<Soldado>> tablero = new ArrayList();
		int batallon1, batallon2, batallon3, batallon4, batallon5;
		int vidatotal1=0, vidatotal2=0, vidatotal3=0, vidatotal4=0;
		double promedioVida1=0, promedioVida2=0, promedioVida3=0, promedioVida4=0;

		// BUCLE PARA DESIGNAR LA CANTIDAD DE FILAS Y COLUMNAS DEL TABLERO
		for(int i=0; i<10; i++) {
			tablero.add(new ArrayList<Soldado>());
			for(int j=0; j<10; j++) {
				tablero.get(i).add(new Soldado());
			}
		}

		// CREACION DEL NUMERO DE POSICIONES DE CADA EJERCITO
		batallon1 = aleatorio(1,10);
		batallon2 = aleatorio(1,10);
		batallon3 = aleatorio(1,10);
		batallon4 = aleatorio(1,10);
		batallon5 = aleatorio(1,10);
		
		Ejercito eje = new Ejercito(batallon1, batallon2, batallon3, batallon4, batallon5);

		// INICIALIZAR ARREGLOS
		inicializarArreglo(ejercito1, batallon1);
		inicializarArreglo(ejercito2, batallon2);
		inicializarArreglo(ejercito3, batallon3);
		inicializarArreglo(ejercito4, batallon4);

		// GENERAR EJERCITOS VALIDOS
		generarEjercitos(ejercito1, ejercito2, 3, 4);
		generarEjercitos(ejercito3, ejercito4, 3, 4);

		// AÑADIR LOS EJERCITOS AL TABLERO
		añadirTablero(ejercito1, tablero);
		añadirTablero(ejercito2, tablero);
		añadirTablero(ejercito3, tablero);
		añadirTablero(ejercito4, tablero);
		
		// MOSTRAR OPCION PARA INGRESAR DATOS MANUALMENTE O AUTO GENERADO
		System.out.println("\n1-QUIERE INGRESAR LOS DATOS MANUALMENTE");
		System.out.println("\n2-QUIERE SUS DATOS DE MANERA AUTOGENERADO");
		String aux = scan.nextLine();
		int auxiliar = intTryParse(aux);
		if(auxiliar == 1) {
			// IMPRIMIR TODOS LOS DATOS DEL REYNO DE INGLATERRA
			Soldado eje1 = new Soldado("# REYNO DE INGLATERRA #");
			System.out.println("Cuantos Soldados vas a agregar");
			int sol = scan.nextInt();
			for( int i=0; i<sol; i++) {
				String nombre = scan.nextLine();
				int fila = scan.nextInt();
				int columna = scan.nextInt();
				int vida = scan.nextInt();
				eje1.addSoldado(new Soldado("Rodrigo",2,3,2));
			}
			// IMPRIMIR TODOS LOS DATOS DEL REYNO DE FRANCIA
			Soldado as = new Soldado("\n# REYNO DE FRANCIA #");
			System.out.println("Cuantos Soldados vas a agregar");
			int sol = scan.nextInt();
			for( int i=0; i<sol; i++) {
				String nombre = scan.nextLine();
				int fila = scan.nextInt();
				int columna = scan.nextInt();
				int vida = scan.nextInt();
				as.addSoldado(new Soldado("Rodrigo",2,3,2));
			}
		    } else if(auxiliar == 2) {
			// IMPRIMIR TODOS LOS DATOS DEL REYNO DE INGLATERRA
			System.out.println("# REYNO DE INGLATERRA #");
			for(int i=0; i<ejercito1.size(); i++) {
				imprimir(ejercito1.get(i));
			}
			datos(ejercito1,vidatotal1,promedioVida1);
			// IMPRIMIR TODOS LOS DATOS DEL REYNO DE FRANCIA
			System.out.println("\n# REYNO DE FRANCIA #");
			for(int i=0; i<ejercito2.size(); i++) {
				imprimir(ejercito2.get(i));
			}
			datos(ejercito2,vidatotal2,promedioVida2);
			
			// IMPRIMIR TODOS LOS DATOS DEL REYNO DE SACRO IMPERIO
			System.out.println("\n# REYNO DE SACRO IMPERIO #");
			for(int i=0; i<ejercito3.size(); i++) {
				imprimir(ejercito3.get(i));
			}
			datos(ejercito3,vidatotal3,promedioVida3);
			// IMPRIMIR TODOS LOS DATOS DEL REYNO DE CASTILLA-ARAGON Y MOROS
			System.out.println("\n# REYNO DE CASTILLA-ARAGON Y MOROS #");
			for(int i=0; i<ejercito4.size(); i++) {
				imprimir(ejercito4.get(i));
			}
			datos(ejercito4,vidatotal4,promedioVida4);
			
			// IMPRIMIR LOS SOLDADOS ENFRENTADOS
					int suma = 0;
					Soldado mayor = new Soldado();
					Soldado max = new Soldado();
					mayor.setPuntos(0);
					for(int i=0; i<ejercito1.size();i++) {
						if ((int)mayor.getPuntos()<ejercito1.get(i).getPuntos()) {
							mayor = ejercito1.get(i);
						}
					}
					for(int i=0; i<ejercito2.size();i++) {
						if ((int)max.getPuntos()<ejercito2.get(i).getPuntos()) {
							max = ejercito2.get(i);
						}
					}
			// MOSTRAR PARA INICIAR EL JUEGO
			double porcentaje1 = 0, porcentaje2 = 0;
			Boolean intentos = true;
			while (intentos) {
				System.out.println("\nQUIERE EMPEZAR A JUGAR");
				System.out.println("1-SI\t 2-No");
				String reader = scan.nextLine();
				int opcion = intTryParse(reader);
				if(opcion == 1) {
					// ENFRENTAMIENTO DEL LOS REYNOS ALEATORIAMENTE
					int w=0, cantidad=4;
					int arreglo[] = new int[cantidad];
							
					arreglo[w]= aleatorio(1,4);
					for( w=1; w<cantidad ;w++) {
						arreglo[w]= aleatorio(2,4);
						for(int x=1; x<w; x++) {
							if(arreglo[w]==arreglo[x]) {
								w--;
							}
						}
					}
					for(int q=0; q<1; q++) {
						if(arreglo[1] == 2) {
							System.out.println("\nREYNO DE INGLATERRA VS REYNO DE FRANCIA");
							imprimirTablero(tablero);
						}else if(arreglo[1] == 3) {
							System.out.println("\nREYNO DE INGLATERRA VS REYNO DE SACRO IMPERIO");
							imprimirTablero(tablero);
						}else if(arreglo[1] == 4) {
							System.out.println("\nREYNO DE INGLATERRA VS REYNO DE CASTILLA-ARAGON Y MOROS");
							imprimirTablero(tablero);
						}
					}
					for(int r=0; r<1; r++) {
						if(arreglo[2] == 2 & arreglo[3] == 3) {
							System.out.println("REYNO DE FRANCIA VS REYNO DE SACRO IMPERIO");
							imprimirTablero(tablero);
						}else if(arreglo[2] == 2 & arreglo[3] == 4) {
							System.out.println("REYNO DE FRANCIA VS REYNO DE CASTILLA-ARAGON Y MOROS");
							imprimirTablero(tablero);
						}else if(arreglo[2] == 3 & arreglo[3] == 2) {
							System.out.println("REYNO DE SACRO IMPERIO VS REYNO DE FRANCIA");
							imprimirTablero(tablero);
						}else if(arreglo[2] == 3 & arreglo[3] == 4) {
							System.out.println("REYNO DE SACRO IMPERIO VS REYNO DE CASTILLA-ARAGON Y MOROS");
							imprimirTablero(tablero);
						}else if(arreglo[2] == 4 & arreglo[3] == 2) {
							System.out.println("REYNO DE CASTILLA-ARAGON Y MOROS VS REYNO DE FRANCIA");
							imprimirTablero(tablero);
						}else if(arreglo[2] == 4 & arreglo[3] == 3) {
							System.out.println("REYNO DE CASTILLA-ARAGON Y MOROS VS REYNO DE SACRO IMPERIO");
							imprimirTablero(tablero);
						}
					}
					System.out.println("\nRonda: "+(1));
					suma = mayor.getPuntos()+max.getPuntos();
					System.out.println("Suma: "+suma);
					porcentaje1 = (100*mayor.getPuntos())/suma;
					porcentaje2 = (100*max.getPuntos())/suma;
					System.out.println("\nLa probabilidad de ganar del soldado del ejercito 1 es: "+porcentaje1+"%");
					System.out.println("La probabilidad de ganar del soldado del ejercito 2 es: "+porcentaje2+"%");
					break;
				} else if(opcion == 2) {
					System.out.println("QUIERE SALIR DE JUEGO");
					System.out.println("1-SI\t 2-No");
					if(!(fin())) {intentos = false;}
				}
			}
			// PRIMERA METRICA PARA DECIDIR EL GANADOR
			if(porcentaje1>porcentaje2) {
				System.out.println("\nGANADOR ***EJERCITO 1***");
			}else if (porcentaje1<porcentaje2) {
				System.out.println("\nGANADOR ***EJERCITO 2***");
				}
			else {
				System.out.print("\n***ES UN EMPATE***");
			}
			// SEGUNDA METRICA PARA DECIDIR EL GANADOR
			if(porcentaje1>porcentaje2) {
				System.out.println("\nGANADOR ***EJERCITO 1***");
			}else if (porcentaje1<porcentaje2) {
				System.out.println("\nGANADOR ***EJERCITO 2***");
				}
			else {
				System.out.print("\n***ES UN EMPATE***");
			}
			// TERCERA METRICA PARA DECIDIR EL GANADOR
			if(vidatotal1<vidatotal2) {
				System.out.println("\nGANADOR ***EJERCITO 1***");
			}else if (vidatotal1<vidatotal2) {
				System.out.println("\nGANADOR ***EJERCITO 2***");
				}
			else {
				System.out.print("\n***ES UN EMPATE***");
			}
		}
	}

	// METODO PARA SALIR
	public static Integer intTryParse(String num) {
		try {
			return Integer.parseInt(num);
		}catch (NumberFormatException e) {
			return 0;
		}
	}
	public static Boolean fin() {
		Scanner scan = new Scanner(System.in);
		Boolean intentos = true;
		while (intentos) {
			String reader = scan.nextLine();
			int opcion = intTryParse(reader);
			if(opcion == 1) {
				intentos = false;
				break;
			} else if(opcion == 2) {
				intentos = true;
				break;
			}
		}
		return intentos;
	}
	// METODO PARA MOSTAR LOS DATOS
	public static void datos(ArrayList<Soldado>M2, int a, double pro) {
		ArrayList<Soldado>Soldados = new ArrayList();
		ordenarPorVidaDescendente(M2);
		System.out.println("\nOrdenados por nivel de vida");
		for(int i=0; i<M2.size(); i++) {
			imprimir(M2.get(i));
		}
		//IMPRIMIR LA VIDA TOTAL Y EL PROMEDIO DEL EJERCITO
		System.out.println("\nVida total y el promedio del ejercito: ");
		for (int i=0; i<M2.size(); i++) {
			a+=M2.get(i).getPuntos();
			pro = a/(M2.size()*1.0);
		}
		System.out.println("Vida total: "+a);
		System.out.println("Promedio de vida: "+pro);
	}

	// METODO PARA CREAR NUMEROS ALEATORIOS EN UN RANGO
	public static int aleatorio(int min, int max) {
		return(int)(Math.random()*(max-min+1)+min);
	}

	// METODO PARA INICIAR UN ARRAYLIST
	public static void inicializarArreglo (ArrayList<Soldado> soldadito, int num) {
		for (int i=0; i<num; i++) {
			soldadito.add(new Soldado());
		}
	}

	// METODO PARA GENERAR DATOS DEL OBJETO SOLDADO
	public static Soldado generarDatos() {
		Soldado soldadito = new Soldado();
		soldadito.setPuntos(aleatorio(1,10));
		soldadito.setColumna(aleatorio(1,10));
		soldadito.setFila(aleatorio(1,10));
		return soldadito;
	}

	// METODOS PARA GENERAR LOS EJERCITOS DE MANERA ALEATORIA
		public static void generarEjercitos(ArrayList<Soldado>B1, ArrayList<Soldado>B2, int a, int b) {
			ArrayList<Soldado>Soldados = new ArrayList();
			Soldados.add(generarDatos());
			for (int i=1; i<(B1.size()+B2.size()); i++) {
				Soldados.add(generarDatos());
				for (int j=0; j<i; j++) {
					if(Soldados.get(i).getFila()==Soldados.get(j).getFila()) {
						if(Soldados.get(i).getColumna()==Soldados.get(j).getColumna()){
							Soldados.remove(i);
							i--;
						}
					}
				}
			}
			for (int i=0; i<B1.size(); i++) {
				B1.add(i, Soldados.get(i));
				B1.get(i).setNombre("Soldado"+i+"x"+a);
				B1.get(i).setColumn(B1.get(i).getPuntos()+"[E"+a+"]");
				B1.remove(i+1);
			}
			for (int i=0; i<B2.size(); i++) {
				B2.add(i, Soldados.get(i+B1.size()));
				B2.get(i).setNombre("Soldado"+i+"x"+b);
				B2.remove(i+1);
				B2.get(i).setColumn(B2.get(i).getPuntos()+"[E"+b+"]");
			}
		}


	// METODO PARA AÑADIR LOS EJERCITOS AL TABLERO
	public static void añadirTablero(ArrayList<Soldado>soldadito, ArrayList<ArrayList<Soldado>>table) {
		for (int i=0; i<soldadito.size(); i++) {
			table.get(soldadito.get(i).getColumna()-1).add(soldadito.get(i).getFila()-1,soldadito.get(i));
			table.get(soldadito.get(i).getColumna()-1).remove(soldadito.get(i).getFila());
		}
	}

	// METODO PARA IMPRIMIR EL TABLERO EN LA CUAL SE DESARROLLA EL JUEGO
	public static void imprimirTablero(ArrayList<ArrayList<Soldado>> table) {
		System.out.println("\tA\tB\tC\tD\tF\tG\tH\tI\tJ");
		for(int i=0; i<table.size(); i++) {
			System.out.print(i+1);
			for(int j=0; j<table.get(i).size();j++) {
				System.out.print("\t"+table.get(i).get(j).getColumn()+"|");
			}
			System.out.println("\n");
		}
	}
	
	//METODO PARA IMPRIMIR LOS SOLDADOS DE MAYOR VIDA
	public static Soldado SoldadoConMayorVida (ArrayList<Soldado>soldadito) {
		Soldado mayor = new Soldado();
		mayor.setPuntos(0);
		for(int i=0; i<soldadito.size();i++) {
			if (mayor.getPuntos()<soldadito.get(i).getPuntos()) {
				mayor = soldadito.get(i);
			}
		}
		return mayor;
	}
	//METODO PARA IMPRIMIR LOS SOLDADOS DE MAYOR VIDA PERO SOLO SUS PUNTOS DE VIDA
	public static void SoldadoMayorVida (ArrayList<Soldado>soldadito) {
		Soldado mayor = new Soldado();
		mayor.setPuntos(0);
		for(int i=0; i<soldadito.size();i++) {
			if (mayor.getPuntos()<soldadito.get(i).getPuntos()) {
				mayor = soldadito.get(i);
			}
		}
		leer(mayor);
	}
	
	// METODO PARA IMPRIMIR EL NOMBRE, LA POSICION Y NIVEL DE VIDA DEL SOLDADO
	public static void imprimir(Soldado soldadito) {
		System.out.println("Nombre: "+soldadito.getNombre()+"\nPosicion: "+soldadito.getColumna()+"X"+soldadito.getFila()+"\tVida: "+soldadito.getPuntos());
	}
	// METODO PARA IMPRIMIR EL NOMBRE, LA POSICION Y NIVEL DE VIDA DEL SOLDADO
	public static void leer(Soldado soldadito) {
		System.out.println(soldadito.getPuntos());
	}
	
	// METODO QUE NOS AYUDA A ORDENAR LOS SOLDADOS DE ACUERDO A SU NIVEL DE VIDA
	public static void ordenarPorVida(ArrayList<Soldado>soldadito) {
		Soldado aux = new Soldado();
		for(int i=0; i<soldadito.size()-1; i++) {
			for(int j=0; j<soldadito.size()-i-1; j++) {
				if(soldadito.get(j).getPuntos()>soldadito.get(j+1).getPuntos()) {
					aux = soldadito.get(j);
					soldadito.set(j,soldadito.get(j+1));
					soldadito.set(j+1,aux);
				}
			}
		}
	}
	// METODO QUE NOS AYUDA A ORDENAR LOS SOLDADOS DE ACUERDO A SU NIVEL DE VIDA (DE MAYOR A MENOR)
	public static void ordenarPorVidaDescendente(ArrayList<Soldado>soldadito) {
		Soldado aux = new Soldado();
		for(int i=0; i<soldadito.size()-1; i++) {
			for(int j=0; j<soldadito.size()-i-1; j++) {
				if(soldadito.get(j).getPuntos()<soldadito.get(j+1).getPuntos()) {
					aux = soldadito.get(j);
					soldadito.set(j,soldadito.get(j+1));
					soldadito.set(j+1,aux);
				}
			}
		}
	}
	
}
