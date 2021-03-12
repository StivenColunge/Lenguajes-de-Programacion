#include <iostream>
using namespace std;
int a,b,r;
int *c, *d;//punteros que almacenan direcciones de memoria da las variables a las que apiuntan

int main ()
{
	a=15;
	b=20;
	
	r=a+b;
	
	cout<<r<<endl;
	
	c=&a;
	d=&b;
	
	r=*c+*d;
	cout<<r<<endl;
	cout<<"contenido de a "<<a<<endl;
	cout<<"la direccion de memoria de c es " <<&c<<endl;
	a=45;
	cout<<"contenido de a "<<a<<endl;
	cout<<"la direccion de memoria de la variable que le apunta es " <<c<<endl;
	cout<<"el contenido del puntero que le apunta a es "<<*c<<endl;
	
}
