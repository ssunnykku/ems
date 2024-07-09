package com.kosta.ems.benefit.dto;

import lombok.*;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class BenefitTargetInfoDTO {
    private Integer courseSeq;
    private String managerId;
    private String courseNumber;
    private String courseName;
    private char isActive;
    private String studentId;
    private String name;
    private String hrdNetId;
    private String bank;
    private String account;
    private Integer settlementAidAmount;
    private Integer trainingAidAmount;
    private Integer mealAidAmount;
    /**/
    private String academyLocation;
    private LocalDate settlementDurationStartDate;
    private LocalDate settlementDurationEndDate;
    private Integer settlementDurationSeq;
    private Integer lectureDays;
    private LocalDate benefitSettlementDate;

    /**/
    private Integer totalAmount;
    private int benefitSeq;


}
