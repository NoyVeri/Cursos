
let persona = {
datosPersona1:{
nombreCompleto: 'Juan Adame',
apellidoCompleto: 'Pepe Irino',
edad: 10,
sexo: 'masculino',
estudia: 'si'
},
datosPersona2:{
    nombreCompleto: 'Alama',
    apellidoCompleto: 'Marcela Goso',
    edad: 14,
    sexo: 'femenino',
    estudia: 'si'
}
    
};

if( persona.datosPersona1.edad >= persona.datosPersona2.edad ){
    console.log( 'la edad del niño es mayor');
}else if( persona.datosPersona2.sexo == 'femenino' ){
    console.log( 'los datos de la persona 2 es femenino ' );
}

