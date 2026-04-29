import java.util.*;
public class MergeQuickShellSorting {

    public static void MergeSort(int[] vetor, int tamanhoVetor){
        if(tamanhoVetor<2){
            return;
        }
       int meio = tamanhoVetor/2;
       int[] left = new int[meio];
       int[] right = new int[tamanhoVetor - meio];

       for (int i=0; i<meio; i++) {
        left[i] = vetor[i];
       }
       for (int i=meio; i<tamanhoVetor; i++){
        right[i - meio] = vetor[i];
       }

       MergeSort(left, meio);
       MergeSort(right, tamanhoVetor - meio);

       Merge(vetor, left, right, meio, tamanhoVetor-meio);
    }

    public static void Merge(int[] vetor, int[] vLeft, int[] vRight, int left, int right){
        
        int i=0, j=0, k=0;

        while (i<left && j<right) {
            if(vLeft[i] <= vRight[j]) {
                vetor[k++] = vLeft[i++];
            } else {
                vetor[k++] = vRight[j++];
            }
        }
       while (i < left) {
        vetor[k++] = vLeft[i++];
       }
       while (j < right) {
        vetor[k++] = vRight[j++];
       }
       System.out.println(Arrays.toString(vetor));
    }

    

    public static void Quick(int[] vetor, int left, int right){
      int leftEnd, rightBegin;
      int temp, i, j, pivo;
        i = left;
        j = right;
        pivo = vetor[(i+j)/2];
        do {

          while (vetor[i] < pivo) i++; //percorre do left até right na primeira metade do vetor dividido incrementando
          while (pivo < vetor[j]) j--; //percorre do right até left na segunda metade do vetor dividido decrementando

          if (i<=j) { //faz a ordenacao, quando ambos while acima param, significa que se encontrou um valor à ser trocado
            temp=vetor[i];
            vetor[i]=vetor[j];
            vetor[j]=temp;
            i++;
            j--;

          }
        } while (i<=j);
        System.out.println(Arrays.toString(vetor)); //imprime cada passo do algoritmo

        leftEnd = j; //salva limites dos subvetores, left até j
        rightBegin = i; // right até i

      if (left<leftEnd) Quick(vetor,left,leftEnd); //recursao do subvetor left
      if (rightBegin<right) Quick(vetor, rightBegin, right); //recursao do subvetor right
     
    }
    public static void QuickSort(int[] vetor, int tamanhoVetor){
       Quick(vetor, 0, tamanhoVetor-1);
    }


    public static void ShellSort(int[] vetor, int tamanhoVetor){
        int i,j,h=1,x;
        while(h<tamanhoVetor) h=3*h+1;

        do{
         h=h/3;
         for(i=h; i<tamanhoVetor; i++){
            x=vetor[i];
            for (j=i-h;j>=0 && x<vetor[j]; j-=h){
                vetor[j+h] = vetor[j];
            }
            vetor[j+h] = x;
         }
         System.out.println(Arrays.toString(vetor));
        } while(h>=1);
    }

    public static void main(String[] args) {

        int[] vetorShell = {3, 4, 9, 2, 5, 8, 2, 1, 7, 4, 6, 2, 9, 8, 5, 1};
        int[] vetorQuick = {3, 4, 9, 2, 5, 8, 2, 1, 7, 4, 6, 2, 9, 8, 5, 1};
        int[] vetorMerge = {3, 4, 9, 2, 5, 8, 2, 1, 7, 4, 6, 2, 9, 8, 5, 1};
        int tamanhoShell = vetorShell.length;
        int tamanhoQuick = vetorQuick.length;
        int tamanhoMerge = vetorMerge.length;

        System.out.println(" - - - Vetor ordenado por ShellSort - - - ");
        ShellSort(vetorShell, tamanhoShell);
        System.out.println(" - - - Vetor ordenado por QuickSort - - - ");
        QuickSort(vetorQuick, tamanhoQuick);
        System.out.println(" - - - Vetor ordenado por MergeSort - - - ");
        MergeSort(vetorMerge, tamanhoMerge);
        
    }
}