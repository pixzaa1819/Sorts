import org.junit.Test;
import static org.junit.Assert.*;

public class SortTesting {

    @Test
    public void testBubbleSort() {
        int[] nums = { 5, 3, 8, 2, 7 };
        int[] expected = { 2, 3, 5, 7, 8 };
        assertArrayEquals(expected, Sort.bubbleSort(nums));
    }

    @Test
    public void testInsertionSort() {
        int[] nums = { 5, 3, 8, 2, 7 };
        int[] expected = { 2, 3, 5, 7, 8 };
        assertArrayEquals(expected, Sort.insertionSort(nums));
    }
}
