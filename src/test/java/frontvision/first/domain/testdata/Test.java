package frontvision.first.domain.testdata;

import frontvision.first.domain.TestUser;
import org.springframework.test.util.ReflectionTestUtils;

public class Test {
    public static TestUser createUser() {
        return TestUser.of("TestUser");
    }

    public static TestUser createUserWithId(Long userId) {
        TestUser user = createUser();
        ReflectionTestUtils.setField(user, "id", userId);
        return user;
    }

}
