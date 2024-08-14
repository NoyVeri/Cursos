let frutas = ['Manzana','Pera','Freza'];
let  PrimeraFruta = frutas[0];

let  UltimaFruta = frutas[frutas.length - 1 ];

console.log(PrimeraFruta,UltimaFruta);

frutas.forEach(function (elemento, indice, array) {
    console.log(elemento, indice);
  })