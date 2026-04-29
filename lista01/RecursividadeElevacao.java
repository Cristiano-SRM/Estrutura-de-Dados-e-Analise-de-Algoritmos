import java.util.*;
public class RecursividadeElevacao {

    public static int elevacao(int x, int y){
        if (y==0){
            return 1;
        }
        return x*elevacao(x, y-1);
    }

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Informe dois valores: ");
       int x = input.nextInt();
       int y = input.nextInt();

       int resultado = elevacao(x, y);

       System.out.println("O primeiro valor elevado ao segundo é: " + resultado);
       input.close();
    }

   
}
