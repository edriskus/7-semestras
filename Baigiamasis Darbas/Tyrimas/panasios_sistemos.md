# Panasios Sistemos

## SETI@home

- Internetinis viešas savanoriško skaičiavimo (volunteer computing) projektas,
  skirtas analizuoti radijo signalus, ieškoti nežemiško intelekto (ETI)
- Dalis pasaulinės SETI (nežemiško intelekto paieškos) iniciatyvos
- Išleista 1999 m. Gegužės 17 d.
- Naujausias stabilus leidimas - Gruodžio 30, 2015
- Trečias didelės apimties internetu paskirstytų skaičaivimų pritaikymas moksliniais
  tikslais, po GIMPS ir distributed.net
- Giminingi projektai - MilkyWay@home and Einstein@home
- Pritaikytas įvairioms platformoms
- Pagrindiniai tikslai:
  - Atlikti naudingų skaičaivimų prisidedant prie SETI
  - Įrodyti savanoriško skaičiavimo panaudojimo praktiškumą
- Iš SETI@home išsivystė ir itin sėkmingai buvo išleistas BOINC
- 2005 m. SETI@home Classic versija nustota naudoti, projektas tapo dalimi BOINC
- Veikia ir ant PlayStation 3

### Veikimo principas

- Duomenys gaunami iš Arecibo (Puerto Rikas) radijo teleskopo ir "the Green Bank Telescope"
- Duomenys padalijami į "gabalus" pagal gavimo laiką ir signalo dažnį
- Vieno "gabalo" dydis - 107 sekundės
- Skaičiavimams naudojamas algoritmas "coherent integration" - niekas anksčiau jo
  nenaudojo, nes neturėjo tokio masto skaičiavimų galios

### Statistika

*With over 5.2 million participants worldwide, the project is the distributed computing project with the most participants to date[when?]. The original intent of SETI@home was to utilize 50,000-100,000 home computers.[12] Since its launch on May 17, 1999, the project has logged over two million years of aggregate computing time.[when?] On September 26, 2001, SETI@home had performed a total of 1021 floating point operations. It was acknowledged by the 2008 edition of the Guinness World Records as the largest computation in history.[19] With over 145,000 active computers in the system (1.4 million total) in 233 countries, as of 23 June 2013, SETI@home had the ability to compute over 668 teraFLOPS.[20] For comparison, the Tianhe-2 computer, which as of 23 June 2013 was the world's fastest supercomputer, was able to compute 33.86 petaFLOPS (approximately 50 times greater). *

### Validacija

*As with any competition, attempts have been made to "cheat" the system and claim credit for work that has not been performed. To combat cheats, the SETI@home system sends every work unit to multiple computers, a value known as "initial replication" (currently 2). Credit is only granted for each returned work unit once a minimum number of results have been returned and the results agree, a value known as "minimum quorum" (currently 2). If, due to computation errors or cheating by submitting false data, not enough results agree, more identical work units are sent out until the minimum quorum can be reached. The final credit granted to all machines which returned the correct result is the same and is the lowest of the values claimed by each machine. The claimed credit by each machine for an identical work unit often varies due to minor differences in floating point arithmetic on different processors.*

### Galingumas

*With over 145,000 active computers in the system (1.4 million total) in 233 countries, as of 23 June 2013, SETI@home had the ability to compute over 668 teraFLOPS.[20] For comparison, the Tianhe-2 computer, which as of 23 June 2013 was the world's fastest supercomputer, was able to compute 33.86 petaFLOPS (approximately 50 times greater). *

## GIMPS

*Great Internet Mersenne Prime Search*

- Ieško Merseno pirminių skaičių
- Paleistas 1996 m.
- Per 22 veikimo metus atrado 16 tokių skaičių, iš kurių 14 buvo didžiausi žinomi
  pirminiai skaičiai savo laiku

*To perform its testing, the project relies primarily on Lucas–Lehmer primality test,[3] an algorithm that is both specialized to testing Mersenne primes and particularly efficient on binary computer architectures. They also have a trial division phase, used to rapidly eliminate Mersenne numbers with small factors which make up a large proportion of candidates. Pollard's p - 1 algorithm is also used to search for larger factors.
Contents*

## distributed.net

- Paleistas 1997 m.
- Universali sistema, skirta panaudoti nenaudojamus CPU ar GPU resursus
- Šiuo metu veikia 2 projektai:
  - RC5-72 - bando per 150 m. "nulaužti" RC5 šifravimą naudojant 72 bitų raktą
  - OGR-28 - *searching for the optimal 28-mark Golomb ruler*
- RC5 projektai - bandymas įveikti RSA skirtus iššūkius, kuriems ši organizacija
  yra įsteigusi piniginius prizus
- RC5-56 distributed.net įveikė 1997 m., po 250 dienų
- RC5-64 distributed.net įveikė 2002 m., po beveik 5 metų
- Programinė įranga, naudojama prisijungti prie projekto - `dnetc`
- 2018 m. Kovo mėn. duomenimis, GPU klientai atlieka 78% viso projekto darbų,
  taip pat 93% darbų kiekvieną dieną:
  - NVIDIA - 8% visų darbų, 29% kiekvieną dieną
  - ATI (Stream) - 52% visų darbų, 10% kiekvieną dieną
  - OpenCL - 17% visų darbų, 53% kiekvieną dieną (universalus)

## BOINC

*Berkeley Open Infrastructure for Network Computing*

- Pradėtas 2002 m.
- 2010 m.  paleistas pirmasis OpenCL projekas
- Guinness World Records ranks BOINC as the largest computing grid in the world.
- Veikia su Microsoft Windows, macOS, Android, Linux ir FreeBSD
- 2018 m. Liepos mėn. duomenimis, galingumas siekia vidutiniškai 26.431 PetaFLOPS
- Yra išleista mobilioji Android aplikacija (veikia ne visi projektai)
- "BOINC credit" sistema skirta validuoti ir įvertinti atliktus darbus

### BOINC Credit System

- Naudotojai prisideda prie BOINC projektų dėl šių priežasčių:
  - To donate to a scientific cause
    - To advance the specific field of study of a project(s)
    - To help fight disease may have an emotional connection for those participating
  - To stress test computers
    - Processing distributed computing projects places a computer under continuous full CPU load, therefore, overclockers often use the stress to test their system's stability
  - To team up, earn credit, and compete against other users and teams
    - Some individuals and teams run many computers and have some dedicated specifically to BOINC in hopes of climbing to the top of the world charts
  - For personal benefit and recognition
    - Projects such as PlanetQuest plan on allowing individuals to name those planets discovered using their computers
    - Projects such as BURP, and Leiden Classical allow users to submit their own operations for use in the system. BURP allows a user to submit models to be rendered, and Leiden Classical allows users to submit physics calculations.
- Tas pats darbas dažniausiai daromas kelis kartus, kad būtų galima patikrinti jo validumą
- Kai kurie projektai atlygio "kreditus" skaičiuoja pagal kompiuterio teikiamus resursus
- "recent average credit (RAC)" padeda nuspėti, kiek vienas naudotojas potencialiai gali atlikti naudingų darbų

## CoinHive

- [Documentation](https://coinhive.com/documentation#hash-rate)
- [setThrottle](https://coinhive.com/documentation/miner#miner-set-throttle)
- Mines Monero using CPU (in WebAssembly)