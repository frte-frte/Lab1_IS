package org.example.lab1_is.repositories;

import org.example.lab1_is.models.HumanBeing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HumanBeingRepository extends JpaRepository<HumanBeing, Integer> {
}
