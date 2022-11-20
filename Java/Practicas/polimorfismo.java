class Operacion{
    private double N1;
    private double N2;
    
    public Operacion(Double N1, Double N2){
    this.N1 = N1;
    this.N2 = N2;
    
    }
    public double getN1(){
    return N1;
    
    }
    public double getN2(){
        return N2;
    }
    public String mostrarDatos(){
        return "\t.:Valores:."+"\nValor 1: "+ N1+"\nValor 2: "+N2;
    }
    
    }
    
    
    
    
    
    
    class Suma extends Operacion{
    private double sumaValores = getN1() + getN2();
    
    public Suma(Double N1,Double N2){
    super(N1, N2);
    
    
    }
    
    
    @Override
    public String mostrarDatos(){
        return "\t.:Suma de los valores:.\n" + "Valor 1: "+ getN1() +"\nValor 2: "+ getN2()+"\nResultado de la suma: "+sumaValores + "\n";
    }
    
    }
    
    
    
    
    
    
    class Resta extends Operacion{
        private double restaValores = getN1() - getN2();
        
        public Resta(Double N1,Double N2){
        super(N1, N2);
        
        
        }
        
        
        @Override
        public String mostrarDatos(){
            return "\t.:Resta de los valores:.\n" + "Valor 1: "+ getN1() +"\nValor 2: "+ getN2()+"\nResultado de la resta: "+restaValores + "\n";
        }
        
        }
    
    
    
    
    
    
        class Multiplicacion extends Operacion{
            private double MultiplicacionValores = getN1() * getN2();
            
            public Multiplicacion(Double N1,Double N2){
            super(N1, N2);
            
            
            }
            
            
            @Override
            public String mostrarDatos(){
                return "\t.:Multipliacion de los valores:.\n" + "Valor 1: "+ getN1() +"\nValor 2: "+ getN2()+"\nResultado de la Multiplicacion: "+MultiplicacionValores + "\n";
            }
            
            }
    
    
    
    public class polimorfismo {
        public static void main(String[]arg){
    Operacion misOperaciones [] = new Operacion [4];
    
    misOperaciones [0] = new Operacion(1.0, 2.0);
    misOperaciones [1] = new Suma(1.0, 2.0);
    misOperaciones [2] = new Resta(2.2, 12.2);
    misOperaciones [3] = new Multiplicacion(34.3, 2.1);
    
    
    for(Operacion Operacion : misOperaciones){
    System.out.println(Operacion.mostrarDatos());
    
    }
    
    
        }
    }
    