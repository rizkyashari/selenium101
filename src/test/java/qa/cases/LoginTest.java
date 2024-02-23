package qa.cases;
/* rizky.ashari created on 23/02/24 */

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import qa.data.CaseData;
import qa.utils.TestException;

@CaseData(jsonPath = {""})
public class LoginTest {
    @BeforeAll
    public static synchronized void setup() {
        try {
            
        } catch(Throwable e) {
            // nothing
        }
    }

    @Test
    @Order(1)
    @DisplayName("User can login successfully")
    public void caseUserLoginSuccess() throws TestException {

    }
}
