
public class Main {
    public static void main(String[] args) {

        //esercizio java oop
        //autonoleggio

     var gestione = new Gestione();

     //esempi utilizzo
     gestione.usaMacchina("345hdn",456,Marca.MERCEDES,"macchinone",3.1,2016,7,4);

     gestione.usaFurgone("67fj",678,Marca.KIA,"furgoncino",3.9,2019,7,6);
     System.out.println(gestione.getAutoInUso());

     gestione.restituzioneFurgone(1,5,230,6,2);


    }
}