/*
Scrivere una funzione che accetti un array in input e provi a dividere un numero
dell'array per 0 e gestisca sia l'eccezione della divisione che quella di indice
non presente nell'array, leggendone il messaggio. Eseguire sempre un blocco di codice
scrivendo un messaggio in console.
 */
public class Main {

    public static void main(String[] args) {
        int[] myArray = {10, 2, 14, 6, 44};
        handleExceptions(myArray[5], 0);
    }

    public static int handleExceptions(int index, int dividend) {
        try {
            System.out.println(index / dividend);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Type of exception: " + e);
        } finally {
            // non esegue il blocco di codice dopo il finally, perché?
            System.out.println("Code finally executed");
        }
        return index / dividend;
    }
}