#include <iostream>


using namespace std;



int vector[30];

int i=0, variable=0, valor=0;

void puchear(int ve[]){
	for(i=0; i<=29;i++){	
		//vector [i]=valor;
		if(ve[i]==0){								
			ve [i]=valor;
			break;
				}
		}
}

void topiar(int ve[]){
	for(i=29;i>=0;i--){	
		//vector [i]=valor;
		if(ve[i]!=0){								
			cout<<"el top es "<<ve[i]<<endl;
			break;
				}
		}
}

void seizear(int ve[]){
	for(i=29;i>=0;i--){	
		//vector [i]=valor;
		if(ve[i]!=0){								
			cout<<"el tamaño es "<<i+1<<endl;			
			break;
			}
		}
}

void popear(int ve[]){
		for(i=29; i>=0;i--){	
		//vector [i]=valor;
		if(ve[i]!=0){								
			ve [i]=0;
			break;
				}
		}
		
}

void emptyar(int ve[]){
	for(i=29; i>=0;i++){	
		//vector [i]=valor;
		if(ve[i]!=0){								
			cout<<"esta llena"<<endl;
	break;
		}else{
			cout<<"esta vacia"<<endl;
			break;
		}
		}
}



int main()
{
	for (i=0;i<=29;i++)
	{
		vector [i]=0;
	}
	//for (i=0;i<=29;i++)
	//	cout <<vector[i]<<"\t";
	
	do{
		system("cls");
		cout<<"1. top"<<endl;
		cout<<"2. push "<<endl;
		cout<<"3. size "<<endl;
		cout<<"4. pop "<<endl;
		cout<<"5. empty "<<endl;
		cout<<"6. salir"<<endl;
		cin>>variable;
		
		switch (variable){
			
			case 1:
				topiar(vector);		
						for(i=0; i<=29;i++)
							cout<<vector [i]<<"\t";	
								system("pause");
				break;
			case 2:
				cout<<"digite un numero"<<endl;
				cin>>valor;
				if (valor==0){
					cout<<"no se permiten 0 "<<endl;
				}else{				
					puchear(vector);
				}		
						for(i=0; i<=29;i++)
							cout<<vector [i]<<"\t";	
					system("pause");			
				break;
			case 3:
				seizear(vector);
						for(i=0; i<=29;i++)
							cout<<vector [i]<<"\t";	
					system("pause");				
				
				
				break;							
			case 4:
				popear(vector);
						for(i=0; i<=29;i++)
							cout<<vector [i]<<"\t";	
					system("pause");
				break;
			case 5:
				emptyar(vector);
						for(i=0; i<=29;i++)
							cout<<vector [i]<<"\t";	
					system("pause");				
				break;				
			case 6:
				break;				
				
							
		}
			
		
	}while (variable!=6);
		
		
	
	
		
		
		
				
		
		
		
}
