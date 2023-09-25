package com.mitu.cTrendsBackend.repository;

import com.mitu.cTrendsBackend.entity.Dept;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeptDao extends JpaRepository<Dept,Long> {
}
