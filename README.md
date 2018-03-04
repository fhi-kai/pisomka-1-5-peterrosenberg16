# Zajačie uši - rekurzia

Máme zajace, ktoré stoja v rade s poradovými číslami 1, 2, 3, ....

Zajace s nepárnym (1, 3, 5, ...) číslom majú dve uši. Zajace s párnym číslom (2, 4, 6, ..) majú o jedno ucho navyše, čiže tri.

1. Implementujte metódu `zajacieUsi()` v rozhraní [ZajacieUsi](src/ZajacieUsi.java), ktorá **rekurzívne** vypočíta koľko majú spolu zajace uší podľa zadaného počtu zajacov.
2. Pre otestovanie a spustenie použite triedu JUnit [ZajacieUsiTest](/test/ZajacieUsiTest.java).  Inštanciu Vašej triedy vytvorte v metóde `setup()`:exclamation:

+ zajacieUsi(0) → 0
+ zajacieUsi(1) → 2
+ zajacieUsi(2) → 5

```java
	/**
	 * Metoda vrati pocet uci zajacov
	 * @param pocetZajacov
	 * @return pocet usi
	 */
	public int zajacieUsi(int pocetZajacov);
	
```

Poznámka: Program má byť napísaný **rekurzívne**. V krajnom prípade môžete použiť aj iný spôsob.


