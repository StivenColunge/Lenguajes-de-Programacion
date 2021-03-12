#include <queue>
#include <iostream>

using namespace std;

queue <int> cola1;
int dato;


int main()
{
	for (int i=1; i<=5; i++)
	{
	
	cout<<"ingrese el dato a la cola"<<endl;
	cin>>dato;
	cola1.push(dato);
}

	cout<<"el numero de elementos ingresados a la cola es "<<cola1.size()<<endl;
	cout<<"el primer emento ingresados a la cola es "<<cola1.front()<<endl;	
	cout<<"el ultimo elemento de la cola es "<<cola1.back()<<endl;
	cout<<"el estado de la pila es -0- contiene elemntos. si es -1- elementos esta vacia "<<cola1.empty()<<endl;
	cola1.pop();
	cout<<"el numero de elementos ingresados a la cola es "<<cola1.size()<<endl;
	cout<<"el primer emento ingresados a la cola es "<<cola1.front()<<endl;
		cout<<"el ultimo elemento de la cola es "<<cola1.back()<<endl;		
	
}

