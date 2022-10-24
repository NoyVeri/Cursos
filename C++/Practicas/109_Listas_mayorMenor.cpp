
#include<iostream>
#include<stdlib.h>
#include<conio.h>
using namespace std;

struct Nodo{
	int dato;
	Nodo *siguiente;	
};

void insertarLista(Nodo *&,int);
void mostrarLista(Nodo *);
void calcularMayorMenor(Nodo *);

int main(){
	Nodo *lista = NULL;
	int dato;
	char opcion;
	
	do{
		cout<<"Digite un numero para agregarlo a lista: ";
		cin>>dato;
		insertarLista(lista,dato);
		
		cout<<"\nDesea agregar un nuevo numero(s/n): ";
		cin>>opcion;
	}while(opcion == 's' || opcion == 'S');
	
	cout<<"\nElementos de la lista: \n";
	mostrarLista(lista); 
	
	calcularMayorMenor(lista);	
	
	getch();
	return 0;
}


void insertarLista(Nodo *&lista,int n){
	Nodo *nuevo_nodo = new Nodo();
	Nodo *aux;
	
	nuevo_nodo->dato = n;
	nuevo_nodo->siguiente = NULL;
	
	if(lista == NULL){
		lista = nuevo_nodo;
	}
	else{
		aux = lista;
		while(aux->siguiente != NULL){
			aux = aux->siguiente;
		}
		aux->siguiente = nuevo_nodo;
	}
	cout<<"\tElemento "<<n<<" agregado a lista correctamente\n";
}


void mostrarLista(Nodo *lista){	
	Nodo *actual = new Nodo();
	
	actual = lista;
	while(actual != NULL){ 
		cout<<actual->dato<<" -> "; 
		actual = actual->siguiente; 
}


void calcularMayorMenor(Nodo *lista){
	int mayor=0,menor=99999;
	
	while(lista != NULL){
		if((lista->dato)>mayor){
			mayor = lista->dato;
		}
		if((lista->dato)<menor){
			menor = lista->dato;
		}
		lista = lista->siguiente;
	}
	
	cout<<"\n\nEl mayor numero es: "<<mayor<<endl;
	cout<<"El menor numero es: "<<menor<<endl;	
}

