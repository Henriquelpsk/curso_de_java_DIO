import java.util.Random;

/**
 * Programa que gera uma matriz 4x4 com numeros aleatorios de 0 a 9
 */
public class ArrayMultidimenssional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][]array = new int[4][4];

        for(int i=0;i < 4 ; i++){
            for(int x=0;x < 4;x++){
                array[i][x] = random.nextInt(9);
            }
        }

        for(int[] linha : array){
            for(int coluna : linha){
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
    }
}
