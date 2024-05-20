package com.emsi.qatarat.dto;

import jakarta.validation.constraints.NotEmpty;
import jdk.jshell.Snippet;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class CharityActionDto {

    private Long id;
@NotEmpty
    private String title;
    private String description;
    private LocalDate date;
    private String location;
    private double targetAmount;
    private double collectedAmount;
    private boolean archived;


}
