public class Veicolo {
   private String targa;
   private int numMatricola;
   private Marca marca;
   private String modello;
   private double cilindrata;
   private int annoDiAquisto;
   private int capacitaSerbatoio;


    public Veicolo(String targa, int numMatricola, Marca marca, String modello, double cilindrata, int annoDiAquisto, int capacitaSerbatoio) {
        this.targa = targa;
        this.numMatricola = numMatricola;
        this.marca = marca;
        this.modello = modello;
        this.cilindrata = cilindrata;
        this.annoDiAquisto = annoDiAquisto;
        this.capacitaSerbatoio = capacitaSerbatoio;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public int getNumMatricola() {
        return numMatricola;
    }

    public void setNumMatricola(int numMatricola) {
        this.numMatricola = numMatricola;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public double getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(double cilindrata) {
        this.cilindrata = cilindrata;
    }

    public int getAnnoDiAquisto() {
        return annoDiAquisto;
    }

    public void setAnnoDiAquisto(int annoDiAquisto) {
        this.annoDiAquisto = annoDiAquisto;
    }

    public int getCapacitaSerbatoio() {
        return capacitaSerbatoio;
    }

    public void setCapacitaSerbatoio(int capacitaSerbatoio) {
        this.capacitaSerbatoio = capacitaSerbatoio;
    }

    @Override
    public String toString() {
        return "Veicolo{" +
                "targa='" + targa + '\'' +
                ", numMatricola=" + numMatricola +
                ", marca=" + marca +
                ", modello='" + modello + '\'' +
                ", cilindrata=" + cilindrata +
                ", annoDiAquisto=" + annoDiAquisto +
                ", capacitaSerbatoio=" + capacitaSerbatoio +
                '}';
    }
}
