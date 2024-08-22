/*
Probando el funcionamiento de los arreglos en todas sus funciones en un programa que maneja partes de un ordenador


*/

let Ordenador = ['CPU','GPU','8 GB RAM','MotherBoard','Fuente','Gabinete'];

//Aqui mostramos la longitud de nuestro arreglo
console.log(Ordenador.length);

/*
La forma de ver algun valor del arreglo es la siguiente

*/
console.log(Ordenador[4]);

// para recorrer un arreglo se pueden hace de diversas maneras como son las siguientes

Ordenador.forEach(function(element,index, array){

    console.log(element,index);
});


Ordenador.forEach((element,index, array) =>{
  console.log(element,index);
});



  for (let valor of Ordenador){
   
    console.log(valor);
  i = 5;
  
  }

  Ordenador.forEach((value) => {
    console.log(value);
    
  });
  