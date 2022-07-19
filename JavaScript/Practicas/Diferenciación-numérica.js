/*Diferenciación numéricas con diferenciación:
-Diferenciacion hacia adelante
-Diferenciacion hacia atras
-Diferenciacion centrada

*/
const xi_2 = 0, xi_1 = 0.25, xi = 0.5, xi1 = 0.75, xi2 = 1;
const fxi_2 = 1.2, fxi_1 = 1.103516, fxi = 0.925, fxi1 = 0.6363281, fxi2 = 0.2;
const valorVerdadero = -0.9125;
let derivada_F, Et;

// Diferencia hacia adelante O(h2)
derivada_F = ( -fxi2 + 4 * fxi1 - 3 * fxi ) / ( 2 * xi_1 );
console.log( 'La diferencia hacia adelante es: ' ,derivada_F );

Et = (( valorVerdadero - derivada_F ) / valorVerdadero) * 100 ;
console.log( 'El error relativo porcentual es:',Et, "%" );

// Diferencia hacia atras O(h2)
derivada_F = ( 3 * fxi - 4 * fxi_1 + fxi_2 ) / ( 2 * xi_1);
console.log( 'La diferencia hacia atras es: ' , derivada_F );

Et = (( valorVerdadero - derivada_F ) / valorVerdadero) * 100 ;
console.log( 'El error relativo porcentual es:', Et , "%" );

// Diferencia centrada O(h4)
derivada_F = ( -fxi2 + 8 * fxi1 - 8 * fxi_1 + fxi_2) / ( 12 * xi_1);
console.log( 'La diferencia centrada es: ' , derivada_F );

Et = ((( valorVerdadero - derivada_F ) / valorVerdadero) * 100) * -1;
console.log( 'El error relativo porcentual es:', Et , "%" );