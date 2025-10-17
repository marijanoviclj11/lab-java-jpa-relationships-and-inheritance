package com.ironhack.labjavajparelationshipsandinheritancesolutions.PublicRelationsContactSystem;

import com.ironhack.labjavajparelationshipsandinheritancesolutions.PublicRelationsContactSystem.enums.Salutations;
import jakarta.persistence.*;

@Embeddable
@Table (name = "employer_name")
public class Name {
    @Enumerated(EnumType.STRING)
    private Salutations salutations;
    @Column (name = "employer_first_name")
    private String firstName;
    @Column (name = "employer_middle_name")
    private String middleName;
    @Column (name = "employer_last_name")
    private String lastName;

    public Salutations getSalutations() {
        return salutations;
    }

    public void setSalutations(Salutations salutations) {
        this.salutations = salutations;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Name(Salutations salutations, String firstName, String middleName, String lastName) {
        this.salutations = salutations;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public Name() {
    }
}
