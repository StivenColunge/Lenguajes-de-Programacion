#include <fstream>
#include <iostream>
using namespace std;

 


int main() {
    string nom, ape;
    double sal;
    ofstream archivo;
    archivo.open("datos.txt");
    for(int i=0; i<=2; i++){
        
        cout<<"Ingrese un nombre"<<endl;
        cin>>nom;
        cout<<"Ingrese un apellido"<<endl;
        cin>>ape;
        cout<<"Ingrese un salario"<<endl;
        cin>>sal;
        
        archivo << nom << " " << ape << sal<<"\n";
        
        cout<<"Registro almacenado correctamente"<<endl;
    }
    archivo.close();
    cout<<"Archivo cerrado correctamente"<<endl;
    
    return 0;
}
