#include<iostream>
using namespace std;
typedef int * Vector;

void MostrarVector( const Vector v, int tam );
void LeerVector( Vector v, int tam );
void SumarVector( const Vector v1, const Vector v2, Vector vr, int tam );

int main(){
Vector v1, v2, vr;
int tam;

cout<< "Introduce el tamaño del vector:";
cin>> tam;
v1 = new int [ tam ];
v2 = new int [ tam ];
vr = new int [ tam ];

cout<< "Introduce el primer vector:" << endl;
LeerVector( v1, tam );
cout<< "Introduce el segundo vector:"<< endl;
LeerVector( v2, tam );
SumarVector( v1, v2, vr, tam );
cout<< "El vector suma es:" << endl;
MostrarVector( vr, tam );
delete [] v1;
delete [] v2;
delete [] vr;

return 0;
}

void MostrarVector( const Vector v, int tam ){
int i;
for( i = 0; i < tam; i++ )
cout<< v[ i ] << " ";
cout<< endl;
return;
}
void LeerVector( Vector v, int tam ){
int i;
for( i = 0; i < tam; i++ )
cin>> v [ i ];
return;

}

void SumarVector( const Vector v1, const Vector v2, Vector vr, int tam){
int i;
for( i = 0; i < tam; i++ )
vr[ i ] = v1[ i ] + v2[ i ];
return;

}