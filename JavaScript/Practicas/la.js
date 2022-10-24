/*
split separa los caracteres en un arreglo
reverse invertira los elementos
join los unira
*/

// ejercicio de saber si una palabra es palindroma
let palabra = "ojo";
let revertir = reverse( palabra );

function reverse( frase ){
   
    return frase.split( "" ).reverse().join( "" );
}





if( revertir == palabra ){
console.log( "\t.:La palabra es palindroma:.\n" + revertir );


}else{
    console.log( "\t.:La plabra no es palindorma:.\n" + revertir );
}
