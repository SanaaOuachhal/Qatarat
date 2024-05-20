package com.emsi.qatarat.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Table(name = "charityAction")
@Entity
@Data
@NoArgsConstructor

public class CharityAction {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "location")
    private String location;

    @Column(name = "targetAmount")
    private double targetAmount;

    @Column(name = "collectedAmount")
    private double collectedAmount;

    @Column(name = "archived")
    private boolean archived;


}
