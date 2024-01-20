package com.felipeJansen.bringglobal.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Transaction {
    private String id;
    private Account this_account;

    private Metadata metadata;
    private OtherAccount other_account;
    private Details details;
    private List<TransactionAttribute> transaction_attributes;

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Details getDetails() {
        return details;
    }

    public void setDetails(Details details) {
        this.details = details;
    }

    public List<TransactionAttribute> getTransaction_attributes() {
        return transaction_attributes;
    }

    public void setTransaction_attributes(List<TransactionAttribute> transaction_attributes) {
        this.transaction_attributes = transaction_attributes;
    }

    public Account getThis_account() {
        return this_account;
    }

    public void setThis_account(Account this_account) {
        this.this_account = this_account;
    }

    public OtherAccount getOther_account() {
        return other_account;
    }

    public void setOther_account(OtherAccount other_account) {
        this.other_account = other_account;
    }
}
