package Calculadora1;

import java.util.Scanner;

public class CalculadoraBasica {
    private float num1;
    private float num2;
    private float resultado;
    private Scanner scn = new Scanner(System.in);
    
    public void Suma()
    {
        System.out.print("Digite el primer numero: ");
        this.num1 = this.scn.nextFloat();
        System.out.print("Digite el segundo numero ");
        this.num2 = this.scn.nextFloat();
        this.resultado = this.num1 + this.num2;
        System.out.println("El total es: " + this.resultado);
        
    }
    public void Resta()
    {
        System.out.print("Digite el primer numero: ");
        this.num1 = this.scn.nextFloat();
        System.out.print("Digite el segundo numero ");
        this.num2 = this.scn.nextFloat();
        this.resultado = this.num1 - this.num2;
        System.out.println("La diferencia es: " + this.resultado);
    }
    public void Multiplicacion()
    {
        System.out.print("Digite el primer numero: ");
        this.num1 = this.scn.nextFloat();
        System.out.print("Digite el segundo numero ");
        this.num2 = this.scn.nextFloat();
        this.resultado = this.num1 * this.num2;
        System.out.println("El producto es: " + this.resultado);
    }
    public void Division()
    {
        System.out.print("Digite el primer numero: ");
        this.num1 = this.scn.nextFloat();
        System.out.print("Digite el segundo numero ");
        this.num2 = this.scn.nextFloat();
        if(this.num2!=0)
        {
            this.resultado = this.num1 / this.num2;
            System.out.println("El cociente es: " + this.resultado);
        }
        else
        {
            System.out.println("Error, division entre 0");
        }
    }
}
