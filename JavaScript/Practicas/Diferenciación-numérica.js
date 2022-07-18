const xi_2 = 0, xi_1 = 0.25, xi = 0.5, xi1 = 0.75, xi2 = 1;
const fxi_2 = 1.2, fxi_1 = 1.103516, fxi = 0.925, fxi1 = 0.6363281, fxi2 = 0.2;
let derivada_F;

derivada_F = ( -fxi2 + 4 * fxi1 - 3 * fxi ) / ( 2 * xi_1 );

console.log( derivada_F );