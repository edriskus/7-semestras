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

- Take two pieces of metal: **copper** and **zinc** which you connect to conducting wires and you then submerge the metals in an **electrolyte** (in this case vinegar).
- Towards the end of the 18th century **Alessandro Volta** found that chaining these cells together would amplify this flow of charge.
- By 1800 he simplified things even further removing the jar which provided more electrolyte than was actually needed - replacing it with a thin sponge material soaked in electrolyte. Such simple cells could be stacked together on top of each other.
- **Voltaic pile**, the first battery in history to provide a continuous flow of electrical charge, or current.
- the **Bubble Telegraph** involved 26 different circuits, one for each letter and it was based on the fact that the battery providing the current can be placed at a distance away from jars of water containing the leads creating the bubbles. This system was never adopted.
- In 1819 it was found that if we simply pass a wire near a compass and connected to a battery as soon as the wire made contact with the battery the needle jumped without any physical contact.
- By 1824 William Sturgeon demonstrated a way to increase the strength of this field even more, simply by wrapping a coil of wire around a piece of iron such as a nail. 
- Suddenly it was possible to create magnetic fields which could move needles with precision and force using electric current applied at a distance using a long loop of wire and a strong battery.

---

- 1832 mathematician Carl Gauss and physics professor William Weber connected their observatory with the laboratory using a **galvanometer**
  - A switch connected in one end would reverse the electrical current in two directions
  - On the other end, the galvanometer deflected left or right based on the direction of the electrical current
  - Such a system had two states: **left** or **right** deflection
  - They assigned shorter symbols for most used alphabet letters (e.g., A - single right turn and E - single left turn) and longer symbols for less used letters (e.g., K - three right deflections)
- However, the signaling rate was slow because of the needle movements (max. 1 deflection per second)
- In 1848 the cost of sending 20 symbols was one week's salary for a shop owner (too expensive)
- **Samuel Morse**, in collaboration with Albert Vail, invented the spring-loader lever (key)
  - On the receiving end, was a spring-loaded lever that made clicking noises with the help of an electromagnet
  - Morse varied the length of a keypress:
    - **Dot** - short keypress
    - **Dash** - 3 times longer than a dot
  - The scheme assigned shorter letter sequences for more common letter (based on books)
  - After a letter, the system inserts a 3 dot length pause
- The simplicity of this key system made it much faster than any needle telegraph
- By 1900 the cost of a single message dropped to 30 cents per message
- Code books were later invented that mapped single words to pupular sencences, which reduced the cost furthermore
  - "Blade" meant "Please name and reserve for myself and family the following accomodations"

### Simbolių perdavimo greitis ir kanalo talpumas. Paskaitos: 1) Symbol rate   2) Channel capacity

- Primary symbols - letters
- Secondary symbols - (Morse Code signals) the lower-level signaling events, such as pulses of electricity
- Baudot Multiplex System (1874) consisted of 5 keys which could be played in any combination. The code assigned the 32 different chords to each letter of the alphabet with the leftovers used for carriage returns, new line and spaces.
- The iambic counter, the mechanical nerves of the system, change words to holes on tape, and the holes on tape to electrical impulses speeding over the wires.
- The speed of transmission was physically limited by the **minimum spaces** between these impulses or the pulse rate.
  - Sending pulses too fast, results in **inter-symbol interference**.
- The **symbol rate** is the number of signaling events which can be squeezed together in one second

---

- There was one other way to increase the capacity of a communication system - We can increase the number of different signaling events.
- This was an idea implemented by Thomas Edison, which he applied to the Morse code system, and it was based on the idea that you could use weak and strong batteries to produce signals of different strengths. He also used two directions, as Gauss and Weber did, forward versus reverse current and two intensities. So he had plus three volts, plus one volt, minus one volt, and minus three volt. Four different current values which could be exchanged.
- Quadruplex telegraph used such a system and continued to be used into the 20th century.
- Fine grained differences lead to difficulties on the receiving end.
- The capacity of a communication system can be defined using these two very simple ideas:
  - First, how many symbol transfers per second? Which we called **symbol rate**. And today it's known simply as **baud**, for Émile Baudot.
  - Second, how many differences per symbol? Which we can think of as the **symbol space**. And we can call this **s**.
- After **n** symbols, we have a tree with** s^n** leaves.
- **The message space** is simply the **width of the base** of one of these trees. It defines the total number of possible messages one could send given a sequence of n symbols.
- **Channel capacity** of a given channel is the highest information rate (in units of information per unit time) that can be achieved with arbitrarily small error probability.
  
### Informacijos kiekio pamatavimas. Markovo grandinės. Paskaitos: 1) Measuring information  2)  Markov chains

- Information measuring is based on the **minimum number of questions** to define the message or the height of the decision tree, and since it is usually transmitted as binary digits, we can shorten this and call our unit the **bit**, instead of binary digit.
  - It is calculated as the logarithm of the number of possible symbol sequences.
  - 10 coin flips requires 10 bits, the six-letter word requires 28.2 bits, and the poker hand requires 28.5 bits.
- In 1928, Ralph Hartley, who built on the ideas of Harry Nyquist (Bell Labs), published an important paper titled, "The Transmission of Information":
  - Information = H, as H equals N times the logarithm of S, where:
    - H is our information
    - N is the number of symbols in the message
    - S is the number of different symbols available at each selection
  - This can also be written as H = log(S^N)
- So, **information** is the **logarithm of the message space**

---

- **Bernoulli** proved that the expected value of simple statistical observations will converge on the actual ratio as the number of trials increases, known as the **weak law of large numbers**.
- **Francis Galton's bean machine** visualizes a **binomial distribution**, which appears to be an ideal form as it kept appearing everywhere any time you looked at the variation of a large number of random trials.
- Pavel Nekrasov, originally a theologian by training, didn't like the idea of us having this predetermined statistical fate. He made a famous claim that **independence** is a necessary condition for the law of large numbers
- This claim angered another Russian mathematician, **Andrey Markov**
- Markov extends Bernoulli's results to dependent variables using an ingenious construction - **Markov state machine**.
- Markov proved that as long as every state in the machine is reachable, when you run these machines in a sequence, they reach equilibrium.
- The concept of modeling sequences of random events using states and transitions between states became known as a **Markov chain**.

![Markov Chain](https://bookdown.org/probability/beta/MC1.png)

### Informacijos entropija Paskaitos: 1) A mathematical theory of communication 2)   Information entropy

- In 1949, **Shannon** used Markov models as the basis for how we can think about communication:
  - Imagine text written in letters A, B, and C. You notice As seem to clump together, while Bs and Cs do not.
  - **0th-order** approximation - select each symbol A, B, or C at random
  - **1st-order** approximation, where the letters are chosen independently, but according to the probability of each letter in the original sequence.
  - **2nd-order** approximation takes into account each **pair** of letters which can occur.
    - We start anywhere and pick a tile, and we write down our output the first letter
    - Then we move to the cup defined by the second letter. We pick a new tile, and repeat this process indefinitely
    - Notice that this sequence is starting to look very similar to the original message, because this model is capturing the conditional dependencies between letters.
  - If we wanted to do even better, we could move to a **3rd-order** approximation, which takes into account groups of three letters, or "**trigrams**".
- Next, Shannon applies this exact same logic to actual **English** text, using statistics that were known for letters, pairs, and trigrams, etc.
  - He shows the **same progression** from zeroth-order random letters to first-order, second-order and third-order sequences.
  - He then goes on and tries the same thing using **words instead of letters**
    - The resemblance to ordinary English text "increases quite noticeably at each depth."

---

- **Claude Shannon** calls the measure of average uncertainty "entropy", and he uses the letter H to represent it.
- The unit of entropy Shannon chooses, is based on the uncertainty of a fair coin flip, and he calls this "**the bit**", which is equivalent to a fair bounce.
- Entropy or H, is the summation **for each symbol** of the **probability** of that symbol times the **logarithm** base two of one over the probability of that symbol.
- Entropy is **maximum** when all outcomes are **equally likely**.
- The fundamental idea is that, if the entropy of an information source drops, that means we can ask fewer questions to guess the outcome.

![Entropy](https://computersciencesource.files.wordpress.com/2010/01/entropycalc1.png)

### Kompresijos kodai ir klaidų korekcija. Paskaitos: 1) Compression codes 2) Error correction

- When we represent information, such as an image, digitally, it means we must slice it up into tiny chunks. This allows us to send an image as a sequence of color symbols, and these colors can be represented as unique numbers, using some code.
- **David Huffman** famously provided the optimal strategy, which he published in 1952, and based on building a binary tree from the bottom up. **Huffman Coding:**
  - First, list all symbols at the bottom (nodes).
  - Then we find the two least probable nodes, in this case B and C, and merge them into one, and add the probabilities together.
  - Repeat with the next two least likely nodes, and continue merging until you have a single node at the top.
  - Finally, we label the edges in this tree with 0 or 1 in any order.
  - The code for each letter is just the path from the top of the tree to the given letter.
- Claude Shannon was the first to claim that the **limit of compression** will always be the **entropy** of the message source.
- As the entropy decreases, the ability to compress increases

![Huffman Coding](https://i.stack.imgur.com/9T1Am.png)

---

- In the 1940s, **Richard Hamming** designed a method which could automatically detect and correct single bit errors, without interrupting calculations.
- A **parity bit** is a single bit which is added to the end of a message, and indicates whether the number of **ones** in the message is **even or odd**.
  - If a single error occurs, the receiver could then detect it, because the parity bit will no longer match. However to detect and correct single errors, Hamming needed to add more parity bits to identify the error location. This leads to his **seven-four code**, which adds three parity bits to each block of four data bits as follows:
    - First we start with the **three parity bits**, which can be represented by a circle.
    - The **four data bits** are placed inside these regions in a specific order.
    - To calculate the parity bits, we look at each circle one at a time, each containing three data bits.
  - This system can automatically correct single errors with a simple rule: If a single error occurs, two or more of the parity bits will be incorrect, and wherever they intersect is the location of the error.
- All error-correction codes increase the size of the source messages slightly, at the expense of automatically correcting errors.
- Claude **Shannon** used this idea of redundancy to redefine the capacity of a communication channel, because as the noise on your channel increases, we must increase the amount of redundancy to communicate error-free. This must then decrease the effective amount of information you can send per unit time.

![Hamming Code](https://upload.wikimedia.org/wikipedia/commons/thumb/b/b0/Hamming%287%2C4%29.svg/320px-Hamming%287%2C4%29.svg.png)

### SETI projektas Paskaitos: 1) The search for extraterrestrial intelligence

- The modern search for extraterrestrial intelligence, or **SETI**, began in 1959 with two Cornell physicists, Giuseppi Cocconi and Philip Morrison
- Researchers assume that any intelligent civilization will have discovered the ability to **transmit radio waves**.
- At the first SETI meeting in 1961, John Lilly proposed that researchers study **dolphin languages** to help them learn more about what extraterrestrial signals might be like.
- The Zipf's law:
  - At first, when Human **babies** learn to speak, the sounds produced are more or less random, or unstructured. (Flat slope on graph)
  - However, as children learn the language of their parents, **structure** is imposed on our speech patterns.
  - If we plot all sounds by how often they appear, the slope of this graph converges towards a 45 degree angle, or a **-1 slope** on a log-log chart.
  - What's interesting is that this same slope appears in **different human languages**, and seems to be a pattern all humans share.
  - Even more surprising is that this pattern also emerged when studying **dolphin** communication.
- Doyle and McCowan calculated the entropy for **different depths**, or orders, so single words is first order, groups of two words is second order, groups of three words is third order, and so on. Then they plotted the value of information entropy against this depth. For adult humans, as we may expect, they found that the **information entropy decreases as the depth increases**.
  - Amazingly, Doyle and McCowan did the same thing with **dolphin** languages, and **found the same pattern**.
- As Doyle puts it, if we get a **narrow band signal**, a **-1 slope on the Zipf plot**, and **higher order Shannon entropies**, we've nailed it (finding ET communication)
  
## II Dalis (Skaityti 1-10 skyrius iš knygos)

### Binarinis simetrinis kanalas ir klaidų korekcijos kodai (Žiūrėti skaidres: Information theory Lect3 v1  )

- In probability theory and statistics, the **binomial distribution** with parameters n and p is the discrete probability distribution of the number of successes in a sequence of n independent experiments, each asking a yes–no question, and each with its own boolean-valued outcome: a random variable containing a single bit of information: success/yes/true/one (with probability p) or failure/no/false/zero (with probability q = 1 − p).
  - ![Binomial Distribution](https://wikimedia.org/api/rest_v1/media/math/render/svg/b872c2c7bfaa26b16e8a82beaf72061b48daaf8e)
  - Binomial Coefficient: ![Binomial Coefficient](https://wikimedia.org/api/rest_v1/media/math/render/svg/d33401621fb832dd2f9783e80a906d562f669008)
  - Mean (Expected value of X): ![Mean](https://wikimedia.org/api/rest_v1/media/math/render/svg/3f16b365410a1b23b5592c53d3ae6354f1a79aff)
  - Varianca (deviation): ![Variance](https://wikimedia.org/api/rest_v1/media/math/render/svg/bf5b4b6e591c413e746d1ba867277e99b9b083b9)
- A **binary symmetric channel** (or BSC) is a common communications channel model used in coding theory and information theory. In this model, a transmitter wishes to send a bit (**a zero or a one**), and the receiver receives a bit. It is assumed that the bit is usually transmitted correctly, but that it will be "flipped" with a small **probability** (the "crossover probability"). This channel is used frequently in information theory because it is one of the simplest channels to analyze.
  - ![Channel](https://upload.wikimedia.org/wikipedia/commons/thumb/8/8e/Binary_symmetric_channel_%28en%29.svg/1200px-Binary_symmetric_channel_%28en%29.svg.png)
  - Conditional Probabilities: ![Conditional Probabilities](https://wikimedia.org/api/rest_v1/media/math/render/svg/729fb9668be91ed00a76c0c0692425e24035648f)

---

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

- Kvantiniai kompiuteriai naudoja qbitus.
- **Qbitas** (Kubitas) – kintanti kvantinė būsena.
- Kubitas yra pagrindinė varomoji galia kvantinio kompiuterio. Kubitas gali saugoti dvi reikšmės 1 arba 0 arba jų superpoziciją.
- **Superpozicija** – kvantas esantis superpozicijoje turėti dvi reikšmes vienu metu. Šito neturi klasikinė fizika.

### Moderni kriptografija

- **Kriptografija** – mokslas, tiriantis informacijos užšifravimo ir iššifravimo metodus. Kriptografija yra sudėtinė kriptologijos mokslo dalis.
- Privalumai:
  - Konfidencialumas – informacijos apsauga nuo neautorizuoto priėjimo.
  - Autentifikacija – tam tikros technikos užtikrina, kad informacija yra tikra ir nesuklastota.
  - Nepažeistumas – tam tikri algoritmai užtikrina, kad duomenys nebūtų pažeisti ir vientysi.
- Minusai:
  - Sudėtinga pasiekti netgi vartojui.
  - Kriptografija išnaudoja nemažai laiko ir pinigų. Dėl reikalingų perskaičiavimų, daugiau laiko prireikia.
  - Gerą kriptografijos būdą implementuoti yra sudėtinga.
- Kvantinė kriptografija skiriasi nuo paprastos kriptografijos tuo, kad paprasta kriptografija remiasi matematika, o kvantinė – fizika.
- Kvantinėj kriptografijoj, raktai yra sudėti iš fotonų. Kvantinė kriptografijoje fotonai gali būti keletoj fazių vienu metu.

### Bitcoin veikimo sprendimai

- Kadangi Bitcoin yra **decentralizuota**, Bitcoin nėra reguliuojama (kaip paprastos valiutos).
- Paprastos valiutos turi centrinį procesorių transakcijų (pavyzdžiui, **bankas**), kuris registruoja visus atliekamus mokėjimus.
- Bitcoin transakcijos yra saugomos kiekviename kompiuteryje, kuris yra susijęs su Bitcoin. Būtent ši saugykla vadinama dižiąja knyga (**ledger**).
- Kiekvienoje transakcijoje, tinklas nuskaito siuntėjo ir gavėjo Bitcoin adresus, kiekį kiek perkelta Bitcoin ir užregistruoja į didžiosios knygos galą arba įrašą, pavadinimu - **Blockchain**. Blockchain yra atnaujinamas apie 100 kartų per dieną ir yra atnaujinamas kiekviename kompiuteryje, kuriame yra naudojama Bitcoin technologija.

### Ląsteliniai automatai

- Ląsteliniai automatai yra diskretinis modelis. Apskritai skirtas sumodeliuot reikalingą situaciją tam tikroje aplinkoje. Cellular automata can simulate a variety of real-world systems, including biological and chemical ones.
- In two dimensions, the best-known cellular automaton is **Conway's game of life**, discovered by J. H. Conway in 1970.
- A cellular automaton is a model of a system of “cell” objects with the following characteristics:
  - The cells live on a **grid**. (We’ll see examples in both one and two dimensions in this chapter, though a cellular automaton can exist in any finite number of dimensions.)
  - Each cell has a **state**. The number of state possibilities is typically finite. The simplest example has the two possibilities of 1 and 0 (otherwise referred to as “on” and “off” or “alive” and “dead”).
  - Each cell has a **neighborhood**. This can be defined in any number of ways, but it is typically a list of adjacent cells.
- Yra sukurta 256 taisykliu, kurios nurodo, kaip elgiasi ląstelės, t.y. kas atsitinka su kaimynais, jeigu viena ląstelė įsijungia arba išsijungia. Vienas populiariausių ir paskaitose nagrinėjome - Rule 30. Its rule outcomes are encoded in the binary representation 30 = 00011110 (base2).
- One of the many interesting phenomena in life is the existence of "**gliders**": small patterns that move across the grid.

### Fraktalai

- Fraktalas – geometrinis darinys, kurio atskiri dariniai yra panašūs arba identiški visumai arba kitiems fragmentams. Pagrindinė fraktalų savybė – panašumas į save. Kitais žodžiais, maža figūros struktūros dalis atrodo identiška didžiajai.
- Klasifikijuoami į:
  1. Tikslus savipanašumas
  2. Apytikslis savipanašumas
  3. Statistiniis savipanašumas.

### Chaosas

- **Chaoso sistemos** yra matematikos rūšis, kuri studijuoja dinamiškų sistemų elgesį, kurios labai priklauso nuo pradinės būsenos.
- Chaoso sistemos nors iš pirmo žvilgsnio atrodo nenuspėjamos, jos susideda iš tam tikrų paternų, pastovių „feedback loops“, repeticijos, fraktalų ir t.t.
- Chaoso sistemos priklauso nuo pradinės būsenos. Pavyzdžiui, oras ir klimatas. Priklausomai nuo pradinės būsenos, oras gali būt toks ir toks.
