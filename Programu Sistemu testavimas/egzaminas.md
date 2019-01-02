# PS Testavimas

## Bendrieji dalykai

- **Programinės įrangos testavimas** - rizikos valdymo strategija, naudojama verifikuoti, ar programinė įranga ir  jos veikimas bei dokumentavimas atitinka specifikuotus reikalavimus. \
- **Testavimas** neapsiriboja programinio produkto defektų radimu – testuojama ir programos kokybė, atitiktis standartams, politikoms, teisės aktų reikalavimams ir pan.
- **Validavimas** - „aukšto lygio“ tikrinimas, kuris  atsako į klausimą, ar kuriama programinė įranga atitinka užsakovo norus ir reikalavimus.
- **Verifikavimas** atsako į klausimą, ar kuriama programinė įranga ar jos moduliai atitinka specifikaciją.
- **Defektas** (angl. bug) – PĮ sutrikimas
- **Klaida** reiškia, kad yra kažkoks **defektas**. Jei dėl **defekto** programa neatitinka specifikacijos, tada tai tampa **trikiu**. **Trikis** gali sukelti visos programos **gedimą**.
- **„Heisenbug**“ – programos defektas, kuris gali išnykti arba pakeisti savo elgseną/veikimą tuomet, kai kas nors ima jį nagrinėti.
- **Efektas** - kokiu mastu  naudotojas pasiekė nusibrėžtus tikslus, naudodamas sukurtą sistemą/procesą/produktą.
- **Efektyvumas** - kiek resursų sunaudota, siekiant tikslo.
- **Yo-yo grafo** paskirtis vizualizuoti polimorfizmus. YO YO grafo mazgai – tai metodai, o orientuotos šakos – tai iškvietimai iš iškviečiančio metodo į iškviečiamą metodą. Punktyrinėmis grafo rodyklėmis jungiami tie metodai, kurių versijos perrašomos, o nepunktyrinėmis - kurie realiai iškvečiami/iškviesti.
- **Juodosios dėžės testavimas** - būdas, kurį naudojant, testavimo sąlygos, atvejai, testavimo duomenys yra rašomi pagal specifikacijos reikalavimus, taip pat analizuojant kitą dokumentaciją. Jis apima tiek funkcinį, tiek nefunkcinį testavimą. Juodosios dėžės testavimas nesiremia vidine sistemos ar jos komponentų struktūra
- **Baltosios dėžės** testavimas remiasi sistemos arba jos komponentų struktūros analize
- **Pilkosios dėžės** -„baltosios“ ir „juodosios“‘ dėžės testavimo būdų kombinacija, kuomet testuotojas išanalizuoja reikalavimus ir komunikuoja su kūrėjais, siekdamas išsiaiškinti vidinę sistemos struktūrą ir taip eliminuoti daugiaprasmybes; jis skaito „tarp eilučių“, siekdamas sukurti testavimo atvejus.
- **Regresinis testavimas** - testavimo rūšis, kurios pagrindinė paskirtis – patikrinti, ar naujas kodas *išlaiko ankstesnėse versijose veikusį funkcionalumą ir elgseną*, testuojant ne tik pasikeitusias sritis bei modulius, bet visą funkcionalumą.
- **Negatyvus testavimas** – testavimas, atliekamas, turint negatyvų požiūrį, siekiant patikrinti tai, ką sistema atlieka klaidingai; šis požiūris padeda rasti defektus.
- **Kodo padengimas/aprėptis** – matas, parodantis, kiek (kuri dalis) programinės įrangos kodo buvo vykdoma testuojant.
- **Alfa** testavimą atlieka kūrėjai ir testuotojai
- **Beta** testavimas atliekamas pas klientą/užsakovą (angl. before delivery), atlieka naudotojai - Beta testavimą atlieka realūs naudotojai realioje („live“) aplinkoje
- **Gama** testavimas atliekamas pas klientą, kai programinės įrangos einamoji versija parengta išleidimui.
- **Derinimas** (angl. Debugging) – programinės įrangos defektų ar problemų radimo ir koregavimo procesas, apimantis kintamųjų momentinių reikšmių analizę, programos veikimo „kelių“ (angl. paths) analizę
- **Burndown** - Diagrama, kurioje parodoma, kaip greitai ir jūsų komanda susidoroja su naudotojų istorijom (user stories). Tai rodo bendrą pastangų kiekį, palyginti su kiekvienos iteracijos pristatymu.
- **Smoke“ testavimas** - programinės įrangos testavimo rūšis, apimanti testavimą po programinės įrangos komponentų surinkimo/parengimo diegimui („build“) ir prieš instaliavimą (pvz., patikrinti, ar programa iš principo pasileidžia); „smoke“ testavimo tikslas – užtikrinti, kad kritinis ir svarbiausias funkcionalumas veikia korektiškai
- **ISTQB® (International Software Testing Qualifications Board)** is a not-for-profit association legally registered in Belgium.
- **Extreme programming (XP)** is a software development methodology which is intended to improve software quality and responsiveness to changing customer requirements. As a type of agile software development,[1][2][3] it advocates frequent "releases" in short development cycles, which is intended to improve productivity and introduce checkpoints at which new customer requirements can be adopted. 
- **Hipotezių testavimas** - statistinis testavimas, naudojamas siekiant nustatyti, ar duomenų pavyzdyje yra pakankamai įrodymų, leidžiančių daryti išvadą, kad tam tikra sąlyga tinka visai populiacijai.
- **Pakartotinis/regresinis** testavimas atliekamas toje pačioje aplinkoje, o **pertestavimo** - kitose.
- **Euristinis** (patirtimi paremtas) - vietoj struktūrinio (angl. scripted testing), paremto testavimo atvejais , tai algoritmų, kodo ir kt. testavimas, kurios strategija grindžiama tikimybėmis, paremtomis praeities duomenimis, patirtimi. Patyrę testuotojai, kūrėjai intuityviai vertina, ar defektų tikimybė didelė, ar ne.

## Temos

### Web aplikacijų testavimas (įskaitant Web aplikacijų patikimumo ir saugos testavimą).

- Web application testing, a software testing technique exclusively adopted to test the applications that are **hosted on web** in which the application interfaces and other functionalities are tested.
- Testavimo metodai:
  - **Funkcionalumo testavimas**:
    - Verify there is no dead page or invalid redirects.
    - First check all the validations on each field.
    - Wrong inputs to perform negative testing.
    - Verify the workflow of the system.
    - Verify the data integrity.
  - **Panaudojamumo testavimas**
    - Test the navigation and controls.
    - Content checking.
    - Check for user intuition.
  - **Sąsajos testavimas** (verify the interface and the dataflow from one system to other)
  - **Suderinamumo testavimas**
    - Browser compatibility
    - Operating system compatibility
    - Compatible to various devices like notebook, mobile, etc.
  - **Našumo testavimas**
    - Apkrovos testai
    - Streso testai
    - Ištvermės testai
    - "Spike Testing" - staiga atsiranda didžiulis kiekis naudotojų
  - **Saugumo testavimas**
    - Injection
    - Broken Authentication and Session Management
    - Cross-Site Scripting (XSS)
    - Insecure Direct Object References
    - Security Misconfiguration
    - Sensitive Data Exposure
    - Missing Function Level Access Control
    - Cross-Site Request Forgery (CSRF)
    - Using Components with Known Vulnerabilities
    - Unvalidated Redirects and Forwards

### WS testavimas.

- Web Service testing
- Web Services is the mechanism or the medium of communication through which two applications / machines will exchange the data irrespective of their underline architecture and the technology.
- Naudojami 2 pagrindiniai Web Servisų protokolai:
  - SOAP (Simple Object Access Protocol) - naudoja XML
  - REST (Representational State Transfer architecture) - naudoja HTTP
- **WSDL** (Web Services Description Language) is an XML based language which will be used to describe the services offered by a web service.
- **Testavimo žingsniai**:
  - Understand the WSDL file
  - Determine the operations that particular web service provides
  - Determine the XML request format which we need to send
  - Determine the response XML format
  - Using a tool or writing code to send request and validate the response
- Būdai
  - Manual
  - Custom automated
  - Third-party automated

### Objektiškai orientuotas testavimas: problemos, iššūkiai.

Objektiskai orientuoto testavimo lygmenys:

1. **Operation/Method** Testing : Performed for classes, blocks and service packages. There are two ways of selecting units :
   1. Methods as Units
   2. Classes as Units
2. **Class** Testing : Intra & Inter class testing is done, test interaction between previously tested methods.
3. **Integration** Testing : Interaction between previously tested classes
   1. Execution Based Integration Testing :Reveals erroneous interaction of units by tracing their execution.
   2. Value Based Integration Testing : Boundary value testing and equivalence class partitioning done by employing action values.
   3. Function Based Integration Testing : Validate functionality of components.
4. **System** Testing : Exercising the whole system is done in this testing. Testing conducted on the complete integrated products & solutions to evaluate system compliance on functional and non-functional requirements is called system testing.

**Polimorfizmas**: teoriškai reikėtų ištestuoti visus galimus susiejimus (bindings; dinaminio susiejimo atveju kodas, kuris realizuoja funkcionalumą, nėra žinomas iki jo vykdymo), bet tai – didelė apimtis, be to, sunku identifikuoti visus sąryšius(bindings);

**Flattening inheritance**:

- Kiekvienas poklasis yra testuojamas taip, tarsi visi paveldėti požymiai būtų naujai apibūdinti.
- Testai, naudojami super klasėse, gali būti naudojami pakartotinai.
- Daug testų yra pertekliniai.

**Incremental testing**: Apriboti testus tik naujoms / pakeistoms funkcijoms.

**Inkapsuliacija**: tikrinamos privačių kintamųjų reikšmės(ataskaita apie būseną); problema – derinimo (debug)metu nematomos kintamųjų reikšmės;

### Objektiškai orientuotas testavimas: kaip testuoti, esant problemoms dėl paveldimumo.

- ...

### Objektiškai orientuotas testavimas: kaip testuoti, esant problemoms dėl polimorfizmo.

- ...

### Objektiškai orientuotas testavimas: yo yo metodas (paskirtis, taikymas, pateikti pavyzdį).

- ...

### Automatizuotas testavimas. Apibūdinti. Kokie karkasai naudojami?

**Testavimo automatizavimas** – tai specialios programinės įrangos (kitos, nei testuojama) naudojimas testų atlikimui kontroliuoti bei gautų rezultatų palyginimui su laukiamais.

Automatizuotas testavimas **naudojamas**:

- tuomet, kai rankinis testavimas labai lėtas,
- tuomet, kai reikia pratestuoti daugiakalbį interfeisą, svetaines ir pan.,
- norint automatinius testus paleisti ne darbo metu, kadangi jis nereikalauja žmogaus įsikišimo,
- dėl to, kad automatizuoti testai vykdomi greičiau,
- dėl to, kad automatizuoti testai gali aprėpti daugiau testavimo atvejų,
- rankinis testavimas nuobodus ir sąlygoja klaidas dėl žmogiškojo faktoriaus.

**Testavimo karkasas** - tai programinė įranga, sukonstruota integraciniam testavimui palengvinti. Tai testuojamos aplikacijos atžvilgiu išorinė programinė įranga, kuri imituoja servisus ir funkcionalumą, kurio testavimo aplinkoje nėra. Karkasai naudojami:

- Automatizuotam testavimui, kadangi apima testavimo skriptus, parametrus, reikalingus testavimo skriptams vykdyti, ir įgalina “surinkti” rezultatus;
- Integraciniam testavimui:  naudojama integruoti dviems sąveikaujantiems  kodo vienetams/moduliams bei patikrinti, ar apjungti komponentai elgiasi/funkcionuoja taip, kaip tikėtasi.

Testavimo karkasai automatizuotam testavimui:

- **Duomenų valdymo** automatizavimo karkasas (angl. Data Driven Automation Framework), naudojantis duomenų valdymo skriptus (angl.  data driven scripts).
- **Raktiniais žodžiais/lentelėmis paremtas** automatizavimo karkasas (angl.  Keyword Driven Automation Framework) yra nuo aplikacijos nepriklausantis automatizavimo karkasas, sukurtas testų apdorojimui.
- **Modulinis** automatizavimo karkasas (angl. modular Automation Framework) dalina testuojamą aplikaciją į eilę loginių izoliuotų modulių.  
- (Sėkmingiausiai naudojamas) **hibridinis** automatizavimo karkasas (angl. Hybrid Automation Framework), naudojantis tiek duomenų valdymo skriptus (angl.  data driven scripts), tiek raktiniais žodžiais/lentelėmis paremtą automatizavimo karkasą.
- **Elgsena paremtas** automatizavimo karkasas (angl. Behavior Driven Development (BDD) framework), įgalinantis lengvą funkcinių validacijų automatizavimą.

### Ciklų testavimas.

**Ciklų testavimas** – „baltosios dėžės“ principu paremtas struktūrizuotas  testavimas, kai testuotojas dirba su programinės įrangos išeities tekstu, rengdamas testavimo atvejus (kelių testavimas, duomenų validavimas, sąlygų testavimas).

Ciklinis testavimas skirtas:

- tam, kad nustatyti ir ištaisyti ciklo pasikartojimo problemas,
- tam, kad identifikuoti veikimo/našumo problemas (bottlenecks),
- tam, kad nustatyti neinicializuotus kintamuosius (kintamuosius, kuriems nepriskirtos pradinės reikšmės),
- tam, kad nustatyti ciklo inicializavimo problemas
- Testavimo strategija ciklų testavimui – ciklas turi būti patikrintas trijuose skirtinguose lygmenyse:
  - ciklo pradžioje,
  - ciklo vykdymo eigoje,
  - ciklui pasibaigus.

### Testavimo aplinka. Testavimo specifika, naudojant debesijos paslaugas.

**Testavimo aplinka** – tai įdiegta ir atitinkamai sukonfigūruota programinės, techninės ir tinklo įrangos sąranka, skirta testavimo atvejų vykdymui.

Testinės aplinkos parengimas apima tokių komponentų paruošimą testavimui:

- sistemos ir aplikacijų,
- testavimo duomenų,
- DB serverio,
- „front end“ aplinką, 
- klientinės dalies operacinę sistemą,
- naršykles,
- kompiuterinį tinklą,
- techninę įrangą, serverių  operacines sistemas, 
- konfigūravimo dokumentaciją, diegimo/instaliavimo vadovus, naudotojo vadovus, kitą dokumentaciją.

Testinės aplinkos parengimo procese dalyvauja sistemos administratoriai, naudotojų administratoriai, programinės įrangos kūrėjai ir testuotojai, techniniai specialistai, kartais – naudotojai.

Testavimo specifika naudojant debesijos paslaugas:

- **Veikimas/Performance** – „cloud“ aplikacijos funkcionuoja infrastruktūroje, kurios testuotojas nevaldo, be to, infrastruktūros resursus dalinasi su kitomis aplikacijomis.  Todėl veikimo užtikrinimas labai svarbus, ir testuotojas į testavimą Debesijoje gali žiūrėti kaip į testavimą gamybinėje aplinkoje. Jei žinoma, kad „cloud“ programa dalijasi ištekliais su kitomis programomis, tuo pačiu metu rekomenduojama paleisti apkrovos bandymus, kad įsitikinti, ar aplikacijos veikia viena kitą. Rekomenduojama taip pat  naudoti stebėseną kaip priemonę, kad būtų galima nuolat vertinti tiek našumą, tiek funkcionalumą. Debesijos paslaugos brangios, tad, žinant silpnas vietas ir jas valdant, galima patirti mažiau sąnaudų.
- **Sauga/Security** – reikia didesnį dėmesį skirti prieigos prie konfidencialių duomenų ribojimo problemoms, pagalvojant, ar jautrūs duomenys talpinami šifruoti/kriptuoti, ar tinkamai veikia prieigos teisių valdymo mechanizmas visuose lygmenyse. Invazijos ir duomenų vagystės debesijos atveju gali būti ir atsitiktinės, pvz., darant vienos aplikacijos rezervinę kopiją, gali būti padaryta kopija ir kitos aplikacijos/duomenų.
- **Priklausomybė nuo trečių šalių/Third-party dependencies** – debesijos aplikacijos naudoja išorinius APS (API) ir paslaugas (services), teikiančias tam tikrą funkcionalumą.  Testuojant į jas reikia žiūrėti kaip į nuosavo sprendimo dalį, taip pat testuoti ir naudotojo požiūriu.

### Statiniai testavimo atvejų kūrimo būdai. Apibūdinti kiekvieną.

**Statinis testavimas** - tai programinės įrangos tikrinimas rankiniu būdu arba naudojant įrankius. Statinis bandymas paprastai atliekamas pradiniame programinės įrangos kūrimo ciklo etape. Statinis testavimas yra naudingas bandant daugelį programinės įrangos aspektų, įskaitant pirminį kodą, funkcines ir reikalavimo specifikacijas bei projektavimo dokumentus ir modelius. Statinis bandymas gali būti toliau suskirstytas į dvi kategorijas, atsižvelgiant į tai, ar jis atliekamas rankiniu būdu, ar naudojant įrankius.

- **Rankiniai** TA kūrimo būdai:
  - Walkthrough (rankinis perėjimas) - Autoriai nurodo dalyvius per dokumentą ir bando suprasti jų minties procesus, kad gautų grįžtamąjį ryšį ir pasiektų bendrą supratimą.
  - Neformali peržiūra - siekiama pagerinti aptariamo produkto kokybę per diskusijas ir šitas procesas paprastai nėra dokumentuojamas
  - Techninė apžvalga - atlieka apmokytas moderatorius arba techninis ekspertas
  - Auditas - visų su programine įranga susijusių dokumentų nagrinėjimas, kurį atlieka išorinis nepriklausomas agentas
  - Inspekcija - pats formaliausias peržiūros būdas, kurį atlieka apmokyti moderatoriai. Tikrinimo metu dokumentai ir produktai yra tikrinami per peržiūros procesą ir nustatomi defektai. Nustatyti defektai dokumentuojami registravimo sąraše arba išdavimo žurnale ir atliekamas oficialus tolesnis patikrinimas
  - Valdymo apžvalga - kompleksinė funkcinė apžvalga, kurią atlieka aukščiausioji organizacijos vadovybė. Ji apima klientų pasitenkinimo analizę, prastos kokybės sąnaudų nustatymą, veiklos tendencijas ir verslo plane nustatytų tikslų pasiekimą.
- **Naudojant įrankius**:
  - Kodavimo standartų analizė
  - Kodo metrikų analizė
  - Kodo struktūros analizė

### Dinaminiai testavimo atvejų kūrimo būdai. Apibūdinti kiekvieną.

**Dinaminis testavimas** apima bandomojo objekto (programos) vykdymą kompiuteryje. Įvesties duomenys įvedami į bandomąjį objektą (programą) ir programa vykdoma. Dinaminiuose bandymuose analizuojami įvairūs kiekiai, pvz., Atminties naudojimas, atsako trukmė, procesoriaus pajėgumo naudojimas ir bendras programinės įrangos našumas, lyginant su laukiama produkcija. Dinaminis bandymas atliekamas patvirtinimo proceso metu. Dinaminius bandymų projektavimo metodus galima toliau suskirstyti į:

- **Specifikacijomis pagrįstas / juodųjų dėžių bandymo dizaino metodas**
  - Ribinės vertės analizė (BVA - boundary value analysis)
  - Sprendimų lentelės testavimas
  - Būsenos perėjimo testavimas
- **Struktūrinis / baltos dėžės bandymo dizaino metodas**
  - Priešingai nei juodųjų dėžių bandymo projektavimo technika, baltos dėžės bandymo projektavimo technika reikalauja žinių apie programos vidinę struktūrą.

### Integracinis testavimas. Integracinio testavimo metodai/būdai (apibūdinti)

**Integracijos testavimas** – tai testavimo rūšis, kuri skirta patikrinti, ar visi reikiami komponentai įtraukti į sistemą, ar jų sąsajos yra suderintos ir tarpusavio sąveikos funkcionuoja  korektiškai. Tipiškai jis atliekamas po vienetų/komponentų testavimo, prieš kokybės kontrolę - validavimą. Integracinio testavimo metu imami jau ištestuoti sistemos komponentai arba jų grupės. Integracinio testavimo rezultatas – išvada, kad integruota sistema (ne)parengta testavimui

**Sąsajos testavimas** – tai integracinio testavimo tipas, kuris koncentruojasi į sąsajos tarp komponentų arba sistemų testavimą arba tai apibrėžtos sąsajos su komponentu arba sistema testavimas.

Testavimo būdai:

- Big Bang - Visi moduliai integruojami ir testuojami iš karto
- Top down (Incremental) - In Top to down approach, testing takes place from top to down following the control flow of the software system. (Stub is called by the Module under Test)
- Bottom up (Incremental) - In the bottom-up strategy, each module at lower levels is tested with higher modules until all modules are tested. It takes help of Drivers for testing (Driver calls the Module to be tested)

### Priėmimo testavimas, jo rūšys. Apibūdinti.

**Priėmimo testavimas** nustato, ar galutinis produktas atitinka naudotojo reikalavimus. 

- Rūšys:
  - Alfa ir Beta
  - Juodosios dežės
  - Naudotojo priėmimo testas

### Mutavimo testavimas. Apibūdinti.

**Mutavimo testavimas** – tai mutavimo analizės naudojimas tam, kad sukurti naujus programinės įrangos testus arba įvertinti egzistuojančius testus (jų kokybę).  Mutavimo testavimo metu nežymiai modifikuojama programinė įranga. Mutavusi programinės įrangos versija vadinama **mutantu**. Testai aptinka ir atmeta mutantus (angl. killing the mutant). Mutantai kuriami apibrėžtų mutavimo operatorių pagrindu. Mutavimo operatoriai imituoja programavimo klaidas (pvz., nurodomas klaidingas kintamojo pavadinimas) arba priverstinai sąlygoja naujų testų sukūrimą (pvz., dalybai iš nulio). Mutavimo testavimo tikslas – aptikti silpnas vietas testiniuose duomenyse arba programiniame kode, ypač tame, kuris retai naudojamas,  taip sukuriant efektyvesnius testus. Jeigu, testuojant mutantą, kyla problemų, tai reiškia, kad originalios(nemustavusios) programinės įrangos atitinkamas kodas nebuvo naudojamas/testuojamas („miręs“ kodas),  arba kad testų rinkinys buvo nepakankamos aprėpties.

Mutavimo testavimas gali būti skirstomas į  programinio kodo sakinių/teiginių mutavimo testavimą (pvz., programuotojas įterpia kodo eilutę, kuri programiniame kode panaikina kai kuriuos sakinious/eilutes), sprendimo mutavimo testavimą (programiniame kode pakeičiami kontrolės sakiniai) ir reikšmių mutavimo testavimą (modifikuojamos parametrų reikšmės).
Mutavimo testavimo pranašumai:

### “Chaos monkey” testavimas. Apibūdinti.

**„Chaos monkey“**  vadovaujasi nuostata  „geriausias būdas išvengti esminių trikių – nuolatos patirti trikius“

„Chaos monkey“  atsitiktiniu būdu užbaigia realioje aplinkoje  funkcionuojančios žiniatinklio paslaugos  egzempliorius, siekiant užtikrinti, kad įdiegtos žiniatinklio paslaugos yra atsparios tokio tipo egzempliorių trikiams. „Chaos Monkey“  programinė priemonė buvo sukurta  „Netflix„  inžinierių tam , kad testuoti AMAZON žiniatinklio paslaugų atsparumą ir atstatomumą. Programinė priemonė gali būti konfigūruojama, nustatant egzempliorių uždarymo dažnį ir kitus parametrus (taip pat ir egzempliorių paleidimo dažnį).

Testuojant stengiamasi imituoti trikius tuo metu, kai jie gali būti operatyviai valdomi, tai yra kai jiems galima būti pasiruošus, nelaukiant, kol ištiks reali nuostolius nešanti katastrofa. Testavimo metu tikrinama, ar gerai valdomi/sprendžiami kilę incidentai/problemos.

### Kokybės užtikrinimas; kokybės kontrolė; testavimas. Apibūdinti. Kokie skirtumai tarp šių trijų veiklų?

- **Kokybės užtikrinimas**
  - Veiklų kompleksas, apimantis visus technologinius aspektus visuose programinio produkto kūrimo, diegimo ir eksploatavimo inicijavimo etapuose, ir vykdomas, siekiant užtikrinti tam tikrą programinio produkto kokybės lygį
  - Fokusuojasi į procesus ir priemones, o ne testavimo atlikimą
  - Orientuotas į procesą
  - Prevencinio pobūdžio, pateikia prevencines priemones
  - Programinės įrangos gyvavimo ciklo procesų poaibis
- **Kokybės kontrolė**
  - Kontroliavimas, kad kuriamas programinis produktas atitiktų nustatytus reikalavimus
  - Koncentruojasi į testavimo atlikimą, vykdant programą; naudoja patvirtintus procesus ir priemones;  tikslas - nustatyti defektus.
  - Orientuotas į produktą
  - Koreguojantis procesas
  - Kokybės užtikrinimo procesų poaibis (kokybės kontrolė – dalis kokybės užtikrinimo)
- **Testavimas**
  - Procesas, apimantis testavimo atvejų kūrimą ir vykdymą, defektų aptikimą ir pan.
  - Fokusuojasi į testavimo atlikimą
  - Orientuotas į produktą
  - Koreguojantis procesas
  - Kokybės kontrolės procesų poaibis (testavimas – dalis kokybės kontrolės)

### Testavimo scenarijai ir testavimo atvejai. Apibūdinti.

**Testavimo atvejis** – tai sąlygų ir kintamųjų aibė, kuria remiantis testuotojas sprendžia, ar sistema funkcionuoja korektiškai ir ar atitinka reikalavimus. Rengiant testavimo atvejus, taip pat aptinkamos klaidos reikalavimų specifikacijoje arba sistemos projekte.

Testavimo atvejį nusako testo atlikimo pradžios sąlygos (pre-conditions) ir testavimo įvesties pasekoje, atlikus testavimo atvejo žingsnius, grąžinti rezultatai, kai sistema/produktas pereina į būseną, nusakomą post-sąlygomis (post-conditions).

**Testavimo scenarijus** – tai testavimo veiklos struktūros aprašymas. Jis apima vaidmenų sąrašą bei vaidmenų atliekamas testavimo veiklas ( pvz., vaidmenys - buhalteris, kasininkas; testavimo veiklas – sukurti prekių realizavimo  dokumentus).

Egzistuoja skirtumas tarp testavimo atvejo ir testavimo scenarijaus. Testavimo atvejis atsako į klausimą, kaip testuoti, o testavimo scenarijus – kas turi būti testuojama. Pagal testavimo scenarijų yra aprašomi testavimo atvejai.

### Testavimo vertinimas. Testavimo metrikos, jų kategorijos pagal ISTQB. Kokiais aspektais vertinamas testavimo progresas (pagal kokias dimensijas)? Pateikti pavyzdžių, atitinkančių kiekvieną dimensiją. Kokios metrikos naudojamos testavimo procesui įvertinti? Pateikti pavyzdžių. Efekas ir efektyvumas.

Metrikų pavyzdžiai:

1. Defekto paieškos kaina (Kiek laiko užtruko)
2. Reikalavimų prieaugis
3. Defektų tankis
4. Perdarymo pastangų dydis
5. Patikrinimo pastangų dydis

### Testavimo vertinimas. Metrikų grupės/kategorijos/rūšys pagal testavimo proceso veiklas. Pateikti pavyzdžių.

- ...

### Testavimo strategijos tipai pagal ISTQB. Apibūdinti.

- **Analitinė strategija** apima dvi bendras testavimo strategijas: reikalavimais paremtą testavimą ir rizika paremtą testavimą. Testavimo komanda ja vadovaujasi, analizuodama testavimo bazę, testavimo sąlygas ir pan.
- **Modeliu paremta strategija** orientuojasi į operacinius profilius, kurių variantai dažnai naudojami veikimo ir patikimumo testavimui. Ji taip pat orientuota į formalius modelius, pvz., sukurtus UML notacija. Formalių modelių atveju dažnai modeliai naudojami ne patikimumo testavimui, o funkciniam testavimui. Ši strategija pasiteisina, kai testavimo komanda modeliuoja realią  aplinką, kurioje sistema funkcionuos, taip pat kuriamos sistemos elgseną tos aplinkos sąlygomis. Modelis rengiamas pagal faktinius arba prognostinius duomenis.
- **Metodikomis paremta strategija** orientuota į standartinės testavimo sąlygų aibės naudojimą (testavimo baze pairenkamas testavimo metodas, standartas, tipiniai kontroliniai sąrašai ir pan.), pvz., testuojama atitiktis  kokybės standartui ISO 9126 (“Programinės įrangos kokybės charakteristikos”). Standartai gali būti taikomi tam tikram testavimo tipui, pvz., saugumo testavimui.  Strategijoje numatytų testavimo sąlygų (test conditions) aibė išlieka ta pati visose iteracijose, taip pat kuriant visas produkto versijas.
- **Procesą arba standartą atitinkanti strategija** numato testavimo proceso eigą tokią, kokia yra aprašyta/nustatyta  kompetentingų asmenų, pvz., standartų komiteto. Tpiškai procesai būna dokumentuoti, aiškiai identifikuojami (pvz., AGILE metodika, IEEE (standartų organizacijos) standartai), o strategija numato, kad testuojant ir/arba  atliekant testavimo valdymą, reikia jų laikytis.
- **Reaktyvi strategija** yra dinaminė (požiūris į testavimą evoliucinis, greitai kinta, vystosi) ir euristinė, paremta atvejų identifikavimų, remiantis patirtimi, o ne modeliais ir/arba standartais. Testavimo atvejai rašomi tik po to, kai „gaunamas“ testavimo vienetas. Tai reagavimo į realiai testuojamos sistemos ar jos komponento veikimą, elgseną ar savybes strategija. Gali būti taikoma tiek iteraciniam, tiek nuosekliam sistemos kūrimo metodui. Gali apimti iš anksto turimų struktūrų panaudojimą, pvz., atakuojančią programinę įrangą.
- **Konsultacinio pobūdžio** naudojama tam, kad nustatyti reikiamą testavimo aprėptį, konsultuojamasi su suinteresuotais asmenimi,  pasitikint jų pateikta informacija.

### Defektų gyvavimo ciklas. Defektų statusai. Defekto svarba ir prioritetas.

1. New
2. Assigned
3. Open -> (Duplicate / Rejected / Defered / Not A Bug)
4. Fixed
5. Pending retest
6. Retest -> Reopened (back to 3)
7. Verified
8. Closed

Defekto svarba yra susijusi su sunkumu. Paprastai **sunkumas apibrėžiamas** kaip finansiniai nuostoliai, žala aplinkai, įmonės reputacija.

Defekto prioritetas yra susijęs su tuo, kaip greitai klaida turėtų būti ištaisyta ir paleista įmonės veikiančiuose serveriuose. Kai defektas yra didelis, greičiausiai jis taip pat turės aukštą prioritetą. Panašiai ir su mažo sunkumo defektais, tada jie turi žemą prioritetą.

### Testavimo planas. Skirtumai tarp testavimo plno ir strategijos.

**Testavimo planas** – tai dokumentas, aprašantis testavimo apimtį, resursus ir pateikiantis testavimo veiklų tvarkaraštį. Pagal ISTQB, testavimo planas – tai dokumentas, aprašantis testavimo apimtį, resursus ir pateikiantis testavimo veiklų tvarkaraštį. Tai formalus testavimo pagrindas programinės įrangos kūrimo projekte. Jame pateikti testuotini vienetai, savybės, kurias reikia testuoti, testavimo užduotys, kas užduotis atliks, testuotojų nepriklausomumo laipsnis, testavimo aplinkos aprašymas, testavimo atvejų projektavimo būdas, testavimo pradžios ir pabaigos kriterijai ir pagrindimas, kodėl tokie kriterijai pasirinkti, rizikos, kurios reikalauja testavimo veiklos atstatymo.

- Testavimo planas
  - Dokumemtas, kuriame aprašoma testavimo apimtis, tikslas, požiūris, koncentruojantis į testavimo resursų panaudojimą
  - Testavimo plano komponentai apima: plano id, testuojamas savybes arba elgseną, testavimo būdą, testavimo užduotis, testo sėkmingumo arba nesėkmingumo kriterijus, testavimo komponentus, atsakomybes tvarkaraštį
  - Rengia testavimo vadovas arba lyderis, aprašydamas kaip ir kada testuoti, kas testuos, ką testuos
  - Atspindi reikalavimų užtikrinimą
  - Gali keistis
  - Planas rašomas, siekiant nustatyti potencialias problemas ir priklausomybes tam, kad įvertinti rizikas
  - Egzistuoja savarankiškai
  - Aprašyta projekto lygyje
- Testavimo strategija
  - Gairės, orientuojančios, kokį testavimo atvejų projektavimo ir testavimo būdą naudoti,  kaip testavimas turi būti atliekamas
  - Strategija apima: tikslus ir apimtį, taip pat aprašomi dokumentacijos formatai, testavimo procesas, atsiskaitymo struktūra, komunikavimo su klientu strategija
  - Rengia projekto vadovas, aprašydamas, į kokius testavimo būdus orientuotis, kokius komponentus testuoti
  - Atspindi bendrą požiūrį į testavimą
  - Po parengimo nekeičiama
  - Tai ilgalaikis „testavimo planas“, kuriame galima abstrahuoti nespecifinę konkrečiam projektui informaciją, parenkant testavimo požiūrį
  - Testavimo strategija gali būti kaip testavimo plano skyrius mažuose projektuose
  - Nustatyta organizacijos lygiu ir gali būti taikoma daugeliui projektų

### Agile testavimo specifika.

Laikomasi taisyklės, kad jokioje iteracijoje sukurtos ir įdiegtos savybės (angl. features) nelaikomos baigtomis kurti iki tol, kol neatliekama visų sistemos dalių integracija ir neatlikti sistemos testai. Gera praktika taip pat laikoma tai, kad ankstesnėje iteracijoje nebaigti taisyti defektai baigiami ištaisyti sekančios iteracijos pradžioje.

### Pateikti tradicinio V, viengubo V, dvigubo VV, trigubo VVV modelio apibūdinimą testavimo požiūriu. Ką modeliai nusako? Koks skirtumas tarp jų?

- Tradicinis V modelis modifikuoja tradicinio V modelio mazgus, kad atspindėtų bandomuosius darbinius produktus, o ne jų gamybai naudojamas veiklas.
- Dvigubas VV modelis prideda antrą V, kad parodytų kiekvienos iš šių vykdomų darbo produktų bandymų tipą.
- Trigubas VVV modelis prideda trečiąjį V, kuris parodo, kaip svarbu patikrinti bandymus, siekiant nustatyti, ar jame yra defektų, kurie gali sustabdyti arba atidėti bandymus, arba sukelti klaidingus teigiamus arba klaidingus neigiamus bandymų rezultatus.

### Testavimo veiklų integracija į bendrą sistemos kūrimo gyvavimo ciklą pagal ISTQB spiralinio, Agile, iteratyvaus augančio, nuoseklaus modelio atvejais.

- ...

### Valstybės informacinių sistemų kūrimo būdai pagal 2015 m. balandžio mėn. 1 d. IVPK direktoriaus įsakymą „Dėl valstybės informacinių sistemųgyvavimo ciklo valdymo metodikos patvirtinimo“.

1. Valstybės informacinių sistemų kūrimo būdai yra nuoseklusis, modulinis ir iteracinis-inkrementinis.
2. **Nuoseklusis** (angl. waterfall) valstybės informacinės sistemos kūrimo būdas susideda iš vienas po kito vykdomų realizavimo stadijos etapų (detali analizė, projektavimas, konstravimas ir integravimas, testavimas, diegimas), kurie nepersidengia ir nesikartoja. Valstybės informacinė sistema realizuojama, nuosekliai įgyvendinant atskirus realizavimo stadijos etapus vieną kartą nuo pirmojo iki paskutiniojo. Po paskutiniojo etapo patvirtinamas priėmimo ir tinkamumo eksploatuoti aktas ir įteisinama valstybės informacinė sistema.
3. **Moduliniu** (angl. modular) valstybės informacinės sistemos kūrimo būdu valstybės informacinė sistema realizuojama, išskaidant ją į atskiras sudedamąsias dalis (posistemius, modulius ir pan.), kurioms įmanoma nustatyti atskirus veiklos reikalavimų rinkinius, kuriuos realizavus šią sudedamąją valstybės informacinės sistemos dalį galima naudoti kaip savarankišką vienetą. Šis kūrimo būdas susideda iš nuosekliai vykdomų realizavimo stadijos etapų, kurie yra taikomi kiekvienos tokios valstybės informacinės sistemos dalies kūrimui. Valstybės informacinės sistemos dalys gali būti vystomos lygiagrečiai arba persidengiančiai laiko atžvilgiu. Pirmoji sėkmingai įdiegta ir atitinkanti jai valstybės informacinės sistemos techniniame aprašyme (specifikacijoje) (toliau – Specifikacija) apibrėžtus veiklos reikalavimus sudedamoji valstybės informacinės sistemos dalis gali būti įteisinama, patvirtinant priėmimo ir tinkamumo eksploatuoti aktą, kuriame nurodoma, kokia valstybės informacinės sistemos dalis laikoma priimta ir tinkama eksploatuoti gamybinėje aplinkoje. Kiekviena vėliau baigta kurti dalis integruojama į jau veikiančią valstybės informacinę sistemą. Analogiškai gali būti patvirtinamas priėmimo ir tinkamumo eksploatuoti aktas, nurodant, kiek ir kokios Specifikacijoje nurodytos valstybės informacinės sistemos dalys tinkamos eksploatuoti. Visa valstybės informacinė sistema baigiama įteisinti, realizavus visas Specifikacijoje nurodytas dalis ir patvirtinus priėmimo ir tinkamumo eksploatuoti aktą, nurodant, kad visa valstybės informacinė sistema yra sukurta ir tinkama eksploatuoti.
4. **Iteracinis-inkrementinis** (angl. agile) valstybės informacinės sistemos kūrimo būdas vadinamas toks būdas, kai valstybės informacinės sistemos realizavimas vykdomas prieaugiais, kurie sudaromi iš vieno ar daugiau valstybės informacinės sistemos panaudojimo atvejų (angl. use case), siekiant per kuo trumpesnį laiką valstybės informacinę sistemą naudojantiems asmenims pateikti bent vieną tinkamą eksploatuoti valstybės informacinės sistemos funkciją, veikiančią gamybinėje arba valstybės informacinės sistemos valdytojo sutikimu testinėje aplinkoje su visomis valstybės informacinės sistemos priėmimui būdingomis pateiktimis: programinės įrangos kodu, diegimo paketais, diegimo ir naudojimo instrukcijomis, kita technine dokumentacija ir patvirtintu  priėmimo ir tinkamumo eksploatuoti aktu. Specifikacijoje įvardijami prieaugiai, numatomi jų funkcionalumai, prieaugiai prioretizuojami ir sudaromas jų diegimo planas. Kiekvienam prieaugiui realizuoti nuosekliai taikomi realizavimo stadijos etapai. Realizavimo stadijos detalios analizės etape analizuojami ir apibrėžiami tik einamuoju momentu realizuojamo prieaugio veiklos reikalavimai. Įdiegus vieną prieaugį, gali būti peržiūrėti Specifikacijoje apibrėžtų kitų prieaugių prioritetai, kiekvienam naujam prieaugiui vykdoma detali analizė, formuluojami realizavimo reikalavimai, gali būti patikslinti jau įdiegtų prieaugių realizavimo reikalavimai, pakartotinai naudojami sukurti moduliai. Visa valstybės informacinė sistema baigiama įteisinti, realizavus visus Specifikacijoje nurodytus prieaugius ir patvirtinus priėmimo ir tinkamumo eksploatuoti aktą, nurodant, kad visa valstybės informacinė sistema yra sukurta ir tinkama eksploatuoti.

### Statinis testavimas, jo tipai. Apibūdinti.

**Statinis testavimas** - programinės įrangos testavimo metodas, kuriame programinė įranga yra išbandyta nevykdant kodo. Jame yra dvi dalys:

- **Apžvalga** - paprastai naudojama ieškant ir pašalinant klaidas ar dviprasmybes dokumentuose, pvz., Reikalavimuose, projektuose, bandymų atvejais ir pan.
- **Statinė analizė** - kūrėjų parašytas kodas (dažniausiai įrankiais) analizuojamas dėl struktūrinių defektų, kurie gali sukelti defektų.

### Dinaminis testavimas, jo tipai. Apibūdinti.

Dinaminis testavimas yra tam tikra programinės įrangos testavimo technika, pagal kurią analizuojamas dinaminis kodo elgesys.

Norint atlikti dinamiką, programinė įranga turėtų būti išbandyta ir vykdoma, analizuojami tokie parametrai kaip atminties naudojimas, procesoriaus naudojimas, atsako trukmė ir bendras programinės įrangos veikimas.

Dinaminis testavimas apima programinės įrangos, skirtos įvesties vertei išbandyti, ir išvesties verčių analizę. Dinaminis testavimas yra verifikavimo ir validacijos dalis.

Dinaminiai testavimo metodai yra plačiai suskirstyti į dvi kategorijas:

- Funkcinis testavimas
- Nefunkcinis testavimas

Dinaminio testavimo lygiai:

- Vieneto testavimas
- Integracijos testavimas
- Sistemos testavimas
- Priėmimo testavimas

### Testavimo būdai pagal ISTQB. Apibūdinti.

- Specifikacijomis paremtas testavimas („juodosios dėžės“)
- Ribinių reikšmių analizė
- Sprendimų lentelės 
- Būsenų perėjimo metodas 
- Panaudojimo atvejų 
- Panaudos atvejų diagrama (Užduočių diagrama) (angl. use case diagram) 
- Struktūra paremtas testavimas („baltosios dėžės“)
- Patirtimi paremtas testavimas

### AGILE testavimo metodologijos pagal ISTQB. Apibūdinti.

- **Test Driven Development (TDD)** – kildinama iš testavimo atvejų,
- **Acceptance Test Driven Development** – kildinama iš priėmino testų,
- **Behavior Driven Development (BDD)** – kildinama iš sistemos elgsenos aprašymo

### Įvesties-išvesties testavimas. Apibūdinti.

Įvesties/išvesties duomenų analizė atliekama, siekiant sumažinti testavimo atvejų skaičių tose situacijose, kurioms esant testavimo atvejų skaičius labai didelis:

- reikia atlikti informacijos, naudojamos testavimo atvejams parengti, ir laukiamų testavimo  rezultatų analizę tam, kad nustatyti, kuri informacija turi įtaką rezultatams,
- remiantis analizės išvadomis, galima sumažinti testavimo atvejų skaičių, panaudojant kombinatoriką taip, kad kombinatorinė aibė testų įgalintų aptikri daugumą defektų, ypač kritinių.

Testavimo įvesties informacijos ir rezultatų analizė atliekama tokiais būdais:

- panaudojant statines priemones, analizuojant programinės įrangos kodą,
- panaudojant dinamines priemones, analizuoti su testiniais duomenimis įvykdytos programos atsekamumo informaciją: dinamines priklausomybės naudojamos nustatyti sąryšius tarp įvesties duomenų ir gautų rezultatų,
- taikant į programos vykdymą orientuotas priemones, manipuliuoti įvairiais įvesties duomenimis (vykdant programą daug kartų su skirtingomis įvesties duomenų aibėmis) tam, kad nustatyti sąryšius tarp įvesties duomenų ir gautų rezultatų.

### Modeliu paremtas testavimas (ioco testavimas).Paaiškinti, atskleisti esmę, naudojantis literatūra, paskaitos medžiaga.

Modeliu paremtas testavimas yra testavimo būdas, naudojantis modelius. Jis praplečia bei papildo  klasikinus testavimo būdus: ekvivalentaus padalinimo, būsenų perėjimo, „use case“ testavimo, ribinių reikšmių testavimo, sprendimų lentelių ir kt. Jo idėja – laikantis projekto testavimo tikslų, patobulinti testavimo projekto kokybę ir efektyvumą, sukuriant modelį programinėmis priemonėmis, taip pat pateikti modelį kaip testavimo projekto specifikaciją. Modelis formalizuotas ir pateikia detalios informacijos, kurios pakanka iš jo (modelio) automatiškai generuoti testavimo atvejus. Kuriant modeliu paremto testavimo modelį, svarbu aptarti testavimo tikslus, kadangi jie apsprendžia testavimo objektą ir tai, į ką bus labiausiai kreipiamas dėmesys testuojant. 

### Naudotojo sąsajos testavimas. Apibūdinti. Ką jis apima? Kas yra panaudojamumo (angl. usability) testavimas?

**Naudotojo sąsajos testavimas** – tai  aplikacijos naudotojo sąsajos defektų aptikimo aplikacijos kūrimo metu procesas.

Naudotojo sąsajos testavimas apima:

- displėjaus ekrane rodomas validacijas,
- grafinės naudotojo sąsajos elementų dydžio ir pozicijos patikrinimą,
- vaizdo failų ryškumo patikrinimą,
- navigavimo galimybės, nuorodų tikrinimą,
- šrifto dydžio ir teksto išdėstymo tikrinimą,
- skaitinių ir datos laukų formatų tikrinimą,
- naudotojo sąsajoje vaizduojamų vaizduojamų duomenų integruotumo tikrinimą,
- klaidos pranešimų vaizdavimą,
- laukų privalomumo tikrinimą,
- santrumpų  prieštaringumo tikrinimą,
- progreso slankjuostės veikimo patikrinimą ir kt.

### Kaip skirstomas testavimo proceso valdymas pagal ISTQB. Ką jis apima? Produkto ir projekto rizikos – apibūdinti, pateikti pavyzdžių.

- ...
