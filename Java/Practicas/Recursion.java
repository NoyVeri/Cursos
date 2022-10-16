import java.util.Scanner;
/**ejercicio de Recursion de dos numeros 
 * @author Manuel Dominguez
 */
public class Recursion{
      Scanner dato = new Scanner(System.in);
/**Se crea la variable donde se va almacenar los datos que necesitamos para hacer la suma de recursion
 * mediante if y un bucle mostramos los resultados de esas sumas
 * 
 * @param a se almacena el valor que va tener a
 * @param b se almacena el valor que va tener b
 */
     public void suma(int a, int b){
        System.out.println("Digame el valor que tiene a: ");
		  a = dato.nextInt(); 
		  System.out.println("Digame el valor que tiene b: ");
		 b = dato.nextInt();
         if( a == 0 ){
           System.out.println( "La suma es " + b );


         }else if( b == 0 ){
            System.out.println( "La suma es " + a );
            
         }else {
           System.out.println( "--------------------" );
           int h = b - 1;
            for(int w = 0; w <= h; w++){
            
                b -= 1;
            int sum = a + b;
            int al = a + b;
            sum += 1;
            System.out.println( "Suma"+"("+ a + "," + b + ")" + " es " + al + " ->" + " 1 " + "+ " + al + " == " + sum );
            }
         }
		 }





/**
 * mediante la clase ejercicio creamos una tabla para llamar a suma
 * @param arg
 */

    public static void main(String[]arg){
      Recursion tabla = new Recursion();
      tabla.suma(0, 0);
        
    
    }


}