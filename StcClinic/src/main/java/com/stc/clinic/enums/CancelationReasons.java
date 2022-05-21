package com.stc.clinic.enums;

public enum CancelationReasons {
    NOSHOW("No show"), BASEDONPATIOENTREQUEST("based on patient request"), PHYSICAIANAPPOLOGY("Physician apology");

    private String value;

    private CancelationReasons(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
