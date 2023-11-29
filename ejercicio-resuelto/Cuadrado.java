public class Cuadrado extends Figura{
    //ATRIBUTOS
    private double lado;
    //CONSTRUCTORES
    public Cuadrado(double lado){
        this.lado = lado;
        this.id = Figura.contadorFiguras++;
    }
    //METODOS GETTER Y SETTER
    public double getLado(){
        return lado;
    }
    public void setLado(double lado){
        this.lado = lado;
    }
    //METODOS PUBLICOS
    public double calcularArea(){
        double resultado;
        resultado = lado*lado;
        return resultado;
    }
    public void dibujar(){
        System.out.println("Dibujando CUADRADO "+ this.id);
    }
}
