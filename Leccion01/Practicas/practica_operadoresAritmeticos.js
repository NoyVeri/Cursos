// formula general

let a = 2,b = 9,c = 10;
let xPositivo;
let xNegativo;
let raiz;
let divicion;
let suma;
let union;

union = b ** 2 - 4 * a * c;
raiz = Math.sqrt( union );
divicion = 2 * a;
suma = -b + raiz;
xPositivo = suma / divicion;
console.log( "Valor de X1 :" + xPositivo );

union = b ** 2 - 4 * a * c;
raiz = Math.sqrt( union );
divicion = 2 * a;
suma = -b - raiz;
xNegativo = suma / divicion;
console.log( "Valor de X2 :" + xNegativo );