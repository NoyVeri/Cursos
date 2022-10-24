#include<iostream>
#include<conio.h>
#include<stdlib.h>

using namespace std;
struct Nodo
{
int dato;
Nodo *siguiente;
};

void menu();
void insertarLista(Nodo *&, int);
void mostrarLista(Nodo *);
void buscarLista(Nodo *,int);
void eliminarNodo(Nodo *&,int);

Nodo *lista = NULL;

int main(){
menu();

getch();
    return 0;
}

void menu(){
int opcion, dato;

do{
cout<<"\t.:MENU:.\n";
cout<<"1. Insertar elementos a la lista\n";
cout<<"2. Mostrar los elementos de la lista\n";
cout<<"3. Buscar un elemento en la lista\n";
cout<<"4. Eliminar un nodo de la lista\n";
cout<<"5. Salir\n";
cout<<"Opcion\n";
cin>>opcion;

switch(opcion){
case 1: cout<<"\nDigite un numero: ";
cin>>dato;
insertarLista(lista,dato);
cout<<"\n";
system("pause");
break;
case 2: mostrarLista(lista);
cout<<"\n";
system("pause");
break;
case 3:
cout<<"\nDigite un numero a buscar: ";
cin>>dato;
buscarLista(lista,dato);
cout<<"\n";
system("pause");
break;
case 4:

cout<<"\nDigite el elemento que desea eliminar: ";
cin>>dato;

eliminarNodo(lista,dato);
cout<<"\n";
system("pause");


}system("cls");
}while(opcion != 5);

}

void insertarLista(Nodo *&lista, int n){
Nodo *nuevo_nodo = new Nodo();

nuevo_nodo->dato = n;
Nodo *aux1 = lista;
Nodo *aux2;
while((aux1 != NULL) && (aux1->dato < n)){
aux2 = aux1;
aux1 = aux1->siguiente;
}
if(lista == aux1){
    lista = nuevo_nodo;
    
}else{
    aux2->siguiente = nuevo_nodo;
    
}

nuevo_nodo->siguiente = aux1;

cout<<"\tElemento "<<n<<" insertado a la lista correctamente\n";

}
void mostrarLista(Nodo *lista){
    Nodo *actual = new Nodo();
    actual = lista;
    while(actual != NULL){
        cout<<actual->dato<<" -> ";
        actual = actual->siguiente;
    }
}
void buscarLista(Nodo *lista,int n){
    bool band = false;
Nodo * actual = new Nodo();

actual = lista;

while((actual != NULL) && (actual->dato <= n)){
    if(actual-> dato == n){
        band = true;
    }
    actual = actual->siguiente;
}
if(band == true){
    cout<<"Elemento "<<n<<" Si a sido encontrada en la lista\n";

}else{
    cout<<"Elemento "<<n<<" No a sido encontrado en la lista\n";
}


}
void eliminarNodo(Nodo *&lista,int n){
    if(lista != NULL){
        Nodo *aux_borrar;
        Nodo *anteriror = NULL;
        aux_borrar = lista;

        while((aux_borrar != NULL) && (aux_borrar->dato != n)){
anteriror = aux_borrar;
aux_borrar = aux_borrar->siguiente;
        }



        if(aux_borrar == NULL){
            cout<<"El elemento no ha sido encontrado";
        }else if(anteriror == NULL){
            lista = lista->siguiente;
            delete aux_borrar;
        }else{
            anteriror->siguiente = aux_borrar->siguiente;
            delete aux_borrar;
        }
    }
}














