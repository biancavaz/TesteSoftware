import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.PerformanceService2;

import java.util.Random;


public class PerformanceServiceTest2 {
    private PerformanceService2 performanceService2 = new PerformanceService2();

    //gera um array aleatório de inteiros
    private int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i=0; i<size; i++){
            array[i] = random.nextInt(size);
        }

        return array;
    }

    @Test
    public void testSortPerformance() {
        int[] array1 = generateRandomArray(1000); //gera um array de 10.000 elementos
        int[] array2 = array1.clone(); // cria uma cópia do array para o segundo teste

        //medir o tempo de execução para o sort nativo (Arrays.sort)
        long startTime = System.nanoTime();
        performanceService2.sortArrayNative(array1);
        long endTime = System.nanoTime();
        long durationNative = endTime - startTime;
        System.out.println("Tempo para Arrays.sort():" + durationNative + "nanosegundos");

        //medir o tempo de execução para o bubble sort
        startTime = System.nanoTime();
        performanceService2.bubbleSort(array2);
        endTime = System.nanoTime();
        long durationBubbleSort = endTime - startTime;
        System.out.println("Tempo para Bubble sort:" + durationBubbleSort + "nanosegundos");

        //verifica se os dois arrays estão ordenados
        assertTrue(isSorted(array1), "O array ordenado com Arrays.sort deveria estar ordenado");
        assertTrue(isSorted(array2), "O array ordenado com Bubble sort deveria estar ordenado");

        //verifica se o sort nativo foi mais rápido (como padrão)
        assertTrue(durationNative < durationBubbleSort, "Arrays.sort() deveria ser mais rápido que o bubble sort.");

    }
        //metodo auxiliar para verificar se o array está rodando
        private boolean isSorted (int[] array){
            for(int i =0; i<array.length -1; i++){
                if ( array[i] > array[i + 1]){
                    return false;
                }
            }
            return true;
        }
    }
