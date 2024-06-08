package com.github.gsc.globalsolution.repository;



import com.github.gsc.globalsolution.model.Peixe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeixeRepository extends JpaRepository<Peixe, Long> {
}

