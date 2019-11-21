# Java-Interface-AbstractClass
Lezione e Laboratorio sulle Interfaccie e le Classi Astratte in Java

## Esercizio 1: Eroi Contro Mostri
* Si supponga di avere delle carte da gioco. Ogni carta rappresenta un Personaggio che può essere di tipo o Umano o Mostro. 
* Un Personaggio di tipo Umano ha una forza fisica iniziale pari a 10 e può combattere, un Personaggio di tipo Mostro, invece, ha una forza fisica iniziale pari a 15 e può azzannare.
* I Personaggi del gioco sono Eroe, Vampiro e Licantropo.
* Eroe è solo della categoria Umano,
* Vampiro è solo della categoria Mostro,
* Licantropo è di tipo Mostro nelle notti di luna piena, altrimenti
di tipo Umano.
* In particolare, la forza fisica dei personaggi diminuisce di un valore pari a:
   - 3 per l’Eroe ad ogni combattimento
   - 2 per il Vampiro ad ogni azzanno
   - 2 per il Licantropo nelle notti di luna piena, 3 nelle altre. 
   ### Come Procedere
* Si dovranno definire tutte le classi e le interfacce necessarie per realizzare il gioco
* Si dovrà inoltre definire una classe principale (che ha il main) che:
* Istanzia tre oggetti: uno di tipo Eroe, uno di tipo Licantropo e uno di tipo Vampiro.
* In una notte di luna piena...
* Fa combattere tre volte l’Eroe
* Fa azzannare una volta il Vampiro
* Fa azzannare il Licantropo due volte
* in una notte di NON luna piena
* Fa combattere il Licantropo una volta
* Stampa al termine la forza fisica rimasta a ciascun personaggio 

**Nota: anche le interfacce sono organizzate in gerarchia** (un interfaccia puo' estendere un altra interfaccia)
