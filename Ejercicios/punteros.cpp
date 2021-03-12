#include <iostream>
using namespace std;

double salario;
double *puntero_sal;

int main()
{
	//asigancion de memoria de la variabole del puntero a la variable 
	puntero_sal=&salario;
	cout<<"ingrese su salario "<<endl;
	cin>>*puntero_sal;
	cout<<"variable salario "<<salario<<endl;
	cout<<"dirrecion de salario "<<&puntero_sal<<endl;
	
	*puntero_sal=*puntero_sal+(*puntero_sal*0.05);
	cout<<"salario final "<<*puntero_sal<<endl;

	
	
}

