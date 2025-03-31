abstract class Poligono {
    protected double base;
    protected double altura;

    // Constructor
    public Poligono(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Metodo abstracto que será implementada en las subclases
    public abstract double area();
}
