#include <iostream>
#include <fstream>
using namespace std;

string recibe;


int main()
{
	ifstream archivo;
	archivo.open("datos.txt");
	
	if (archivo.fail())
	{
		cout<<"error en la apaertura del archivo. revisar"<<endl;
		exit(0);
		}
		else
		{
			while(!archivo.eof())
			{
				archivo>>recibe;
				cout<<"el dato encontrado en el archivo es "<<recibe<<endl;
				
			}
			}	
		cout<<"fin de la lectura del archivo txt "<<endl;
	
}
