import java.util.Scanner;

public class polindromo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada;

        do {

            entrada = scanner.nextLine();

            if (!entrada.equals("FIM")) {
                String resposta = (verificador(entrada)) ? "SIM" : "NAO";
                System.out.println(resposta);
            }

        } while (!entrada.equals("FIM") && scanner.hasNext());

        scanner.close();
    }

    public static boolean verificador(String entrada) {
        return polindromoRecursivo(entrada, 0, entrada.length() - 1);
    }

    public static boolean polindromoRecursivo(String entrada, int inicio, int fim) {

        if (inicio >= fim)
            return true;

        if (entrada.charAt(inicio) != entrada.charAt(fim))
            return false;

        return polindromoRecursivo(entrada, inicio + 1, fim - 1);
    }
}