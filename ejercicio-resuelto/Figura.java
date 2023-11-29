public abstract class Figura {
    public static int contadorFiguras = 1;
    //ATRIBUTOS
    private int posicionX;
    private int posicionY;
    protected int id;
    //METODOS GETTER Y SETTER
    public int getPosicionX(){
        return posicionX;
    }
    public int getPosicionY(){
        return posicionY;
    }
    public void setPosicionX(int posicionX){
        this.posicionX = posicionX;
    }
    public void setPosicionY(int posicionY){
        this.posicionY = posicionY;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    //METODOS ABSTRACTOS
    public abstract double calcularArea();
    public abstract void dibujar();
}