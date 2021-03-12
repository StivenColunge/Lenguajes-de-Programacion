#include <fstream>
#include <iostream>

using namespace std;

struct datos{
	
	int  codigo;
	string nombre, apellido;
	double nota1, nota2,nota3,definitiva;

};



datos notas[5];
int i;

double promedio;



int main(){
	ofstream archivo;
	archivo.open("notas1.txt");
	for(i=0; i<=5;i++)
	{
		cout<<"codigo "<<endl;
		cin>>notas[i].codigo;
		cout<<"nombre "<<endl;
		cin>>notas[i].nombre;
		cout<<"apellido "<<endl;
		cin>>notas[i].apellido;
		cout<<"nota 1 "<<endl;
		cin>>notas[i].nota1;
		cout<<"nota 2 "<<endl;
		cin>>notas[i].nota2;
		cout<<"nota 3 "<<endl;
		cin>>notas[i].nota3;
		
		notas[i].definitiva=(notas[i].nota2+notas[i].nota3+notas[i].nota1)/3;
		
		promedio=promedio+notas[i].definitiva;
		
		
			
			
			
		archivo<<"codigo"<<"     "<<"nombre"<<"     "<<"apellido"<<"     "
		<<"nota 1"<<"   "<<"nota 2"<<"   "<<"nota 3"<<"   "<<"definitiva"<<endl;
		archivo<<notas[i].codigo<<"       "<<notas[i].nombre<<"       "<<notas[i].apellido<<"        "
		<<notas[i].nota1<<"      "<<notas[i].nota2<<"      "<<notas[i].nota3<<"      "<<notas[i].definitiva<<endl;
		
		cout<<"ingrese otro alumno"<<endl;
	}
	
	promedio=promedio/5;
	
	archivo<<"                       total promedio                                  "<<promedio<<endl;
	
	archivo.close();
    cout<<"Archivo cerrado correctamente"<<endl;
    
    return 0;
	
	
	
}
