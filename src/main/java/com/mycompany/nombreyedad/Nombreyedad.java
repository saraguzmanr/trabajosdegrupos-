
package com.mycompany.nombreyedad;
import java.util.Scanner;



public class Nombreyedad {

    public static void main(String[] args) {
        
        
     
       Scanner leer=new Scanner(System.in);
      
      double descuento=0; 
        int cuenta;
     
       System.out.println("Bienvenido\ningrese su nombre:");
       String nombre=leer.nextLine ();
       System.out.println("ingrese su apellido:");
       String apellido=leer.nextLine();
      
        System.out.println("ingrese su edad:");
       int edad=leer.nextInt ();
       
       System.out.println("ingrese valor de la cuenta:");     
       cuenta =leer.nextInt();

     
       if( edad<=19){
        descuento = cuenta-(cuenta*0.10);
      }if(edad > 19 && edad <= 30){
         descuento = cuenta-(cuenta*0.05);
      }if(edad > 30){
          descuento= cuenta;
      }
        System.out.println(""+nombre.toUpperCase()+" "+" "+apellido.toUpperCase()+ " "+" \n"+edad+ " años");
        System.out.print("Total a pagar:" +descuento);
      
}
}          
       
     
       
       
       
       
       
       
       
       
       
       
       
       
     
   
       

 