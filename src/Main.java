public class Main {
//Scrivere una funzione che provi a dividere un numero per 0 e
// catturi l'eccezione leggendone il messaggio.

    public static void main(String[] args) {
        int num1=5;
        int num2=0;
        division(num1,num2);
    }
    public static void division(int num1, int num2) {
        try {
            System.out.println("Il risultato della divisione: " + num1/num2);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide a number by zero");
        }
    }
}