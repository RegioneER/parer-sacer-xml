# Sacer XML

Fonte template redazione documento:  https://www.makeareadme.com/.


# Descrizione

Il seguente progetto è utilizzato come **dipendenza** interna per definire i modelli "xsd" che via Jaxb permettono di generare le relative classi Java (marshalling & unmarshalling), è utilizzato quindi come libreria/dipendenza Maven (https://maven.apache.org/), dalle seguenti applicazioni: Sacer e Sacerws.

# Installazione

Come già specificato nel paragrafo precedente [Descrizione](# Descrizione) si tratta di un progetto di tipo "libreria", quindi un modulo applicativo utilizzato attraverso la definzione della dipendenza Maven secondo lo standard previsto (https://maven.apache.org/): 

```xml
<dependency>
  <groupId>it.eng.parer</groupId>
  <artifactId>sacer-xml</artifactId>
  <version>$VERSIONE</version>
</dependency>
```

# Utilizzo

Il modulo contiene al suo interno le principali definizioni dei modelli XML utilizzi in vari contesti applicativi, su cui viene effettuata una validazione sintattico/semenatica attraverso uno standard XSD (https://www.w3.org/TR/xmlschema11-1/) localizzabili nella directory [src/main/resources/xsd](src/main/resources/xsd/it/eng/parer/). Inoltre, attraverso JAXB (https://javaee.github.io/jaxb-v2/) è possibile effettuare le opportune operazioni di marshalling e unmarshilling al fine di ottenere in un caso a paritre dall'XML un oggetto Java e viceversa.  Per ottenere gli oggetti a partire dall'XSD si utilizza un apposito plug-in maven (https://mvnrepository.com/artifact/org.codehaus.mojo/jaxb2-maven-plugin/1.6) così definito su pom.xml: 

```xml
<plugin>
	<groupId>org.codehaus.mojo</groupId>
	<artifactId>jaxb2-maven-plugin</artifactId>
	<version>1.6</version>
</plugin>
```

Gli xsd sono organizzati per "macro ambiti" si può infatti osservare che esistono varie sotto folder contenute nella principale, alcuni esempi:

- [ws](src/main/resources/xsd/it/eng/parer/ws/), gli xsd all'intero raccolgono le modallazioni degli XML utilizzati in flussi operartivi esposti attraverso servizi backe-end (tipicamente REST);
- [aipFascicoli](src/main/resources/xsd/it/eng/parer/aipFascicoli/), xsd relativi alla generazione degli AIP;
- [firma](src/main/resources/xsd/it/eng/parer/firma/), xsd relativi alla generazione di modelli legati alla verifica firma dei file.

Le restanti sotto folder allo stesso modo sono organizzate secondo questa logica:

```bash
└── it
    └── eng
        └── parer
            ├── aipFascicoli
            ├── elenco
            ├── elencoFascicoli
            ├── firma
            ├── serie
            └── ws
```

In alcuni ambiti sono stati definiti, secondo lo standard JAXB, delle customizzazioni in termini di mapping dei dati / namespace, attraverso la definizone di XJB (https://docs.oracle.com/cd/E17802_01/webservices/webservices/docs/1.5/tutorial/doc/JAXBUsing4.html), questo al fine di ottere le personalizzazioni necessarie per l'implementazione degli applicativi che utilizzeranno i modelli Java generati.

# Supporto

Mantainer del progetto è [Engineering Ingegneria Informatica S.p.A.](https://www.eng.it/).

# Contributi

Se interessati a crontribuire alla crescita del progetto potete scrivere all'indirizzo email <a href="mailto:areasviluppoparer@regione.emilia-romagna.it">areasviluppoparer@regione.emilia-romagna.it</a>.

# Credits

Progetto di proprietà di [Regione Emilia-Romagna](https://www.regione.emilia-romagna.it/) sviluppato a cura di [Engineering Ingegneria Informatica S.p.A.](https://www.eng.it/).

# Licenza

Questo progetto è rilasciato sotto licenza GNU Affero General Public License v3.0 or later ([LICENSE.txt](LICENSE.txt)).

