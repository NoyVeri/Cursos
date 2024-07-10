import java.util.Scanner;
public class Practica2 {
    public static void main(String[]arg){

        double cant;
        double desc;
        double costoTot;

           Scanner Datos = new Scanner ( System.in );
   
    System.out.println("\t.:aplicaion para calcular el costo total:.\n");
       
       System.out.println( "Digame la cantidad" );
       cant= Datos.nextInt();
       
       double costo1 = cant*125;
       double numcaj= 0.5 + cant/4;
       double flete = numcaj*50;
       
       
if( cant > 1000 ){
desc = costo1 * 0.1;
costoTot = costo1 + flete - desc;
}else if (cant > 100 ){

desc = costo1 * 0.05; 
costoTot = costo1 + flete - desc;

}else{
    desc = 0; 
costoTot = costo1 + flete - desc;
}
System.out.println("El costo total es: " + costoTot + "\nEl Numcaj es de: " + numcaj + "\nEl descuenton que tiene es de: " + desc);

    }
}
