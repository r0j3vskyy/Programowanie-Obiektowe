# Programowanie Obiektowe

Zbiór ćwiczeń z programowania obiektowego w języku Java: podstawowe klasy, dziedziczenie, interfejsy, kolekcje, generyki, komparatory, rekordy oraz zadania egzaminacyjne.

## Struktura

```text
.
├── src/
│   ├── Zestaw1/ ... Zestaw9/
│   │   └── zadania z kolejnych zestawów ćwiczeń
│   ├── PrzykladoweZadania/
│   │   └── przykładowe zadania egzaminacyjne podzielone według numerów i tematów
│   ├── Zestawy2025/
│   │   └── zestawy egzaminacyjne H11–H14
│   └── Zestawy2026/
│       └── zestawy egzaminacyjne P11–P14
├── .vscode/
│   ├── launch.json
│   └── settings.json
└── README.md
```

Katalogi w `src/` zachowują strukturę zgodną z deklaracjami `package`. Dzięki temu przeniesienie plików nie zmienia nazw pakietów ani klas uruchamianych z konfiguracji VS Code.

## Kompilacja

Wymagana jest Java z `javac` i `java` w zmiennej `PATH`.

W PowerShellu, z katalogu repozytorium:

```powershell
New-Item -ItemType Directory -Force build\classes
$files = Get-ChildItem src -Recurse -Filter *.java
javac -encoding UTF-8 -d build\classes $files.FullName
```

Powyższa komenda kompiluje cały projekt. Pliki wynikowe trafiają do `build/classes/`, który jest ignorowany przez Git.

## Uruchamianie

Uruchamiaj klasę, podając jej pełną nazwę wraz z pakietem, np.:

```powershell
java -cp build\classes Zestaw1.Zestaw1
java -cp build\classes PrzykladoweZadania.Nr3.K12.Utils
java -cp build\classes Zestawy2026.Zestaw.TestTrain
```

Lista gotowych konfiguracji uruchamiania znajduje się w [.vscode/launch.json](.vscode/launch.json). W VS Code można wybrać klasę z panelu **Run and Debug**.
