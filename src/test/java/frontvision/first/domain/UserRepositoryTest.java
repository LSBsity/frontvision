package frontvision.first.domain;

import frontvision.first.common.BaseRepositoryTest;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UserRepositoryTest extends BaseRepositoryTest {

    @Autowired
    protected EntityManager em;

    @Nested
    @DisplayName("findById 메소드 테스트")
    class FindByUserIdTest {

        @Nested
        @DisplayName("유저가 존재하는 경우")
        class If_user_exist {
            @Test
            @DisplayName("유저를 반환한다.")
            void return_user() {
                TestUser user = createUser();

                Optional<TestUser> findUser = testRepository.findById(user.getId());

                assertThat(findUser.isPresent()).isTrue();
                assertThat(findUser.get().getId()).isEqualTo(user.getId());
            }

        }

        @Nested
        @DisplayName("유저가 존재하지 않는 경우")
        class If_user_not_exist {

            @Test
            @DisplayName("null을 반환한다.")
            void return_null() {
                Long notExistUserId = 1557L;

                Optional<TestUser> findUser = testRepository.findById(notExistUserId);
                assertThat(findUser.isEmpty()).isTrue();
            }
        }

    }

}







