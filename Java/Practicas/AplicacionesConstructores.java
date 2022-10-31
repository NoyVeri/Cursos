/*Librerias que necesite para darle un mejor programa
-la primera permite que el usuario ingrese datos
-la segunda hace que la consola pueda limpiarse
*/
import java.util.Scanner;
import java.io.IOException;
class Operaciones {
    
   String operacion;
    double Num1;
    double Num2;
    
    //Se les da un identificador a las variables que deseamos utilizar
    public Operaciones( String operacion,double Num1, double Num2 ) {
        this.operacion = operacion;
        this.Num1 = Num1;
        this.Num2 = Num2;
        
    }

    //Lugar donde se realizan las operaciones de sumas
    public void suma() {
       double resultado;
 resultado = Num1 + Num2;
 System.out.println( "----------------------------------------------------------" );
       System.out.println( "La " + operacion + " del numero " + Num1 + " y el numero " + Num2 + " es " + resultado );
       
        
       
    }
    //Lugar donde se realizan las operaciones de resta
    public void resta() {
        double resultado;
  resultado = Num1 - Num2;
  System.out.println( "----------------------------------------------------------" );
        System.out.println( "La " + operacion + " del numero " + Num1 + " y el numero " + Num2 + " es " + resultado );
        
         
        
     }
     //Lugar donde se realizan las operaciones de multiplicacion
     public void multiplicacion() {
        double resultado;
  resultado = Num1 * Num2;
  System.out.println( "----------------------------------------------------------" );
        System.out.println( "La " + operacion + " del numero " + Num1 + " y el numero " + Num2 + " es " + resultado );
        
         
        
     }
     //Lugar donde se realizan las operaciones de division
     public void division() {
        double resultado;
  resultado = Num1 / Num2;
  System.out.println( "----------------------------------------------------------" );
        System.out.println( "La " + operacion + " del numero " + Num1 + " y el numero " + Num2 + " es " + resultado );
        
         
        
     }
     //Lugar donde se realizan las operaciones de residuo
     public void Residuo() {
        double resultado;
  resultado = Num1 % Num2;
  System.out.println( "----------------------------------------------------------" );
        System.out.println( "La " + operacion + " del numero " + Num1 + " y el numero " + Num2 + " es " + resultado );
        
         
        
     }
     //Lugar donde se realizan las operaciones de potencias
     public void Potencia() {
        double resultado;
  resultado = Math.pow( Num1, Num2 );
  System.out.println( "----------------------------------------------------------" );
        System.out.println( "La " + operacion + " del numero " + Num1 + " y el numero " + Num2 + " es " + resultado );
        
         
        
     }
}

public class AplicacionesConstructores {

    public static void main(String[]arg)  throws IOException, InterruptedException{

     String opera;
     double Num1;
     double Num2;
     int desi;
     int ayu = 1;
        Scanner Datos = new Scanner ( System.in );

        //bucle para mostrar los datos en la pantalla y poder hacer que se repita las veces que desee el usuario
for(int i = 1; i <= ayu; i++){
    
    System.out.println( "\t.:Escriba el nombre completo de la operacion que desea realizar:." );
    opera = Datos.next();
    opera = opera.toUpperCase();
    
    
    System.out.println( "Diga el valor de numero 1" );
    Num1 = Datos.nextDouble();
    System.out.println( "Diga el valor de numero 2" );
    Num2 = Datos.nextDouble();
    
    Operaciones Carro2 = new Operaciones( opera, Num1,Num2 ); 
    //Dependiendo lo que desea el usuario se relizara el llamado a la clase operaciones 
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
System.out.println( "----------------------------------------------------------" );
      System.out.println( "\t.:¿Desea Hacer otra operacion?, favor de escribir el numero:.\n" + "1.Si\n" + "2.No\n" + "3.Lista de Opreciones" );
desi = Datos.nextInt();

//Proceso para repetir la eleccion de operaciones, ver lista de operaciones admitidas o cerrar programa
        switch ( desi ) {
    case 1:
    ayu += desi;
    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); 
        break;

    case 3: 
        System.out.println( "\n-Suma\n" + "-Resta\n" + "-Multiplicacion\n" + "-Division\n" + "-Residuo\n" + "-Potencia" );
        ayu ++;
        break;

    default:
    System.out.println( "Gracias por Usar el Programa" );
        break;
}

    
}


        

        




    }
        
             }  
    