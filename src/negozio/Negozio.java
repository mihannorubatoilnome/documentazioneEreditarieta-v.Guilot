package negozio;

public class Negozio {

    public static void main(String[] args) {
        NonAlimentare p1 = new NonAlimentare("", true, "Nike Air Force 1", 120, "USA");
        
        p1.applicaSconto();
        System.out.println(p1.toString());
    }
    
}
