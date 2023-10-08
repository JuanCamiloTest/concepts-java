# concepts-java
// Ejecutado en un compilador web de java :).
public class HelloWorld {

    public static void main(String []args) {
        System.out.println("Hello, World!\n\n\n");
        ACMEBicycle bicycle = new ACMEBicycle();
        bicycle.printStates();
        bicycle.cadence = 8;
        System.out.println("\n\n");
        bicycle.printStates();
    }
}

interface Bicycle {
    public void changeCadene(int newValue);
}

class ACMEBicycle implements Bicycle {
    int cadence = 0;
    int cadence2 = 707;

    public ACMEBicycle() {}

    public ACMEBicycle(int cadence) {
        this.cadence = cadence;
    }
    
    public void changeCadene(int newValue) {
        System.out.println(newValue);
    }

    public void printStates() {
        System.out.printf("el valor es: %d, %d", this.cadence2, this.cadence);
    }
}
