package com.ironhack.labjavajparelationshipsandinheritancesolutions.NurseAssociationDivisionManagement.repository;

import com.ironhack.labjavajparelationshipsandinheritancesolutions.NurseAssociationDivisionManagement.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Long> {
}
