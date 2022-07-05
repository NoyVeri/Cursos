/*
Cada operador tiene un rango de prioridad, el cual dependiendo de este se realizaria primero
o despues de otro operador.

cuando los dos operadores tienen el mismo rango de prioridad, se hara el pimero que se encuentre de
izquierda a derecha es decir : 2*2*3, primero se hara el 2 * 2 cuyo resultado sera multiplicado por 3
lo cual nos queda el resultado de 12.

*/

// Primer rango se encuentran los parentecis, lo cual la operacion que se encuentra dentro se realizara primero

let a = 2, b = 2, c = 3;


z = a * b + c;
console.log( z );

z = a * ( b + c );
console.log( z );

// Segundo rango se encuentran los incrementos o decrementos ( ++, -- )

z = a + --b;
console.log ( z );

// Tercer rango se encuentran los operadores de multipliacion, divicion y modulo ( *, /, % )
b = ++b;

z = a + b * c;
console.log( z );

//Cuarto rango se encuentra la adiccion y la substraccion ( + y - )

