package ba.unsa.etf;

public class prva {
    private String ime, prezime;
    private int indeks;
    private intefzamock interfejs;

    public prva(String ime, String prezime, int indeks) {
        this.ime = ime;
        this.prezime = prezime;
        this.indeks = indeks;
    }

    public prva(intefzamock interfejs) {
        this.interfejs = interfejs;
    }

    public String metoda(String prezime){
        String dfgd interfejs.nekametoda()
        if(prezime.equals("Nekic")) return "Neko";
        return "neki string";
    }


}
