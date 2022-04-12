/**
 * @author Edmard Guilot
 * @version JDK 1.0
 */
package negozio;

/**
 * La classe gestisce la tipologia Alimentare di Prodotto
 */
public class Alimentare extends Prodotto{
    
    /**
     * Anno di scadenza riportato sulla confezione del prodotto
     */
    protected int annoScadenza;

    /**
     * Mese di scadenza riportato sulla confezione del prodotto
     */
    protected int meseScadenza;
    
    /**
     * Costruttore Parametrico - Costruisce un oggetto di tipo ProdottoAlimentare
     * @param meseScadenza Mese di scadenza da assegnare al nuovo oggetto Prodotto
     * @param annoScadenza Anno di scadenza da assegnare al nuovo oggetto Prodotto
     * @param nome Nome da assegnare al nuovo oggetto Prodotto
     * @param prezzo Prezzo da assegnare al nuovo oggetto Prodotto
     * @param provenienza Nazione di produzione del nuovo oggetto Prodotto
     */
    public Alimentare(int meseScadenza, int annoScadenza, String nome, double prezzo, String provenienza) {
        super(nome, prezzo, provenienza);
        this.annoScadenza = annoScadenza;
        this.meseScadenza = meseScadenza;
    }

    /**
     * Restituisce l'anno di scadenza riportato sulla confezione
     * @return Anno di scadenza
     */
    public int getAnnoScadenza() {
        return annoScadenza;
    }

    /**
     * Imposta l'anno di scadenza dell'oggetto Prodotto Alimentare
     * @param annoScadenza Intero che rappresenta l'anno (>1900)
     */
    public void setAnnoScadenza(int annoScadenza) {
        if(annoScadenza > 1900)
            this.annoScadenza = annoScadenza;
        
        else
            System.out.println("Anno non VALIDO!");
        
    }

    /**
     * Restituisce il mese di scadenza riportato sulla confezione
     * @return Mese di scadenza
     */
    public int getMeseScadenza() {
        return meseScadenza;
    }

    /**
     * Imposta il mese di scadenza dell'oggetto Prodotto Alimentare
     * @param meseScadenza Intero che rappresenta il mese (1-12)
     */
    public void setMeseScadenza(int meseScadenza) {
        if(meseScadenza >= 1 && meseScadenza <= 12)
            this.meseScadenza = meseScadenza;
        
        else
            System.out.println("Mese non VALIDO!");
        
    }
    
    /**
     * Controlla la scadenza del prodotto
     * @return True se il prodotto è scaduto, false altrimenti
     */
    //Metodo da FINIRE!
    /*
    public boolean isScaduto(){
        if()
    }
    */

    /**
     * Applica uno sconto sul prezzo del prodotto Alimentare.
     * Se il prodotto è scaduto lo sconto non viene applicato.
     * Se ci si trova nel mese di scadenza allora applica uno sconto del 50%
     * Negli altri casi rimane lo sconto del 10%
     */
    public void applicaSconto(){
        this.prezzo = this.prezzo - (this.prezzo / 100 * 10);
    }
    
    /**
     * Restituisce una stringa che rappresenta l'oggetto ProdottoAlimentare
     * @return Rappresentazione testuale dell'oggetto ProdottoAlimentare
     */
    @Override
    public String toString(){
        return("\nNome del Prodotto : "+this.nome+
               "\nPrezzo del Prodotto : "+this.prezzo+
                "\nProvenienza del Prodotto : "+this.provenienza+
                "\nMese di Scadenza : "+this.meseScadenza+
                "\nAnno di Scadenza : "+this.annoScadenza);
    }
    
}
