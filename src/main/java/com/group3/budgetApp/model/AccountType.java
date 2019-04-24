package com.group3.budgetApp.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "account_type")
public class AccountType {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer Id;
    
    @Column(name = "description")
    private String description;
    
    public AccountType() {
    }
    
    public AccountType(String description) {
        this.description = description;
    }
}
