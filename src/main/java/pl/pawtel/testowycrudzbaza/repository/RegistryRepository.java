package pl.pawtel.testowycrudzbaza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pawtel.testowycrudzbaza.Registry;

public interface RegistryRepository extends JpaRepository <Registry, Long> {

}
