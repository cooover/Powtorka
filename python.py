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
# P58 i P59

'''sklep_prod={'chleb':'swiezy chleb', 'jajko':'duze jajka', 'mleko':'mleko prosto od krowy'}
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
                print("zostalo "+str(a)+" sztuk produktu o nazwie: "+sklep_zamowienie)
            print("brak produktu w sklepie")
        nav= input("Czy chcesz zamawiac dalej?: ")
else:
    print("Zakonczono. Suma do zaplaty: "+str(suma)+" zl.")'''

# P60

'''cyfry={'0':'zero', '1':'jeden', '2':'dwa', '3':'trzy', '4':'cztery', '5':'piec', '6':'szesc', '7':'siedem', '8':'osiem', '9':'dziewiec'}
napis=""
nav=""
print("Wcisnij Q aby zakonczyc wpisywanie")
while nav!="Q":
    nav=input()
    if(nav in cyfry):
        napis+=cyfry[nav]+" "
print(napis)'''

# P61
'''
for x in range (1,11):
    for y in range (1,11):
        print(x*y,"\t", end="")
    print()
'''
# P62
'''
for x in range (3,10):
    print(x*x," ",end="")
print()
'''
# P63
'''
list=[]
i=4
for x in range (1,10,2):
    list.append(x*x)
while(i>=0):
    print(list[i]," ",end="")
    i-=1
'''
# P64

list = []
nav=""
print("Wcisnij Q aby zakonczyc wpisywanie")
while nav!="Q":
    list.append(nav)
    nav=input()   
list.pop(0)
szukana_liczba = input("Jakiej liczby chcesz szukac?: ")
print(list)
if(szukana_liczba in list):
    print(list.index(szukana_liczba)+1)
else:
    print("nie ma tego na liscie")
    
# P65
