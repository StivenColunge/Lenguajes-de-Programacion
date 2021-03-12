#include <stdlib.h>
#include <time.h>
#include <iostream>
using namespace std;

int num1;
int a,b,c;


int main ()
{
	
	srand(time(NULL));
	a = 1+rand()%(6-1);
	cout<<"el valor generado es "<<a<<endl;	
	
	for (c=1;c<=5;c++)
	{
		
		cout<<"ingrese un numero entre 1 y 5 "<<endl;
		cin>>num1;
		if (num1==a)
		{
			cout<<"felicitaciones hawaii de vacaciones. logro su objetivo"<<endl;
			cout<<"total de intentos: "<<c<<endl;
			exit(0);		
		}
		if(num1>a)
		{
			cout<<"el valor ingresado es mayor "<<endl;
		}else{
			
			cout<<"el valor ingresado es menor "<<endl; 
		}
		if (c>2){
			cout<<"Muchos intentos mi bro. Perdistes :3 "<<endl;
			cout<<"total de intentos: "<<c<<endl;
			exit(0);	
			}

	}
}
