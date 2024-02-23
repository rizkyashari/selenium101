package qa.data;
/* rizky.ashari created on 23/02/24 */

import org.apache.commons.io.FilenameUtils;

public class ConstantValueAdapter {
    public static String getRootPath() {
        String userDir = System.getProperty("user.dir");
        String webAutoDir = FilenameUtils.separatorsToSystem("/src");

        if (!userDir.contains(webAutoDir)) {
            userDir = FilenameUtils.normalize(userDir + webAutoDir);
        }

        return userDir;
    }

}
