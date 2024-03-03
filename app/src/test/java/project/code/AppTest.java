package project.code;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {
    @Test
    void testGreeting() {
        String expected = "Hello World!";
        String actual = App.greeting();
        assertThat(expected.equals(actual));
    }
}
