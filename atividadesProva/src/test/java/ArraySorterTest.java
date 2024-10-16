import org.example.ArraySorter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ArraySorterTest {

     static ArraySorter arraySorter;

    @BeforeAll
    public static void setup () {
        arraySorter = new ArraySorter();
    }
    @Test
        public void testSortArray() {
            ArraySorter sorter = new ArraySorter();

            // Caso de teste: array desordenado
            int[] input = {5, 2, 8, 3, 1};
            sorter.sortArray(input);

            // Verifica se o array foi ordenado corretamente
            int[] expected = {1, 2, 3, 5, 8};
            Assertions.assertArrayEquals(expected, input);
        }

        @Test
        public void testSortAlreadySortedArray() {
            ArraySorter sorter = new ArraySorter();

            // Caso de teste: array já ordenado
            int[] input = {1, 2, 3, 4, 5};
            sorter.sortArray(input);

            // Verifica se o array permanece o mesmo
            int[] expected = {1, 2, 3, 4, 5};
            Assertions.assertArrayEquals(expected, input);
        }

        @Test
        public void testSortEmptyArray() {
            ArraySorter sorter = new ArraySorter();

            // Caso de teste: array vazio
            int[] input = {};
            sorter.sortArray(input);

            // Verifica se o array vazio permanece vazio
            int[] expected = {};
            Assertions.assertArrayEquals(expected, input);
        }

        @Test
        public void testSortSingleElementArray() {
            ArraySorter sorter = new ArraySorter();

            // Caso de teste: array com um único elemento
            int[] input = {42};
            sorter.sortArray(input);

            // Verifica se o array permanece o mesmo
            int[] expected = {42};
            Assertions.assertArrayEquals(expected, input);
        }
    }

