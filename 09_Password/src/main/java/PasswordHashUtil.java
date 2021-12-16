import com.google.common.hash.Hashing;

import java.nio.charset.StandardCharsets;

public class PasswordHashUtil {
    private String hash;

    public PasswordHashUtil(String password) {
        this.hash = Hashing.sha256()
                .hashString(password, StandardCharsets.UTF_8)
                .toString();
    }

    public String getHashAsHexString() {
        return hash;
    }

    public Boolean isPasswordMatching(String password) {
        String hashedPassword = Hashing.sha256()
                .hashString(password, StandardCharsets.UTF_8)
                .toString();
        if(hash.equals(hashedPassword)) {
            return true;
        } else {
            return false;
        }
    }
}
