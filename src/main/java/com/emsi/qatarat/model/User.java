package com.emsi.qatarat.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "users")
@Entity
@Data
@NoArgsConstructor
public class User {
    @Id
    private Long id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "donationsHistory")
    private String donationsHistory;

    @Column(name = "profilGoogle")
    private String profilGoogle;

    @Column(name = "email")
    private String email;
}
