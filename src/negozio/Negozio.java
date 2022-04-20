package negozio;

public class Negozio {

    public static void main(String[] args) {
        NonAlimentare p1 = new NonAlimentare("Seta", true, "Nike Air Force 1", 120, "USA");
        Alimentare a1 = new Alimentare(5, 2018, "Melinda", 100, "Toscana");

        p1.applicaSconto();
        System.out.println(p1.toString());

        System.out.println(a1.isScaduto());
        a1.applicaSconto();
        System.out.println(a1.toString());


    }
    
}
