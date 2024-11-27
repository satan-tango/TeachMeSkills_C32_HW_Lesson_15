package com.varkovich.lesson_15.task_3.validator;

import com.varkovich.lesson_15.task_3.utils.CollectionLengthValidationState;

public class CollectionLengthValidator {

    public static CollectionLengthValidationState validateCollectionLength(String length) {
        if (length == null || length.equals("")) {
            return CollectionLengthValidationState.INVALID_DOCUMENT_NULL_OR_EMPTY;
        }
        int number;
        try {
            number = Integer.valueOf(length);

            if (number < 1) {
                return CollectionLengthValidationState.INVALID_LENGTH_LESS_THEN_1;
            }

            if (number > 200) {
                return CollectionLengthValidationState.INVALID_LENGTH_MORE_THEN_200;
            }

            return CollectionLengthValidationState.LENGTH_IS_VALID;
        } catch (NumberFormatException e) {
            return CollectionLengthValidationState.INVALID_LENGTH_NOT_NUMBER;
        }
    }
}
