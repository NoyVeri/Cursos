import java.util.InputMismatchException;
import java.util.Scanner;

class Materia {
private String NombreMateria;
private double calf1;
private double calf2;
private double calf3;
private String Maestro;
private double prom;

public Materia( String Maestro, String NombreMateria, double calf1, double calf2, double calf3){
    this.Maestro = Maestro;
    this.calf1 = calf1;
    this.calf2 = calf2;
    this.calf3 = calf3;
    this.NombreMateria = NombreMateria;


}

public String getMaestro(){
    return Maestro;
   
   }
   public String getNombreMateria(){
    return NombreMateria;
   
   }public double getcalf1(){
    return calf1;
   
   }public double getcalf2(){
    return calf2;
   
   }public double getcalf3(){
    return calf3;
   
   }public double getprom(){
    return (calf1*.3) + (calf2*.3) + (calf3*.4);
   }

   
    public String mostrarDatos(){
   return "\nEn la materia " + getNombreMateria() + "\nSaco como promedio un " + getprom() + "\n-------------------------------------------------";
}



    
}

class estudiante extends Materia{
private String Nombre;
private int NoControl;
private String Apellido;

 




public estudiante(String Maestro, String NombreMateria, double calf1, double calf2, double calf3, String Nombre, String Apellido, int NoControl){
    super(Maestro, NombreMateria, calf1, calf2, calf3);
this.NoControl = NoControl;
this.Nombre = Nombre;
this.Apellido = Apellido;



}


@Override
public String mostrarDatos(){
    return "El estudainte " + Nombre + " " + Apellido + "\nCon el numero de control " + NoControl + "\nEn la materia " + getNombreMateria() + "\nSaco como promedio un " + getprom() + "\n-------------------------------------------------";
}

}




























public class ProyectoFinal {
   
    public static void main(String[]arg)throws InputMismatchException{
try{Scanner datos = new Scanner( System.in );
System.out.println( "\t.:CALCULADORA DE PROMEDIO DE MATERIAS:.\n" );

System.out.println("Cuantas materias son: ");
int mater = datos.nextInt();
int lo = mater -1;
Materia Prueba [] = new Materia [mater];



    
System.out.println("Diga el nombre del maestro: ");
String maest = datos.next();

System.out.println("Diga el nombre del estudiante: ");
String nomb = datos.next();

System.out.println("Diga el apellido del estudiante: ");
String Ape = datos.next();

System.out.println("Diga el numero de control del estudiante: ");
int numcontrol = datos.nextInt();

System.out.println("Diga el nombre de la materia");
String mate = datos.next();

System.out.println("Calificacion del primer parcial: ");
double cal1 = datos.nextDouble();
System.out.println("Calificacion del segundo parcial: ");
double cal2 = datos.nextDouble();
System.out.println("Calificacion del tercer  parcial: ");
double cal3 = datos.nextDouble();



    Prueba [0] = new estudiante(maest, mate,cal1,cal2, cal3, nomb, Ape, numcontrol);
    System.out.println("----------------------------------------------------------------------------------");
   
    for(int i = 1; i <= lo; i++){
    System.out.println("Diga el nombre del maestro: ");
    String maestr = datos.next();


    System.out.println("Diga el nombre de la materia");
    String materi = datos.next();

    
    System.out.println("Calificacion del primer parcial: ");
    double calf1 = datos.nextDouble();
    System.out.println("Calificacion del segundo parcial: ");
    double calf2 = datos.nextDouble();
    System.out.println("Calificacion del tercer  parcial: ");
    double calf3 = datos.nextDouble();


Prueba [i] = new Materia(maestr, materi, calf1, calf2, calf3);
System.out.println("----------------------------------------------------------------------------------");
}




for(Materia Operacion : Prueba){
    System.out.println(Operacion.mostrarDatos());
    
    }
}catch(InputMismatchException ed){
    System.out.println( "\t.:Trato de escribir un dato distinto al que se pide" );
    }
}
}