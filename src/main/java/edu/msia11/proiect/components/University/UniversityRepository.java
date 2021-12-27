package edu.msia11.proiect.components.University;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UniversityRepository extends JpaRepository<UniversityEntity, Long> {

    List<UniversityEntity> findByNameIgnoreCase(String name);
}
