import java.util.*;
public class ConversaoBinaria {
    static Scanner teclado = new Scanner(System.in);
    public static void Conversor(int n)
    {
       if (n == 0) {
        return; //para o loop da recursao
       }

       Conversor(n/2); //divide por 2 a cada iteração da recursao, a impressão mostra o resto de cada estado da divisão, dando assim o binario
       System.out.print(n%2);

    }

    public static void main(String[] args) {

        System.out.println("Informe um numero decimal para converter em binario: ");
        int num = teclado.nextInt();
        Conversor(num);

    }
}
