package programmer.zaman.now.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class ConditionTest {

    @Test
    @EnabledOnOs({OS.WINDOWS})
    public void testRunOnlyWindows() {}

    @Test
    @DisabledOnOs({OS.WINDOWS})
    public void testDisabledOnWindows() {}

    @Test
    @EnabledOnJre({JRE.JAVA_8})
    public void testEnabledOnJava8() {}

    @Test
    @DisabledOnJre({JRE.JAVA_8})
    public void testDisabledOnJava8() {}

    @Test
    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_15)
    public void testEnabledOnJava11To15() {}

    @Test
    @DisabledForJreRange(min = JRE.JAVA_16, max = JRE.JAVA_22)
    public void testEnabledOnJava16To22() {}

    @Test
    @EnabledIfSystemProperties({
            @EnabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
    })
    public void testEnabledJavaOnOracle() {}

    @Test
    @DisabledIfSystemProperties({
            @DisabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
    })
    public void testDisabledJavaOnOracle() {}
}
