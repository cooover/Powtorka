# P53
'''a=0
if (a):
    print(bool(a))
a+=1
if (a):
    print(bool(a))
a+=1
if (a):
    print(bool(a))
a+=1
if (a):
    print(bool(a))
a+=1
if (a):
    print(bool(a))
a+=1'''

# P54
'''if(a>=0 and a <=9):
    print("Wartosc znajduje sie w zadanym przedziale")
else:
    print("Out of range")
    
a = input("Podaj liczbe: ")
if(int(a)>=0 and int(a) <=9):
    print("Wartosc znajduje sie w zadanym przedziale")
else:
    print("Out of range")'''
    
# P55

'''lista = ['pierwszy', 'drugi', 'trzeci', 'czwarty', '5']
text = input("Podaj zmienna: ")
if(text== lista[0]):
    print("Zmienna znajduje sie na pierwszym miejscu listy")
elif(text==lista[1]):
    print("Zmienna znajduje sie na drugim miejscu listy")
elif(text in lista):
    print("Zmienna znajduje sie w liscie ale nie na pierwszym ani na drugim miejscu")
else:
    print("Zmiennej nie ma ani na pierwszym, ani na grugim miejscu listy")'''

# P56
'''a=int(input("Podaj liczbe: "))
print("liczba parzysta") if (a%2==0) else print("liczba nieparzysta")'''

# P57
'''sklep_prod={'chleb':'swiezy chleb', 'jajko':'duze jajka', 'mleko':'mleko prosto od krowy'}
sklep_zamowienie=input("podaj co chcesz zamowic: ")
if(sklep_zamowienie in sklep_prod):
    print ("Mamy w sklepie! Zamawiasz: ")
    print(sklep_prod[sklep_zamowienie])
else:
    print("brak produktu w sklepie")
    '''
# P58
sklep_prod={'chleb':'swiezy chleb', 'jajko':'duze jajka', 'mleko':'mleko prosto od krowy'}
sklep_cena={'chleb':1, 'jajko':2, 'mleko':3}
sklep_ilosc={'chleb':20, 'jajko':100, 'mleko':30}
suma=0
nav=input("Czy chcesz zlozyc zamowienie?(T/N): ")
while nav!="N":
    if(nav!="T"):
        print("Podano zly znak")
        nav=input("Wybierz 'T' lub 'N': ")  
    else:
        sklep_zamowienie=input("podaj co chcesz zamowic: ")
        if(sklep_zamowienie in sklep_prod):
            print ("Mamy w sklepie! Cena:"+str(sklep_cena[sklep_zamowienie])+" zl/szt. Zamawiasz: ")
            print(sklep_prod[sklep_zamowienie])
            ilosc= int(input("Ile sztuk?: "))
            if(sklep_ilosc[sklep_zamowienie]-ilosc>=0):
                print("Do zaplaty za "+sklep_prod[sklep_zamowienie]+" : "+str(sklep_cena[sklep_zamowienie]*ilosc)+"zl.")
                suma+=sklep_cena[sklep_zamowienie]*ilosc
            else:
                print("Nie mamy az tylu sztuk") 
            a = sklep_ilosc[sklep_zamowienie]=sklep_ilosc[sklep_zamowienie]-ilosc
            if(a>=0):
                print("zostalo "+str(a)+" sztuk produktu o nazwie:"+sklep_zamowienie)
            print("brak produktu w sklepie")
        nav= input("Czy chcesz zamawiac dalej?: ")
else:
    print("Zakonczono. Suma do zaplaty: "+str(suma)+" zl.")