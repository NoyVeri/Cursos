class Persona {
private int Edad;
private String Nombre;
private String Apellido;

public Persona(int Edad,String Nombre,String Apellido){
this.Edad = Edad;
this.Nombre = Nombre;
this.Apellido = Apellido;

}

public int getEdad(){
    return Edad;
}

public String getNombre(){
    return Nombre;
}

public String getApellido(){
    return Apellido;
}


}

class Alumno extends Persona{
private int Grado;
private Double Promedio;

public Alumno(int Edad,String Nombre,String Apellido,int Grado,Double Promedio){
super(Edad, Nombre, Apellido);
this.Grado = Grado;
this.Promedio = Promedio;
}

public void DatoAlumno(){
    System.out.println("\t.:Datos del Alumno:.");
System.out.println("Nombre: " + getNombre() + "\nApellido: " + getApellido() + "\nEdad: " + getEdad() +" años"+ "\nGrado: " + Grado + "\nPromedio: " + Promedio);
System.out.println( "-----------------------------------------------------------------" );

}

}


class Maestro extends Persona{
private String Materia;
private String Escuela;

public Maestro(int Edad,String Nombre,String Apellido,String Materia,String Escuela){
super(Edad, Nombre, Apellido);
this.Materia = Materia;
this.Escuela = Escuela;
}

public void DatoMaestro(){
System.out.println( "\t.:Datos del Maestro:." );
System.out.println( "Nombre: " + getNombre() + "\nApellido: " + getApellido() + "\nEdad: " + getEdad() +" años"+ "\nMateria: " + Materia + "\nEscuela: " + Escuela );
System.out.println( "-----------------------------------------------------------------" );
}

}

class Administracion extends Persona{
private String puestoAdmin;
private int añosAntiguedad;

public Administracion(int Edad,String Nombre,String Apellido,String puestoAdmin,int añosAntiguedad){
super(Edad, Nombre, Apellido);
this.puestoAdmin = puestoAdmin;
this.añosAntiguedad = añosAntiguedad;
}
public void DatoAdministrativo(){
System.out.println( "\t.:Datos del Administrador:." );
System.out.println( "Nombre: " + getNombre() + "\nApellido: " + getApellido() + "\nEdad: " + getEdad() +" años"+ "\nPuesto: " + puestoAdmin + "\nAntiguedad: " + añosAntiguedad +" años");
System.out.println( "-----------------------------------------------------------------" );


}

}

















public class Herencia {
    public static void main(String[]arg){

        Alumno estudiante = new Alumno(10, "Alejandro", "Perez", 10, 9.3);
    
    estudiante.DatoAlumno();
    
Maestro maestro = new Maestro(34, "Jesus", "Gonzalez", "Algebra", "Escuela Lopez");

maestro.DatoMaestro();

Administracion Admin = new Administracion(34, "Bryan", "Saens", "Gerente", 10);

Admin.DatoAdministrativo();
}
}
