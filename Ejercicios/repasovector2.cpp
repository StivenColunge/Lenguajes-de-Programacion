#include <iostream>
using namespace std;

int i,j,aux;
int vector [10];

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
	
}
