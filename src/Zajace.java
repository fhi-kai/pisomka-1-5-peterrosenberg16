public class Zajace implements ZajacieUsi{

    @Override
    public int zajacieUsi(int pocetZajacov) {
        if (pocetZajacov == 0) return 0;
        return 2 + zajacieUsi(pocetZajacov-1);
    }}
