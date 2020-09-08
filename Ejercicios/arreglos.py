espaciodelvector=int(input("ingrese el tamaño de 1 a 5: "))
vector=[]
if (espaciodelvector>5 or espaciodelvector<=0):
    print("jajaja que chistosito lok")
else:  
    for i in range(0,espaciodelvector):
        agregar=str(input("coloca el relleno papu: "))
        vector.append(agregar)
print(vector)

eliminar1=str(input("desea eliminar algun objeto. S ES SI Y N ES NO?" ))
if (eliminar1 != "s"):
    print("ponte serio")
else:
    eliminar=int(input("que pocicion desea eliminar? "))
    del vector[eliminar]
print(vector)

modificar=int(input("cuntas modificaciondes dese realizar (incertar) de 1 a 5? "))
if (modificar>5 or modificar<=0):
    print("mk ya...")
else:
    for i in range(0,5,modificar ):
        agregar=str(input("que esea colocar? "))
        vector.append(agregar)