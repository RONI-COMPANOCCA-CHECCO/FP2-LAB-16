public class Circulo extends Figura{
    //ATRIBUTOS
    private double radio;
    private final double PI = 3.14159;
    //CONSTRUCTORES
    public Circulo(double radio){
        this.radio = radio;
        this.id = Figura.contadorFiguras++;
    }
    //METODOS SETTER Y GETTER
    public double getRadio(){
        return radio;
    }
    public void setRadio(double radio){
        this.radio = radio;
    }
    //METODOS PUBLICOS
    public double calcularArea(){
        double resultado;
        resultado = PI *radio*radio;
        return resultado;
    }
    public void dibujar(){
        System.out.println("Dibujando CIRCULO: "+this.id);
    }
    
}
