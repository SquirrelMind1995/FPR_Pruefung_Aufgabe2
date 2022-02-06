# FPR_Pruefung_Aufgabe2
##Schlusswert
Der Schlusswert erscheint nun erst zum Schluss, da auf jeden Thread die join() Methode angewandt wurde.
Dies führt dazu, dass zuerst auf die Beendigung aller Threads gewartet wird, bis das Programm mit der Konsolenausgabe fortgesetzt wird.

##Exception
Ich habe die main-Methode in einen synchronized Kontext gesetzt. Dadurch wird die Datenkonsistenz gewährleistet, im Falle des 
gleichzeitigen Zugriffs zweier Thread auf eine Variable.