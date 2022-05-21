package com.stc.clinic.enums;

public enum Configurations {
    USER_DETAILS_TOKEN_OBJECT("details"),
    USER_SERVICE_BEAN("userService"),
    UNION_RESPONSE_BEAN("unionResponse"),
    EXCEPTION_PATH_ON_SERVER_KEY("EXCEPTION_PATH_ON_SERVER"),
    UPLOAD_DIRECTORY("UPLOAD_DIRECTORY"),
    FUNCTION_RESULT("FunctionResult");


    public static final String BASE_PACKAGE = "com.work.specialist";
    public static final String DATE_FORMATE = "dd/MM/yyyy hh:mm";
    private String value;

    private Configurations(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
