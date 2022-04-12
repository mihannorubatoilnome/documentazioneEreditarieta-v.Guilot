/**
 * @author Edmard Guilot
 * @version JDK 1.0
 */
package negozio;

/**
 * La classe gestisce prodotti di un negozio
 */
public class Prodotto {

    /**
     * Nome del prodotto
     */
    protected String nome;

    /**
     * Prezzo di vendita del prodotto
     */
    protected double prezzo;

    /**
     * Nazione di produzione del prodotto
     */
    protected String provenienza;
    
    /**
     * Costruttore parametrico, costruisce un oggetto Prodotto dato il nome prezzo e nazione di provenienza
     * @param nome Nome da assegnare al nuovo oggetto Prodotto
     * @param prezzo Prezzo da assegnare al nuovo oggetto Prodotto
     * @param provenienza Nazione di produzione del nuovo oggetto Prodotto
     */
    public Prodotto(String nome, double prezzo, String provenienza){
        this.nome = nome;
        this.prezzo = prezzo;
        this.provenienza = provenienza;
    }

    /**
     * Restituisce il nome del prodotto
     * @return Il nome del prodotto
     */
    public String getNome() {
        return nome;
    }

    /**
     * Imposta il nome del prodotto
     * @param nome Nome del prodotto
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Restituisce il prezzo del prodotto
     * @return Il prezzo del prodotto
     */
    public double getPrezzo() {
        return prezzo;
    }

    /**
     * Imposta il prezzo dell'oggetto di tipo Prodotto
     * @param prezzo Prezzo del prodotto
     */
    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    /**
     * Restituisce la nazione di produzione del prodotto
     * @return Nazione di provenienza
     */
    public String getProvenienza() {
        return provenienza;
    }

    /**
     * Imposta la provenienza dell'oggetto di tipo Prodotto
     * @param provenienza Stringa provenienza
     */
    public void setProvenienza(String provenienza) {
        this.provenienza = provenienza;
    }
    
    /**
     * Applica uno sconto del 10% sul prezzo del prodotto
     */
    public void applicaSconto(){
        this.prezzo = this.prezzo - (this.prezzo / 100 * 10);
    }
    
    /**
     * Restituisce una stringa che rappresenta l'oggetto
     * @return Rappresentazione testuale dell'oggetto Prodotto
     */
    @Override
    public String toString(){
        return("\nNome del Prodotto : "+this.nome+
               "\nPrezzo del Prodotto : "+this.prezzo+
                "\nProvenienza del Prodotto : "+this.provenienza);
    }
}
