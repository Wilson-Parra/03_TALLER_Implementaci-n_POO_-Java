package FigurasGeometricas;

import java.util.Scanner;

public class Circulo extends Figura {
    private float radio;

    public  Circulo() {
        
    }
    public Circulo(float radio) {
        this.radio = radio;
    }
    public float getRadio() {
        return radio;
    }
    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    public void pedirDatos() {
        Scanner lectura=new Scanner(System.in);
        System.out.println("Digita el radio del circulo");
        radio=lectura.nextFloat();
        lectura.close();
    }
    public void calcularArea() {
        double area;
        area=((3.1416*radio)+(3.1416*radio));
        System.out.println("El radio del circulo es: "+radio);
        System.out.println("El area del circulo es: "+area);
    }
   
}
