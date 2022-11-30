#include<iostream>
#include<conio.h>
#include<stdlib.h>

using namespace std;




struct Nodo{
    int dato;
    Nodo*der;
    Nodo*izq;
};
void menu();
Nodo*crearNodo(int);
void insertarNodo(Nodo *&, int);
Nodo*arbol = NULL;


int main(){
menu();


     getch();
    return 0;
}

void menu(){
int dato,opcion;
do{
    cout<<"\t.:MENU:."<<endl;
    cout<<"1. Insertar un nuevo nodo"<<endl;
    cout<<"2. Salir"<<endl;
    cout<<"Opcion: ";
    cin>>opcion;

    switch (opcion)
    {
    case 1:
        cout<<"\nDigite un numero: ";
        cin>>dato;
        insertarNodo(arbol,dato);
        cout<<"\n";
        system("pause");
        break;
    }
    system("cls");
}while(opcion != 2);

}


Nodo*crearNodo(int n){
Nodo*nuevo_nodo = new Nodo();


nuevo_nodo->dato = n;
nuevo_nodo->der = NULL;
nuevo_nodo->izq = NULL;

return nuevo_nodo;
}
void insertatNodo(Nodo *&arbol,int n){
if (arbol == NULL)
{
    Nodo *nuevo_nodo = crearNodo(n);
arbol = nuevo_nodo;

    
}else{
    int valorRaiz = arbol->dato;
    if (n < valorRaiz)
    {
        insertarNodo(arbol->izq,n);
    }else{
        insertatNodo(arbol->der,n);
    }
    
}



}


