let a = 1, b = 2, c = 3, d = 4;
let z;
// Incremento:
/*Pre-incremento (el operador ++ antes de la variable) 
-Es decir, que cuando "a" tenga un valor, cuando sea almacenada en otra variable esta aumentara antes de ser
asignada a esta nueva variable.

-Siendo que si antes tenia '1' al asignarse a otra variable esta aumentara a '2' siendo este valor el que
se almacena

-es decir si 'a' tiene un valor de '1' este aumentara a '2' ANTES de ser asignado a 'z'
*/
console.log( a );

z = ++a;

console.log( a );
console.log( z );

/*Post-Incremento (el operador ++ despues de la variable) 
-El valor de una variable aumentara despues de ser asignado a otra variable 

-Siendo que si 'b' tiene un '1' despues de ser almacenada en otra variable este sera '2'

-es decir que si 'b' tiene el valor de '1' este aumentara DESPUES de ser asignado a 'z' 
*/
console.log(b);

z = b ++;

console.log(b);
console.log(z);

// Decremento:
/*Pre-decremento (el operador -- antes de la variable) 
-Es decir, que cuando "a" tenga un valor, cuando sea almacenada en otra variable este disminuye antes de ser
asignada a esta nueva variable.

-Siendo que si antes tenia '2' al asignarse a otra variable este disminuye a '1' siendo este valor el que
se almacena

-es decir si 'a' tiene un valor de '2' este disminiye a '1' ANTES de ser asignado a 'z'
*/
console.log( c );

z = --c;

console.log( c );
console.log( z );

/*Post-decremento (el operador ++ despues de la variable) 
-El valor de una variable aumentara despues de ser asignado a otra variable 

-Siendo que si 'b' tiene un '1' despues de ser almacenada en otra variable este sera '2'

-es decir que si 'b' tiene el valor de '1' este aumentara DESPUES de ser asignado a 'z' 
*/