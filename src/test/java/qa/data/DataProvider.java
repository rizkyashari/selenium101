package qa.data;
/* rizky.ashari created on 23/02/24 */

import java.util.HashMap;
import java.util.Map;

public class DataProvider {
    protected static final Map<String, String> jsonFileList = new HashMap<>();
    private static final String DATA_FOLDER = ConstantValueAdapter.getRootPath() + "/test/resources/testdata/";
    public static Map<String, String> getJsonFileList() {
        return jsonFileList;
    }


}
