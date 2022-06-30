
const valorVerdadero = 0.6931472;
let fx, fx0,x1,fx1,error,errorRelativoPorcentual;
// interpolacion x0 = 1 hasta x1 = 6
fx0 = 0;
fx1 = 1.791759;
x1 = 6;
x0 = 1;
x = 2;
fx1 = fx1 - fx0;
x1 = x1 - x0;
x = x - x0;
fx = fx0 + (fx1/x1)*x;
console.log( fx );

error = fx - valorVerdadero;
error = error * -1;
console.log(error);
errorRelativoPorcentual = (error/valorVerdadero)*100;
console.log( errorRelativoPorcentual, "%" );

// interpolacion x0 = 1 hasta x1 = 4
fx0 = 0;
fx1 = 1.386294;
x1 = 4;
x0 = 1;
x = 2;
fx1 = fx1 - fx0;
x1 = x1 - x0;
x = x - x0;
fx = fx0 + (fx1/x1)*x;
console.log( fx );

error = fx - valorVerdadero;
error = error * -1;
console.log(error);
errorRelativoPorcentual = (error/valorVerdadero)*100;
console.log( errorRelativoPorcentual, "%" );
