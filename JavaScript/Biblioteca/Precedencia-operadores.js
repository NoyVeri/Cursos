/*
Cada operador tiene un rango de prioridad, el cual dependiendo de este se realizaria primero
o despues

*/

// Primer rango se encuentran los parentecis, lo cual la operacion que se encuentra dentro se realizara primero

let a = 2, b = 2, c = 3;


z = a * b + c;
console.log( z );

z = a * ( b + c );
console.log( z );

//