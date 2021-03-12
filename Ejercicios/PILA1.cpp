#include <stack>
#include <iostream>
using namespace std;

stack <int> pilaA;


int main()
{
	pilaA.push(34);
	pilaA.push(12);
	pilaA.push(100);
	cout<<pilaA.size()<<endl;
	cout<<pilaA.top()<<endl;
	pilaA.pop();				
	cout<<pilaA.top()<<endl;
	cout<<pilaA.empty();
}
