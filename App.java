// App.java

public class App {
    
    public static void main(String[] args) {
        // ... existing code ...
        
        // Example calls to the multiplication function
        Calculatrice calculator = new Calculatrice();
        int result1 = calculator.multiplication(5, 3);
        int result2 = calculator.add(2, 7);

        System.out.println("*** Results:");
        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }
}
