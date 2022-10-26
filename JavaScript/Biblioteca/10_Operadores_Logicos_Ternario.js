/*
El operador ternario es un comparador el cual dependiendo si la comparacion es verdadera o falsa 
lanzara un resultado u otro

se escribe de la siguiente manera:

"Condicion" ? "Resultado si es verdadera la condicion" : "Resultado si es falsa la condicion"

son importantes los signos de "?" y de ":"
*/

//Resultados tipo string
let numero = 12;

let resultado = numero % 2 == 0 ? "El numero es par" : "El numero es impar";

console.log( resultado );

//Resultados tipo verdadero o falso

let resulta = 4 > 10 ? true : false;

console.log( resulta );

//Resultado tipo entero

let vari = 2 < 10 ? 2 : 10;

console.log( vari );

//Nota: se pueden combinar los tipos de resultados como si estubieras imprimiendola en la consola

let va = 2 != 34 ? 2 + " es distinto a " + 34 : 2 + " no es distinto " + 34;

console.log( va );

//Otra forma de ver este operador convinando otros operadores
let b = 1, a = 5;

let otra = b != 1 && a < 1 || b == 3 ? b + " si es distinto a 0 y " + a + " es menor a 10" : b + " no es distinto a 0 y " + a + " no es menor a 10";

console.log( otra );

