package frontvision.first.common;

import frontvision.first.domain.TestRepository;
import frontvision.first.domain.TestUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public abstract class BaseRepositoryTest {

    @Autowired
    protected TestRepository testRepository;

    protected TestUser createUser() {
        return testRepository.save(TestUser.of("Test"));
    }

}
