package com.example.billingsystem.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name="OrderDetails")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;

    @Column(name = "Name")
    private String name;

    @Column(name = "COMPANYNAME")
    private String companyName;

    @Column(name = "PODetails")
    private String poDetails;

    @Column(name = "OurRefNo")
    private String referenceNumber;

    @Column(name = "Amount")
    private double amount;

    @Column(name = "Pendingbill")
    private double pendingBill;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MMM/yy")
    @Column(name = "Billingdate")
    private Date billingDate;

    @Column(name = "Remarks")
    private String remarks;

    @Column(name = "type")
    private String type;

}
