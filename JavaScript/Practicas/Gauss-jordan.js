// Metodo Gauss Jordan

/*fila 1 x-y+3z = 13
  fila 2 x+y+z =11
  fila 3 2x+2y-z =7
*/
let fila1 = {
x:1,
y:-1,
z:3,
c:13
};
let fila2 = {
    x:1,
    y:1,
    z:1,
    c:11
    };
let fila3 = {
        x:2,
        y:2,
        z:-1,
        c:7
        };
    
       
console.log('(',fila1.x,fila1.y,fila1.z,'|',fila1.c,')',
'(',fila2.x,fila2.y,fila2.z,'|',fila2.c,')','(',fila3.x,fila3.y,fila3.z,'|',fila3.c,')');

fila2.x=fila2.x - fila1.x;
fila2.y=fila2.y - fila1.y;
fila2.z=fila2.z - fila1.z;
fila2.c=fila2.c - fila1.c;

fila3.x=fila3.x - 2*fila1.x;
fila3.y=fila3.y - 2*fila1.y;
fila3.z=fila3.z - 2*fila1.z;
fila3.c=fila3.c - 2*fila1.c;

console.log('(',fila1.x,fila1.y,fila1.z,'|',fila1.c,')',
'(',fila2.x,fila2.y,fila2.z,'|',fila2.c,')','(',fila3.x,fila3.y,fila3.z,'|',fila3.c,')');

fila3.x=fila3.x - 2*fila2.x;
fila3.y=fila3.y - 2*fila2.y;
fila3.z=fila3.z - 2*fila2.z;
fila3.c=fila3.c - 2*fila2.c;


console.log('(',fila1.x,fila1.y,fila1.z,'|',fila1.c,')',
'(',fila2.x,fila2.y,fila2.z,'|',fila2.c,')','(',fila3.x,fila3.y,fila3.z,'|',fila3.c,')');

fila1.x = fila1.x + fila3.x;
fila1.y = fila1.y + fila3.y;
fila1.z = fila1.z + fila3.z;
fila1.c = fila1.c + fila3.c;

fila2.x = 3*fila2.x - 2*fila3.x;
fila2.y = 3*fila2.y - 2*fila3.y;
fila2.z = 3*fila2.z - 2*fila3.z;
fila2.c = 3*fila2.c - 2*fila3.c;

console.log('(',fila1.x,fila1.y,fila1.z,'|',fila1.c,')',
'(',fila2.x,fila2.y,fila2.z,'|',fila2.c,')','(',fila3.x,fila3.y,fila3.z,'|',fila3.c,')');

fila1.x = 6*fila1.x + fila2.x;
fila1.y = 6*fila1.y + fila2.y;
fila1.z = 6*fila1.z + fila2.z;
fila1.c = 6*fila1.c + fila2.c;

console.log('(',fila1.x,fila1.y,fila1.z,'|',fila1.c,')',
'(',fila2.x,fila2.y,fila2.z,'|',fila2.c,')','(',fila3.x,fila3.y,fila3.z,'|',fila3.c,')');

fila1.x = fila1.x / 6;
fila1.y = fila1.y / 6;
fila1.z = fila1.z / 6;
fila1.c = fila1.c / 6;

fila2.x = fila2.x / 6;
fila2.y = fila2.y / 6;
fila2.z = fila2.z / 6;
fila2.c = fila2.c / 6;

fila3.x = fila3.x / -3;
fila3.y = fila3.y / -3;
fila3.z = fila3.z / -3;
fila3.c = fila3.c / -3;

console.log('(',fila1.x,fila1.y,fila1.z,'|',fila1.c,')',
'(',fila2.x,fila2.y,fila2.z,'|',fila2.c,')','(',fila3.x,fila3.y,fila3.z,'|',fila3.c,')');

console.log("El resultado es: ","x = ",fila1.c, "y = ", fila2.c, "z = ",fila3.c);