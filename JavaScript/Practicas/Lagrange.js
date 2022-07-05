let x0 = 1, x1 = 4, x2 = 6, x = 2;
let fx0 = 0, fx1 = 1.386294, fx2 = 1.791760, f2x;

f2x = ((( x - x1 ) * ( x - x2 )) / (( x0 - x1 ) * ( x0 - x2 ))) * fx0;
f2x = f2x + ((( x - x0 ) * ( x - x2 )) / (( x1 - x0 ) * ( x1 - x2 ))) * fx1;
f2x = f2x + ((( x - x0 ) * ( x - x1 )) / (( x2 - x0 ) * ( x2 - x1 ))) * fx2;


console.log(" El Resultado es: ", f2x , " Cuando es de segundo grado in 2");