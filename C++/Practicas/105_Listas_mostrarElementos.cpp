#include <iostream>
#include<stdlib.h>
#include<conio.h>

using namespace std;



struct Nodo{

	int dato;

	Nodo *siguiente;

};



void menu();

void insertarLista( Nodo *&, int);

void mostrarLista(Nodo *);
Nodo *lista=NULL;

int main(){

	

	menu();

	getch;

	return 0;

}void menu(){

	int opcion, dato;

	do{

		cout<<"Menu"<<endl;

		cout<<"1.- Insertar elementos a la salida  "<<endl;

		cout<<"2.- Mostrar elementos de la lista"<<endl;

		cout<<"3.- Salir"<<endl;
cout<<"opcion: ";
		cin>>opcion;

		switch(opcion){

			case 1:cout<<"Digite su numero: ";

			cin>>dato;

			insertarLista(lista,dato);

			cout<<endl;

			system("pause");

			break;

			case 2:

			mostrarLista(lista);
 cout<<"\n";
			system("pause");

			break;

		}

		system("cls");

	}while(opcion != 3);

}

void insertarLista(Nodo *&lista, int n){

	Nodo *nuevo_nodo= new Nodo();

	nuevo_nodo->dato=n;

	Nodo *aux1=lista;

	Nodo*aux2;

	

	while((aux1 != NULL) && (aux1->dato<n)){

		aux2=aux1;

		aux2=aux1->siguiente;

	}

	if(lista==aux1){

		lista =nuevo_nodo;

	}

	else{

		aux2->siguiente =nuevo_nodo;

	}

	nuevo_nodo->siguiente=aux1;

	cout<<"Elemento "<<n<<" insertado a la lista correctamente"<<endl;

}

void mostrarLista(Nodo *lista){

	Nodo *actual = new Nodo();

	actual = lista;

	

	while(actual != NULL){

		cout<<actual->dato<<" -> ";

		actual= actual->siguiente;

	}

}

