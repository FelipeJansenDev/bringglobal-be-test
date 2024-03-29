package com.felipeJansen.bringglobal.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Holder {
    private String name;
    private boolean is_alias;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIs_alias() {
        return is_alias;
    }

    public void setIs_alias(boolean is_alias) {
        this.is_alias = is_alias;
    }

    // getters e setters
}
