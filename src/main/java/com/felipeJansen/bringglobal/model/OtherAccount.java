package com.felipeJansen.bringglobal.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OtherAccount {
    private String id;
    private Holder holder;
    private BankRouting bank_routing;

    private Metadata metadata;
    private List<AccountRouting> account_routings;

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

    public Holder getHolder() {
        return holder;
    }

    public void setHolder(Holder holder) {
        this.holder = holder;
    }

    public BankRouting getBank_routing() {
        return bank_routing;
    }

    public void setBank_routing(BankRouting bank_routing) {
        this.bank_routing = bank_routing;
    }

    public List<AccountRouting> getAccount_routings() {
        return account_routings;
    }

    public void setAccount_routings(List<AccountRouting> account_routings) {
        this.account_routings = account_routings;
    }

    // getters e setters
}
