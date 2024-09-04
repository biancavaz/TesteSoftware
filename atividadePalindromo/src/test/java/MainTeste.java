
import org.example.ListUtils;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class MainTeste {

    private List<String> list;
    private ListUtils listUtils;

    @Before
    public void setUp () {
        list = new ArrayList<>();
        listUtils = new ListUtils();
    }

    @Test
    public void testAddToList() {
        listUtils.addToList(list, "item1");
        assertEquals(1, list.size());

        assertTrue(list.contains("item1"));

        listUtils.addToList(list, "item2");
        assertEquals(2, list.size());

        assertTrue(list.contains("item2"));
    }

    @Test
    public void testRemoveToList() {
        list.add("item1");
        listUtils.removeToList(list,"item1");

        assertFalse(list.contains("item1"));
        assertEquals(0, list.size());

        listUtils.removeToList(list, "item2");
        assertEquals(0, list.size());
    }

    @Test
    public void testFindToList (){
        list.add("item1");
        assertTrue(listUtils.findToList(list, "item1"));
    }

    @Test
    public void testRemoveNonExistenItem (){
        list.add("item1");
        listUtils.removeToList(list, "item2");

        assertEquals(1, list.size());
    }

}
