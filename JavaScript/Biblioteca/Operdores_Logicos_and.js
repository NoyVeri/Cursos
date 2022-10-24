/*el operador &&(AND) nos sirve para hacer dos comparaciones, es decir
"si A es mayor a 3 Y menor a 7"

a > 3 && a < 7

por lo cual este operador obliga que ambas comparaciones se cumplan, de lo contrario no se realizaria 
el programa
*/
let a = 0, b = 40, c = 20;
const valorMinimo = 10, valorMaximo = 32;

// cuando ninguna de las condiciones se cumple
if( a >= valorMinimo && a <= valorMaximo ){

console.log( "Entra en el rango" );

}else{
console.log( "No entra en el rango" );

}
//cuando una de las condiciones se cumple, b mayor al minimo pero no menor al maximo
if( b >= valorMinimo && b <= valorMaximo ){

    console.log( "Entra en el rango" );
    
    }else{
    console.log( "No entra en el rango" );
    
    }
    //cuando las dos condiciones se cumplen
    if( c >= valorMinimo && c <= valorMaximo ){

        console.log( "Entra en el rango" );
        
        }else{
        console.log( "No entra en el rango" );
        
        }