#include <iostream>
#include <conio.h>

using namespace std;

int main(){
	int num[100][100],filas,colu;
	
	cout<<"numero de filas: "<<endl; cin>>filas;
	cout<< "numero de columnas: "<<endl; cin>>colu;
	
	
	for(int i=0;i<filas;i++){
		for(int j=0;j<colu;j++){
			cout<<"Escribe los numero de orden de izquierda a derecha ["<<i<<"]["<<j<<"]: ";
			cin>>num[i][j];
		}
	} 
	
	cout<<"\nMatriz final\n\n";
	
	for(int i=0;i<filas;i++){
		for(int j=0;j<colu;j++){
			cout<<"[";
			cout<<num[i][j];
			cout<<"]";
			
		}
		
		cout<<"\n";
	}
	
	
	getch();
    system("pause");
	return 0;
}