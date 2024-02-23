package qa.utils;
/* rizky.ashari created on 23/02/24 */

import qa.data.TestStatus;

public class TestException extends RuntimeException {
    public TestException() {
        super();
        TestStatus.setTestCaseFail();
    }

    public TestException(String message) {
        super(message);
        TestStatus.setTestCaseFail();
    }

    public TestException(Throwable cause) {
        super(cause);
        TestStatus.setTestCaseFail();
    }

    public TestException(String message, Throwable cause) {
        super(message, cause);
        TestStatus.setTestCaseFail();
    }

    @Override
    public String getMessage() {
        return super.getCause() instanceof TestException
                ? super.getMessage() : createMessage(super.getMessage());
    }

    private String createMessage(String originalMessageString) {
        String beginMessage = " - Automation Capture Exception";

        return (originalMessageString == null ? "" : originalMessageString + "\n")
                + beginMessage;
    }
}
