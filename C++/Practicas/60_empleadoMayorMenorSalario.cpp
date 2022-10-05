#include<iostream>
#include<conio.h>

using namespace std;
struct Empleado{
    char nombre[ 20 ];
    float salario;
}emp[ 100 ];

int main(){
 int n_empleados, posM = 0, posm = 0;
float mayor = 0, menor = 999999; 

 cout<<"Digite el numero de empleados: ";
 cin>>n_empleados;

 for( int i = 0; i < n_empleados; i++ ){
    fflush(stdin);
    cout<<i + 1 <<". Digite su nombre: ";
    cin.getline(emp[ i ].nombre,20,'\n' );
    cout<<i + 1<<". Digite su salario: ";
    cin>>emp[ i ].salario;




if( emp[ i ].salario > mayor ){
    mayor = emp[ i ].salario;
    posM = i;
}
if( emp[ i ].salario < menor ){
    menor = emp[ i ].salario;
    posm = i;
}



    cout<<"\n";
 }

cout<<"\n.:Datos de empleado con mayor salario:.\n";
cout<<"Nombre: "<<emp[ posM ].nombre<<endl;
cout<<"Salario: "<<emp[ posM ].salario<<endl;

cout<<"\n.:Datos de empleado con menor salario:.\n";
cout<<"Nombre: "<<emp[ posm ].nombre<<endl;
cout<<"Salario: "<<emp[ posm ].salario<<endl;

    getch();
    return 0;
}