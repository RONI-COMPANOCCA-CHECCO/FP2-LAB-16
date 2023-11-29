public class Triangulo extends Figura{
    //ATRIBUTOS
    private double base;
    private double altura;
    //METODOS GETTER Y SETTER
    public double getBase(){
        return base;
    }
    public void setBase(double base){
        this.base = base;
    }
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    //CONSTRUCTORES
    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
        this.id = Figura.contadorFiguras++;
    }
    public double calcularArea(){
        double resultado;
        resultado = base*altura/2;
        return resultado;
    }
    public void dibujar(){
        System.out.println("dibujando TRIANGULO "+this.id);
    }
}
