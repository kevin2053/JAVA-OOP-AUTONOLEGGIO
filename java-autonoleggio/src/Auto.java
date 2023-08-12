public class Auto extends Veicolo{
    private int numeroPosti;

    public Auto(String targa, int numMatricola, Marca marca, String modello, double cilindrata, int annoDiAquisto, int capacitaSerbatoio, int numeroPosti) {
        super(targa, numMatricola, marca, modello, cilindrata, annoDiAquisto, capacitaSerbatoio);
        this.numeroPosti = numeroPosti;
    }

    public int getNumeroPosti() {
        return numeroPosti;
    }

    public void setNumeroPosti(int numeroPosti) {
        this.numeroPosti = numeroPosti;
    }


}
