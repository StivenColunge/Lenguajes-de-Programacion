#include <iostream>
#include <queue>
#include <stack>

using namespace std;

//definir variales esruct como arelgos array vectores 
queue <int> cola1;
stack <int> pila2, pila1;

int i=0,opc=0;

//creamos un indice para recorrer el vector int matriz [5][5] se requiere dos indices

int main()
{
	
		
	do{
		system("cls");
		cout<<"1. ingrese pasajeros a cola 1 "<<endl;
		cout<<"2. ingresar pasajeros a las pilas "<<endl;
		cout<<"3. vaciar pasajeros de las pilas (1) "<<endl;
		cout<<"4. vaciar pasajeros de las pilas (2) "<<endl;		
		cout<<"5. mostrar cola y pilas"<<endl;
		cout<<"6. salir "<<endl;

		cout<<"ingrese una opcion "<<endl;
		cin>>opc;
		switch(opc){
			case 1:
				system("cls");
				cout<<"elementos en cola 1"<<endl;
				for(i=0;i<=29; i++){
					if(cola1.size()==30){
						cout<<"esta lleno"<<endl;
						break;						
					}	    
					cola1.push(i+1);				
				}
				cout<<"elementos ingresados"<<endl;		
				system("pause");			
				break;
			case 2:
				system("cls");
				for(i=0;i<=29; i++){
					if(pila1.size()<3){
						cout<<"elemento ingresado a pila "<<cola1.front()<<endl;
						pila1.push(cola1.front());
						cola1.pop();	
						system("pause");
				}	else if (pila2.size()<3){
						cout<<"elemento ingresado a pila "<<cola1.front()<<endl;
						pila2.push(cola1.front());
						cola1.pop();	
						system("pause");
				}	else{
					cout<<"estan llenas las pilas"<<endl;
					break;
					system("pause");
				}
			}
				break;
			case 3:
				system("cls");
					if(pila1.size()>0){
						cout<<"eliminado elemento de la pila "<<pila1.top()<<endl;
						pila1.pop();
						system ("pause");
				}   else{
					cout<<"estan vacias las pilas"<<endl;
					system("pause");
				}
				break;
			case 4:
				system("cls");
					if(pila2.size()>0){
						cout<<"eliminado elemento de la pila 2 "<<pila2.top()<<endl;
						pila2.pop();
						system ("pause");
				}   else{
					cout<<"estan vacias las pilas"<<endl;
					system("pause");
				}
				break;							
			case 5:
				system("cls");
				cout<<"numero de pasajeros en la cola "<<cola1.size()<<endl;
				cout<<"numero de pasajeros en la pila 1 = "<<pila1.top()<<endl;
				cout<<"numero de pasajeros en la pila 2 = "<<pila1.top()<<endl;
				system("pause");
								
				break;


				
}
}	while(opc!=6);
}



