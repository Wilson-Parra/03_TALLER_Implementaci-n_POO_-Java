package Interfaz;
import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera implements Juego { 
        
      private int maquina;
        private int usuario;
    
       
        Scanner lectura=new Scanner(System.in);
        
    public void iniciar(){
        System.out.print("Hola vamos a jugar chimbuspapas: 0 Para Tijera, 1 Para Piedra y 2 Para Papel ");
       usuario=lectura.nextInt(); 
    }

    public void jugar(){
      Random random=new Random();
    maquina=random.nextInt(3);
    }

    public void finalizar(){
        if (maquina==0 ) {
            if (usuario==1) {
              
                System.out.print("Usted ha ganado porque la maquina saco tijera ");
            }
           else if (usuario==2) {
            
            System.out.print("Usted ha perdido porque la maquina saco tijera ");
           }
           else {
            System.out.print("Nadie gano empate porque la maquina saco tijera ");
           }
        } 
        else if (maquina==1) {
            if (usuario==1) {
                System.out.print("Nadie gano empate porque la maquina saco piedra ");
            }
           else if (usuario==2) {
            
            System.out.print("Usted ha ganado porque la maquina saco piedra ");
           }
           else {
            
            System.out.print("Usted perdio porque la maquina saco piedra ");
           } 
        }
        else {
            if (usuario==1) {
             
                System.out.print("Usted ha perdido porque la maquina saco papel ");
            }
           else if (usuario==2) {
            System.out.print("Nadie gano, empate porque la maquina saco papel ");
           }
           else {
            
            System.out.print("Usted ha ganado porque la maquina saco papel ");
           } 
        }
    }
}
