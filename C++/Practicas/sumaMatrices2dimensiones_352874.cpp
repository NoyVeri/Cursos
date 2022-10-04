#include <iostream>
#include <stdio.h>
#include <conio.h>
using namespace std;
#define TAM 3

int main()
{
int matriz[ TAM + 1 ][ TAM + 1 ], i, j;

for( i = 0; i < TAM + 1; i++)

for( j = 0; j < TAM + 1; j++)
matriz[ i ][ j ] = 0;

for( i = 0; i < TAM; i++)
{

for( j = 0; j < TAM; j++)
{
printf( "Ingresar dato entero en ( fila[%d] columna[%d] ):", i, j );
scanf( "%d", & matriz[ i ][ j ] );
}
printf( "\n" );
}
for( i = 0 ; i < TAM; i++)
{

for( j = 0; j < TAM; j++)
printf( "%d\t", matriz[ i ][ j ] );
printf( "\n" );
}

for( i = 0; i < TAM; i++)
{

for( j = 0; j < TAM; j++)
{
matriz[ i ][ TAM ] += matriz[ i ][ j ];
matriz[ TAM ][ j ] += matriz[ i ][ j ];
}
}
printf( "\n" );

for( i = 0; i < TAM + 1; i++)
{

for( j = 0; j < TAM + 1; j++)
printf( "%d\t", matriz[ i ][ j ] );
printf( "\n" );
}

getch();
}