import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main{
    //LISTA DE OBJETOS FIGURA
    static ArrayList<Figura> lienzo = new ArrayList<Figura>();
    static Scanner consola = new Scanner(System.in);
    public int menuFiguras(){
        System.out.println("-------------------------------");
        System.out.println("\tFIGURAS");
        System.out.println("-------------------------------");
        System.out.println("1. Cuadrado");
        System.out.println("2. Circulo");
        System.out.println("3. Triangulo");
        System.out.println("-------------------------------");
        int opcion = consola.nextInt();
        return opcion;
    }
    public void crearFigura(ArrayList<Figura> lienzo, int opc){
        if(opc==1){
            System.out.println("Ingrese el LADO del cuadrado: ");
            int lado = consola.nextInt();
            lienzo.add(new Cuadrado(lado));
        }
        if(opc==2){
            System.out.println("Ingrese el RADIO del Circulo: ");
            int radio = consola.nextInt();
            lienzo.add(new Circulo(radio));
        }
        if(opc==3){
            System.out.println("Ingrese la BASE del TRIANGULO: ");
            int base = consola.nextInt();
            System.out.println("Ingrese la Altura del TRIANGULO: ");
            int altura = consola.nextInt();

            lienzo.add(new Triangulo(base, altura));
        }
    }
    public void imprimirAreasFiguras(ArrayList<Figura> lienzo){
        for(Figura objFigura: lienzo){
            if(objFigura instanceof Cuadrado)
                System.out.print("Area del Cuadrado "+objFigura.getId()+" : ");
            else 
                if(objFigura instanceof Circulo)
                    System.out.print("Area del Circulo "+objFigura.getId()+" : ");
                else 
                    if(objFigura instanceof Triangulo){
                        System.out.print("Area del Triangulo "+objFigura.getId()+" : ");
            //POLIMORFISMO
            System.out.println(objFigura.calcularArea());
            }
        }
    }
    public void imprimirFiguras(ArrayList<Figura> lienzo){
        for(Figura objFigura: lienzo){
            //POLIMORFISMO
            objFigura.dibujar();
        }
    }
    public static void main(String[] args){
        int opcion;
        Main principal = new Main();
        do{
            System.out.println(
                "--------------------------------------------\n"+
                "1. Crear figura\n"+
                "2. Imprimir Todas las Figuras\n"+
                "3. Calcular Areas\n"+
                "4. Imprimir Tio de Figuras\n"+ 
                "5. Imprimir un objeto Figura\n"+
                "6. FIN\n"+
                "--------------------------------------------\n"+
                "Ingrese la opcion (1-6)"
            );
            opcion = consola.nextInt();
            switch(opcion){
                case 1: //
                        int opc = principal.menuFiguras();
                        principal.crearFigura(lienzo, opc);
                        break;
                case 2: //
                        principal.imprimirFiguras(lienzo);
                        break;
                case 3: //
                        principal.imprimirAreasFiguras(lienzo);
                        break;        
                case 0:
                        System.exit(0);
                        break;    
            }
        }while (true);
    }
}
