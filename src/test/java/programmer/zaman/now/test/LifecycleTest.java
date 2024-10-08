package programmer.zaman.now.test;

import org.junit.jupiter.api.Test;

public class LifecycleTest {
    private String temp;

    @Test
    void TestA() {
        temp = "Eko";
    }

    @Test
    void TestB() {
        System.out.println(temp);
    }
}
