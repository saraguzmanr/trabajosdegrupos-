
package com.mycompany.nombreyedad;

import.util.Scanner


public class nombreyapellido {
   Scanner leer = new Scanner(System.in);
        String nombre,apellido;
        int edad;
        double cuenta; resultado;
        System.out.print("Bienvenido ingrese su nombre: ");
        nombre = leer.nextLine();
        System.out.print("ingrese su apellido: ");
        apellido=leer.nextLine();
        System.out.print("ingrese su edad: ");
        edad = leer.nextInt();
        System.out.print("ingrese la cuenta: ");
        cuenta = leer.nextDouble();

        resultado = calcularDescuento(cuenta, edad);

        System.out.print("Hola " + nombre.toUpperCase() + " " +apellido.toUpperCase()+  " su edad es " + edad + " y su cuenta con descuento es de: " + resultado);
    }
    public static double calcularDescuento(double cuenta, int edad) {
        double descuento = 0.0;
        if (edad >= 18 && edad < 19)  
}

}
return cuenta-descuento;