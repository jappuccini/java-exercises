import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;

class ApplicationTest {

    @Test
    @DisplayName("the application should compile")
    void shouldCompile() {
        assertNotNull(new Application());
    }
}
