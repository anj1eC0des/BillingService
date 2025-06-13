package com.example.BillingService.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BillDTO {
    private int patientId;
    private int appointmentId;
    private int amount;
    private String paymentStatus;
}
