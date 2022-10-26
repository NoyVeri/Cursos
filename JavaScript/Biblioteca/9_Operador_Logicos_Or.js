/*
El operador OR nos sirve para hacer 2 comparaciones, si cualquiera de las 2 se cumple hace el proceso que deseamos
por ejemplo:
si a > 10 or a == 20

simbolo para utilizar or es: ||

*/
let vacaciones = true, diaDescanso = false;

if( vacaciones == true  || diaDescanso == true){

    console.log( "\t.:Puede faltar al trabajo:.\n" );
}else{
    console.log( "\t.:No puede faltar al trabajo:.\n" );
}
