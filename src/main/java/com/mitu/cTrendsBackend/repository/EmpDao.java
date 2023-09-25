package com.mitu.cTrendsBackend.repository;

import com.mitu.cTrendsBackend.entity.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpDao extends JpaRepository<Emp,Long> {
}
