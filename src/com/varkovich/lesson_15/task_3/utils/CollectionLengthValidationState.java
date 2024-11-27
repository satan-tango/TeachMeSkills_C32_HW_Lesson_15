package com.varkovich.lesson_15.task_3.utils;

public enum CollectionLengthValidationState {
    INVALID_LENGTH_MORE_THEN_200("Invalid length, must be less then 200"),
    INVALID_LENGTH_LESS_THEN_1("Invalid length, must be more then 0"),
    INVALID_LENGTH_NOT_NUMBER("Invalid input, it must a number"),
    INVALID_DOCUMENT_NULL_OR_EMPTY("Invalid input, null or empty"),
    LENGTH_IS_VALID("Length is valid");

    private final String message;

    CollectionLengthValidationState(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
