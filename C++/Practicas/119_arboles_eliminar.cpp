#include<iostream>
#include<conio.h>
#include<stdlib.h>

using namespace std;




struct Nodo{
    int dato;
    Nodo*der;
    Nodo*izq;
    Nodo*padre;
};

void menu();
Nodo*crearNodo(int,Nodo*);
void insertarNodo(Nodo *&, int,Nodo*);
Nodo*arbol = NULL;
void mostrarArbol(Nodo*,int);
bool busqueda(Nodo*,int);
void preOrden(Nodo*);
void InOrden(Nodo*);
void PostOrden(Nodo*);
void Eliminar(Nodo*,int);
void eliminarNodo(Nodo*);


int main(){
menu();


     getch();
    return 0;
}

void menu(){
int dato,opcion,contador = 0;
do{
    cout<<"\t.:MENU:."<<endl;
    cout<<"1. Insertar un nuevo nodo"<<endl;
    cout<<"2. Mostrar el arbol completo"<<endl;
    cout<<"3. Buscar un elemento en el arbol"<<endl;
    cout<<"4. Recorrer el arbol en preorden"<<endl;
    cout<<"5. Recorrer el arbol en InOrden"<<endl;
    cout<<"6. Recorrer el arbol en postOrden"<<endl;
    cout<<"7. Salir"<<endl;
    cout<<"Opcion: ";
    cin>>opcion;

    switch (opcion)
    {
    case 1:
        cout<<"\nDigite un numero: ";
        cin>>dato;
        insertarNodo(arbol,dato,NULL);
        cout<<"\n";
        system("pause");
        break;
        case 2: cout<<"\nMostrar el arbol completo:\n\n";
        mostrarArbol(arbol,contador);
        cout<<"\n";
        system("pause");
        break;
        case 3: cout<<"\nDigite el elemento a buscar: ";
        cin>>dato;
        if(busqueda(arbol,dato)== true){
            cout<<"\nElemento "<<dato<< " a sido encontrado en el arbol\n";
        }else{
             cout<<"\nElemento no encontrado\n";
        }
        cout<<"\n";
        system("pause");
        break;
        case 4: cout<<"\nRecorrido en Preorden: ";
        preOrden(arbol);
        cout<<"\n\n";
        system("pause");
        case 5: cout<<"\nRecorrido en InOrden: ";
        InOrden( arbol );
        cout<<"\n\n";
        system("pause");
        break;
        case 6: cout<<"\nRecorrido en postorden: ";
        PostOrden(arbol);
        cout<<"\n\n";
        system("pause");
        break;
    }
    system("cls");
}while(opcion != 7);

}


Nodo*crearNodo(int n,Nodo*padre){
Nodo*nuevo_nodo = new Nodo();


nuevo_nodo->dato = n;
nuevo_nodo->der = NULL;
nuevo_nodo->izq = NULL;
nuevo_nodo->padre = padre;

return nuevo_nodo;
}
void insertatNodo(Nodo *&arbol,int n,Nodo *padre){
if (arbol == NULL)
{
    Nodo *nuevo_nodo = crearNodo(n,padre);
arbol = nuevo_nodo;

    
}else{
    int valorRaiz = arbol->dato;
    if (n < valorRaiz)
    {
        insertarNodo(arbol->izq,n,arbol);
    }else{
        insertatNodo(arbol->der,n,arbol);
    }
    
}



}


void mostrarArbol(Nodo *arbol,int cont){
if(arbol == NULL){
    return;
}else{
    mostrarArbol(arbol->der,cont+1);
    for(int i =0; i <cont;i++){
        cout<<"  ";
    }
    cout<<arbol->dato<<endl;
    mostrarArbol(arbol->izq,cont+1);
}


}


bool busqueda(Nodo*arbol,int n){
if(arbol == NULL){
    return false;
}else if(arbol->dato == n){
    return true;
}else if (n < arbol->dato){
    return busqueda(arbol->izq,n);
}else{
    return busqueda(arbol->der,n);
}


}

void preOrden(Nodo*arbol){
    if(arbol == NULL){
        return;
    }else{
        cout<<arbol->dato<<" - ";
        preOrden(arbol->izq);
        preOrden(arbol->der);
    }
}

void InOrden(Nodo*arbol){
    if(arbol == NULL){
        return;
    }else{
        InOrden(arbol->izq);
        cout<<arbol->dato<<" - ";
InOrden(arbol->der);
    }
}

void PostOrden(Nodo*arbol){
if(arbol == NULL){
    return;
}else{
    PostOrden(arbol->izq);
    PostOrden(arbol->der);
    cout<<arbol->dato<<" - ";
}
}



void Eliminar(Nodo*arbol,int n){
    if(arbol == NULL){
        return;
    }else if(n < arbol->dato){
        Eliminar(arbol->izq,n);
    }else if(n > arbol->dato){
        Eliminar(arbol->der,n);
    }else{
        eliminarNodo(arbol);
    }
}

void eliminarNodo(Nodo*nodoEliminar){
    
}





