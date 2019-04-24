package com.group3.budgetApp.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "TRANSACTION_type")
public class TransactionType {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer Id;
    
    @Column(name = "description")
    private String description;
    
    public TransactionType() {
    }
    
    public TransactionType(String description) {
        this.description = description;
    }
}
