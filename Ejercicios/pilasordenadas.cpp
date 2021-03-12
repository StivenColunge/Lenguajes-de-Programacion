#include <stack>
#include <iostream>
using namespace std;

int i,j,aux,sumapar,sumainpar;
int vector [10];
stack <int> pila1;
stack <int> pila2;

int main ()
{
	system("cls");
	for(i=0;i<=9;i++){
	cout<<"ingrese el elemento en la posicion ["<<i<<"]"<<endl;
	cin>>vector[i];
	
	}
	
	system("cls");
	for(i=0;i<=9;i++)
	{
		cout<<vector[i]<<"\t";
	}
	cout<<endl;
	
	
	for(i=0;i<=9;i++)
	{
	for(j=i+1;j<=9;j++)
	{
		if (vector[i]>vector[j])
		{
			aux=vector[i];
			vector[i]=vector[j];
			vector[j]=aux;
		}
	}
	}
		for(i=0;i<=9;i++)
	{
		cout<<vector[i]<<"\t";
	}
	cout<<"pila par "<<endl;
	sumapar=vector[i]%0 + vector[i]%0;
	cout<<sumapar<<endl;
	pila1.push(i%2);
	cout<<pila1.top()<<endl;
	//cout<<pila1.size()<<endl;
	cout<<"pila inpar "<<endl;
	sumainpar=vector[i]%1+vector[i];
	cout<<sumainpar<<endl;
	pila2.push(i%1);
	//cout<<pila1.size()<<endl;
	
}
