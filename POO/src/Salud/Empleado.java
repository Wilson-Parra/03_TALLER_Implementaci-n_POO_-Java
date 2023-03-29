package Salud;

import java.util.Scanner;

public class Empleado extends Persona {
private String cargo;
private String departamento;
private double valorHora;
private double horasTrabajadas;

public Empleado() {

}

public Empleado(String tipoDoc,int documento,String nombre,String apellido,double peso,double estatura,int edad,
String sexo,double mc,String cargo, String departamento, double valorHora, int horasTrabajadas) {
    super(tipoDoc,documento,nombre,apellido,peso,estatura,edad,sexo,mc);
    this.cargo = cargo;
    this.departamento = departamento;
    this.valorHora = valorHora;
    this.horasTrabajadas = horasTrabajadas;
}

public String getCargo() {
    return cargo;
}

public void setCargo(String cargo) {
    this.cargo = cargo;
}

public String getDepartamento() {
    return departamento;
}

public void setDepartamento(String departamento) {
    this.departamento = departamento;
}

public double getValorHora() {
    return valorHora;
}


public void setValorHora(double valorHora) {
    this.valorHora = valorHora;
}

public double getHorasTrabajadas() {
    return horasTrabajadas;
}


public void setHorasTrabajadas(int horasTrabajadas) {
    this.horasTrabajadas = horasTrabajadas;
}



public void pedirDatos() {
    Scanner lectura=new Scanner(System.in);
    System.out.println("Digita el cargo en el que esta");
    cargo=lectura.next();
    System.out.println("Digita su departamento de trabajo");
    departamento=lectura.next();
        System.out.println("Digita las horas trabajadas");
    horasTrabajadas=lectura.nextDouble();
    System.out.println("Digita el precio de sus horas");
    valorHora=lectura.nextDouble();
    lectura.close();
}

public void calcularHonorarios (){
double honorarios= horasTrabajadas*valorHora;
double reteica=honorarios*0.00966;
double total=honorarios-reteica;
System.out.println("Sus honorarios son "+total);


}

public void mostrarDatos(){
    System.out.println("El cargo es "+cargo);
    System.out.println("Las horas trabajadas son "+horasTrabajadas+" y el valor de la hora es "+valorHora);

}

    
}
