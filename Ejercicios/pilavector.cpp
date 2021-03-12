#include <iostream>


using namespace std;

//definir variales esruct como arelgos array vectores 

string vector[29]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

int i=0;

//creamos un indice para recorrer el vector int matriz [5][5] se requiere dos indices

int main()
{
	for (i=0;i<=29;i++)
	{
		vector [i]=i+1;
	}
	for (i=0;i<=29;i++)
		cout <<vector[i]<<"\t";
		
}
