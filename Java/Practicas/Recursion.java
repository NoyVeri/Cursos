import java.util.Scanner;
public class Recursion{
      Scanner dato = new Scanner(System.in);

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







    public static void main(String[]arg){
      Recursion tabla = new Recursion();
      tabla.suma(0, 0);
        
    
    }


}