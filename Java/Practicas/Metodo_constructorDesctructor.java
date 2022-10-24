class Automovil {
    
    String marca;
    int cilindros;
    char transmicion;
     int año;
    
    public Automovil(String marca, int cilindros, char transmicion, int año) {
        this.marca = marca;
        this.cilindros = cilindros;
        this.transmicion = transmicion;
        this.año = año;
        
    }

    
    public void datos() {
       
       System.out.println("La marca del auto es "+ marca);
       System.out.println("Cuentan con "+ cilindros+" cilindros");
       System.out.println("Cuenta con una transmicion tipo " + transmicion);
       System.out.println("Es del año " + año); 
        
       
    }
   
}
public class Metodo_constructorDesctructor {

    public static void main(String[]arg){
    
        
        Automovil Carro2 = new Automovil("Ford", 4, 'N',2002); 
        Carro2.datos();
        
    }
        
             }  
    