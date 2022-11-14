

class transporte{
private int Nollantas;
private String marca;
private double porceGasolina;

public transporte(int Nollantas, String marca, double porceGasolina){
this.Nollantas = Nollantas;
this.marca = marca;
this.porceGasolina = porceGasolina;


}
public int getNollantas(){
    return Nollantas;
}

public String getmarca(){
    return marca;
}

public double getporceGasolina(){
    return porceGasolina;
}

}


class automovil extends transporte{
private int NoAsientos;
private String matricula;

public automovil(int Nollantas,String marca, double porceGasolina, int NoAsientos, String matricula){
super(Nollantas, marca, porceGasolina);
this.NoAsientos = NoAsientos;
this.matricula = matricula;
    
}
public void tipoAuto(){
    System.out.println("\t.:Datos del automovil:.");
    System.out.println("Cuenta con: " + getNollantas() + " llantas\n" + "Es de la marca: " + getmarca() + "\nCuenta con " + getporceGasolina() + "% de gasolina\n" + "Tiene " + NoAsientos + " Asientos\n" + "Su matricula es: " + matricula);

}

}




















public class HerenciaEjercicio {
    public static void main(String[]arg){
automovil automovil = new automovil(4, "Nissan", 34.23, 7, "L32OPE");
automovil.tipoAuto();

    }
}
