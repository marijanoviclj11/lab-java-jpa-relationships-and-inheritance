package com.ironhack.labjavajparelationshipsandinheritancesolutions.EventManagementSystem.model;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Conference extends Event {
    @OneToMany(mappedBy = "conference", cascade = CascadeType.ALL)
    private List<Speaker> speakers;

    public List<Speaker> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(List<Speaker> speakers) {
        this.speakers = speakers;
    }

    public Conference() {
    }
}
