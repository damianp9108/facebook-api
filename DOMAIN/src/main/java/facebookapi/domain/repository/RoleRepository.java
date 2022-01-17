package facebookapi.domain.repository;

import facebookapi.domain.ERole;
import facebookapi.domain.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer > {
    Optional<Role> findByName(ERole name);
}
