package Principal;

import java.util.Scanner;
import Salud.Empleado;
import Salud.Persona;

public class Inicio {
    public static void main(String[] args) {
 double condi;
 Scanner lectura=new Scanner(System.in);
 Persona usuario=new Persona();
 usuario.pedirDatos();
    /* usuario.calcularMc();*/ 
    condi=usuario.calcularMc2();
    /*  usuario.mostrarMc();*/ 
       Empleado honorario=new Empleado();
        honorario.pedirDatos();
        usuario.mostrarPersona();
        usuario.mostrarEdad();
        if (condi>=20) {
            if (condi<=25) {
                System.out.println("Su mc es de "+condi);
                System.out.println("Por tu mc Tienes un Peso Ideal");
            } else {
                System.out.println("Su mc es de "+condi);
               System.out.println("Por tu mc Tienes un Sobrepeso");
            }
           } else {
            System.out.println("Su mc es de "+condi);
            System.out.println("Por tu mc Tienes un Peso Bajo");
           }
        honorario.mostrarDatos();
        honorario.calcularHonorarios(); 
lectura.close();
    }
}

