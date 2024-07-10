import java.util.Scanner;
public class practica1 {

    public static void main(String[]arg){

   
     int a;
     int b;
     int c;
     int resultado = 0;

        Scanner Datos = new Scanner ( System.in );

 System.out.println("\t.:para verificar si es un triangulo es necesario que nos expreses dichos angulos:.\n");
    
    System.out.println( "Diga el valor del primer angulo" );
    a= Datos.nextInt();
    System.out.println( "Diga el valor del segundo angulo" );
     b= Datos.nextInt();
    System.out.println( "Diga el valor del tercer angulo" );
    c = Datos.nextInt();
   
    resultado = a + b + c;

if(resultado == 180){
   if(a >0 && b >0 && c >0){
      System.out.println("Es un triangulo");
   }else{
      System.out.println("un angulo es igual o menor que cero");}

}else{
System.out.println("No es un triangulo");

} 



    }

        
             }  
    