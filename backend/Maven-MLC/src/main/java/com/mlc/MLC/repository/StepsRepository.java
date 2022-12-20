package com.mlc.MLC.repository;

import com.mlc.MLC.models.Steps;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StepsRepository extends JpaRepository<Steps, Long> {
}
