package Calculadora2;

import java.util.Scanner;

public class CalculadoraAvanzada {

    private float num1;
    private Scanner scn = new Scanner(System.in);

    public void Potencia() {
        int potencia;
        System.out.print("Digite el numero: ");
        this.num1 = this.scn.nextFloat();
        System.out.print("Digite a que potencia lo quiere elevar: ");
        potencia = this.scn.nextInt();
        System.out.println(this.num1 + " elevado a la " + potencia + " es " + Math.pow(num1, potencia));
    }
    public void Opuesto()
    {
        float opuesto;
        System.out.print("Digite el numero: ");
        this.num1 = this.scn.nextFloat();
        if(this.num1!=0)
        {
            opuesto = this.num1*-1;
        }
        else
        {
            opuesto = 0;
        }
        
        System.out.println("El numero opuesto a " + this.num1 + " es " + opuesto);
    }
    
    public void Factorial()
    {
        System.out.print("Digite el numero entero para calcular su factorial: ");
        this.num1 = this.scn.nextInt();
        float factorial = this.num1;
        float numero = factorial - 1;
        while (numero!=0) {
            factorial = factorial * numero;
            numero--;
        }
        System.out.println("El numero factorial de " + this.num1 + " es " + factorial);
    }
}
