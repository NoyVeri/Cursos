let a = 3, b = 2, c = "3";


/*Se comparan ambos valores sin importar el tipo de cada variable
es decir que no importa si son enteros con caracteres, este mismo se comvertira en entero y sera comparado
*/
z = a == c; 
console.log( z );

/*Se comparan ambos valores pero en esta ocacion si se toma encuenta el tipo de variable
es decir no se puede compara un entero con un caracter

*/
w = a === c;
console.log( w );