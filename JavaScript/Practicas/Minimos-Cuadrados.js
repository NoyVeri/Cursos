//Método mínomos cuadrados
let totalX = 55, totalY = 57, totalXY = 233, totalX2 = 473, n = 9;
let m,b, x,y;

m = ( totalXY - (totalX * totalY) / n ) / (totalX2 - (totalX**2) / n );
console.log( m );

b = ( totalY / n ) - m * (totalX / n );
console.log( b );

y = b;
x = y / - m;
console.log( x );

console.log( "Las cordenadas de X son: ",x,"las cordenadas de Y son:",y );