package com.example.domain.exceptions

import lombok.AllArgsConstructor
import lombok.Getter


@Getter
@AllArgsConstructor
enum class ErrorCode(var code: String, var message: String) {
    ORDER_NOT_FOUND("504", Constants.ORDER_NOT_FOUND),
    INTERNAL_SERVER_ERROR("500", Constants.INTERNAL_SERVER_ERROR),
    INCORRECT_REQUEST_BODY("501", Constants.INCORRECT_REQUEST_BODY);
    object Constants {
        const val INCORRECT_REQUEST_BODY = "Request is not valid!"
        const val INTERNAL_SERVER_ERROR = "Problem with the server. Please contact an administrator!"
        const val ORDER_NOT_FOUND = "Order is not found!"
    }

}