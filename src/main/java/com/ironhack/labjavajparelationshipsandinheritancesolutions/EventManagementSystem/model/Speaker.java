package com.ironhack.labjavajparelationshipsandinheritancesolutions.EventManagementSystem.model;

import jakarta.persistence.*;

@Entity
@Table (name = "speaker")
public class Speaker {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int presentationDuration;
    @ManyToOne(fetch = FetchType.LAZY)
    private Conference conference;

    public Speaker(String name, int presentationDuration, Conference conference) {
        this.name = name;
        this.presentationDuration = presentationDuration;
        this.conference = conference;
    }

    public Speaker() {
    }

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

    public int getPresentationDuration() {
        return presentationDuration;
    }

    public void setPresentationDuration(int presentationDuration) {
        this.presentationDuration = presentationDuration;
    }

    public Conference getConference() {
        return conference;
    }

    public void setConference(Conference conference) {
        this.conference = conference;
    }
}
