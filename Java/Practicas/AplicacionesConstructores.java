
import java.util.Scanner;
import java.io.IOException;
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
 System.out.println( "----------------------------------------------------------" );
       System.out.println( "La " + operacion + " del numero " + Num1 + " y el numero " + Num2 + " es " + resultado );
       
        
       
    }
    public void resta() {
        double resultado;
  resultado = Num1 - Num2;
  System.out.println( "----------------------------------------------------------" );
        System.out.println( "La " + operacion + " del numero " + Num1 + " y el numero " + Num2 + " es " + resultado );
        
         
        
     }
     public void multiplicacion() {
        double resultado;
  resultado = Num1 * Num2;
  System.out.println( "----------------------------------------------------------" );
        System.out.println( "La " + operacion + " del numero " + Num1 + " y el numero " + Num2 + " es " + resultado );
        
         
        
     }
     public void division() {
        double resultado;
  resultado = Num1 / Num2;
  System.out.println( "----------------------------------------------------------" );
        System.out.println( "La " + operacion + " del numero " + Num1 + " y el numero " + Num2 + " es " + resultado );
        
         
        
     }
     public void Residuo() {
        double resultado;
  resultado = Num1 % Num2;
  System.out.println( "----------------------------------------------------------" );
        System.out.println( "La " + operacion + " del numero " + Num1 + " y el numero " + Num2 + " es " + resultado );
        
         
        
     }
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
for(int i = 1; i <= ayu; i++){
    
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
System.out.println( "----------------------------------------------------------" );
      System.out.println( "\t.:¿Desea Hacer otra operacion?, favor de escribir el numero:.\n" + "1.Si\n" + "2.No\n" + "3.Lista de Opreciones" );
desi = Datos.nextInt();
if(desi == 1){

    ayu += desi;
    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); 
}else if( desi == 3){
    System.out.println( "\n-Suma\n" + "-Resta\n" + "-Multiplicacion\n" + "-Division\n" + "-Residuo\n" + "-Potencia" );
    
}else{
    System.out.println( "Gracias por Usar el Programa" );
}
    
}


        

        




    }
        
             }  
    