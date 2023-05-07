M03-UF3
Pàgina 1
Read characters from a file!!!
En aquest exercici treballarem:
• Programació modular
• Classes i objectes
• ArrayList
• Lectura de fitxers de text amb try-catch-finally
Donat el fitxer characters-one-piece.csv importarem les seves dades usant la classe
java.io.File.
Per a fer-ho degudament, seguirem aquest passos:
1. Crear un nou projecte de IntelliJ amb el nom CognomNom_AC02
2. Refractor del Main per a posar-li el nom de CognomNom_Main.
3. Arrossegar el fitxer characters-one-piece.csv a l’arrel del workspace del projecte.
4. Observar estructura de dades del fitxer: la seva capçalera, les columnes que té i el seu
separador de columnes.
5. Crear un Package models dins del projecte.
6. Crear una nova classe de dades complexes dins de la carpeta models amb el nom de
CognomNom_Character amb els atributs (quantitat i tipus de dades) que creiem
necessaris segons el que haguem observat al fitxer.
7. A la classe controlador (Main), crear un ArrayList static i global de tipus
CognomNom_Character.
8. Crear un mètode dins del Main que permeti llegir lines usant Scanner.nextLine() i
parsejar-les usant String.split() el fitxer de dades i que usant un
while(fitxerInput.hasNextLine()){} afegeixi un objecte per a cada personatge dins de
l’ArrayList. Recorda usar la ruta relativa per a referir-te al fitxer.
9. Imprimir tots els objectes l’ArrayList per pantalla.
10. EXTRA: Crear els mètodes necessaris per tal de que el programa tingui un menú
principal funcional que permeti fer accions de CRUD sobre l’AL de personatges.
Entrega:
a. Fitxer de la classe CognomNom_Character.java
b. Fitxer de la classe CognomNom_Main.java
