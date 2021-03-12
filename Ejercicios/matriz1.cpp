#include <iostream> //cout --- mostrar datos pantalla ingresar datos
using namespace std;

int vector[5]; //0---- n (tamaño-1) 0 1 2 3 4 
int matriz[5][3]; //matriz de 5 filas x 3 columnas

int i=0,j=0; // indice me permiten la movilidad de los vectores o matrices

int acum=0;

int main()
{
	for(i=0; i<=4; i++)
	{
		cout<<"INGRESE EL ELEMENTO ["<<i<<"]"<<endl;
		cin>>vector[i];
		
	}
	for (i=0; i<=4; i++)
	{
		cout<<vector[i]<<"\t";
		acum=acum+vector[i];
	}
	cout<<endl;
	cout<<"lasumatoria del vector es: "<<acum<<endl;
}

//suma resatr multi raiz etc
