package com.ironhack.labjavajparelationshipsandinheritancesolutions.NurseAssociationDivisionManagement.model;

import com.ironhack.labjavajparelationshipsandinheritancesolutions.NurseAssociationDivisionManagement.enums.MemberStatus;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table (name = "member")
public class Member {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    @Enumerated (EnumType.STRING)
    private MemberStatus memberStatus;
    private String name;
    private LocalDate renewalDate;

    @ManyToOne
    private Division division;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MemberStatus getStatus() {
        return memberStatus;
    }

    public void setStatus(MemberStatus memberStatus) {
        this.memberStatus = memberStatus;
    }

    public LocalDate getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(LocalDate renewalDate) {
        this.renewalDate = renewalDate;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public Member() {
    }

    public Member(MemberStatus memberStatus, String name, LocalDate renewalDate, Division division) {
        this.memberStatus = memberStatus;
        this.name = name;
        this.renewalDate = renewalDate;
        this.division = division;
    }
}
