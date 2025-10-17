package com.ironhack.labjavajparelationshipsandinheritancesolutions.EventManagementSystem.model;

import com.ironhack.labjavajparelationshipsandinheritancesolutions.EventManagementSystem.enums.GuestStatus;
import jakarta.persistence.*;

@Entity
@Table (name = "guest")
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @Enumerated (EnumType.STRING)
    private GuestStatus guestStatus;
    @ManyToOne (fetch = FetchType.LAZY)
    private Event event;

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

    public GuestStatus getGuestStatus() {
        return guestStatus;
    }

    public void setGuestStatus(GuestStatus guestStatus) {
        this.guestStatus = guestStatus;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Guest() {
    }

    public Guest(String name, GuestStatus guestStatus, Event event) {
        this.name = name;
        this.guestStatus = guestStatus;
        this.event = event;
    }
}
