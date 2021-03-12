#include <iostream>
using namespace std;
int op;
double c=0,f=0,k=0,temp=0;

void capturar(){
		cout<<"ingrese celcisus"<<endl;
		cin>>c;
		cout<<"ingrese fahrenheit"<<endl;
		cin>>f;		
		cout<<"ingrese kelvin"<<endl;
		cin>>k;
}

void CF(){
		temp=(c*1.800)+32;	
		cout<<"centígrados a Fahrenheit es: "<<temp<<endl;
}

void FC(){
		temp=(f-32)*5/9;
		cout<<"Fahrenheit a centígrados es: "<<temp<<endl;
}

void KC(){
		temp=k-273.15;	
		cout<<"Kelvin a centígrados es: "<<temp<<endl;	
}

void CK(){
		temp=c+273.15;	
		cout<<"centígrados a Kelvin es: "<<temp<<endl;	
}

void KF(){
		temp=(k-273.15)*1.800+32.00;	
		cout<<"Kelvin a Fahrenheit es: "<<temp<<endl;	
}

void FK(){
		temp=(f-32)*5/9+273.15;	
		cout<<"Fahrenheit a Kelvin es: "<<temp<<endl;	
}

int main()
{ do {
	system("cls");
	cout<<"menu principal"<<endl;
	cout<<"1. campurar"<<endl;
	cout<<"2. Centígrados a Fahrenheit"<<endl;
	cout<<"3. Fahrenheit a centígrados"<<endl;
	cout<<"4. Kelvin a centígrados"<<endl;
	cout<<"5. centígrados a Kelvin"<<endl;
	cout<<"6. Kelvin a Fahrenheit"<<endl;
	cout<<"7. Fahrenheit a Kelvin"<<endl;		
	cout<<"8. salir"<<endl;
	cout<<"ingrese la opcion "<<endl;
	cin>>op;
	
	switch(op){
		case 1:system("cls");
			capturar();
			break;
		case 2:
			system("cls");
			CF();
			system("pause");
			break;
		case 3:
			system("cls");
			FC();
			system("pause");
			break;
		case 4:
			system("cls");
			KC();
			system("pause");
			break;
		case 5:
			system("cls");
			CK();
			system("pause");
			break;
		case 6:
			system("cls");
			KF();
			system("pause");
			break;
		case 7:
			system("cls");
			FK();
			system("pause");
			break;									
		case 8:exit(0);
	}	
			
	}while(op<=9);
	
 } 
