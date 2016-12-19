package sec.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sec.project.domain.Signup;

public interface SignupRepository extends JpaRepository<Signup, Long> {

}
