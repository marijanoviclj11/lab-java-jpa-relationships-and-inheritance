package com.ironhack.labjavajparelationshipsandinheritancesolutions.NurseAssociationDivisionManagement.repository;

import com.ironhack.labjavajparelationshipsandinheritancesolutions.NurseAssociationDivisionManagement.model.Division;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DivisionRepository extends JpaRepository<Division, Long> {
}
