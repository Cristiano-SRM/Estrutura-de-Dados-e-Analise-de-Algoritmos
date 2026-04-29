import java.util.*;
public class DiffMetodosOrdenadacao {
    static Scanner input = new Scanner(System.in);

    public static void bubbleSort(ArrayList<Integer> vetor, int tamanhoVetor){
      int PosicaoTrocaBubble = 0;
      int trocasCountBubble = 0;
      int comparacaoCountBubble = 0;
      //-1 e -1-i reduz o numero de iterações dos for pois nao revisita elementos posteriormente ordenados
        for(int i=0; i<tamanhoVetor-1 ; i++){
            for(int j=0; j<tamanhoVetor-1-i;j++){
              comparacaoCountBubble++;
               if(vetor.get(j) > vetor.get(j+1)) {
                //troca
                int temp = vetor.get(j);
                vetor.set(j, vetor.get(j+1));
                vetor.set(j+1, temp);
                trocasCountBubble++;

           PosicaoTrocaBubble= j+1; //imprime a posição onde houve uma troca, se acontecer
           //(+1 para ficar visualmente mais atrativo ao olho humano no terminal, inves de 0 a 4 seria 1 a 5 por exemplo)
           System.out.println("A posição " + PosicaoTrocaBubble + " mudou de lugar com a posição: " + (PosicaoTrocaBubble+1));

               }
            }

        }
      System.out.println("Quantidade de trocas: "+ trocasCountBubble);
      System.out.println("Quantidade de comparações: "+ comparacaoCountBubble);
      System.out.println("Vetor ordenado por bubble:" + vetor);

    }

    public static void selectSort(ArrayList<Integer> vetor, int tamanhoVetor){
      int trocasCountSelect = 0;
      int comparacaoCountSelect = 0;

      for (int i=0;i<tamanhoVetor-1;i++){
        int indiceMenor = i;
        for(int j=i+1;j<tamanhoVetor;j++){
          comparacaoCountSelect++;
          if (vetor.get(j) < vetor.get(indiceMenor)){
            indiceMenor = j;
          }
        }

      if(indiceMenor != i){
      int temp = vetor.get(i);
      vetor.set(i, vetor.get(indiceMenor));
      vetor.set(indiceMenor, temp);
      trocasCountSelect++;
   }
  }

      System.out.println("Quantidade de trocas: "+ trocasCountSelect);
      System.out.println("Quantidade de comparações: "+ comparacaoCountSelect);
      System.out.println("Vetor ordenado por select:" + vetor);
    }

    public static void insertSort(ArrayList<Integer> vetor, int tamanhoVetor){
      int trocasCountInsert = 0;
      int comparacaoCountInsert = 0;
      int x;
      int j;
      for(int i=1;i<tamanhoVetor;i++){
         x = vetor.get(i);
        for(j=i-1; j>=0 && x<vetor.get(j); j--){
           comparacaoCountInsert++;
           vetor.set(j+1, vetor.get(j));
           trocasCountInsert++;
  
        }
        vetor.set(j+1, x);
      }


      System.out.println("Quantidade de trocas: " + trocasCountInsert);
      System.out.println("Quantidade de comparações: " + comparacaoCountInsert);
      System.out.println("Vetor ordenado por insert:" + vetor);
    }

    public static void main(String[] args) {

      boolean loopVetores=true;
      while(loopVetores) {
      System.out.println("Informe o metodo de ordenação desejado: ");
      System.out.println("1 - Bubble Sort.");
      System.out.println("2 - Select Sort.");
      System.out.println("3 - Insertion Sort.");
      System.out.println("Digite '-1' para fechar o programa.");
      int escolha = input.nextInt();
      if (escolha == -1) {
        loopVetores=false;
      } else switch(escolha) {
        case 1: boolean continuarBubble = true; ArrayList<Integer> VetorBubble = new ArrayList<>();
        System.out.println("Preencha um vetor, digite 'P' ou 'p' para parar: ");
        
        do { //preenche um vetor dinamico do tamanho que o usuario desejar
          if(input.hasNextInt()){
            VetorBubble.add(input.nextInt());
          } else {
            String entrada = input.next();
            if (entrada.equalsIgnoreCase("p")){
                continuarBubble = false;
            } else {
                System.out.println("Entrada invalida.");
            }
          }
        } while(continuarBubble);

        int tamanhoVetBubble = VetorBubble.size();
        bubbleSort(VetorBubble,tamanhoVetBubble);

        break;

        case 2: boolean continuarSelect = true; ArrayList<Integer> VetorSelect = new ArrayList<>(); 
        System.out.println("Preencha um vetor, digite 'P' ou 'p' para parar: ");

        do { //preenche um vetor dinamico do tamanho que o usuario desejar
          if(input.hasNextInt()){
            VetorSelect.add(input.nextInt());
          } else {
            String entrada = input.next();
            if (entrada.equalsIgnoreCase("p")){
                continuarSelect = false;
            } else {
                System.out.println("Entrada invalida.");
            }
          }
        } while(continuarSelect);

        int tamanhoVetSelect = VetorSelect.size();
        selectSort(VetorSelect,tamanhoVetSelect);

        break;

        case 3: boolean continuarInsert = true; ArrayList<Integer> VetorInsert = new ArrayList<>(); 
        System.out.println("Preencha um vetor, digite 'P' ou 'p' para parar: ");

        do { //preenche um vetor dinamico do tamanho que o usuario desejar
          if(input.hasNextInt()){
            VetorInsert.add(input.nextInt());
          } else {
            String entrada = input.next();
            if (entrada.equalsIgnoreCase("p")){
                continuarInsert = false;
            } else {
                System.out.println("Entrada invalida.");
            }
          }
        } while(continuarInsert);

        int tamanhoVetInsert = VetorInsert.size();
        insertSort(VetorInsert,tamanhoVetInsert);

        break;
        
        default: System.out.println("Selecione uma opção valida, 1-3.");
        break;
      }
       
    }

    input.close();
}
}

