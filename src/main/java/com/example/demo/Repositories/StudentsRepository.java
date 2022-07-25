package com.example.demo.Repositories;

import com.example.demo.entities.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<Students, Integer> {
}