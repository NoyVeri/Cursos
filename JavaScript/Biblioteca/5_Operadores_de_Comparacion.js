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

/* Se comprara ambos valores pero te dice si son diferentes entre si, pero no toma en cuenta el tipo de la variable

*/
q = a != c;
console.log( q );

/* Se compara ambos valores entre si y te dice si son diferentes entre, pero en esta ocacion si toma encuenta
el tipo de la variable 

*/
 t = a !== c;
 console.log( t );