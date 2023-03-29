package Salud;

import java.util.Scanner;

public class Persona {
    private String tipoDoc;
    private int documento;
    private String nombre;
    private String apellido;
    private double peso;
    private double estatura;
    private int edad;
    private String sexo;
    private double mc;

    public Persona() {
        
    }

    public Persona(String tipoDoc, int documento, String nombre, String apellido, double peso, double estatura,
            int edad, String sexo, double mc) {
        this.tipoDoc = tipoDoc;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = peso;
        this.estatura = estatura;
        this.edad = edad;
        this.sexo = sexo;
        this.mc = mc;
    }
    public String getTipoDoc() {
        return tipoDoc;
    }
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
    public int getDocumento() {
        return documento;
    }
    public void setDocumento(int documento) {
        this.documento = documento;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getEstatura() {
        return estatura;
    }
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public double getMc() {
        return mc;
    }
    public void setMc(double mc) {
        this.mc = mc;
    }
    public void pedirDatos() {
        Scanner lec=new Scanner(System.in);
        System.out.println("Digite su tipo de documento");
        tipoDoc=lec.next();
        System.out.println("Digite su  documento");
        documento=lec.nextInt();
        System.out.println("Digite su Nombre");
        nombre=lec.next();
        System.out.println("Digite su Apellido");
        apellido=lec.next();
        System.out.println("Digite su peso");
        peso=lec.nextDouble();
        System.out.println("Digite su estatura");
        estatura=lec.nextDouble();
        System.out.println("Digite su edad");
        edad=lec.nextInt();
        System.out.println("Digite su sexo");
        sexo=lec.next();
        lec.close();


    }
    public void mostrarPersona() {
        System.out.println("Su tipo de documento es "+tipoDoc);
        System.out.println("Su  documento es "+documento);
        System.out.println("La persona registrada es "+nombre);
        System.out.println("Su apellido es "+apellido);
        System.out.println("Su peso es "+peso);
        System.out.println("Su estatura es "+estatura);
        System.out.println("Su edad es "+edad);
        System.out.println("Su sexo es "+sexo);
    }
    /* 
    public void calcularMc() {
        mc=(peso/estatura)*(peso/estatura);
    }
    */
  /* 
    public void mostrarMc() {
        if (mc>20) {
            if (mc<=25) {
                System.out.println("Su mc es de "+mc+" por lo tanto su peso es ideal");
            } else {
                System.out.println("Su mc es de "+mc+" por lo tanto usted esta en sobrepeso"); 
            }
        } else {
            System.out.println("Su mc es de "+mc+" por lo tanto su peso esta por debajo de lo ideal");
        }
    }
    */
    public void mostrarEdad() {
        if (edad>18) {
            System.out.println("Su edad es "+edad+" Usted es mayor de edad");
        } else {
            System.out.println("Su edad es "+edad+" Usted es menor de edad"); 
        }
    }
    public double calcularMc2() {
        mc=(peso/estatura)*(peso/estatura);
        return mc;
    }

}
