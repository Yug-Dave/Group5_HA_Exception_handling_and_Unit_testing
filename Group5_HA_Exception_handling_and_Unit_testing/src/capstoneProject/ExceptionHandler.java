package capstoneProject;

public class ExceptionHandler {
    
    // a. Handling Multiple Exceptions
    public void handleMultipleExceptions() {
        try {
            // Code that may throw multiple exceptions
            // For example: Integer.parseInt("abc"); // Throws NumberFormatException
            // System.out.println(10 / 0); // Throws ArithmeticException
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }

    // b. Re-throwing Exceptions
    public void rethrowException() throws Exception {
        try {
            // Code that may throw an exception
            throw new Exception("Initial Exception");
        } catch (Exception e) {
            System.out.println("Re-throwing exception: " + e.getMessage());
            throw e; // Re-throwing the caught exception
        }
    }

    // c. Resource Management
    public void resourceManagement() {
        try (java.io.FileReader fr = new java.io.FileReader("file.txt")) {
            // Code to read from the file
        } catch (java.io.IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }

    // d. Chaining Exceptions
    public void chainingExceptions() {
        try {
            throw new RuntimeException("Runtime Exception");
        } catch (RuntimeException e) {
            throw new Exception("Chained Exception", e); // Chaining the exception
        }
    }
}

