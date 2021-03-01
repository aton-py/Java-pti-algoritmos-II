import java.util.Scanner;

public class Main {

  public static boolean isSorted(int[] a){    

    if(a == null) {
        return false;
    }
    else if(a.length == 0) {
        return true;
    }
    for (int i = 0; i < a.length-1; i++) {
        if(a[i] > a[i+1]) {
            return false;
        }           
    }
    return true;
  }

  public static void main(String[] args) {

    System.out.printf("Informe o Tamanho do Vetor : \n");
    Scanner read = new Scanner(System.in); 

    int n = read.nextInt(); // tamanho do vetor
    int v[] = new int[n]; // declaração do vetor "v"
    int i; // índice ou posição

    // Entrada de Dados
    for (i=0; i<n; i++) {
      System.out.printf("Informe %2do. valor de %d: ", (i+1), n);
      v[i] = read.nextInt();
    }

    // Definir o maior e o menor valor
    int sub = 0;
    int min = v[0]; 
    int max = v[0];
    for (i=0; i<n; i++) {
      if (v[i] < min)
         min = v[i];

      if (v[i] > max)
         max = v[i];
      sub = max - min;      
    }
    
    // Maior e menor valor
    System.out.printf("\n");
    for (i=0; i<n; i++) {
      if (v[i] == min)
        System.out.printf("v[%d] = %2d <--------- menor valor\n", i, v[i]);
      else if (v[i] == max)
              System.out.printf("v[%d] = %2d <--------- maior valor\n", i, v[i]);
           else System.out.printf("v[%d] = %2d\n", i, v[i]);
    }

    System.out.printf("\n<------------------------------>\n");
    System.out.printf("\nOrdenado : " + isSorted(v) + "\n"); //Verificar se é ordenado
    System.out.printf("\nMaior Diferença Entre Valores = %d\n", sub);
    System.out.printf("\n<--------------FIM-------------->\n");  
  }
}
