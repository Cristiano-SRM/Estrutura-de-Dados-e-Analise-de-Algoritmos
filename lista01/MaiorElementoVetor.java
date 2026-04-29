import java.util.*;
public class MaiorElementoVetor {
    static Scanner teclado = new Scanner(System.in);

     public static int MaiorVetor(ArrayList<Integer> v, int n){

      if (n==1){ // para o loop
        return n;
      }

     // recursao, cada iteração do loop guarda o valor anterior comparando com o atual conforme o array decrementa
     // no fim, apenas o maior int (comparado com Math.max) sobresai e retorna
      int MaiorAnterior = MaiorVetor(v, n-1);
      return Math.max(v.get(n-1), MaiorAnterior);

      }

    public static void main(String[] args) {
        System.out.println("Preencha um vetor, escreva P para sair: ");
        boolean continuar = true;
        ArrayList<Integer> VetorNum = new ArrayList<>();

        do { //preenche um vetor dinamico do tamanho que o usuario desejar
        
          if(teclado.hasNextInt()){
            VetorNum.add(teclado.nextInt());
          } else {
            String entrada = teclado.next();
            if (entrada.equalsIgnoreCase("p")){
                continuar = false;
            } else {
                System.out.println("Entrada invalida.");
            }
          }

        } while(continuar);

        // Passa o arraylist preenchido e o tamanho do array pro metodo
        int resultado = MaiorVetor(VetorNum, VetorNum.size());

        System.out.println("\n");
        System.out.print("O maior numero do array é: " + resultado);
    }
}
