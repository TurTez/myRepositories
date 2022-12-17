package java_intermediate.exception_handling.learning_to_read_and_write;

public class ExceptionHandlingWithTryandCatch {
    public static void main(String[] args) {
        String[] arr = {"hi", "Hello"};

        try {
           System.out.println(arr[0]);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
