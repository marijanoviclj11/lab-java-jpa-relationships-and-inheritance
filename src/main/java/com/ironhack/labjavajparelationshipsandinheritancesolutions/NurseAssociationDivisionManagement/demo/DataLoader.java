package com.ironhack.labjavajparelationshipsandinheritancesolutions.NurseAssociationDivisionManagement.demo;

import com.ironhack.labjavajparelationshipsandinheritancesolutions.NurseAssociationDivisionManagement.enums.MemberStatus;
import com.ironhack.labjavajparelationshipsandinheritancesolutions.NurseAssociationDivisionManagement.model.Association;
import com.ironhack.labjavajparelationshipsandinheritancesolutions.NurseAssociationDivisionManagement.model.Division;
import com.ironhack.labjavajparelationshipsandinheritancesolutions.NurseAssociationDivisionManagement.model.Member;
import com.ironhack.labjavajparelationshipsandinheritancesolutions.NurseAssociationDivisionManagement.repository.AssociationRepository;
import com.ironhack.labjavajparelationshipsandinheritancesolutions.NurseAssociationDivisionManagement.repository.DivisionRepository;
import com.ironhack.labjavajparelationshipsandinheritancesolutions.NurseAssociationDivisionManagement.repository.MemberRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Component
public class DataLoader implements CommandLineRunner {
    public final AssociationRepository associationRepository;
    public final DivisionRepository divisionRepository;
    public final MemberRepository memberRepository;

    public DataLoader(AssociationRepository associationRepository, DivisionRepository divisionRepository, MemberRepository memberRepository) {
        this.associationRepository = associationRepository;
        this.divisionRepository = divisionRepository;
        this.memberRepository = memberRepository;
    }
    List<Division> divisions = new ArrayList<>();
    List<Member> members= new ArrayList<>();
    List<Member> members1= new ArrayList<>();
    List<Member> members2= new ArrayList<>();
    List<Member> members3= new ArrayList<>();
    List<Member> members4= new ArrayList<>();
    List<Member> members5= new ArrayList<>();
    List<Member> members6= new ArrayList<>();
    List<Member> members7= new ArrayList<>();
    @Override
    public void run(String... args) throws Exception {
        System.out.println("DataLoader is running...");
        Association association1 = new Association("Nurse Association of Croatia", divisions);
        Division divisionNorth = new Division("North Division" , "North" , "Ana Kovač"  , members1, association1);
        Division divisionSouth = new Division("South Division", "South", "James Miller" , members2, association1);
        Division divisionEast = new Division("East Division", "East", "Olivia Johnson" , members3, association1);
        Division divisionWest = new Division("West Division", "West", "Michael Brown" , members4, association1);
        Division divisionCentral = new Division("Central Division", "Central", "Sophia Davis" , members5, association1);
        Division divisionCoastal = new Division("Coastal Division", "Coast", "Daniel Wilson" , members6, association1);
        Division divisionMountain = new Division("Mountain Division", "Mountains", "Emma Taylor" , members7, association1);
        divisions.add(divisionNorth);
        divisions.add(divisionSouth);
        divisions.add(divisionEast);
        divisions.add(divisionWest);
        divisions.add(divisionCentral);
        divisions.add(divisionCoastal);
        divisions.add(divisionMountain);
        Member member1 = new Member(MemberStatus.ACTIVE, "Liam Anderson", LocalDate.of(2025, 1, 10), divisionNorth);
        Member member2 = new Member(MemberStatus.ACTIVE, "Ava Thomas", LocalDate.of(2025, 2, 15), divisionSouth);
        Member member3 = new Member(MemberStatus.LAPSED, "Noah Martinez", LocalDate.of(2024, 11, 5), divisionEast);
        Member member4 = new Member(MemberStatus.ACTIVE, "Isabella Garcia", LocalDate.of(2025, 3, 20), divisionWest);
        Member member5 = new Member(MemberStatus.ACTIVE, "Ethan Rodriguez", LocalDate.of(2025, 4, 8), divisionCentral);
        Member member6 = new Member(MemberStatus.LAPSED, "Mia Hernandez", LocalDate.of(2024, 12, 1), divisionCoastal);
        Member member7 = new Member(MemberStatus.ACTIVE, "Lucas Robinson", LocalDate.of(2025, 5, 18), divisionMountain);
        members1.add(member1);
        members2.add(member2);
        members3.add(member3);
        members4.add(member4);
        members5.add(member5);
        members6.add(member6);
        members7.add(member7);
        associationRepository.save(association1);
    }
}
