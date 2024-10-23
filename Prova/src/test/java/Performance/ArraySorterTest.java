package Performance;

import org.example.Performance.ArraySorter;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ArraySorterTest {


    static ArraySorter sorter;

    @BeforeAll
    public static void satUp () {
        sorter = new ArraySorter();
    }

    @Test
    public void testSort () {

        ArrayList<Integer> list = new ArrayList<>(List.of(1, 4, 3, 7, 2));

        long startTime = System.nanoTime();
        sorter.sort(list);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        assertEquals(new ArrayList<>(List.of(1, 2, 3, 4, 7)), list);
        System.out.println("tempo de execução: "+ duration + " nanosegundos");
    }

    @AfterAll
    public static void tearDown () {
        sorter = null;
    }
}
