let a = 0, b = 1, m = 5;
let fx0 = 1.13, fx1 = 2.15, fx2 = 3.16, fx3 = 4.35, fx4 = 4.69, fx5 = 5;
let am;
am =  b-a   ;
m = m * 2;
am =  am / m ;
am = am * ( fx0 + 2*fx1 + 2*fx2 + 2*fx3 + fx4 + fx5 );


console.log( "El resultado de la integral es:",am );