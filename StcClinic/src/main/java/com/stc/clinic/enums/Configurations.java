package com.stc.clinic.enums;

public enum Configurations {



    public static final String BASE_PACKAGE = "com.stc.clinic";
    public static final String DATE_FORMATE = "dd/MM/yyyy hh:mm";
    private String value;

    private Configurations(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
