package com.felipeJansen.bringglobal.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionAttribute {
    private String transaction_attribute_id;
    private String name;
    private String type;
    private String value;

    public String getTransaction_attribute_id() {
        return transaction_attribute_id;
    }

    public void setTransaction_attribute_id(String transaction_attribute_id) {
        this.transaction_attribute_id = transaction_attribute_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    // getters e setters
}
