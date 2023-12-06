package org.example;

import java.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.assertArrayEquals;

public class ArraySorter {
    public static int[] sortArray(int[] array) {
        Arrays.sort(array);
        return array;
    }
}

@RunWith(Parameterized.class)
public class ArraySorterTest {
    private int[] expected;
    private int[] input;

    public ArraySorterTest(int[] input, int[] expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameters
    public static Collection<Object[]> testCases() {
        return Arrays.asList(new Object[][] {
                {new int[] {3, 2, 1}, new int[] {1, 2, 3}},
                {new int[] {5, 4, 3, 2, 1}, new int[] {1, 2, 3, 4, 5}},
                {new int[] {1, 1, 1, 1, 1}, new int[] {1, 1, 1, 1, 1}}
        });
    }

    @Test
    public void testSortArray() {
        assertArrayEquals(expected, ArraySorter.sortArray(input));
    }
}