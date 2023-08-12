import java.util.ArrayList;
import java.util.List;

public class Gestione {
    private List autoInUso = new ArrayList();

    Gestione(){};

    public void usaMacchina(String targa, int numMatricola, Marca marca, String modello, double cilindrata,
                            int annoDiAquisto, int capacitaSerbatoi,int numPosti){
        var auto = new Auto(targa,numMatricola,marca,modello,cilindrata,annoDiAquisto,capacitaSerbatoi,numPosti);
        autoInUso.add(auto);
    }

    public void usaFurgone(String targa, int numMatricola, Marca marca, String modello, double cilindrata,
                            int annoDiAquisto, int capacitaSerbatoi,int capacitaDiCarcio){
        var furgone = new Furgone(targa,numMatricola,marca,modello,cilindrata,annoDiAquisto,capacitaSerbatoi,
                capacitaDiCarcio);
        autoInUso.add(furgone);
    }

    public void restituzioneMacchina(int numerazioneOrdine, int numGiornidiUtilizzo, int numeroKm,
                                     int carburanteIniziale, int carburanteMancanteAlSerbatoio){
        int primoCalcolo = numGiornidiUtilizzo * 50;
        int secondoCalcolo = numeroKm / 25;
        double terzoCalcolo =  (carburanteIniziale - carburanteMancanteAlSerbatoio) * 2;
        double risultato = primoCalcolo + secondoCalcolo + terzoCalcolo;
        System.out.println("devi pagare: " + risultato + " $");
        autoInUso.remove(numerazioneOrdine);
    }

    public void restituzioneFurgone(int numerazioneOrdine, int numGiornidiUtilizzo, int numeroKm,
                                    int carburanteIniziale, int carburanteMancanteAlSerbatoio){
        int primoCalcolo = numGiornidiUtilizzo * 70;
        int secondoCalcolo = (numeroKm - 100) / 30;
        double terzoCalcolo =  (carburanteIniziale - carburanteMancanteAlSerbatoio) * 2;
        double risultato = primoCalcolo + secondoCalcolo + terzoCalcolo;
        System.out.println("devi pagare: " + risultato);
        autoInUso.remove(numerazioneOrdine);

    }

    public List getAutoInUso() {

        return autoInUso;
    }

    public void setAutoInUso(List autoInUso) {

        this.autoInUso = autoInUso;
    }
}
