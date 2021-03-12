#include <fstream>
#include <iostream>

using namespace std;

struct datos{
	
	int identificacion;
	string nombre;
	string apellido;
	double salario;
};



datos salarios[5];
int i;


int main(){
	ofstream archivo;
	archivo.open("datosvector.txt");
	for(i=0; i<=4;i++)
	{
		cout<<"identificacion "<<endl;
		cin>>salarios[i].identificacion;
		cout<<"nombre "<<endl;
		cin>>salarios[i].nombre;
		cout<<"apellido "<<endl;
		cin>>salarios[i].apellido;
		cout<<"salario "<<endl;
		cin>>salarios[i].salario;
		
		archivo<<salarios[i].identificacion<<" "<<salarios[i].nombre<<" "<<salarios[i].apellido<<" "<<salarios[i].salario<<endl;
		
	}
	
	archivo.close();
    cout<<"Archivo cerrado correctamente"<<endl;
    
    return 0;
	
	
	
}
