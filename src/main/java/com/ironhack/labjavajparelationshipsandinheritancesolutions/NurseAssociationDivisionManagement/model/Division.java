package com.ironhack.labjavajparelationshipsandinheritancesolutions.NurseAssociationDivisionManagement.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "division")
public class Division {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String district;
    private String president;

    @OneToMany(mappedBy = "division",cascade = CascadeType.ALL)
    private List<Member> members = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    private Association association;

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

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Association getAssociation() {
        return association;
    }

    public void setAssociation(Association association) {
        this.association = association;
    }

    public String getPresident() {
        return president;
    }

    public void setPresident(String president) {
        this.president = president;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public Division(String name, String district, String president, List<Member> members, Association association) {
        this.name = name;
        this.district = district;
        this.president = president;
        this.members = members;
        this.association = association;
    }

    public Division() {
    }
}
