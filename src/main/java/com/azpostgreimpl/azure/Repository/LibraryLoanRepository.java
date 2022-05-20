package com.azpostgreimpl.azure.Repository;

import com.azpostgreimpl.azure.Entity.LibraryLoan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryLoanRepository extends JpaRepository<LibraryLoan,Integer> {
}
