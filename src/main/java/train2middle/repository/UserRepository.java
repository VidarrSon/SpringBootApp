package train2middle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import train2middle.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Long deleteUserById(Long id);
}
