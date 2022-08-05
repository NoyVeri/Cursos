// Metodo Gauss 

/*fila 1 x+2y-z = -1
  fila 2 2x+6y+z =7
  fila 3 5x+7y-4z =9
*/
let fila1 = {
    x:1,
    y:2,
    z:-1,
    i:-1
    };
    let fila2 = {
        x:2,
        y:6,
        z:1,
        i:7
        };
    let fila3 = {
            x:5,
            y:7,
            z:-4,
            i:9
            };
        
            
    console.log('(',fila1.x,fila1.y,fila1.z,'|',fila1.i,')',
    '(',fila2.x,fila2.y,fila2.z,'|',fila2.i,')','(',fila3.x,fila3.y,fila3.z,'|',fila3.i,')');
    
    fila2.x=fila2.x - 2*fila1.x;
    fila2.y=fila2.y - 2*fila1.y;
    fila2.z=fila2.z - 2*fila1.z;
    fila2.i=fila2.i - 2*fila1.i;
    
    fila3.x=fila3.x - 5*fila1.x;
    fila3.y=fila3.y - 5*fila1.y;
    fila3.z=fila3.z - 5*fila1.z;
    fila3.i=fila3.i - 5*fila1.i;
    
    console.log('(',fila1.x,fila1.y,fila1.z,'|',fila1.i,')',
    '(',fila2.x,fila2.y,fila2.z,'|',fila2.i,')','(',fila3.x,fila3.y,fila3.z,'|',fila3.i,')');
    
    
    
    fila3.x=3*fila2.x + 2*fila3.x;
    fila3.y=3*fila2.y + 2*fila3.y;
    fila3.z=3*fila2.z + 2*fila3.z;
    fila3.i=3*fila2.i + 2*fila3.i;

    console.log('(',fila1.x,fila1.y,fila1.z,'|',fila1.i,')',
    '(',fila2.x,fila2.y,fila2.z,'|',fila2.i,')','(',fila3.x,fila3.y,fila3.z,'|',fila3.i,')');
   
    fila3.i = fila3.i / fila3.z;
    console.log( " El valor de Z es:",fila3.i );

    fila2.i = ( fila2.i - 3*fila3.i ) / fila2.y;
    console.log( " El valor de Y es :",fila2.i );

    fila1.i = fila1.i - 2*fila2.i + fila3.i;
    console.log( "El valor de X es :",fila1.i )
   