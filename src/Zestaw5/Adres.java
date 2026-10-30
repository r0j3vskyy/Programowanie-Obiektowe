package Zestaw5;

public class Adres implements AdresI {
    private String ulica;
    private String nrDomu;
    private String nrMieszkania;
    private String miasto;
    private String kodPocztowy;

    public Adres(String ulica, String nrDomu, String nrMieszkania, String miasto, String kodPocztowy){
        setUlica(ulica);
        setNrDomu(nrDomu);
        setNrMieszkania(nrMieszkania);
        setMiasto(miasto);
        setKodPocztowy(kodPocztowy);
    }
    public Adres(String ulica, String nrDomu, String miasto, String kodPocztowy){
        setUlica(ulica);
        setNrDomu(nrDomu);
        setNrMieszkania(null);
        setMiasto(miasto);
        setKodPocztowy(kodPocztowy);
    }

    public String getUlica(){
        return ulica;
    }
    public void setUlica(String ulica){
        if (ulica == null || ulica.trim().isEmpty()){
            throw new IllegalArgumentException("Ulica nie moze byc pusta.");
        }
        this.ulica = ulica;
    }

    public String getNrDomu(){
        return nrDomu;
    }
    public void setNrDomu(String nrDomu){
        if (nrDomu == null || nrDomu.trim().isEmpty()){
            throw new IllegalArgumentException("NrDomu nie moze byc pusty.");
        }
        this.nrDomu = nrDomu;
    }

    public String getNrMieszkania(){
        return nrMieszkania;
    }
    public void setNrMieszkania(String nrMieszkania){
        this.nrMieszkania = nrMieszkania;
    }

    public String getMiasto(){
        return miasto;
    }
    public void setMiasto(String miasto){
        if (miasto == null || miasto.trim().isEmpty()){
            throw new IllegalArgumentException("Miasto nie moze byc puste.");
        }
        this.miasto = miasto;
    }

    public String getKodPocztowy(){
        return kodPocztowy;
    }
    public void setKodPocztowy(String kodPocztowy){
        if (kodPocztowy == null || kodPocztowy.trim().isEmpty()){
            throw new IllegalArgumentException("Kod pocztowy nie moze byc pusty");
        }
        this.kodPocztowy = kodPocztowy;
    }
    // public void pokaz(){
    //     System.out.println("Miasto: " + miasto + ", kod pocztowy: " + kodPocztowy);
    //     System.out.println(ulica + " " + nrDomu + "/" + nrMieszkania);
    // }
    public boolean przed(Adres innyAdres){
        return this.kodPocztowy.compareTo(innyAdres.kodPocztowy) < 0;
    }
    @Override
    public String toString(){
        return kodPocztowy + " " + miasto + ", ul." + ulica + " " + nrDomu + nrMieszkania;
    }
}
