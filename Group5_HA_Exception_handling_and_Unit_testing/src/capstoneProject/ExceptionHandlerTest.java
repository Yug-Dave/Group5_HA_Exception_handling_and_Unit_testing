package capstoneProject;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ExceptionHandlerTest {

    ExceptionHandler handler = new ExceptionHandler();

    // Tests for Handling Multiple Exceptions
    @Test
    public void testHandleMultipleExceptions() {
        // Write test logic for handling multiple exceptions
    }

    // Tests for Re-throwing Exceptions
    @Test
    public void testRethrowException() {
        assertThrows(Exception.class, () -> {
            handler.rethrowException();
        });
    }

    // Tests for Resource Management
    @Test
    public void testResourceManagement() {
        // Validate that resources are managed correctly
    }

    // Tests for Chaining Exceptions
    @Test
    public void testChainingExceptions() {
        assertThrows(Exception.class, () -> {
            handler.chainingExceptions();
        });
    }

    // Additional tests can be added as needed
}

