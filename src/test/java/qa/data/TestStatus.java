package qa.data;
/* rizky.ashari created on 23/02/24 */

public class TestStatus {

    private TestStatus(){
        //nothing
    }

    private static ThreadLocal<Boolean> status = new ThreadLocal<>();

    public static boolean isTestCasePass() {
        return status.get();
    }

    public static void setTestCasePass() {
        status.set(true);
    }

    public static void setTestCaseFail() {
        status.set(false);
    }

    public static void isTestCaseRemove() {
        status.remove();
    }
}
