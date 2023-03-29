package FigurasGeometricas;

public class Triangulo extends Figura {
    private int baset,alturat;

   
    public Triangulo(int baset, int alturat) {
        this.baset = baset;
        this.alturat = alturat;
    }

    public int getBaset() {
        return baset;
    }

    public void setBaset(int baset) {
        this.baset = baset;
    }

    public int getAlturat() {
        return alturat;
    }

    public void setAlturat(int alturat) {
        this.alturat = alturat;
    }

    public void calcularArea() {
        float area;
        area=((baset*alturat)/2);
        System.out.println("La base del triangulo es: "+baset+" y la altura es: "+alturat);
        System.out.println("El area del triangulo: "+area);
    }
    
}
