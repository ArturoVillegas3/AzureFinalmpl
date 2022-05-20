package com.azpostgreimpl.azure.Repository;

import com.azpostgreimpl.azure.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer>{
}
