// en esta practica se lleva a acabo las pruebas que surgan con el let y el const

/* ejercicio de ejemplo: hacer que si te dan permiso a salir imprima un siuu, de lo contrario
mandar a imprimir un chale que mala onda 
*/

let jefa = 'si';
const jefe = 'si';

if(jefa == 'si'){
console.log("preguntale a tu padre");
console.log("*le pregunta xd*");

if(jefe == 'si'){
console.log("dijo que si jefa");
console.log("jefa: entonces no vas");
jefa = 'no';
if(jefa != 'si'){
console.log("con todo respeto pero, chingue su madre jefa");
console.log("jefa: que dijiste chamaco cagado *le pega*");
console.log("ya jefa no sea mamona ");
}
    
}else if (jefe != 'si'){

    console.log("chale que mala onda jefe");
}

}else if (jefa != 'si'){

console.log("chale que mala onda jefa");
console.log("*se hace mariguano*");

}