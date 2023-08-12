public class Furgone extends Veicolo{
    private int capacitaDiCarico;


    public Furgone(String targa, int numMatricola, Marca marca, String modello, double cilindrata, int annoDiAquisto, int capacitaSerbatoio, int capacitaDiCarico) {
        super(targa, numMatricola, marca, modello, cilindrata, annoDiAquisto, capacitaSerbatoio);
        this.capacitaDiCarico = capacitaDiCarico;
    }

    public int getCapacitaDiCarico() {

        return capacitaDiCarico;
    }

    public void setCapacitaDiCarico(int capacitaDiCarico) {

        this.capacitaDiCarico = capacitaDiCarico;
    }


}
