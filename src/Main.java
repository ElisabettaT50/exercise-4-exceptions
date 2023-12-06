/*
Scrivere una funzione che accetti un array in input e provi a dividere un numero
dell'array per 0 e gestisca sia l'eccezione della divisione che quella di indice
non presente nell'array, leggendone il messaggio. Eseguire sempre un blocco di codice
scrivendo un messaggio in console.
 */
public class Main {

    public static void main(String[] args) {
        int[] myArray = {10, 2, 14, 6, 44};
        handleExceptions(myArray, myArray[5], 0);
    }

    public static void handleExceptions(int[] array, int index, int dividend) {
        try {
            int result = index / dividend;
            if (dividend == 0);
        } catch (ArithmeticException ex1) {
            System.out.println("Type of exception: " + ex1);
        } catch (ArrayIndexOutOfBoundsException ex2) {
            System.out.println("Type of exception: " + ex2);
        } finally {
            System.out.println("Code finally executed");
        }
    }
}