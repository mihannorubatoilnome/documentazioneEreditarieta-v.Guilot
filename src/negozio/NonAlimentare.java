/**
 * @author Edmard Guilot
 * @version JDK 1.0
 */
package negozio;

/**
 * La classe gestisce la tipologia NonAlimentare di Prodotto
 */
public class NonAlimentare extends Prodotto{
    
    /**
     * Materiale principale costituente del prodotto
     */
    protected String materialePrincipale;

    /**
     * Se il prodotto è riciclabile o meno
     */
    protected boolean riciclabile;
    
    /**
     * Costruttore Parametrico - Costruisce un oggetto di tipo Prodotto NonAlimentare
     * @param materialePrincipale Nome del materiale principale
     * @param riciclabile True se riciclabile, False altrimenti
     * @param nome Nome da assegnare al nuovo oggetto Prodotto
     * @param prezzo Prezzo da assegnare al nuovo oggetto Prodotto
     * @param provenienza Nazione di produzione del nuovo oggetto Prodotto
     */
    public NonAlimentare(String materialePrincipale, boolean riciclabile, String nome, double prezzo, String provenienza) {
        super(nome, prezzo, provenienza);
        this.materialePrincipale = materialePrincipale;
        this.riciclabile = riciclabile;
    }

    /**
     * Restituisce il nome del materiale principale
     * @return Nome del materiale principale
     */
    public String getMaterialePrincipale() {
        return materialePrincipale;
    }

    /**
     * Imposta il materiale dell'oggetto
     * @param materialePrincipale Stringa che rappresenta materiale
     */
    public void setMaterialPrincipale(String materialePrincipale) {
        this.materialePrincipale = materialePrincipale;
    }

    /**
     * Restituisce se il prodotto Non Alimnetare è riciclabile oppure no
     * @return True se è riciclabile, falso altrimenti
     */
    public boolean isRiciclabile() {
        return riciclabile;
    }

    /**
     * Imposta vero se l'oggetto è riciclabile, falso altrimenti
     * @param riciclabile vero/falso
     */
    public void setRiciclabile(boolean riciclabile) {
        this.riciclabile = riciclabile;
    }
    
    /**
     * Applica uno sconto sul prodotto Non Alimentare.
     * Se il prodotto è riciclabile viene uno sconto del 15%
     * Altrimenti sconto del 10%
     */
    public void applicaSconto(){
        if(isRiciclabile() == true)
            this.prezzo = this.prezzo - (this.prezzo / 100 * 15);
        
        else
            this.prezzo = this.prezzo - (this.prezzo / 100 * 10);
        
    }
    
}
