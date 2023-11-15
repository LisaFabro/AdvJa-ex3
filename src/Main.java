public class Main {
//Scrivere una funzione che provi a dividere un numero per 0 e
// catturi l'eccezione leggendone il messaggio.
    public static void main(String[] args) {
        int num1=2;
        int num2=0;
        try{
            int result= num1/num2;
        }catch(Exception e){
            System.out.println("Cannot divide a number by zero");
        }
        System.out.println("End of the code");
    }
}