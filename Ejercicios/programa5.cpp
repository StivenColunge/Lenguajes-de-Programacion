#include <iostream>
using namespace std;
int op;
int v1=0,v2=0,vr=0;

int main()
{
	
	do{
	system("cls");
	cout<<"menu principal"<<endl;
	cout<<"1. campurar"<<endl;
	cout<<"2. sumar"<<endl;
	cout<<"3. restar"<<endl;
	cout<<"4. multi"<<endl;
	cout<<"5. salir"<<endl;
	cout<<"ingrese la opcion "<<endl;
	cin>>op;
	
	switch(op){
		case 1:
			cout<<"ingrese v1"<<endl;
			cin>>v1;
			cout<<"ingrese v2"<<endl;
			cin>>v2;
			break;
		
		case 2:
			system("cls");
			vr=v1+v2;	
			cout<<"la suma de v1+v2 es: "<<vr<<endl;
			system("pause");
			break;
		case 3:
			system("cls");
			vr=v1-v2;
			cout<<"la resta de v1-v2 es: "<<vr<<endl;
			system("pause");
			break;
		case 4:
			system("cls");
			vr=v1*v2;
			system("cls");
			cout<<"la multiplicacion de v1*v2 es: "<<vr<<endl;
			system("pause");
			break;
		case 5:exit(0);
		
	}	
		
	
	
	}while(op<=5);
	
	
 } 
