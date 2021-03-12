#include <queue>
#include <iostream>

using namespace std;

queue <int> cola1;
int dato,opc;


int main()
{
	do{
		system("cls");
		cout<<"1. ingrese elemento "<<endl;
		cout<<"2. retirar elemento "<<endl;
		cout<<"3. estado de la pila"<<endl;
		cout<<"4. primero elemento de la cola "<<endl;
		cout<<"5. ultimo elemento de la cola "<<endl;
		cout<<"6. tamaño de la cola "<<endl;
		cout<<"7. salir "<<endl;
		cout<<"ingrese una opcion "<<endl;
		cin>>opc;
		switch(opc){
			case 1:
				system("cls");
				cout<<"ingrese el elementos"<<endl;
				cin>>dato;
				cola1.push(dato);
				break;
			case 2:
				system("cls");
				if(cola1.empty()==0)
				{
				cout<<"el elemento "<<cola1.front()<<" FUE RETIRADO "<<endl;
				cola1.pop();
				system("pause");
				}else{
				cout<<"no hay ELEMENTOS "<<endl;
				system("pause");
				}
				break;
			case 3:
				system("cls");
				if (cola1.empty()==0)
				{		
				cout<<"hay elemntos en la cola"<<endl;
				}
				else
				{
				cout<<"la cola esta vacia"<<endl;
				}
				system("pause");
				break;							
			case 4:
				system("cls");
				cout<<"el primer elemento de la cola es "<<cola1.front()<<endl;
				system("pause");
				break;
			case 5:
				system("cls");
				cout<<"el ultimo elemento de la cola es "<<cola1.back()<<endl;
				system("pause");
				break;
			case 6:
				system("cls");
				cout<<"el numero de elementos de la cola es "<<cola1.size()<<endl;
				system("pause");
				break;
																		
		}
		
	} while(opc!=7);
	

}
	
	


