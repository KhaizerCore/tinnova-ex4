public class Main {
    public static void main(String[] args) {
        for(var x = 0; x <= 10; x++) {
            System.out.println("Soma dos multiplos de 3 ou 5 menores que "+ String.valueOf(x) +
                    ": " + String.valueOf(somaMultiplosDe3Ou5(x)));
        }
    }

    /**
     * Método utilizado para implementar a soma dos multiplos de 3 ou 5 contidos no intervalo de 0 até x-1.
     * @param int x
     * @return int soma
     */
    public static int somaMultiplosDe3Ou5(int x){
        int soma = 0;
        for (x = x - 1; x > 0; x--)
            soma += ((x % 3) == 0 || (x % 5) == 0) ? x : 0;
        return soma;
    }
}