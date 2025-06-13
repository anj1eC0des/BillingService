package com.example.BillingService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.BillingService.entity.Bill;
import com.example.BillingService.entity.BillDTO;
import com.example.BillingService.repository.BillingRepository;

@Service
public class BillService {

    private final BillingRepository billingRepository;

    public BillService(BillingRepository billingRepository) {
        this.billingRepository = billingRepository;
    }

    public Bill creatBill(BillDTO bill) {
        Bill b = new Bill();
        b.setPatientId(bill.getPatientId());
        b.setAppointmentId(bill.getAppointmentId());
        b.setAmount(b.getAmount());
        b.setPaymentStatus(bill.getPaymentStatus());
        return billingRepository.save(b);
    }

    public List<Bill> listBills() {
        return billingRepository.findAll();
    }

    public Optional<Bill> getBill(int id) {
        // bill find by id
        return billingRepository.findById(id);
    }

    public Bill updateBill(int id, BillDTO bill) {
        Bill b = new Bill();
        b.setBillId(id);
        b.setPatientId(bill.getPatientId());
        b.setAppointmentId(bill.getAppointmentId());
        b.setAmount(b.getAmount());
        b.setPaymentStatus(bill.getPaymentStatus());
        return billingRepository.save(b);
    }

    public void deleteBill(int id) {
        billingRepository.deleteById(id);
    }

    public List<Bill> searchBillByPatientId(int id) {
        return billingRepository.searchByPatientId(id);
    }
}
