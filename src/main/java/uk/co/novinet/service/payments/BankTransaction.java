package uk.co.novinet.service.payments;

import java.util.Date;

import static org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString;

public class BankTransaction {
    private Long id;
    private Date date;
    private String description;
    private Double amount;
    private Double runningBalance;
    private String counterParty;
    private String reference;

    public BankTransaction(Long id, Date date, String description, Double amount, Double runningBalance, String counterParty, String reference) {
        this.id = id;
        this.date = date;
        this.description = description;
        this.amount = amount;
        this.runningBalance = runningBalance;
        this.counterParty = counterParty;
        this.reference = reference;
    }

    public Long getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public Double getAmount() {
        return amount;
    }

    public Double getRunningBalance() {
        return runningBalance;
    }

    public String getCounterParty() {
        return counterParty;
    }

    public String getReference() {
        return reference;
    }

    public String toString() {
        return reflectionToString(this);
    }
}
