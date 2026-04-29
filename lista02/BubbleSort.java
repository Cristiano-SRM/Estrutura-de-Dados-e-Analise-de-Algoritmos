import java.util.*;
public class BubbleSort {
    static Scanner input = new Scanner(System.in);

    public static void bubbleSort(ArrayList<Integer> v, int n) {
      int PosicaoTroca = 0;
        for(int i=0; i<n ; i++){
            for(int j=0; j<n-1;j++){
               if(v.get(j) > v.get(j+1)) {
                //troca
                int temp = v.get(j);
                v.set(j, v.get(j+1));
                v.set(j+1, temp);

           PosicaoTroca = j+1; //imprime a posição onde houve uma troca, se acontecer
           //(+1 para ficar visualmente mais atrativo ao olho humano no terminal, inves de 0 a 4 seria 1 a 5 por exemplo)
           System.out.println("A posição " + PosicaoTroca + " mudou de lugar com a posição: " + (PosicaoTroca+1));

               }
            }

        }
      System.out.println("Vetor ordenado:" + v);

    }

    public static void main(String[] args) {

        boolean continuar = true;
        ArrayList<Integer> VetorBolha = new ArrayList<>();

        do { //preenche um vetor dinamico do tamanho que o usuario desejar
        
          if(input.hasNextInt()){
            VetorBolha.add(input.nextInt());
          } else {
            String entrada = input.next();
            if (entrada.equalsIgnoreCase("p")){
                continuar = false;
            } else {
                System.out.println("Entrada invalida.");
            }
          }

        } while(continuar);
        
        int VetorTamanho = VetorBolha.size();
        bubbleSort(VetorBolha, VetorTamanho);
        
    }
    
}
