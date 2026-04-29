import java.util.*;
public class ImprimirSequencia {
  static Scanner teclado = new Scanner(System.in);
  public static void inverte(int n){
      if (n == 0){
        System.out.println("\n");
          return;
      }
      System.out.println("Informe a sequencia numerica: ");
      int sequencia = teclado.nextInt();
      inverte(n-1);
      System.out.println(sequencia);
      
  }
    
    public static void main(String[] args) {
       System.out.println("Informe o tamanho da sequencia numerica: ");
       int tamanho = teclado.nextInt();
       
       inverte(tamanho);
       }
       
    }