import csv

with open ("CSV_excel.csv") as f:
    reader =csv.DictReader(f, delimiter=";")
    therical=[]  #collections
    mesures=[]  #collections
    for row in reader:
        theorical=row("good")
        mesure=row("bad")  #se travaille par columns; chaque columns est unique

print(mesures)