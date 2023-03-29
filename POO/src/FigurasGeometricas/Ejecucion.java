package FigurasGeometricas;
import java.util.Scanner;
public class Ejecucion {
    
    public static void main(String[] args) {
        float lado,base,altura;
        int baset,alturat,figura,deci=0;
        int i=0;
        while (deci==0) {
        Scanner captura=new Scanner(System.in);
        System.out.println("A que figura va a calcularle el area:0 cuadrado, 1 rectangulo, 2 triangulo, 3 circulo");
        figura=captura.nextInt();

        switch (figura) {
            case 0:
            System.out.println("Por favor digite el lado del cuadrado");
            lado=captura.nextFloat();
            Cuadrado c1=new Cuadrado(lado);
            c1.calcularArea();
                break;
                case 1:
                System.out.println("Por favor digite la base del rectángulo");
                base=captura.nextFloat();
                System.out.println("Por favor digite la altura del rectángulo");
                altura=captura.nextFloat();       
        Rectangulo r1=new Rectangulo(base, altura);
        r1.calcularArea();
                break;
                case 2:
                System.out.println("Digite la base del triangulo");
                baset=captura.nextInt();
                System.out.println("Digite la altura del triangulo");
                alturat=captura.nextInt();
                Triangulo t1=new Triangulo(baset,alturat);
                t1.calcularArea();
                break;
                case 3:
                Circulo circu=new Circulo();
                circu.pedirDatos();
                circu.calcularArea();
                break;
            default:
            System.out.println("Ingreso numero invalido en las opciones");
                break;
        }
        System.out.println("Desea volver a jugar: 0 Si, 1 NO");
        deci=captura.nextInt();
        i++;
        captura.close();
    }
System.out.println("Usted calculo el area  "+i+" vez");
    }
}
