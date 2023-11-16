public class Main {
//Scrivere una funzione che provi a dividere un numero per 0 e
// catturi l'eccezione leggendone il messaggio.
    public static void main(String[] args) {
        int num1=2;
        int num2=0;
        try{
            System.out.println("The result of the operation is: " + division(num1, num2));
        }catch(ArithmeticException e){
            System.out.println("Cannot divide a number by zero");
        }
    }
    public static int division(int num1, int num2){
        return num1/num2;
    }
}