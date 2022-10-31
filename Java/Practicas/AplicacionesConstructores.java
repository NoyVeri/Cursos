
import java.util.Scanner;

class Operaciones {
    
   String operacion;
    double Num1;
    double Num2;
    
    
    public Operaciones( String operacion,double Num1, double Num2 ) {
        this.operacion = operacion;
        this.Num1 = Num1;
        this.Num2 = Num2;
        
    }

    
    public void suma() {
       double resultado;
 resultado = Num1 + Num2;
       System.out.println( "La " + operacion + " del numero " + Num1 + " y el numero " + Num2 + " es " + resultado );
       
        
       
    }
    public void resta() {
        double resultado;
  resultado = Num1 - Num2;
        System.out.println( "La " + operacion + " del numero " + Num1 + " y el numero " + Num2 + " es " + resultado );
        
         
        
     }
     public void multiplicacion() {
        double resultado;
  resultado = Num1 * Num2;
        System.out.println( "La " + operacion + " del numero " + Num1 + " y el numero " + Num2 + " es " + resultado );
        
         
        
     }
     public void division() {
        double resultado;
  resultado = Num1 / Num2;
        System.out.println( "La " + operacion + " del numero " + Num1 + " y el numero " + Num2 + " es " + resultado );
        
         
        
     }
     public void Residuo() {
        double resultado;
  resultado = Num1 % Num2;
        System.out.println( "La " + operacion + " del numero " + Num1 + " y el numero " + Num2 + " es " + resultado );
        
         
        
     }
     public void Potencia() {
        double resultado;
  resultado = Math.pow( Num1, Num2 );
        System.out.println( "La " + operacion + " del numero " + Num1 + " y el numero " + Num2 + " es " + resultado );
        
         
        
     }
}

public class AplicacionesConstructores {

    public static void main(String[]arg){

     String opera;
     double Num1;
     double Num2;
    
        Scanner Datos = new Scanner ( System.in );



        System.out.println( "\t.:Escriba el nombre completo de la operacion que desea realizar:." );
opera = Datos.next();
opera = opera.toUpperCase();


System.out.println( "Diga el valor de numero 1" );
Num1 = Datos.nextDouble();
System.out.println( "Diga el valor de numero 2" );
Num2 = Datos.nextDouble();

Operaciones Carro2 = new Operaciones( opera, Num1,Num2 ); 

        switch( opera ){
case "SUMA":

 Carro2.suma();

break;
case "RESTA":

Carro2.resta();

break;
case "MULTIPLICACION":

Carro2.multiplicacion();

break;
case "DIVISION":

Carro2.division();

break;
case "RESIDUO":

Carro2.Residuo();

break;
case "POTENCIA":

Carro2.Potencia();

break;
default:

System.out.println( "Error, Operacion no encontrada, escribalo mejor" );
        break;
  }


        




    }
        
             }  
    