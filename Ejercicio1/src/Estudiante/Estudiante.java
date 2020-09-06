package Estudiante;

import java.util.Scanner;
public class Estudiante {
    private Scanner scn = new Scanner(System.in);
    private String nombre;
    private String apellido;
    private int edad;
    private int carnet;
    private String carrera;
    private String mat1;
    private String mat2;
    private String mat3;
    private String mat4;
    private String mat5;
    
    
    public Estudiante() {
    }
    
    public Estudiante(String nombre, String apellido, int edad, int carnet, String carrera) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.carnet = carnet;
        this.carrera = carrera;
    }

    
    
    public void Datos()
    {
        System.out.print("Ingrese Primer Nombre: ");
        this.nombre=this.scn.next();
        System.out.print("Ingrese Primer Apellido: ");
        this.apellido=this.scn.next();
        System.out.print("Ingrese Edad: ");
        this.edad=this.scn.nextInt();
        System.out.print("Ingrese el Carnet (los numeros): ");
        this.carnet=this.scn.nextInt();
        System.out.print("Ingrese Carrera: ");
        this.carrera=this.scn.next();
    }
    public void Materias()
    {
        System.out.print("Ingrese Nombre de Materia 1 a cursar: ");
        this.mat1=this.scn.next();
        System.out.print("Ingrese Nombre de Materia 2 a cursar: ");
        this.mat2=this.scn.next();
        System.out.print("Ingrese Nombre de Materia 3 a cursar: ");
        this.mat3=this.scn.next();
        System.out.print("Ingrese Nombre de Materia 4 a cursar: ");
        this.mat4=this.scn.next();
        System.out.print("Ingrese Nombre de Materia 5 a cursar: ");
        this.mat5=this.scn.next();
    }
    public void imprimir_datos() { 
        System.out.println("DATOS ESTUDIANTE "); 
        System.out.println("Nombre: "+nombre + "" + apellido); 
        System.out.println("Edad: "+edad); 
        System.out.println("Carnet: "+carnet);
        System.out.println("Carrera: "+carrera); 
        System.out.println(""); 
        System.out.println("MATERIAS"); 
        System.out.println("Materias Inscritas: "+mat1+"-"+mat2+"-"+mat3+"-"+mat4+"-"+mat5); 
    }
}
