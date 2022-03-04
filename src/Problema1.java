public class Problema1 {

    static String[] listaNumeros(){

        String[] lista = new String[20];
        int[] listaNum = new int[20];
        int num = 1;
        for (int i = 0; i <= 20; i++){
            listaNum[i] = num;

            if (num % 3 == 0) {
                String tx1 = "Fizz";
                lista[i] = tx1;
            } else if (num % 5 == 0) {
                String tx2 = "Buzz";
                lista[i] = tx2;
            } else if (num % 3 == 0 && num % 5 == 0) {
                String tx3 = "FizzBuzz";
                lista[i] = tx3;
            }
            num++;
            System.out.print(listaNum[i] + lista[i]);
        }

        return lista;
    }

    public static void main(String[] args) {
        listaNumeros();
    }
}
