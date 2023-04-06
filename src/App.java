import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double altura;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira sua altura: ");
        altura = teclado.nextDouble();
        teclado.close();

        System.out.print("O seu peso ideal é: " + ((72.7*altura)-58));
    }
}
