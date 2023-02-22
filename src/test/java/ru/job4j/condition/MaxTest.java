package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax11To8To15Then15() {
        int x = 11;
        int y = 8;
        int z = 15;
        int result = Max.max(x, y, z);
        int expected = 15;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax11To8To15To154Then154() {
        int a = 11;
        int b = 8;
        int c = 15;
        int d = 154;
        int result = Max.max(a, b, c, d);
        int expected = 154;
        assertThat(result).isEqualTo(expected);
    }
}