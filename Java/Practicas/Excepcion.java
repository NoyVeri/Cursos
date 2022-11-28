import java.util.InputMismatchException;
import java.util.Scanner;




class OptencionNumero{
 int N1;
 int N2;


public OptencionNumero( int N1, int N2 ){
    this.N1 = N1;
 this.N2 = N2;



}

public void division() throws ArithmeticException{
try {
   double resultado;
resultado = N1 / N2;

    System.out.println( "El Recultado de la divicion es: " + resultado );
}catch( ArithmeticException e ){
    System.out.println( "\t.:Cualquier numero dividido entre 0 Es Imposible:." );
}
}
}











public class Excepcion {
   
    public static void main(String[]arg) throws InputMismatchException{

int helpN1;
int helpN2;
Scanner Almacen = new Scanner ( System.in );

try{
    System.out.println( "\t.:CALCULADORA DE DIVICIONES:." );

System.out.println( "Diga cual es el valor del Dividendo: " );
helpN1 = Almacen.nextInt();

System.out.println( "Diga cual es el valor del Divisor: " );
helpN2 = Almacen.nextInt();

OptencionNumero opera = new OptencionNumero ( helpN1,helpN2 );

opera.division();

}catch (InputMismatchException ed){
    System.out.println( "\t.:Tampoco se aceptan decimales:." );
}


    }
}
