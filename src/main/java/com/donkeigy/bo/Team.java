package com.donkeigy.bo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by cedric on 10/20/15.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Team
{
    private String code;
    private String fullName;
    private String shortName;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }
}
