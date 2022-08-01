let Xi = 0, formu;
const e = 2.718281828;


for (i = 0; i <= 4; i++){
    X = i;
    p1 = ( e**-Xi )-Xi;
    p2 = -(e**-Xi)-1;
    p1 = p1 / p2;
    formu = Xi - p1;

    Et = ((formu - Xi) / formu)*100;
    Xi = formu;
    console.log( "Resultado de la raíz",formu,"porcentaje de erro", Et,"%" ); 
}
