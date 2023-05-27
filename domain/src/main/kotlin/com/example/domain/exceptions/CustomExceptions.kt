package com.example.domain.exceptions

class CustomException: RuntimeException {
    var details: String = ""
    var errorCode: String = ""

    constructor(code: ErrorCode, details: String?) : super(code.name) {
        this.errorCode = code.code
        this.details = details!!
    }

    constructor(code: ErrorCode) : super(code.name) {
        this.errorCode = code.code
        details = code.message
    }
}