/*
Los operadores de asignacion son aquellos que usamos para dar un valor a una variable, el más comun es "="
el cual hace que cualquier valor que pongamos despues del "=" se almacene en la variable.

pero tambien hay variantes de este mismo, el cual proboca la realizacion de diferentes operaciones 
dependiendo el que se utilice,normalmente se representa con la operación aritmetica que necesites y 
despues el "=" para que el VALOR QUE TIENE LA VARIABLE REALICE LA OPERACION ARITMETICA QUE LE MANDASTE A HACER.

es decir que a *= 2 es lo mismo que a = a * 2;
+-**%
*/
// Primer tipo "=" sirve para almacenar cualquier valor en una variable
let a = 12;
console.log( a );

//Segundo tipo "*=" sirve para que el valor almacenado antes se multiplique por un valor que le demos
a = 5;
a *= 2;
console.log( a );
//Tercer tipo "/=" sirve para dividir el valor de la variable por el numero dado 
a = 12;
a /= 2;
console.log( a );