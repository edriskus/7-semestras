# Informacijos Teorija

Egzamino metu bus duota 3 klausimai į kuriuos atsakymas turi būti pateiktas raštu. Egzamino metu niekuo negalima naudotis išskyrus tik savo ranka parašytais konspektais. Jei naudojamasi konspektu tai konspektas turi būti pridedamas prie atsakymų lapo.

Klausimai

- [Informacijos Teorija](#informacijos-teorija)
  - [I Dalis](#i-dalis)
    - [Žmogaus kalbos ir alfabeto raidos istorija. Paskaitos: 1) Origins of written language , 2) History of the alphabet](#%C5%BEmogaus-kalbos-ir-alfabeto-raidos-istorija-paskaitos-1-origins-of-written-language--2-history-of-the-alphabet)
    - [Šaltinio informacijos kodavimas ir vaizdo telegrafo veikimas. Paskaitos: 1) Source encoding 2) Visual telegraphs](#%C5%A1altinio-informacijos-kodavimas-ir-vaizdo-telegrafo-veikimas-paskaitos-1-source-encoding-2-visual-telegraphs)
    - [Elektrostatinio ir elektromagnetinio telegrafo veikimas. Morzės abėcėlė. Paskaitos: 1) Electrostatic telegraphs 2) The battery and electromagnetism 3) Morse code](#elektrostatinio-ir-elektromagnetinio-telegrafo-veikimas-morz%C4%97s-ab%C4%97c%C4%97l%C4%97-paskaitos-1-electrostatic-telegraphs-2-the-battery-and-electromagnetism-3-morse-code)
    - [Simbolių perdavimo greitis ir kanalo talpumas. Paskaitos: 1) Symbol rate 2) Channel capacity](#simboli%C5%B3-perdavimo-greitis-ir-kanalo-talpumas-paskaitos-1-symbol-rate-2-channel-capacity)
    - [Informacijos kiekio pamatavimas. Markovo grandinės. Paskaitos: 1) Measuring information 2) Markov chains](#informacijos-kiekio-pamatavimas-markovo-grandin%C4%97s-paskaitos-1-measuring-information-2-markov-chains)
    - [Informacijos entropija Paskaitos: 1) A mathematical theory of communication 2) Information entropy](#informacijos-entropija-paskaitos-1-a-mathematical-theory-of-communication-2-information-entropy)
    - [Kompresijos kodai ir klaidų korekcija. Paskaitos: 1) Compression codes 2) Error correction](#kompresijos-kodai-ir-klaid%C5%B3-korekcija-paskaitos-1-compression-codes-2-error-correction)
    - [SETI projektas Paskaitos: 1) The search for extraterrestrial intelligence](#seti-projektas-paskaitos-1-the-search-for-extraterrestrial-intelligence)
  - [II Dalis (Skaityti 1-10 skyrius iš knygos)](#ii-dalis-skaityti-1-10-skyrius-i%C5%A1-knygos)
    - [Binarinis simetrinis kanalas ir klaidų korekcijos kodai (Žiūrėti skaidres: Information theory Lect3 v1 )](#binarinis-simetrinis-kanalas-ir-klaid%C5%B3-korekcijos-kodai-%C5%BEi%C5%ABr%C4%97ti-skaidres-information-theory-lect3-v1)
    - [Šaltinio kodavimo teorema . (Žiūrėti skaidres: Information_theory_Lect4_v1)](#%C5%A1altinio-kodavimo-teorema--%C5%BEi%C5%ABr%C4%97ti-skaidres-informationtheorylect4v1)
    - [Simbolių kodai . (Žiūrėti skaidres: Information_theory_Lect4_v1)](#simboli%C5%B3-kodai--%C5%BEi%C5%ABr%C4%97ti-skaidres-informationtheorylect4v1)
    - [Aritmetiniai kodai. (Žiūrėti skaidres: Information_theory_Lect5_v1 )](#aritmetiniai-kodai-%C5%BEi%C5%ABr%C4%97ti-skaidres-informationtheorylect5v1)
    - [LZW kompresijos algoritmas (Žiūrėti skaidres: Information_theory_Lect5_v1 )](#lzw-kompresijos-algoritmas-%C5%BEi%C5%ABr%C4%97ti-skaidres-informationtheorylect5v1)
    - [Kanalo su triukšmu teorema. (Žiūrėti skaidres: Information_theory_Lect6_v1 )](#kanalo-su-triuk%C5%A1mu-teorema-%C5%BEi%C5%ABr%C4%97ti-skaidres-informationtheorylect6v1)
  - [III Dalis (Skaidrės, Wikipedia, YouTube)](#iii-dalis-skaidr%C4%97s-wikipedia-youtube)
    - [Kvantinio kompiuterio veikimas](#kvantinio-kompiuterio-veikimas)
    - [Moderni kriptografija](#moderni-kriptografija)
    - [Bitcoin veikimo sprendimai](#bitcoin-veikimo-sprendimai)
    - [Ląsteliniai automatai](#l%C4%85steliniai-automatai)
    - [Fraktalai](#fraktalai)
    - [Chaosas](#chaosas)

## I Dalis

- **Information**. In simplest terms, information is what allows one mind to influence another.
- Information can be measured and compared using a measurement called **entropy**.
- We can describe exactly how much using a unit called the **bit**, a measure of surprise.
  - A bit is linked to a very simple idea. The **answer to a yes or no question**.

### Žmogaus kalbos ir alfabeto raidos istorija.  Paskaitos: 1) Origins of written language , 2) History of the alphabet

- Somewhere around **50,000 years ago** there was a sudden explosion of diverse cultural artifacts, including instruments for making music, new tools, and other forms of creative expression
- At the time, the universal written language was **art**
- Our ancestors use natural materials to create pictorial representations of their reality.
- A common theme among these ancient paintings are **animal forms, as well as the human hand**.
- **Pictograms** (a simplified drawing that resembles the physical object it represents) are an important step in the evolution of writing. (~3,000 B.C)
- **Ideogram** - a conceptual picture of an abstract idea
- **Ancient Mesopotamia** is home to some of the oldest written documents ever found, some dating before 3,000 B.C
  - This is the birth place of many of the world's earliest civilizations.
- **The Rebus Principle** - Sound plus sound equals new meaning (it has nothing to do with the individual symbols)
  - A great example of this was found in **Egypt** along the Nile River. Dated to around 3,100 B.C., it contains some of the earliest **hieroglyphic** inscriptions ever found.

---

- Messages are formed by arranging symbols in specific patterns.
- 3,000 BC - ancient Egypt - **Hieroglyphics** was generally unintelligible to the common people (used only by priests etc.).
  - The symbols have two categories:
    - word signs - symbols that represent a single meaningful concept
    - sound signs - these symbols represent chunks of sound.
  - The total number of different symbols in common use was over **1,500**
  - At the time, the medium used to store the symbols was primarily **rock**. Mobility was not a main concern when communicating messages in this way.
  - However, a new physical medium for storing symbols was emerging at the time - **Papyrus**. This medium was ideal for **sending messages** across greater spaces.
  - This lead to a cursive script, known as **Hieratic**. These symbols were based on Hieroglyphics, however the pictures were simplified to match the swiftness of writing in ancient shorthand. Also, the number of common symbols in use began to shrink down to around **700**.
  - A marked increase in writing by hand lead to a new writing system called **Demotic** around **650 BC**. The new simplicity meant that achildren could be tught to write at a **young age**.
- 3,000 BC - Mesopotamia - **Cuneiform** was the writing system originally used for fiscal purposes
  - Originally used by the **Sumerians** - over **2,000** different symbols
  - **Akkadian** gradually replaced Sumerian as the spoken language. When it was adapted by the Akkadians and fitted to their language, they reduced the number of symbols to around **600**, and they did this again by moving towards sound signs.
- around 1700 BC - The **Sinai** inscriptions were found 
  - Eeach picture denotes a consonant sound, and no word signs are used. 
  - When sounded out correctly, the letters would produce words in ancient Semitic.
- 1,000 BC - **Phoenician Alphabet** was based on the principle that one sign represents one consonant - **22** symbols total. 
  - The symbols chosen to represent these sounds were often borrowed from Hieroglyphic pictures, so that the letter's name began with the letter's sound.
  - The secret power - it did not need Semitic speech in order to work. This was the source of the Greek and later Roman alphabet forms we know today.

### Šaltinio informacijos kodavimas ir vaizdo telegrafo veikimas. Paskaitos: 1) Source encoding 2) Visual telegraphs

- Turime paprastą kanalą (laidą) - triukšmas leidžia perduoti tik paprasčiausius signalus
- Reikia užkoduoti skaičių, išmestą dviem kauliukais
- Paprasčiausia - tiek signalų, kiek akučių iškrenta
- Kanalo riba (pardavimo greitis) - 2 signalai per sekundę (jei daugiau - sunku suprasti)
- Tam, kad perdavimas būtų efektyvesnis, akučių skaičius surikiuojamas pagal išmetimo tikimybę
- Priskiriamas mažiausias signalų skaičius tikėtiniausiam akučių skaičiui
- Tai - optimaliausias kodavimas tokiam metodui

---

- The **signal fire** - one difference, two states.
- **Polybius** was a Greek historian born in 200 BC. The limitation of a signal fire was clear to him.
- A fire signal is great when the space of possible messages is small. However, when the message space, which is the total number of possible messages, grows there was a need to communicate many differences.
- **Aeneas Tacticus**, one of the earliest Greek writers on the art of war from the fourth century, BC, developed** the equal water vessel** communication method.
  - First, sender and receiver raises the torch to indicate message start
  - Then, the sender lowers the torch and opens his vessel
  - The receiver opens his vessel when he sees the torch lowered
  - When the water stops, the level of water means a specific greek alphabet letter
- **Polybius square**, works as follows: 
  - Two people separated by a distance each have 10 torches separated into two groups of five.
  - To begin, the sender raises a torch and waits for the receiver to respond. Then the sender lights a certain number from each group of torches and raises them. The receiver then counts the number of torches lit in the first group. This number defines the row position in an alphabetic grid they share. And the second group of torches signifies the column position in this grid. The intersection of the row and column number defines the letter sent.
  - Realize that given N yes or no questions, there are two to the power of N possible answer sequences.
- In 1605 **Francis Bacon** clearly explained how this idea could allow one to send all letters of the alphabet using only a single difference - **bilateral cipher**
  - "The transposition of two letters by five placings "will be sufficient for 32 differences"
- 1795 - Lord George Murray's **shutter telegraph**
  - It was composed of six rotating shutters which could be oriented as either open or closed.
  - With six shutters we have six questions, open or closed? Providing us with two to the power of six, or 64 differences.
  - With a **telescope** it was now possible to send letters at an incredible distance between beacons.

### Elektrostatinio ir elektromagnetinio telegrafo veikimas. Morzės abėcėlė. Paskaitos: 1) Electrostatic telegraphs 2) The battery and electromagnetism 3) Morse code

- 600 BC - Thales of Miletus widely regarded as the first Greek philosopher - discovers that amber attracts small particles when rubbed to fur.
- Benjamin Franklin, who in 1752 set out to prove that there is a connection between lightning and these tiny shocks due to friction.
- In a famously dangerous experiment done alone with his son, he let a kite into a thunderstorm and near the bottom where the thread was wet, he tied an iron key and after some time he brought his knuckle up to the key experienced the series of small shocks identical to the ones created by contact with fur.
- It was found that conductors such as copper wire would transmit this pulling effect over a distance.
- In 1774 French inventor George Louis Le Sage sent messages through an array of 26 wires each wire representing a letter of the alphabet. When a discharge occurred at one end the pith ball would move at the other. The trouble with this telegraph was that it only extended between the two rooms of his house. The power the deflection was small and difficult to work with.
- Alessandro Volta invented the Leyden jar a capacitor or charge storing device. And when he chained many jars together he found he could increase the capacity even more and release deadly volt of electricity.
- Over the next 50 years people tried to design systems for sending sparks across greater distances using longer wires and more powerful discharges. However sending electrostatic discharges as a communication method seemed clumsy archaic and was no improvement over the existing optical telegraph of the day.

---

- Take two pieces of metal: copper and zinc which you connect to conducting wires and you then submerge the metals in an electrolyte (in this case vinegar).
- Towards the end of the 18th century Alessandro Volta found that chaining these cells together would amplify this flow of charge.
- By 1800 he simplified things even further removing the jar which provided more electrolyte than was actually needed - replacing it with a thin sponge material soaked in electrolyte. Such simple cells could be stacked together on top of each other.
- Voltaic pile, the first battery in history to provide a continuous flow of electrical charge, or current.
- the Bubble Telegraph involved 26 different circuits, one for each letter and it was based on the fact that the battery providing the current can be placed at a distance away from jars of water containing the leads creating the bubbles. This system was never adopted.
- In 1819 it was found that if we simply pass a wire near a compass and connected to a battery as soon as the wire made contact with the battery the needle jumped without any physical contact.
- By 1824 William Sturgeon demonstrated a way to increase the strength of this field even more, simply by wrapping a coil of wire around a piece of iron such as a nail. 
- Suddenly it was possible to create magnetic fields which could move needles with precision and force using electric current applied at a distance using a long loop of wire and a strong battery.

---



### Simbolių perdavimo greitis ir kanalo talpumas. Paskaitos: 1) Symbol rate   2) Channel capacity

- ...

### Informacijos kiekio pamatavimas. Markovo grandinės. Paskaitos: 1) Measuring information  2)  Markov chains

- ...

### Informacijos entropija Paskaitos: 1) A mathematical theory of communication 2)   Information entropy

- ...

### Kompresijos kodai ir klaidų korekcija. Paskaitos: 1) Compression codes 2) Error correction

- ...

### SETI projektas Paskaitos: 1) The search for extraterrestrial intelligence

- ...

## II Dalis (Skaityti 1-10 skyrius iš knygos)

### Binarinis simetrinis kanalas ir klaidų korekcijos kodai (Žiūrėti skaidres: Information theory Lect3 v1  )

- ...

### Šaltinio kodavimo teorema . (Žiūrėti skaidres: Information_theory_Lect4_v1)

- ...

### Simbolių kodai . (Žiūrėti skaidres: Information_theory_Lect4_v1)

- ...

### Aritmetiniai kodai. (Žiūrėti skaidres:  Information_theory_Lect5_v1 )

- ...

### LZW kompresijos algoritmas (Žiūrėti skaidres:  Information_theory_Lect5_v1 )

- ...

### Kanalo su triukšmu teorema. (Žiūrėti skaidres: Information_theory_Lect6_v1 )

- ...

## III Dalis (Skaidrės, Wikipedia, YouTube)

### Kvantinio kompiuterio veikimas

- ...

### Moderni kriptografija

- ...

### Bitcoin veikimo sprendimai

- ...

### Ląsteliniai automatai

- ...

### Fraktalai

- ...

### Chaosas

- ...