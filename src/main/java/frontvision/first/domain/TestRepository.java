package frontvision.first.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<TestUser, Long> {
}
