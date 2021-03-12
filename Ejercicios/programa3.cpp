#include <iostream> //cout --- mostrar datos pantalla ingresar datos
using namespace std;

// variables simples int float double string char 
// variables estaticas estructuradas array--- vector, matrices.
// variables dinamicas estructuradas pilas colas arboles listas (simples, circulares, dobles)

struct registro {
	int codigo;	
	string nombre;
	int edad;
	double salario;
};

registro v1[5];


int main()
{
	for (int i=0;i<=4;i++)
	{
	
	cout<<"ingrese el codigo"<<endl;
	cin>>v1[i].codigo;
	cout<<"ingrese el nombre"<<endl;
	cin>>v1[i].nombre;
	cout<<"ingrese el edad"<<endl;
	cin>>v1[i].nombre;
	cout<<"ingrese el salario"<<endl;
	cin>>v1[i].nombre;
	
	
	}

}
