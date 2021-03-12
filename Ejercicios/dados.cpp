#include <stdlib.h>
#include <time.h>
#include <iostream>
using namespace std;

int num1;
int a,b,c,i;
bool seguir=true;
string continua;

int main ()
{
	
	srand(time(NULL));

	while(seguir==true){	
	a = 1+rand()%(7-1);
	b = 1+rand()%(7-1);
	cout<<"Dado "<<a<<" y "<<b<<endl;
	
	cout<<"continua s/n"<<endl;
	cin>>continua;
		if(continua=="n" or continua== "N"){
		seguir=false;
		}
		
	
    if(a == b){
        
		c = c + 1;
        if(c == 3){
            cout<<"has ganado los 3 pares";
            exit(0);
        }
}
}
}

